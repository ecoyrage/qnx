package com.fh.fh.mapperEx;


import com.fh.fh.modelEx.CourseEx;

import java.util.List;
import java.util.Map;

public interface CourseMapperEx{

    List<CourseEx> selectCourses(Map map);

    List<CourseEx> selectCourseList(Map map);
}