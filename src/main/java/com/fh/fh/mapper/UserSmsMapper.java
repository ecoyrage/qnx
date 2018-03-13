package com.fh.fh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.fh.model.UserSms;
import com.fh.fh.model.UserSmsExample;

public interface UserSmsMapper {
	int countByExample(UserSmsExample example);

	int deleteByExample(UserSmsExample example);

	int deleteByPrimaryKey(String id);

	int insert(UserSms record);

	int insertSelective(UserSms record);

	List<UserSms> selectByExample(UserSmsExample example);

	List<UserSms> selectByExampleWithBLOBs(UserSmsExample example);

	UserSms selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") UserSms record, @Param("example") UserSmsExample example);

	int updateByExampleWithBLOBs(@Param("record") UserSms record, @Param("example") UserSmsExample example);

	int updateByExample(@Param("record") UserSms record, @Param("example") UserSmsExample example);

	int updateByPrimaryKeySelective(UserSms record);

	int updateByPrimaryKeyWithBLOBs(UserSms record);

	int updateByPrimaryKey(UserSms record);

}
