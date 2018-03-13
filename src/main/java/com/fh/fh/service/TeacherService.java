package com.fh.fh.service;

import com.fh.fh.mapper.TeacherMapper;
import com.fh.fh.mapperEx.TeacherMapperEx;
import com.fh.fh.model.Teacher;
import com.fh.fh.model.TeacherExample;
import com.fh.fh.modelEx.TeacherEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private TeacherMapperEx teacherMapperEx;

	public int countByExample(TeacherExample example) {
		return this.teacherMapper.countByExample(example);
	}

	public Teacher selectByPrimaryKey(String teacher_id) {
		return this.teacherMapper.selectByPrimaryKey(teacher_id);
	}

	public List<Teacher> selectByExample(TeacherExample example) {
		return this.teacherMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String teacher_id) {
		return this.teacherMapper.deleteByPrimaryKey(teacher_id);
	}

	public int updateByPrimaryKeySelective(Teacher record) {
		return this.teacherMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Teacher record) {
		return this.teacherMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(TeacherExample example) {
		return this.teacherMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Teacher record, TeacherExample example) {
		return this.teacherMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Teacher record, TeacherExample example) {
		return this.teacherMapper.updateByExample(record, example);
	}

	public int insertSelective(Teacher record) {
		return this.teacherMapper.insertSelective(record);
	}

    public List<TeacherEx> selectTeachers(Map map) {
		return this.teacherMapperEx.selectTeachers(map);
    }
}
