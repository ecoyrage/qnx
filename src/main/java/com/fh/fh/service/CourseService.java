package com.fh.fh.service;

import com.fh.fh.mapper.CourseMapper;
import com.fh.fh.mapperEx.CourseMapperEx;
import com.fh.fh.model.Course;
import com.fh.fh.model.CourseExample;
import com.fh.fh.modelEx.CourseEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CourseService {
	@Autowired
	private CourseMapper courseMapper;
	@Autowired
	private CourseMapperEx courseMapperEx;

	public int countByExample(CourseExample example) {
		return this.courseMapper.countByExample(example);
	}

	public Course selectByPrimaryKey(String course_id) {
		return this.courseMapper.selectByPrimaryKey(course_id);
	}

	public List<Course> selectByExample(CourseExample example) {
		return this.courseMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String course_id) {
		return this.courseMapper.deleteByPrimaryKey(course_id);
	}

	public int updateByPrimaryKeySelective(Course record) {
		return this.courseMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Course record) {
		return this.courseMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(CourseExample example) {
		return this.courseMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Course record, CourseExample example) {
		return this.courseMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Course record, CourseExample example) {
		return this.courseMapper.updateByExample(record, example);
	}

	public int insertSelective(Course record) {
		return this.courseMapper.insertSelective(record);
	}

	public List<CourseEx> selectCourses(Map map) {
		return this.courseMapperEx.selectCourses(map);
	}

	public List<CourseEx> selectCourseList(Map map) {
		return this.courseMapperEx.selectCourseList(map);
	}
}
