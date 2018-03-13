package com.fh.framework.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.fh.common.domain.Res;
import com.fh.common.util.JsonMapper;

@Component
public class GlobalExceptionHandler implements HandlerExceptionResolver {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		String message = ex.getMessage();
		if(message == null) {
			message = "系统异常！";
		}
		if (LOGGER.isErrorEnabled()) {
			// 日志记录异常message和stacktrace
			LOGGER.error(message, ex);
		}
		
		// 处理异步请求
		if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
			response.setContentType("application/json;charset=UTF-8");
			PrintWriter pw = null;
			try {
				pw = response.getWriter();
				pw.write(JsonMapper.toJson(Res.error(message)));// eq  new ResultVO(false, message)
				pw.flush();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (pw != null)
					pw.close();
			}
			return null;
		}
		
		ModelAndView mav = new ModelAndView("error");
		//map.put("errno", 1001);
		mav.addObject("errmsg", message);
		mav.addObject("exception", getStackTraceMsg(ex.getStackTrace()));
		return mav;
	}
	
    private static String getStackTraceMsg(StackTraceElement[] stackArray) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < stackArray.length; i++) {
            StackTraceElement element = stackArray[i];
            sb.append(element.toString()).append("\n");
        }
        return sb.toString();
    }
}