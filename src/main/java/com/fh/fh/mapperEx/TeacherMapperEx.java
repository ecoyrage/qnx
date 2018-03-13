package com.fh.fh.mapperEx;


import com.fh.fh.modelEx.TeacherEx;

import java.util.List;
import java.util.Map;

public interface TeacherMapperEx{

    List<TeacherEx> selectTeachers(Map map);
}