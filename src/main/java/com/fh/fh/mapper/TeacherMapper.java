package com.fh.fh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.fh.model.Teacher;
import com.fh.fh.model.TeacherExample;

public interface TeacherMapper {
	int countByExample(TeacherExample example);

	int deleteByExample(TeacherExample example);

	int deleteByPrimaryKey(String teacher_id);

	int insert(Teacher record);

	int insertSelective(Teacher record);

	List<Teacher> selectByExample(TeacherExample example);

	Teacher selectByPrimaryKey(String teacher_id);

	int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

	int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

	int updateByPrimaryKeySelective(Teacher record);

	int updateByPrimaryKey(Teacher record);

}
