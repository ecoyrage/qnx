package com.fh.sys.service;

import com.fh.sys.mapper.RoleMenuMapper;
import com.fh.sys.model.RoleMenu;
import com.fh.sys.model.RoleMenuExample;
import com.fh.sys.model.RoleMenuKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleMenuService {

	@Autowired
    RoleMenuMapper roleMenuMapper;

	public int countByExample(RoleMenuExample example) {
		return roleMenuMapper.countByExample(example);
	}

	public int deleteByExample(RoleMenuExample example) {
		return roleMenuMapper.deleteByExample(example);
	}

	public int deleteByPrimaryKey(RoleMenuKey key) {
		return roleMenuMapper.deleteByPrimaryKey(key);
	}

	public int insert(RoleMenu record) {
		return roleMenuMapper.insert(record);
	}

	public int insertSelective(RoleMenu record) {
		return roleMenuMapper.insertSelective(record);
	}

	public List<RoleMenu> selectByExample(RoleMenuExample example) {
		return roleMenuMapper.selectByExample(example);
	}

	public RoleMenu selectByPrimaryKey(RoleMenuKey key) {
		return roleMenuMapper.selectByPrimaryKey(key);
	}

	public int updateByExampleSelective(RoleMenu record, RoleMenuExample example) {
		return roleMenuMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(RoleMenu record, RoleMenuExample example) {
		return roleMenuMapper.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(RoleMenu record) {
		return roleMenuMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(RoleMenu record) {
		return roleMenuMapper.updateByPrimaryKey(record);
	}
}
