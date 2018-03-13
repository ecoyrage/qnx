package com.fh.sys.mapper;

import com.fh.sys.model.RoleMenu;
import com.fh.sys.model.RoleMenuExample;
import com.fh.sys.model.RoleMenuKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMenuMapper {
	int countByExample(RoleMenuExample example);

	int deleteByExample(RoleMenuExample example);

	int deleteByPrimaryKey(RoleMenuKey key);

	int insert(RoleMenu record);

	int insertSelective(RoleMenu record);

	List<RoleMenu> selectByExample(RoleMenuExample example);

	RoleMenu selectByPrimaryKey(RoleMenuKey key);

	int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

	int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

	int updateByPrimaryKeySelective(RoleMenu record);

	int updateByPrimaryKey(RoleMenu record);

}
