package com.fh.sys.service;

import com.fh.sys.mapper.GroupMapper;
import com.fh.sys.model.Group;
import com.fh.sys.model.GroupExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
	@Autowired
	private GroupMapper groupMapper;

	public int countByExample(GroupExample example) {
		return this.groupMapper.countByExample(example);
	}

	public Group selectByPrimaryKey(String id) {
		return this.groupMapper.selectByPrimaryKey(id);
	}

	public List<Group> selectByExample(GroupExample example) {
		return this.groupMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return this.groupMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Group record) {
		return this.groupMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Group record) {
		return this.groupMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(GroupExample example) {
		return this.groupMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Group record, GroupExample example) {
		return this.groupMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Group record, GroupExample example) {
		return this.groupMapper.updateByExample(record, example);
	}

	public int insertSelective(Group record) {
		return this.groupMapper.insertSelective(record);
	}

}
