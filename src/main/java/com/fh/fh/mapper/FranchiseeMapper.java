package com.fh.fh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.fh.model.Franchisee;
import com.fh.fh.model.FranchiseeExample;

public interface FranchiseeMapper {
	int countByExample(FranchiseeExample example);

	int deleteByExample(FranchiseeExample example);

	int deleteByPrimaryKey(String franchisee_id);

	int insert(Franchisee record);

	int insertSelective(Franchisee record);

	List<Franchisee> selectByExample(FranchiseeExample example);

	Franchisee selectByPrimaryKey(String franchisee_id);

	int updateByExampleSelective(@Param("record") Franchisee record, @Param("example") FranchiseeExample example);

	int updateByExample(@Param("record") Franchisee record, @Param("example") FranchiseeExample example);

	int updateByPrimaryKeySelective(Franchisee record);

	int updateByPrimaryKey(Franchisee record);

}
