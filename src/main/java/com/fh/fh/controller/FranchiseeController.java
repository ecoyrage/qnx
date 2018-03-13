package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.common.util.StringUtils;
import com.fh.common.util.WebUtil;
import com.fh.fh.model.Franchisee;
import com.fh.fh.model.FranchiseeExample;
import com.fh.fh.service.FranchiseeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("${adminPath}/franchisee/")
public class FranchiseeController extends BaseController {
    @Autowired
    private FranchiseeService franchiseeService;
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        return "fh/franchisee/franchiseeList";
    }
    @ResponseBody
    @RequestMapping(value = "dataList", method = RequestMethod.POST)
    public PageMap dataList(@RequestBody PageMap page) {
        String franchiseeName = page.getStr("franchiseeName");
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        FranchiseeExample franchiseeExample = new FranchiseeExample();
        franchiseeExample.setOrderByClause("create_time DESC");
        if(StringUtils.isNotBlank(franchiseeName)){
            franchiseeExample.createCriteria().andFranchiseeNameLike("%"+franchiseeName+"%");
        }else{
            franchiseeExample.createCriteria();
        }
        List<Franchisee> franchiseeList = franchiseeService.selectByExample(franchiseeExample);
        return page.data(franchiseeList);
    }
    @RequestMapping("form")
    public String form(String franchiseeId,Model model) {
        if(franchiseeId != null){
            Franchisee franchisee = franchiseeService.selectByPrimaryKey(franchiseeId);
            model.addAttribute("franchisee",franchisee);
        }
        return "fh/franchisee/franchiseeForm";
    }
    @ResponseBody
    @RequestMapping("formCheck")
    public Res formCheck(Franchisee franchisee,HttpServletRequest request) {
        String[] pics = WebUtil.getRequestFiles_savePath(request, "img");
        if(franchisee.getFranchiseeId() == null){
            if (pics.length == 0) {
                return Res.error("请上传图片！");
            }
            franchisee.setLogo(pics[0]);
            franchisee.setCreateTime(new Date());
            int r = franchiseeService.insertSelective(franchisee);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }else{
            Franchisee f = franchiseeService.selectByPrimaryKey(franchisee.getFranchiseeId().toString());
            f.setFranchiseeName(franchisee.getFranchiseeName());
            if(pics.length > 0){
                f.setLogo(pics[0]);
            }
            int r = franchiseeService.updateByPrimaryKey(f);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }
        return Res.success("保存成功！");
    }
    @ResponseBody
    @RequestMapping("delete")
    public Res delete(@RequestParam String franchiseeId) {
        int r = franchiseeService.deleteByPrimaryKey(franchiseeId);
        if(r <= 0){
            return Res.error("保存失败！");
        }
        return Res.success("删除成功！");
    }
}
