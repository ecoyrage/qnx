package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.fh.model.Suggest;
import com.fh.fh.model.SuggestExample;
import com.fh.fh.service.SuggestService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("${adminPath}/suggest/")
public class SuggestController extends BaseController {
    @Autowired
    private SuggestService suggestService;
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        return "fh/suggest/suggestList";
    }
    @ResponseBody
    @RequestMapping(value = "/dataList", method = RequestMethod.POST)
    public PageMap dataList(@RequestBody PageMap page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        SuggestExample suggestExample = new SuggestExample();
        suggestExample.createCriteria();
        suggestExample.setOrderByClause("create_time DESC");
        List<Suggest> suggestList = suggestService.selectByExample(suggestExample);
        return page.data(suggestList);
    }
    @ResponseBody
    @RequestMapping("delete")
    public Res delete(@RequestParam String suggestId, HttpServletRequest request) {
        int r = suggestService.deleteByPrimaryKey(suggestId);
        if(r <= 0){
            return Res.error("保存失败！");
        }
        return Res.success("删除成功！");
    }
}

