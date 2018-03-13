package com.fh.fh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.fh.mapper.FranchiseeMapper;
import com.fh.fh.model.Franchisee;
import com.fh.fh.model.FranchiseeExample;

@Service
public class FranchiseeService {
	@Autowired
	private FranchiseeMapper franchiseeMapper;

	public int countByExample(FranchiseeExample example) {
		return this.franchiseeMapper.countByExample(example);
	}

	public Franchisee selectByPrimaryKey(String franchisee_id) {
		return this.franchiseeMapper.selectByPrimaryKey(franchisee_id);
	}

	public List<Franchisee> selectByExample(FranchiseeExample example) {
		return this.franchiseeMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String franchisee_id) {
		return this.franchiseeMapper.deleteByPrimaryKey(franchisee_id);
	}

	public int updateByPrimaryKeySelective(Franchisee record) {
		return this.franchiseeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Franchisee record) {
		return this.franchiseeMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(FranchiseeExample example) {
		return this.franchiseeMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Franchisee record, FranchiseeExample example) {
		return this.franchiseeMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Franchisee record, FranchiseeExample example) {
		return this.franchiseeMapper.updateByExample(record, example);
	}

	public int insertSelective(Franchisee record) {
		return this.franchiseeMapper.insertSelective(record);
	}

}
