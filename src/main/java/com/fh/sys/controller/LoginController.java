package com.fh.sys.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.util.JsonMapper;
import com.fh.common.util.codec.MD5Utils;
import com.fh.framework.util.AdminUtils;
import com.fh.framework.util.SettingUtils;
import com.fh.sys.model.Admin;
import com.fh.sys.model.AdminExample;
import com.fh.sys.model.Menu;
import com.fh.sys.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("${adminPath}")
public class LoginController extends BaseController {
	@Autowired
	private AdminService adminService;
	@RequestMapping(value = {"", "/index"}, method = RequestMethod.GET)
	public String index(ModelMap model) {
		List<Menu> menuList = AdminUtils.getMenuTree();
		model.addAttribute("menuListJson", JsonMapper.toJson(menuList));
		model.addAttribute("setting", SettingUtils.getSetting());
		return "sys/index";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("setting", SettingUtils.getSetting());
		return "sys/login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam(required = true) String loginname,
			@RequestParam(required = true) String password, String remember,
			Model model, HttpServletRequest request) {
		model.addAttribute("setting", SettingUtils.getSetting());
		password = MD5Utils.encode(password);
		AdminExample adminEx = new AdminExample();
		adminEx.createCriteria().andLoginnameEqualTo(loginname.toLowerCase()).andPasswordEqualTo(password);
		List<Admin> adminList = adminService.selectByExample(adminEx);
		if (adminList != null && adminList.size() > 0) {
			if(adminList.get(0).getUseable() == 1){
				HttpSession session = request.getSession();
				session.setAttribute("admin", adminList.get(0));
				// response.sendRedirect(adminPath + "/index");
				return "redirect:" + adminPath + "/index";
			}else{
				model.addAttribute("message", "账号已停用");
			}
		}else{
			model.addAttribute("message", "用户名或者密码错误");
		}
		model.addAttribute("loginname", loginname);
		model.addAttribute("remember", "1".equals(remember));
		return "sys/login";
	}
	@RequestMapping(value = "/logout")
	public String logout(
			@CookieValue(value = "loginName", required = false) String loginname,
			Model model, HttpServletRequest request) {
		request.getSession().removeAttribute("admin");
		model.addAttribute("loginname", loginname);
		model.addAttribute("setting", SettingUtils.getSetting());
		return "sys/login";
	}
}
