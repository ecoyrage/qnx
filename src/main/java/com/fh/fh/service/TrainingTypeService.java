package com.fh.fh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.fh.mapper.TrainingTypeMapper;
import com.fh.fh.model.TrainingType;
import com.fh.fh.model.TrainingTypeExample;

@Service
public class TrainingTypeService {
	@Autowired
	private TrainingTypeMapper trainingTypeMapper;

	public int countByExample(TrainingTypeExample example) {
		return this.trainingTypeMapper.countByExample(example);
	}

	public TrainingType selectByPrimaryKey(String id) {
		return this.trainingTypeMapper.selectByPrimaryKey(id);
	}

	public List<TrainingType> selectByExample(TrainingTypeExample example) {
		return this.trainingTypeMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return this.trainingTypeMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(TrainingType record) {
		return this.trainingTypeMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(TrainingType record) {
		return this.trainingTypeMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(TrainingTypeExample example) {
		return this.trainingTypeMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(TrainingType record, TrainingTypeExample example) {
		return this.trainingTypeMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(TrainingType record, TrainingTypeExample example) {
		return this.trainingTypeMapper.updateByExample(record, example);
	}

	public int insertSelective(TrainingType record) {
		return this.trainingTypeMapper.insertSelective(record);
	}

}
