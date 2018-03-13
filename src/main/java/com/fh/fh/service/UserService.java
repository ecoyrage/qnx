package com.fh.fh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.fh.mapper.UserMapper;
import com.fh.fh.model.User;
import com.fh.fh.model.UserExample;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public int countByExample(UserExample example) {
		return this.userMapper.countByExample(example);
	}

	public User selectByPrimaryKey(String id) {
		return this.userMapper.selectByPrimaryKey(id);
	}

	public List<User> selectByExample(UserExample example) {
		return this.userMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return this.userMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(User record) {
		return this.userMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(User record) {
		return this.userMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(UserExample example) {
		return this.userMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(User record, UserExample example) {
		return this.userMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(User record, UserExample example) {
		return this.userMapper.updateByExample(record, example);
	}

	public int insertSelective(User record) {
		return this.userMapper.insertSelective(record);
	}

}
