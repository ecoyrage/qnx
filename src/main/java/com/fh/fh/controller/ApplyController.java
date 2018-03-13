package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.common.util.StringUtils;
import com.fh.fh.modelEx.ApplyEx;
import com.fh.fh.service.ApplyService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("${adminPath}/apply/")
public class ApplyController extends BaseController {
    @Autowired
    private ApplyService applyService;
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        return "fh/apply/applyList";
    }
    @ResponseBody
    @RequestMapping(value = "/dataList", method = RequestMethod.POST)
    public PageMap dataList(@RequestBody PageMap page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        String courseName = page.getStr("courseName");
        Map map = new HashedMap();
        if(StringUtils.isNotBlank(courseName)){
            map.put("courseName","%"+courseName+"%");
        }
        List<ApplyEx> applyList = applyService.selectApplys(map);
        return page.data(applyList);
    }
    @ResponseBody
    @RequestMapping("delete")
    public Res delete(@RequestParam String applyId, HttpServletRequest request) {
        int r = applyService.deleteByPrimaryKey(applyId);
        if(r <= 0){
            return Res.error("保存失败！");
        }
        return Res.success("删除成功！");
    }
}

