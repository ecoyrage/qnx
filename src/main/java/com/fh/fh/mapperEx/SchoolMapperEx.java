package com.fh.fh.mapperEx;


import com.fh.fh.model.School;

import java.util.List;
import java.util.Map;

public interface SchoolMapperEx{

    List<School> selectSchoolList(Map map);
}