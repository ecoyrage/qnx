package com.fh.fh.action;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.Page;
import com.fh.common.util.StringUtils;
import com.fh.fh.model.*;
import com.fh.fh.service.*;
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
public class SchoolAction extends BaseController {
    @Autowired
    private TrainingTypeService trainingTypeService;
    @Autowired
    private BusinessCircleService businessCircleService;
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("school.th")
    public ModelAndView school(Page page,String schoolName,String trainingType,String businessCircle,String type){
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
        if(StringUtils.isNotBlank(schoolName)){
            map.put("name","%"+schoolName+"%");
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
        List<School> schoolList = schoolService.selectSchoolList(map);
        ModelAndView modelAndView = new ModelAndView("school/schoolList");
        modelAndView.addObject("trainingTypeList", trainingTypeList);
        modelAndView.addObject("businessCircleList", businessCircleList1);
        modelAndView.addObject("schoolList", schoolList);
        modelAndView.addObject("page", page.data(schoolList));
        modelAndView.addObject("trainingType", trainingType);
        modelAndView.addObject("businessCircle", businessCircle);
        modelAndView.addObject("schoolName", schoolName);
        modelAndView.addObject("type", type);
        return modelAndView;
    }
    @RequestMapping("schoolDetail.th")
    public ModelAndView schoolDetail(String schoolId){
        School school = schoolService.selectByPrimaryKey(schoolId);
        ModelAndView modelAndView = new ModelAndView("school/schoolDetail");
        modelAndView.addObject("school", school);
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andSchoolIdEqualTo(Integer.parseInt(schoolId));
        int courseCount = courseService.countByExample(courseExample);
        modelAndView.addObject("courseCount", courseCount);
        courseExample.clear();
        courseExample.createCriteria().andSchoolIdEqualTo(Integer.parseInt(schoolId));
        List<Course> courseList = courseService.selectByExample(courseExample);
        modelAndView.addObject("courseList", courseList);
        TeacherExample teacherExample = new TeacherExample();
        teacherExample.createCriteria().andSchoolIdEqualTo(Integer.parseInt(schoolId));
        int teacherCount = teacherService.countByExample(teacherExample);
        List<Teacher> teacherList = teacherService.selectByExample(teacherExample);
        modelAndView.addObject("teacherCount", teacherCount);
        modelAndView.addObject("teacherList", teacherList);
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
