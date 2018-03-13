package com.fh.fh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.fh.model.Suggest;
import com.fh.fh.model.SuggestExample;

public interface SuggestMapper {
	int countByExample(SuggestExample example);

	int deleteByExample(SuggestExample example);

	int deleteByPrimaryKey(String suggest_id);

	int insert(Suggest record);

	int insertSelective(Suggest record);

	List<Suggest> selectByExample(SuggestExample example);

	Suggest selectByPrimaryKey(String suggest_id);

	int updateByExampleSelective(@Param("record") Suggest record, @Param("example") SuggestExample example);

	int updateByExample(@Param("record") Suggest record, @Param("example") SuggestExample example);

	int updateByPrimaryKeySelective(Suggest record);

	int updateByPrimaryKey(Suggest record);

}
