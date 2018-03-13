package com.fh.sys.service;

import com.fh.sys.mapper.AdminMapper;
import com.fh.sys.model.Admin;
import com.fh.sys.model.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
	@Autowired
	private AdminMapper adminMapper;

	public int countByExample(AdminExample example) {
		return this.adminMapper.countByExample(example);
	}

	public Admin selectByPrimaryKey(String id) {
		return this.adminMapper.selectByPrimaryKey(id);
	}

	public List<Admin> selectByExample(AdminExample example) {
		return this.adminMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return this.adminMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Admin record) {
		return this.adminMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Admin record) {
		return this.adminMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(AdminExample example) {
		return this.adminMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Admin record, AdminExample example) {
		return this.adminMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Admin record, AdminExample example) {
		return this.adminMapper.updateByExample(record, example);
	}

	public int insertSelective(Admin record) {
		return this.adminMapper.insertSelective(record);
	}

}
