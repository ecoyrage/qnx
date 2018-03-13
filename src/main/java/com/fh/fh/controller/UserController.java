package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.common.util.StringUtils;
import com.fh.fh.model.User;
import com.fh.fh.model.UserExample;
import com.fh.fh.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("${adminPath}/user/")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;
    @RequestMapping("list")
    public String list(Model model) {
        return "fh/user/userList";
    }
    @RequestMapping("remark")
    public String remark(String remark, Model model) {
        model.addAttribute("remark",remark);
        return "fh/user/userRemark";
    }
    @ResponseBody
    @RequestMapping(value = "delUser")
    public Res delUser(@RequestParam  String userId) {
        if (StringUtils.isNotBlank(userId)) {
        }
        return Res.error("删除失败！");
    }
    @ResponseBody
    @RequestMapping(value = "/dataList", method = RequestMethod.POST)
    public PageMap dataList(@RequestBody PageMap page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        UserExample userExample = new UserExample();
        userExample.createCriteria();
        userExample.setOrderByClause("create_time");
        List<User> userList = userService.selectByExample(userExample);
        return page.data(userList);
    }
}
