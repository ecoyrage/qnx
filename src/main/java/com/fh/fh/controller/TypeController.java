package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.common.util.StringUtils;
import com.fh.fh.model.BusinessCircle;
import com.fh.fh.model.BusinessCircleExample;
import com.fh.fh.model.TrainingType;
import com.fh.fh.model.TrainingTypeExample;
import com.fh.fh.service.BusinessCircleService;
import com.fh.fh.service.TrainingTypeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("${adminPath}/type/")
public class TypeController  extends BaseController {
    @Autowired
    private BusinessCircleService businessCircleService;
    @Autowired
    private TrainingTypeService trainingTypeService;
    @RequestMapping(value = "businessCircleList", method = RequestMethod.GET)
    public String businessCircleList(Model model) {
        return "fh/type/businessCircleList";
    }
    @ResponseBody
    @RequestMapping(value = "/businessCircleDataList", method = RequestMethod.POST)
    public PageMap businessCircleDataList(@RequestBody PageMap page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<BusinessCircle> list = new ArrayList<>();
        BusinessCircleExample businessCircleExample = new BusinessCircleExample();
        businessCircleExample.createCriteria().andParentIdEqualTo(0);
        businessCircleExample.setOrderByClause("id ASC");
        List<BusinessCircle> businessCircleList = businessCircleService.selectByExample(businessCircleExample);
        for(BusinessCircle businessCircle:businessCircleList){
            list.add(businessCircle);
            businessCircleExample.clear();
            businessCircleExample.setOrderByClause("id ASC");
            businessCircleExample.createCriteria().andParentIdEqualTo(businessCircle.getId());
            List<BusinessCircle> businessCircleList1 = businessCircleService.selectByExample(businessCircleExample);
            for(BusinessCircle businessCircle1:businessCircleList1){
                list.add(businessCircle1);
                businessCircleExample.clear();
                businessCircleExample.setOrderByClause("id ASC");
                businessCircleExample.createCriteria().andParentIdEqualTo(businessCircle1.getId());
                List<BusinessCircle> businessCircleList2 = businessCircleService.selectByExample(businessCircleExample);
                for(BusinessCircle businessCircle2:businessCircleList2){
                    list.add(businessCircle2);
                }
            }
        }
        return page.data(list);
    }
    @RequestMapping(value = "businessCircleForm", method = RequestMethod.GET)
    public String businessCircleForm(String id, Integer parentId,Model model) {
        if(StringUtils.isNotBlank(id)){
            BusinessCircle businessCircle = businessCircleService.selectByPrimaryKey(id);
            parentId = businessCircle.getParentId();
            model.addAttribute("businessCircle", businessCircle);
        }else{
            BusinessCircle businessCircle = new BusinessCircle();
            businessCircle.setParentId(parentId);
            model.addAttribute("businessCircle", businessCircle);
        }
        if(parentId != null){
            BusinessCircle parent = businessCircleService.selectByPrimaryKey(parentId.toString());
            model.addAttribute("parent", parent);
        }
        return "fh/type/businessCircleForm";
    }
    @ResponseBody
    @RequestMapping(value = "businessCircleCheck" , method = RequestMethod.POST)
    public Res businessCircleCheck(@RequestBody BusinessCircle businessCircle) throws  Exception {
        if(businessCircle.getParentId() == null){
            businessCircle.setParentId(0);
            businessCircle.setLevel(1);
            businessCircle.setFullName(businessCircle.getName());
            BusinessCircleExample businessCircleExample = new BusinessCircleExample();
            businessCircleExample.createCriteria().andNameEqualTo(businessCircle.getName()).andLevelEqualTo(1);
            List<BusinessCircle> list = businessCircleService.selectByExample(businessCircleExample);
            if(list.size() > 0){
                return Res.error("此名称已存在!");
            }
        }else{
            BusinessCircle parent = businessCircleService.selectByPrimaryKey(businessCircle.getParentId().toString());
            businessCircle.setLevel(parent.getLevel() + 1);
            businessCircle.setFullName(parent.getFullName()+"-"+businessCircle.getName());
            BusinessCircleExample businessCircleExample = new BusinessCircleExample();
            businessCircleExample.createCriteria().andNameEqualTo(businessCircle.getName()).andLevelEqualTo(parent.getLevel() + 1);
            List<BusinessCircle> list = businessCircleService.selectByExample(businessCircleExample);
            if(list.size() > 0){
                return Res.error("此名称已存在!");
            }
        }
        int r;
        if(businessCircle.getId() == null){
            r = businessCircleService.insertSelective(businessCircle);
        }else{
            r = businessCircleService.updateByPrimaryKey(businessCircle);
        }
        if(r <= 0){
            return Res.error("提交失败");
        }
        return Res.success("成功");
    }
    @RequestMapping(value = "trainingTypeList", method = RequestMethod.GET)
    public String trainingTypeList(Model model) {
        return "fh/type/trainingTypeList";
    }
    @ResponseBody
    @RequestMapping(value = "/trainingTypeDataList", method = RequestMethod.POST)
    public PageMap trainingTypeDataList(@RequestBody PageMap page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<TrainingType> list = new ArrayList<>();
        TrainingTypeExample trainingTypeExample = new TrainingTypeExample();
        trainingTypeExample.createCriteria().andParentIdEqualTo(0);
        trainingTypeExample.setOrderByClause("id ASC");
        List<TrainingType> trainingTypeList = trainingTypeService.selectByExample(trainingTypeExample);
        for(TrainingType trainingType:trainingTypeList){
            list.add(trainingType);
            trainingTypeExample.clear();
            trainingTypeExample.setOrderByClause("id ASC");
            trainingTypeExample.createCriteria().andParentIdEqualTo(trainingType.getId());
            List<TrainingType> trainingTypeList1 = trainingTypeService.selectByExample(trainingTypeExample);
            for(TrainingType trainingType1:trainingTypeList1){
                list.add(trainingType1);
                trainingTypeExample.clear();
                trainingTypeExample.setOrderByClause("id ASC");
                trainingTypeExample.createCriteria().andParentIdEqualTo(trainingType1.getId());
                List<TrainingType> trainingTypeList2 = trainingTypeService.selectByExample(trainingTypeExample);
                for(TrainingType trainingType2:trainingTypeList2){
                    list.add(trainingType2);
                }
            }
        }
        return page.data(list);
    }
    @RequestMapping(value = "trainingTypeForm", method = RequestMethod.GET)
    public String trainingTypeForm(String id, Integer parentId,Model model) {
        if(StringUtils.isNotBlank(id)){
            TrainingType trainingType = trainingTypeService.selectByPrimaryKey(id);
            parentId = trainingType.getParentId();
            model.addAttribute("trainingType", trainingType);

        }else{
            TrainingType trainingType = new TrainingType();
            trainingType.setParentId(parentId);
            model.addAttribute("trainingType", trainingType);
        }
        if(parentId != null){
            TrainingType parent = trainingTypeService.selectByPrimaryKey(parentId.toString());
            model.addAttribute("parent", parent);
        }
        return "fh/type/trainingTypeForm";
    }
    @ResponseBody
    @RequestMapping(value = "trainingTypeCheck" , method = RequestMethod.POST)
    public Res trainingTypeCheck(@RequestBody TrainingType trainingType) throws  Exception {
        if(trainingType.getParentId() == null){
            trainingType.setParentId(0);
            trainingType.setLevel(1);
            trainingType.setFullName(trainingType.getName());
            TrainingTypeExample trainingTypeExample = new TrainingTypeExample();
            trainingTypeExample.createCriteria().andNameEqualTo(trainingType.getName()).andLevelEqualTo(1);
            List<TrainingType> list = trainingTypeService.selectByExample(trainingTypeExample);
            if(list.size() > 0){
                return Res.error("此名称已存在!");
            }
        }else{
            TrainingType parent = trainingTypeService.selectByPrimaryKey(trainingType.getParentId().toString());
            trainingType.setLevel(parent.getLevel() + 1);
            trainingType.setFullName(parent.getFullName()+"-"+trainingType.getName());
            //判断名称重复
            TrainingTypeExample trainingTypeExample = new TrainingTypeExample();
            trainingTypeExample.createCriteria().andNameEqualTo(trainingType.getName()).andLevelEqualTo(parent.getLevel() + 1);
            List<TrainingType> list = trainingTypeService.selectByExample(trainingTypeExample);
            if(list.size() > 0){
                return Res.error("此名称已存在!");
            }
        }
        int r;
        if(trainingType.getId() == null){
            r = trainingTypeService.insertSelective(trainingType);
        }else{
            r = trainingTypeService.updateByPrimaryKey(trainingType);
        }
        if(r <= 0){
            return Res.error("提交失败");
        }
        return Res.success("成功");
    }
    @ResponseBody
    @RequestMapping("delete")
    public Res delete(String trainingTypeId, String businessCircleId){
        if(StringUtils.isNotBlank(businessCircleId)){
            BusinessCircle businessCircle = businessCircleService.selectByPrimaryKey(businessCircleId);
            String b = businessCircle.getFullName();
            BusinessCircleExample businessCircleExample = new BusinessCircleExample();
            businessCircleExample.createCriteria().andParentIdEqualTo(Integer.parseInt(businessCircleId));
            int r = businessCircleService.countByExample(businessCircleExample);
            if(r> 0){
                return Res.error("请先删除下级!");
            }
            int rr = businessCircleService.deleteByPrimaryKey(businessCircleId);
            if(rr > 0){
                return Res.success("删除成功!");
            }
        }else if(StringUtils.isNotBlank(trainingTypeId)){
            TrainingType trainingType = trainingTypeService.selectByPrimaryKey(trainingTypeId);
            String t = trainingType.getFullName();
            //是否有下级
            TrainingTypeExample trainingTypeExample = new TrainingTypeExample();
            trainingTypeExample.createCriteria().andParentIdEqualTo(Integer.parseInt(trainingTypeId));
            int r = trainingTypeService.countByExample(trainingTypeExample);
            if(r > 0){
                return Res.error("请先删除下级!");
            }
            int rr = trainingTypeService.deleteByPrimaryKey(trainingTypeId);
            if(rr > 0){
                return Res.success("删除成功!");
            }
        }
        return Res.error("删除失败!");
    }
}

