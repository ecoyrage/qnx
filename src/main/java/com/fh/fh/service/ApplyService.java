package com.fh.fh.service;

import com.fh.fh.mapper.ApplyMapper;
import com.fh.fh.mapperEx.ApplyMapperEx;
import com.fh.fh.model.Apply;
import com.fh.fh.model.ApplyExample;
import com.fh.fh.modelEx.ApplyEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ApplyService {
	@Autowired
	private ApplyMapper applyMapper;
	@Autowired
	private ApplyMapperEx applyMapperEx;

	public int countByExample(ApplyExample example) {
		return this.applyMapper.countByExample(example);
	}

	public Apply selectByPrimaryKey(String apply_id) {
		return this.applyMapper.selectByPrimaryKey(apply_id);
	}

	public List<Apply> selectByExample(ApplyExample example) {
		return this.applyMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String apply_id) {
		return this.applyMapper.deleteByPrimaryKey(apply_id);
	}

	public int updateByPrimaryKeySelective(Apply record) {
		return this.applyMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Apply record) {
		return this.applyMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(ApplyExample example) {
		return this.applyMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Apply record, ApplyExample example) {
		return this.applyMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Apply record, ApplyExample example) {
		return this.applyMapper.updateByExample(record, example);
	}

	public int insertSelective(Apply record) {
		return this.applyMapper.insertSelective(record);
	}

    public List<ApplyEx> selectApplys(Map map) {
		return this.applyMapperEx.selectApplys(map);
    }
}
