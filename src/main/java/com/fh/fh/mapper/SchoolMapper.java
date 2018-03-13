package com.fh.fh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.fh.model.School;
import com.fh.fh.model.SchoolExample;

public interface SchoolMapper {
	int countByExample(SchoolExample example);

	int deleteByExample(SchoolExample example);

	int deleteByPrimaryKey(String school_id);

	int insert(School record);

	int insertSelective(School record);

	List<School> selectByExample(SchoolExample example);

	School selectByPrimaryKey(String school_id);

	int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

	int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

	int updateByPrimaryKeySelective(School record);

	int updateByPrimaryKey(School record);

}
