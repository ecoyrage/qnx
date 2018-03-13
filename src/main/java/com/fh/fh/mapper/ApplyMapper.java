package com.fh.fh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.fh.model.Apply;
import com.fh.fh.model.ApplyExample;

public interface ApplyMapper {
	int countByExample(ApplyExample example);

	int deleteByExample(ApplyExample example);

	int deleteByPrimaryKey(String apply_id);

	int insert(Apply record);

	int insertSelective(Apply record);

	List<Apply> selectByExample(ApplyExample example);

	Apply selectByPrimaryKey(String apply_id);

	int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

	int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

	int updateByPrimaryKeySelective(Apply record);

	int updateByPrimaryKey(Apply record);

}
