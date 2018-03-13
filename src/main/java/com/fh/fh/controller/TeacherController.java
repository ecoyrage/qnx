package com.fh.fh.controller;

import com.fh.common.base.web.BaseController;
import com.fh.common.domain.PageMap;
import com.fh.common.domain.Res;
import com.fh.common.util.StringUtils;
import com.fh.common.util.WebUtil;
import com.fh.fh.model.*;
import com.fh.fh.modelEx.TeacherEx;
import com.fh.fh.service.*;
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
@RequestMapping("${adminPath}/teacher/")
public class TeacherController extends BaseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private TrainingTypeService trainingTypeService;
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private TeacherService teacherService;
    @RequestMapping(value = "teacherList", method = RequestMethod.GET)
    public String teacherList(Model model) {
        return "fh/teacher/teacherList";
    }
    @ResponseBody
    @RequestMapping(value = "/teacherDataList", method = RequestMethod.POST)
    public PageMap courseDataList(@RequestBody PageMap page) {
        String teacherName = page.getStr("teacherName");
        String schoolName = page.getStr("schoolName");
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        Map map = new HashedMap();
        if(StringUtils.isNotBlank(teacherName)){
            map.put("teacherName","%"+teacherName+"%");
        }
        if(StringUtils.isNotBlank(schoolName)){
            map.put("schoolName","%"+schoolName+"%");
        }
        List<TeacherEx> teacherExList = teacherService.selectTeachers(map);
        return page.data(teacherExList);
    }
    @RequestMapping("form")
    public String form(String schoolId,String teacherId,Model model) {
        School school = schoolService.selectByPrimaryKey(schoolId);
        if(teacherId != null){
            Teacher teacher = teacherService.selectByPrimaryKey(teacherId);
            model.addAttribute("teacher",teacher);
        }
        model.addAttribute("school",school);
        return "fh/teacher/teacherForm";
    }
    @ResponseBody
    @RequestMapping("formCheck")
    public Res formCheck(Teacher teacher,HttpServletRequest request) {
        String introduction = "";
        if(StringUtils.isNotBlank(teacher.getIntroduction())){
            introduction = StringEscapeUtils.unescapeHtml(teacher.getIntroduction());
        }
        teacher.setIntroduction(introduction);
        String[] pics = WebUtil.getRequestFiles_savePath(request, "img");
        if(teacher.getTeacherId()== null){
            if (pics.length == 0) {
                return Res.error("请上传图片！");
            }
            teacher.setLogo(pics[0]);
            teacher.setCreateTime(new Date());
            int r = teacherService.insertSelective(teacher);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }else{
            Teacher t = teacherService.selectByPrimaryKey(teacher.getTeacherId().toString());
            t.setTeacherName(teacher.getTeacherName());
            t.setIntroduction(teacher.getIntroduction());
            if(pics.length > 0){
                t.setLogo(pics[0]);
            }
            int r = teacherService.updateByPrimaryKey(t);
            if(r <= 0){
                return Res.error("保存失败！");
            }
        }
        return Res.success("保存成功！");
    }
    @ResponseBody
    @RequestMapping("delete")
    public Res delete(@RequestParam String teacherId) {
        int r = teacherService.deleteByPrimaryKey(teacherId);
        if(r <= 0){
            return Res.error("保存失败！");
        }
        return Res.success("删除成功！");
    }
}
