package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.common.util.StringUtils;
import com.fh.common.util.WebUtil;
import com.fh.fh.model.*;
import com.fh.fh.modelEx.CourseEx;
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
@RequestMapping("${adminPath}/course/")
public class CourseController  extends BaseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private TrainingTypeService trainingTypeService;
    @Autowired
    private SchoolService schoolService;
    @RequestMapping(value = "courseList", method = RequestMethod.GET)
    public String courseList(Model model) {
        return "fh/course/courseList";
    }
    @ResponseBody
    @RequestMapping(value = "/courseDataList", method = RequestMethod.POST)
    public PageMap courseDataList(@RequestBody PageMap page) {
        String courseName = page.getStr("courseName");
        String schoolName = page.getStr("schoolName");
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        Map map = new HashedMap();
        if(StringUtils.isNotBlank(courseName)){
            map.put("courseName","%"+courseName+"%");
        }
        if(StringUtils.isNotBlank(schoolName)){
            map.put("schoolName","%"+schoolName+"%");
        }
        List<CourseEx> list = courseService.selectCourses(map);
        return page.data(list);
    }
    @RequestMapping("form")
    public String form(String schoolId,String courseId,Model model) {
        School school = schoolService.selectByPrimaryKey(schoolId);
        if(courseId != null){
            Course course = courseService.selectByPrimaryKey(courseId);
            model.addAttribute("course",course);
            String[] trainingType = course.getTrainingType().split("-");
            model.addAttribute("trainingType1",trainingType[0]);
            model.addAttribute("trainingType2",trainingType[1]);
            if(trainingType.length > 2){
                model.addAttribute("trainingType3",trainingType[2]);
            }
        }
        model.addAttribute("school",school);
        model.addAttribute("trainingTypeList1",trainingTypeList(trainingTypeService,1));
        model.addAttribute("trainingTypeList2",trainingTypeList(trainingTypeService,2));
        model.addAttribute("trainingTypeList3",trainingTypeList(trainingTypeService,3));
        return "fh/course/courseForm";
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
    public Res formCheck(Course course,String trainingType1,String trainingType2,String trainingType3, HttpServletRequest request) {
        String content = "";
        if(StringUtils.isNotBlank(course.getContent())){
            content = StringEscapeUtils.unescapeHtml(course.getContent());
        }
        course.setContent(content);
        String trainingType = trainingTypeService.selectByPrimaryKey(trainingType1).getName() + "-"+ trainingTypeService.selectByPrimaryKey(trainingType2).getName();
        if(StringUtils.isNotBlank(trainingType3)){
            trainingType += "-" + trainingTypeService.selectByPrimaryKey(trainingType3).getName();
        }
        String[] pics = WebUtil.getRequestFiles_savePath(request, "img");
        if(course.getCourseId()== null){
            if (pics.length == 0) {
                return Res.error("请上传图片！");
            }
            course.setLogo(pics[0]);
            course.setCreateTime(new Date());
            course.setTrainingType(trainingType);
            int r = courseService.insertSelective(course);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }else{
            Course c = courseService.selectByPrimaryKey(course.getCourseId().toString());
            c.setCourseName(course.getCourseName());
            c.setContent(course.getContent());
            c.setLevel(course.getLevel());
            c.setTrainingType(trainingType);
            c.setCycle(course.getCycle());
            c.setHot(course.getHot());
            if(pics.length > 0){
                c.setLogo(pics[0]);
            }
            c.setCourseTime(course.getCourseTime());
            int r = courseService.updateByPrimaryKey(c);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }
        return Res.success("保存成功！");
    }
    @ResponseBody
    @RequestMapping("delete")
    public Res delete(@RequestParam String courseId, HttpServletRequest request) {
        int r = courseService.deleteByPrimaryKey(courseId);
        if(r <= 0){
            return Res.error("保存失败！");
        }
        return Res.success("删除成功！");
    }

}

