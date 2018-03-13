package com.fh.framework.interceptor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.NamedThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import com.fh.common.constants.Global;
import com.fh.common.domain.Res;
import com.fh.common.util.JsonMapper;
import com.fh.sys.model.Admin;

/**
 * 权限拦截器
 * @author Cailin
 *
 */
public class AuthInterceptor implements HandlerInterceptor {
	
	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	private static final ThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("ThreadLocal StartTime");
	
	private static String[] anonymousUrls = null;
	private String[] getAnonymousUrls(){
		if(anonymousUrls == null){
			//获取公开地址
			String anonymousURL = Global.getConfig("anonymousURL");
			anonymousUrls = anonymousURL.split(",");
		}
		return anonymousUrls;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, 
			Object handler) throws Exception {
		Admin admin = (Admin) WebUtils.getSessionAttribute(request, "admin");
		if (admin == null) {
			// 用户访问地址：
			String url = request.getRequestURI();
			// 便利公开的地址，如果用户访问的地址url包括了公开的地址，则说明用户访问的地址就是公开的地址
			for (String suffix : getAnonymousUrls()) {
				if (url.endsWith(suffix)) {
					return true;// 放行，用户继续访问
				}
			}
			
			String requestType = request.getHeader("X-Requested-With");
			if ("XMLHttpRequest".equals(requestType)) {
				// Ajax异步请求
				PrintWriter pw = null;
	            try {
	            	response.setContentType("application/json;charset=UTF-8");
	                pw = response.getWriter();
	                pw.write(JsonMapper.toJson(Res.errno(1000).error("请刷新页面重新登录")));
	                pw.flush();
	                pw.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            } finally {
	                if (pw != null)
	                	pw.close();
	            }
			} else {
				//获得项目的根路径
				//String contextPath = request.getContextPath();
				response.sendRedirect(request.getContextPath() + Global.getAdminPath() + "/login");
			}
			return false;
		}
		/*if (logger.isDebugEnabled()){
			long beginTime = System.currentTimeMillis();//1、开始时间  
	        startTimeThreadLocal.set(beginTime);		//线程绑定变量（该数据只有当前请求的线程可见）  
	        logger.debug("开始计时: {}  URI: {}", new SimpleDateFormat("hh:mm:ss.SSS")
	        	.format(beginTime), request.getRequestURI());
		}*/
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, 
			ModelAndView modelAndView) throws Exception {
		if (modelAndView != null){
			logger.info("ViewName: " + modelAndView.getViewName());
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
			Object handler, Exception ex) throws Exception {

		// 保存日志
	//	LogUtils.saveLog(request, handler, ex, null);
		
		// 打印JVM信息。
		/*if (logger.isDebugEnabled()){
			long beginTime = startTimeThreadLocal.get();//得到线程绑定的局部变量（开始时间）  
			long endTime = System.currentTimeMillis(); 	//2、结束时间  
	        logger.debug("计时结束：{}  耗时：{}  URI: {}  最大内存: {}m  已分配内存: {}m  已分配内存中的剩余空间: {}m  最大可用内存: {}m",
	        		new SimpleDateFormat("hh:mm:ss.SSS").format(endTime), DateUtils.formatDateTime(endTime - beginTime),
					request.getRequestURI(), Runtime.getRuntime().maxMemory()/1024/1024, Runtime.getRuntime().totalMemory()/1024/1024, Runtime.getRuntime().freeMemory()/1024/1024, 
					(Runtime.getRuntime().maxMemory()-Runtime.getRuntime().totalMemory()+Runtime.getRuntime().freeMemory())/1024/1024); 
	        //删除线程变量中的数据，防止内存泄漏
	        startTimeThreadLocal.remove();
		}*/
		
	}

}
