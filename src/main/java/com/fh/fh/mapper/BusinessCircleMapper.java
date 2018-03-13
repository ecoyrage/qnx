package com.fh.fh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.fh.model.BusinessCircle;
import com.fh.fh.model.BusinessCircleExample;

public interface BusinessCircleMapper {
	int countByExample(BusinessCircleExample example);

	int deleteByExample(BusinessCircleExample example);

	int deleteByPrimaryKey(String id);

	int insert(BusinessCircle record);

	int insertSelective(BusinessCircle record);

	List<BusinessCircle> selectByExample(BusinessCircleExample example);

	BusinessCircle selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") BusinessCircle record, @Param("example") BusinessCircleExample example);

	int updateByExample(@Param("record") BusinessCircle record, @Param("example") BusinessCircleExample example);

	int updateByPrimaryKeySelective(BusinessCircle record);

	int updateByPrimaryKey(BusinessCircle record);

}
