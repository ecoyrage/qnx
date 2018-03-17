package com.fh.fh.action;

import com.fh.common.base.web.BaseController;
import com.fh.common.constants.Consts;
import com.fh.common.domain.Res;
import com.fh.common.util.ChuangLanSmsSend;
import com.fh.common.util.DateUtil;
import com.fh.common.util.IDUtils;
import com.fh.common.util.StringUtils;
import com.fh.common.util.codec.MD5Utils;
import com.fh.common.util.sms.SmsSendResponse;
import com.fh.fh.model.*;
import com.fh.fh.modelEx.BannerEx;
import com.fh.fh.modelEx.CourseEx;
import com.fh.fh.service.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("common/user/")
public class CommonAction extends BaseController{
    @Autowired
    private TrainingTypeService trainingTypeService;
    @Autowired
    private BannerService bannerService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private FranchiseeService franchiseeService;
    @Autowired
    private BusinessCircleService businessCircleService;
    @Autowired
    private ApplyService applyService;
    @Autowired
    private SuggestService suggestService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserSmsService userSmsService;
    @RequestMapping("index.th")
    public ModelAndView index(){
        TrainingTypeExample trainingTypeExample = new TrainingTypeExample();
        trainingTypeExample.createCriteria();
        List<TrainingType> trainingTypeList = trainingTypeService.selectByExample(trainingTypeExample);
        ModelAndView modelAndView = new ModelAndView("/common/index");
        modelAndView.addObject("trainingTypeList", trainingTypeList);
        BannerExample bannerExample = new BannerExample();
        bannerExample.createCriteria().andStatusEqualTo(BannerEx.Status.SHOW);
        List<Banner> bannerList = bannerService.selectByExample(bannerExample);
        for(Banner banner:bannerList){
            if(banner.getType() == 1){
                modelAndView.addObject("banner1", banner);
            }
            if(banner.getType() == 2){
                modelAndView.addObject("banner2", banner);
            }
            if(banner.getType() == 3){
                modelAndView.addObject("banner3", banner);
            }
        }
        Page page = new Page();
        page.setPageNum(1);
        page.setPageSize(8);
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        CourseExample courseExample = new CourseExample();
        courseExample.setOrderByClause("hot DESC");
        courseExample.createCriteria().andTrainingTypeLike("%艺术%");
        List<Course> courseList1 = courseService.selectByExample(courseExample);
        modelAndView.addObject("courseList1", courseList1);
        Page page1 = new Page();
        page1.setPageNum(1);
        page1.setPageSize(8);
        PageHelper.startPage(page1.getPageNum(), page1.getPageSize());
        courseExample.clear();
        courseExample.setOrderByClause("hot DESC");
        courseExample.createCriteria().andTrainingTypeLike("%语言培训%");
        List<Course> courseList2 = courseService.selectByExample(courseExample);
        modelAndView.addObject("courseList2", courseList2);
        FranchiseeExample franchiseeExample = new FranchiseeExample();
        franchiseeExample.createCriteria();
        franchiseeExample.setOrderByClause("create_time DESC");
        List<Franchisee> franchiseeList = franchiseeService.selectByExample(franchiseeExample);
        modelAndView.addObject("franchiseeList", franchiseeList);
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping("trainingType")
    public Res trainingType(){
        TrainingTypeExample trainingTypeExample = new TrainingTypeExample();
        trainingTypeExample.createCriteria().andParentIdEqualTo(0);
        List<TrainingType> trainingTypeList = trainingTypeService.selectByExample(trainingTypeExample);
        List<Map<String,Object>> list1 = new ArrayList<>();
        for(TrainingType trainingType:trainingTypeList){
            Map map = new HashedMap();
            map.put("name",trainingType.getName());
            map.put("trainingTypeId",trainingType.getId());
            map.put("parentId",trainingType.getParentId());
            trainingTypeExample.clear();
            trainingTypeExample.createCriteria().andParentIdEqualTo(trainingType.getId());
            List<TrainingType> trainingTypeList2 = trainingTypeService.selectByExample(trainingTypeExample);
            List<Map<String,Object>> list2 = new ArrayList<>();
            for(TrainingType trainingType2:trainingTypeList2){
                Map map2 = new HashedMap();
                map2.put("name",trainingType2.getName());
                map2.put("trainingTypeId",trainingType2.getId());
                map2.put("parentId",trainingType2.getParentId());
                trainingTypeExample.clear();
                trainingTypeExample.createCriteria().andParentIdEqualTo(trainingType2.getId());
                List<TrainingType> trainingTypeList3 = trainingTypeService.selectByExample(trainingTypeExample);
                List<Map<String,Object>> list3 = new ArrayList<>();
                for(TrainingType trainingType3:trainingTypeList3){
                    Map map3 = new HashedMap();
                    map3.put("name",trainingType3.getName());
                    map3.put("trainingTypeId",trainingType3.getId());
                    map3.put("parentId",trainingType3.getParentId());
                    list3.add(map3);
                }
                map2.put("subs",list3);
                list2.add(map2);
            }
            map.put("subs",list2);
            list1.add(map);
        }
        return Res.success(list1);
    }
    @RequestMapping("aboutus.th")
    public ModelAndView aboutus(){
        ModelAndView modelAndView = new ModelAndView("common/aboutus");
        return modelAndView;
    }
    @RequestMapping("connectionus.th")
    public ModelAndView contentus(){
        ModelAndView modelAndView = new ModelAndView("common/connectionus");
        return modelAndView;
    }
    @RequestMapping("suggest.th")
    public ModelAndView suggest(){
        ModelAndView modelAndView = new ModelAndView("common/suggest");
        return modelAndView;
    }
    @RequestMapping("search.th")
    public ModelAndView search(com.fh.common.domain.Page page, String name){
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
        if(StringUtils.isNotBlank(name)){
            map.put("courseName","%"+name+"%");
        }
        map.put("type","0");
        List<CourseEx> courseList = courseService.selectCourseList(map);
        ModelAndView modelAndView = new ModelAndView();
        if(courseList.size() > 0){
            modelAndView = new ModelAndView("course/courseList");
            modelAndView.addObject("trainingTypeList", trainingTypeList);
            modelAndView.addObject("businessCircleList", businessCircleList1);
            modelAndView.addObject("courseList", courseList);
            modelAndView.addObject("page", page.data(courseList));
            modelAndView.addObject("courseName", name);
        }else{
            PageHelper.startPage(page.getPageNum(), page.getPageSize());
            if(StringUtils.isNotBlank(name)){
                map.put("name","%"+name+"%");
            }
            List<School> schoolList = schoolService.selectSchoolList(map);
            if(schoolList.size() > 0){
                modelAndView = new ModelAndView("school/schoolList");
                modelAndView.addObject("trainingTypeList", trainingTypeList);
                modelAndView.addObject("businessCircleList", businessCircleList1);
                modelAndView.addObject("schoolList", schoolList);
                modelAndView.addObject("page", page.data(schoolList));
                modelAndView.addObject("schoolName", name);
            }
        }
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping("applyForm")
    public Res form(Apply apply,String businessCircle1,String businessCircle2,String businessCircle3,
                    String trainingType1,String trainingType2,String trainingType3) {
        String businessCircle = "";
        if(StringUtils.isNotBlank(businessCircle1)){
            businessCircle += businessCircleService.selectByPrimaryKey(businessCircle1).getName();
        }
        if(StringUtils.isNotBlank(businessCircle2)){
            businessCircle += "-"+ businessCircleService.selectByPrimaryKey(businessCircle2).getName();
        }
        if(StringUtils.isNotBlank(businessCircle3)){
            businessCircle += "-" + businessCircleService.selectByPrimaryKey(businessCircle3).getName();
        }
        String trainingType = "";
        if(StringUtils.isNotBlank(trainingType1)){
            trainingType += trainingTypeService.selectByPrimaryKey(trainingType1).getName();
        }
        if(StringUtils.isNotBlank(trainingType2)){
            trainingType += "-"+ trainingTypeService.selectByPrimaryKey(trainingType2).getName();
        }
        if(StringUtils.isNotBlank(trainingType3)){
            trainingType += "-" + trainingTypeService.selectByPrimaryKey(trainingType3).getName();
        }
        apply.setBusinessCircle(businessCircle);
        apply.setTrainingType(trainingType);
        apply.setCreateTime(new Date());
        int r = applyService.insertSelective(apply);
        if(r <= 0){
            return Res.error("保存失败！");
        }
        return Res.success("您已成功报名，请等待培训老师和您联系。");
    }
    @ResponseBody
    @RequestMapping("suggestForm")
    public Res suggestForm(Suggest suggest) {
        suggest.setCreateTime(new Date());
        int r = suggestService.insertSelective(suggest);
        if(r <= 0){
            return Res.error("保存失败！");
        }
        return Res.success("保存成功！");
    }
    @RequestMapping("mobileSms")
    @ResponseBody
    public Res mobileSms(@RequestParam String mobile, @RequestParam Integer type) throws Exception{
        if(type == 1){
            UserExample example = new UserExample();
            example.createCriteria().andMobileEqualTo(mobile);
            int count = userService.countByExample(example);
            if(count>0){
                return new Res(false, "手机号已存在,请登录!");
            }
            String code = IDUtils.random(6);
            SmsSendResponse response = ChuangLanSmsSend.sendSms(mobile,code,Consts.REG_TEMPLATE_CODE);
            if(response != null){
                if(response.getCode().equals("0")){
                    UserSms userSms = new UserSms();
                    userSms.setMethod("regCustomer");
                    userSms.setTel(mobile);
                    userSms.setVaildCode(code);
                    userSms.setVaildTimes(5);
                    userSms.setStartTime(new Date());
                    userSms.setEndTime(DateUtil.addMinute(userSms.getStartTime(), userSms.getVaildTimes()));
                    userSms.setStatus(1);
                    int r = userSmsService.insertSelective(userSms);
                    if(r > 0){
                        return new Res(true,"短信发送成功！");
                    }
                }else{
                    return new Res(false,response.getErrorMsg());
                }
                return new Res(false,"短信发送失败！");
            }
        }else if(type == 2){
            UserExample example = new UserExample();
            example.createCriteria().andMobileEqualTo(mobile);
            int count = userService.countByExample(example);
            if(count == 0) {
                return new Res(false, "该手机号还未注册，请先注册!");
            }
            String code = IDUtils.random(6);
            SmsSendResponse response = ChuangLanSmsSend.sendSms(mobile,code, Consts.FIND_PSW_TEMPLATE_CODE);
            if(response != null){
                if(response.getCode().equals("0")){
                    UserSms userSms = new UserSms();
                    userSms.setMethod("findPassword");
                    userSms.setTel(mobile);
                    userSms.setVaildCode(code);
                    userSms.setVaildTimes(5);
                    userSms.setStartTime(new Date());
                    userSms.setEndTime(DateUtil.addMinute(userSms.getStartTime(), userSms.getVaildTimes()));
                    userSms.setStatus(1);
                    int r = userSmsService.insertSelective(userSms);
                    if(r > 0){
                        return new Res(true,"短信发送成功！");
                    }
                }else{
                    return new Res(false,"请求频繁！");
                }
                return new Res(false,"短信发送失败！");
            }
        }else{
            return new Res(false, "不支持该类型短信！");
        }
        return new Res(false, "发送短信失败！");
    }
    @RequestMapping(value = "regCheck",method = RequestMethod.POST)
    @ResponseBody
    public Res regCheck(@RequestParam String mobile, @RequestParam String password,@RequestParam String vaidCode){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andMobileEqualTo(mobile);
        List<User> userList = userService.selectByExample(userExample);
        if(userList.size() > 0){
            return new Res(false,"用户已存在！");
        }
        User user = null;
        UserSmsExample userSmsExample = new UserSmsExample();
        userSmsExample.createCriteria().andTelEqualTo(mobile).andStatusEqualTo(1).andMethodEqualTo("regCustomer").andVaildCodeEqualTo(vaidCode);
        List<UserSms> userSmsList = userSmsService.selectByExample(userSmsExample);
        if(userSmsList.size() > 0){
            for(UserSms userSms:userSmsList){
                if(!new Date().before(userSms.getEndTime())){
                    return new Res(false,"验证码失效！");
                }
            }
            String loginToken = IDUtils.genSecretKey(32);
            user = new User();
            user.setUserCode(IDUtils.next());
            user.setCreateTime(new Date());
            user.setPassword(MD5Utils.encode(password));
            user.setMobile(mobile);
            user.setAccessToken(loginToken);
            int r = userService.insertSelective(user);
            if(r > 0){
                for(UserSms userSms:userSmsList){
                    userSms.setStatus(0);
                    userSmsService.updateByPrimaryKey(userSms);
                }
                Map<String,String> map = new HashedMap();
                map.put("userCode",user.getUserCode());
                map.put("accessToken",user.getAccessToken());
                return new Res(true,"注册成功！",map);
            }

        }else{
            return new Res(false,"验证码错误！");
        }
        return new Res(false,"注册失败！");
    }
    @RequestMapping(value = "loginCheck", method = RequestMethod.POST)
    @ResponseBody
    public Res loginCheck(@RequestParam String mobile, @RequestParam String password) throws Exception {
        password = MD5Utils.encode(password);
        UserExample userExample = new UserExample();
        userExample.createCriteria().andMobileEqualTo(mobile).andPasswordEqualTo(password);
        List<User> userList = userService.selectByExample(userExample);
        if (userList != null && userList.size() > 0) {
            String loginToken = IDUtils.genSecretKey(32);
            Date vaildTime = DateUtil.nextHour(new Date(), 2);
            userList.get(0).setAccessToken(loginToken);
            userList.get(0).setExpiredTime(vaildTime);
            int r = userService.updateByPrimaryKey(userList.get(0));
            if(r > 0){
                return  new Res(true,"success",userList.get(0));
            }
        }else{
            return  new Res(false,"用户名或者密码错误!");
        }
        return  new Res(false,"系统错误，请咨询客服!");
    }
}
