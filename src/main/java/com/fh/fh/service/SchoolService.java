package com.fh.fh.service;

import com.fh.fh.mapper.SchoolMapper;
import com.fh.fh.mapperEx.SchoolMapperEx;
import com.fh.fh.model.School;
import com.fh.fh.model.SchoolExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SchoolService {
	@Autowired
	private SchoolMapper schoolMapper;
	@Autowired
	private SchoolMapperEx schoolMapperEx;

	public int countByExample(SchoolExample example) {
		return this.schoolMapper.countByExample(example);
	}

	public School selectByPrimaryKey(String school_id) {
		return this.schoolMapper.selectByPrimaryKey(school_id);
	}

	public List<School> selectByExample(SchoolExample example) {
		return this.schoolMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String school_id) {
		return this.schoolMapper.deleteByPrimaryKey(school_id);
	}

	public int updateByPrimaryKeySelective(School record) {
		return this.schoolMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(School record) {
		return this.schoolMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(SchoolExample example) {
		return this.schoolMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(School record, SchoolExample example) {
		return this.schoolMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(School record, SchoolExample example) {
		return this.schoolMapper.updateByExample(record, example);
	}

	public int insertSelective(School record) {
		return this.schoolMapper.insertSelective(record);
	}

    public List<School> selectSchoolList(Map map) {
		return this.schoolMapperEx.selectSchoolList(map);
    }
}
