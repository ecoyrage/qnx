package com.fh.fh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fh.fh.mapper.UserSmsMapper;
import com.fh.fh.model.UserSms;
import com.fh.fh.model.UserSmsExample;

@Service
public class UserSmsService {
	@Autowired
	private UserSmsMapper userSmsMapper;

	public int countByExample(UserSmsExample example) {
		return this.userSmsMapper.countByExample(example);
	}

	public UserSms selectByPrimaryKey(String id) {
		return this.userSmsMapper.selectByPrimaryKey(id);
	}

	public List<UserSms> selectByExample(UserSmsExample example) {
		return this.userSmsMapper.selectByExample(example);
	}

	public List<UserSms> selectByExampleWithBLOBs(UserSmsExample example) {
		return this.userSmsMapper.selectByExampleWithBLOBs(example);
	}

	public int deleteByPrimaryKey(String id) {
		return this.userSmsMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(UserSms record) {
		return this.userSmsMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKeyWithBLOBs(UserSms record) {
		return this.userSmsMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	public int updateByPrimaryKey(UserSms record) {
		return this.userSmsMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(UserSmsExample example) {
		return this.userSmsMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(UserSms record, UserSmsExample example) {
		return this.userSmsMapper.updateByExampleSelective(record, example);
	}

	public int updateByExampleWithBLOBs(UserSms record, UserSmsExample example) {
		return this.userSmsMapper.updateByExampleWithBLOBs(record, example);
	}

	public int updateByExample(UserSms record, UserSmsExample example) {
		return this.userSmsMapper.updateByExample(record, example);
	}

	public int insertSelective(UserSms record) {
		return this.userSmsMapper.insertSelective(record);
	}

}
