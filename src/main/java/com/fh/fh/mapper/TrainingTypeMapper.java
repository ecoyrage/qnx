package com.fh.fh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.fh.model.TrainingType;
import com.fh.fh.model.TrainingTypeExample;

public interface TrainingTypeMapper {
	int countByExample(TrainingTypeExample example);

	int deleteByExample(TrainingTypeExample example);

	int deleteByPrimaryKey(String id);

	int insert(TrainingType record);

	int insertSelective(TrainingType record);

	List<TrainingType> selectByExample(TrainingTypeExample example);

	TrainingType selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") TrainingType record, @Param("example") TrainingTypeExample example);

	int updateByExample(@Param("record") TrainingType record, @Param("example") TrainingTypeExample example);

	int updateByPrimaryKeySelective(TrainingType record);

	int updateByPrimaryKey(TrainingType record);

}
