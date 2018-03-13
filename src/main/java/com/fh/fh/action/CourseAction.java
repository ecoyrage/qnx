package com.fh.fh.action;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.Page;
import com.fh.common.util.StringUtils;
import com.fh.fh.model.*;
import com.fh.fh.modelEx.CourseEx;
import com.fh.fh.service.BusinessCircleService;
import com.fh.fh.service.CourseService;
import com.fh.fh.service.SchoolService;
import com.fh.fh.service.TrainingTypeService;
import com.github.pagehelper.PageHelper;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("common/")
public class CourseAction extends BaseController {
    @Autowired
    private TrainingTypeService trainingTypeService;
    @Autowired
    private BusinessCircleService businessCircleService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private SchoolService schoolService;
    @RequestMapping("course.th")
    public ModelAndView course(Page page,String courseName,String trainingType,String businessCircle,String type){
        TrainingTypeExample trainingTypeExample = new TrainingTypeExample();
        trainingTypeExample.createCriteria().andParentIdEqualTo(0);
        List<TrainingType> trainingTypeList = trainingTypeService.selectByExample(trainingTypeExample);
        BusinessCircleExample businessCircleExample = new BusinessCircleExample();
        businessCircleExample.createCriteria().andParentIdEqualTo(0).andNameEqualTo("常州");
        List<BusinessCircle> businessCircleList = businessCircleService.selectByExample(businessCircleExample);
        businessCircleExample.clear();
        businessCircleExample.createCriteria().andParentIdEqualTo(businessCircleList.get(0).getId());
        List<BusinessCircle> businessCircleList1 = businessCircleService.selectByExample(businessCircleExample);
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        Map map = new HashedMap();
        if(StringUtils.isNotBlank(courseName)){
            map.put("courseName","%"+courseName+"%");
        }
        if(StringUtils.isNotBlank(trainingType)){
            map.put("trainingType","%"+trainingType+"%");
        }
        if(StringUtils.isNotBlank(businessCircle)){
            map.put("businessCircle","%"+businessCircle+"%");
        }
        if(StringUtils.isNotBlank(type)){
            map.put("type",type);
        }else{
            type = "0";
            map.put("type","0");
        }
        List<CourseEx> courseList = courseService.selectCourseList(map);
        ModelAndView modelAndView = new ModelAndView("course/courseList");
        modelAndView.addObject("trainingTypeList", trainingTypeList);
        modelAndView.addObject("businessCircleList", businessCircleList1);
        modelAndView.addObject("courseList", courseList);
        modelAndView.addObject("page", page.data(courseList));
        modelAndView.addObject("trainingType", trainingType);
        modelAndView.addObject("businessCircle", businessCircle);
        modelAndView.addObject("courseName", courseName);
        modelAndView.addObject("type", type);
        return modelAndView;
    }
    @RequestMapping("courseDetail.th")
    public ModelAndView courseDetail(String courseId){
        Course course = courseService.selectByPrimaryKey(courseId);
        ModelAndView modelAndView = new ModelAndView("course/courseDetail");
        modelAndView.addObject("course", course);
        School school = schoolService.selectByPrimaryKey(course.getSchoolId().toString());
        modelAndView.addObject("school", school);
        modelAndView.addObject("businessCircleList1",businessCircleList(businessCircleService,1));
        modelAndView.addObject("businessCircleList2",businessCircleList(businessCircleService,2));
        modelAndView.addObject("businessCircleList3",businessCircleList(businessCircleService,3));
        modelAndView.addObject("trainingTypeList1",trainingTypeList(trainingTypeService,1));
        modelAndView.addObject("trainingTypeList2",trainingTypeList(trainingTypeService,2));
        modelAndView.addObject("trainingTypeList3",trainingTypeList(trainingTypeService,3));
        return modelAndView;
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

}
