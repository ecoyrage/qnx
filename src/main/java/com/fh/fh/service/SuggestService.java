package com.fh.fh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.fh.mapper.SuggestMapper;
import com.fh.fh.model.Suggest;
import com.fh.fh.model.SuggestExample;

@Service
public class SuggestService {
	@Autowired
	private SuggestMapper suggestMapper;

	public int countByExample(SuggestExample example) {
		return this.suggestMapper.countByExample(example);
	}

	public Suggest selectByPrimaryKey(String suggest_id) {
		return this.suggestMapper.selectByPrimaryKey(suggest_id);
	}

	public List<Suggest> selectByExample(SuggestExample example) {
		return this.suggestMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String suggest_id) {
		return this.suggestMapper.deleteByPrimaryKey(suggest_id);
	}

	public int updateByPrimaryKeySelective(Suggest record) {
		return this.suggestMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Suggest record) {
		return this.suggestMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(SuggestExample example) {
		return this.suggestMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Suggest record, SuggestExample example) {
		return this.suggestMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Suggest record, SuggestExample example) {
		return this.suggestMapper.updateByExample(record, example);
	}

	public int insertSelective(Suggest record) {
		return this.suggestMapper.insertSelective(record);
	}

}
