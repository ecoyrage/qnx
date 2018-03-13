package com.fh.fh.mapper;

import com.fh.fh.model.Course;
import com.fh.fh.model.CourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper {
	int countByExample(CourseExample example);

	int deleteByExample(CourseExample example);

	int deleteByPrimaryKey(String course_id);

	int insert(Course record);

	int insertSelective(Course record);

	List<Course> selectByExample(CourseExample example);

	Course selectByPrimaryKey(String course_id);

	int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

	int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

	int updateByPrimaryKeySelective(Course record);

	int updateByPrimaryKey(Course record);

}
