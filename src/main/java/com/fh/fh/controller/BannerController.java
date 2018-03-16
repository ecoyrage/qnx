package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.common.util.StringUtils;
import com.fh.common.util.WebUtil;
import com.fh.fh.model.Banner;
import com.fh.fh.modelEx.BannerEx;
import com.fh.fh.service.BannerService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("${adminPath}/banner/")
public class BannerController extends BaseController {
    @Autowired
    private BannerService bannerService;
    @RequestMapping("list")
    public String list(Model model) {
        return "fh/banner/bannerList";
    }
    @ResponseBody
    @RequestMapping(value = "/dataList", method = RequestMethod.POST)
    public PageMap dataList(@RequestBody PageMap page) {
        String type = page.getStr("type");
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        Map map = new HashedMap();
        if(StringUtils.isNotBlank(type)){
            map.put("type",type);
        }
        List<Banner> list = bannerService.selectBannerList(map);
        return page.data(list);
    }
    @RequestMapping("form")
    public String form(String bannerId,Model model) {
        if(bannerId != null){
            Banner banner = bannerService.selectByPrimaryKey(bannerId);
            model.addAttribute("banner",banner);
        }
        return "fh/banner/bannerForm";
    }
    @ResponseBody
    @RequestMapping("formCheck")
    public Res formCheck(Banner banner, Model model, HttpServletRequest request) {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Iterator<String> iter = multipartRequest.getFileNames();
        List<MultipartFile> files = multipartRequest.getFiles(iter.next());
        String[] pics = WebUtil.getRequestFiles_savePath(request, "bannerImg");
        if(banner.getId() == null){
            for (MultipartFile file : files) {
                String myFileName = file.getOriginalFilename();
                if (myFileName == null || myFileName.trim() == "") {
                    return Res.error("请上传图片！");
                }
            }
            banner.setImgUrl(pics[0]);
            banner.setCreateTime(new Date());

            int r = bannerService.insertSelective(banner);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }else{
            Banner b = bannerService.selectByPrimaryKey(banner.getId().toString());
            if(pics.length > 0){
                b.setImgUrl(pics[0]);
            }
            b.setTitle(banner.getTitle());
            b.setLinkUrl(banner.getLinkUrl());
            b.setUpdateTime(new Date());

            int r = bannerService.updateByPrimaryKey(b);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }
        return Res.success("保存成功！");
    }
    @ResponseBody
    @RequestMapping("stateCheck")
    public Res stateCheck(String bannerId, Model model) {
        Banner banner = bannerService.selectByPrimaryKey(bannerId);
        if(banner.getStatus() == BannerEx.Status.SHOW){
            banner.setStatus(BannerEx.Status.HIDDEN);
        }else if(banner.getStatus() == BannerEx.Status.HIDDEN){
            banner.setStatus(BannerEx.Status.SHOW);
        }
        banner.setUpdateTime(new Date());
        int r = bannerService.updateByPrimaryKey(banner);
        if(r <= 0){
            return Res.error("失败！");
        }
        return Res.success("成功！");
    }
}
