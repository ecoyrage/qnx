package com.fh.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fh.sys.model.Setting;
import com.fh.sys.model.SettingExample;

public interface SettingMapper {
	int countByExample(SettingExample example);

	int deleteByExample(SettingExample example);

	int deleteByPrimaryKey(String id);

	int insert(Setting record);

	int insertSelective(Setting record);

	List<Setting> selectByExample(SettingExample example);

	List<Setting> selectByExampleWithBLOBs(SettingExample example);

	Setting selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Setting record, @Param("example") SettingExample example);

	int updateByExampleWithBLOBs(@Param("record") Setting record, @Param("example") SettingExample example);

	int updateByExample(@Param("record") Setting record, @Param("example") SettingExample example);

	int updateByPrimaryKeySelective(Setting record);

	int updateByPrimaryKeyWithBLOBs(Setting record);

	int updateByPrimaryKey(Setting record);

}
