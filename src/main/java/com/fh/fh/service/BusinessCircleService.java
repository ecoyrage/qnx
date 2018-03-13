package com.fh.fh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.fh.mapper.BusinessCircleMapper;
import com.fh.fh.model.BusinessCircle;
import com.fh.fh.model.BusinessCircleExample;

@Service
public class BusinessCircleService {
	@Autowired
	private BusinessCircleMapper businessCircleMapper;

	public int countByExample(BusinessCircleExample example) {
		return this.businessCircleMapper.countByExample(example);
	}

	public BusinessCircle selectByPrimaryKey(String id) {
		return this.businessCircleMapper.selectByPrimaryKey(id);
	}

	public List<BusinessCircle> selectByExample(BusinessCircleExample example) {
		return this.businessCircleMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return this.businessCircleMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(BusinessCircle record) {
		return this.businessCircleMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(BusinessCircle record) {
		return this.businessCircleMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(BusinessCircleExample example) {
		return this.businessCircleMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(BusinessCircle record, BusinessCircleExample example) {
		return this.businessCircleMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(BusinessCircle record, BusinessCircleExample example) {
		return this.businessCircleMapper.updateByExample(record, example);
	}

	public int insertSelective(BusinessCircle record) {
		return this.businessCircleMapper.insertSelective(record);
	}

}
