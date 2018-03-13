package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.common.util.StringUtils;
import com.fh.common.util.WebUtil;
import com.fh.fh.model.*;
import com.fh.fh.service.BusinessCircleService;
import com.fh.fh.service.CourseService;
import com.fh.fh.service.SchoolService;
import com.fh.fh.service.TrainingTypeService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("${adminPath}/school/")
public class SchoolController extends BaseController{
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private BusinessCircleService businessCircleService;
    @Autowired
    private TrainingTypeService trainingTypeService;
    @Autowired
    private CourseService courseService;
    @RequestMapping("list")
    public String list(Model model) {
        return "fh/school/schoolList";
    }
    @ResponseBody
    @RequestMapping(value = "/dataList", method = RequestMethod.POST)
    public PageMap dataList(@RequestBody PageMap page) {
        String name = page.getStr("schoolName");
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        Map map = new HashedMap();
        if(StringUtils.isNotBlank(name)){
            map.put("name","%"+name+"%");
        }
        map.put("type","0");
        List<School> list = schoolService.selectSchoolList(map);
        return page.data(list);
    }
    @RequestMapping("form")
    public String form(String schoolId,Model model) {
        if(schoolId != null){
            School school = schoolService.selectByPrimaryKey(schoolId);
            model.addAttribute("school",school);
            String[] businessCircle = school.getBusinessCircle().split("-");
            model.addAttribute("businessCircle1",businessCircle[0]);
            model.addAttribute("businessCircle2",businessCircle[1]);
            if(businessCircle.length > 2){
                model.addAttribute("businessCircle3",businessCircle[2]);
            }
            String[] trainingType = school.getTrainingType().split("-");
            model.addAttribute("trainingType1",trainingType[0]);
            model.addAttribute("trainingType2",trainingType[1]);
            if(trainingType.length > 2){
                model.addAttribute("trainingType3",trainingType[2]);
            }
        }
        model.addAttribute("businessCircleList1",businessCircleList(businessCircleService,1));
        model.addAttribute("businessCircleList2",businessCircleList(businessCircleService,2));
        model.addAttribute("businessCircleList3",businessCircleList(businessCircleService,3));
        model.addAttribute("trainingTypeList1",trainingTypeList(trainingTypeService,1));
        model.addAttribute("trainingTypeList2",trainingTypeList(trainingTypeService,2));
        model.addAttribute("trainingTypeList3",trainingTypeList(trainingTypeService,3));
        return "fh/school/schoolForm";
    }
    public static List<BusinessCircle> businessCircleList(BusinessCircleService businessCircleService, int level){
        BusinessCircleExample businessCircleExample = new BusinessCircleExample();
        businessCircleExample.createCriteria().andLevelEqualTo(level);
        List<BusinessCircle> businessCircleList = businessCircleService.selectByExample(businessCircleExample);
        return businessCircleList;
    }
    public static List<TrainingType> trainingTypeList(TrainingTypeService trainingTypeService, int level){
        TrainingTypeExample trainingTypeExample = new TrainingTypeExample();
        trainingTypeExample.createCriteria().andLevelEqualTo(level);
        List<TrainingType> trainingTypeList = trainingTypeService.selectByExample(trainingTypeExample);
        return trainingTypeList;
    }
    @ResponseBody
    @RequestMapping("formCheck")
    public Res formCheck(School school,String businessCircle1,String businessCircle2,String businessCircle3,
                         String trainingType1,String trainingType2,String trainingType3, HttpServletRequest request) {
        String introduction = "";
        if(StringUtils.isNotBlank(school.getIntroduction())){
            introduction = StringEscapeUtils.unescapeHtml(school.getIntroduction());
        }
        school.setIntroduction(introduction);
        String businessCircle = businessCircleService.selectByPrimaryKey(businessCircle1).getName() + "-"+ businessCircleService.selectByPrimaryKey(businessCircle2).getName();
        if(StringUtils.isNotBlank(businessCircle3)){
            businessCircle += "-" + businessCircleService.selectByPrimaryKey(businessCircle3).getName();
        }
        String trainingType = trainingTypeService.selectByPrimaryKey(trainingType1).getName() + "-"+ trainingTypeService.selectByPrimaryKey(trainingType2).getName();
        if(StringUtils.isNotBlank(trainingType3)){
            trainingType += "-" + trainingTypeService.selectByPrimaryKey(trainingType3).getName();
        }
        String[] pics = WebUtil.getRequestFiles_savePath(request, "img");
        if(school.getSchoolId() == null){
            if (pics.length == 0) {
                return Res.error("请上传图片！");
            }
            SchoolExample schoolExample = new SchoolExample();
            schoolExample.createCriteria().andNameEqualTo(school.getName());
            List<School> schoolList = schoolService.selectByExample(schoolExample);
            if(schoolList.size() > 0){
                return Res.error("学校名称已存在！");
            }
            school.setLogo(pics[0]);
            school.setCreateTime(new Date());
            school.setBusinessCircle(businessCircle);
            school.setTrainingType(trainingType);
            int r = schoolService.insertSelective(school);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }else{
            SchoolExample schoolExample = new SchoolExample();
            schoolExample.createCriteria().andNameEqualTo(school.getName()).andSchoolIdNotEqualTo(school.getSchoolId());
            List<School> schoolList = schoolService.selectByExample(schoolExample);
            if(schoolList.size() > 0){
                return Res.error("学校名称已存在！");
            }
            School s = schoolService.selectByPrimaryKey(school.getSchoolId().toString());
            s.setAddress(school.getAddress());
            s.setName(school.getName());
            s.setTel(school.getTel());
            s.setBusinessCircle(businessCircle);
            s.setTrainingType(trainingType);
            s.setIntroduction(school.getIntroduction());
            s.setHot(school.getHot());
            if(pics.length > 0){
                s.setLogo(pics[0]);
            }
            int r = schoolService.updateByPrimaryKey(s);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }
        return Res.success("保存成功！");
    }
    @ResponseBody
    @RequestMapping("delete")
    public Res delete(@RequestParam String schoolId, HttpServletRequest request) {
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andSchoolIdEqualTo(Integer.parseInt(schoolId));
        int count = courseService.countByExample(courseExample);
        if(count > 0){
            return Res.error("该学校下有课程，不可删除！");
        }
        int r = schoolService.deleteByPrimaryKey(schoolId);
        if(r <= 0){
            return Res.error("保存失败！");
        }
        return Res.success("删除成功！");
    }
}
