package com.fh.sys.service;

import com.fh.sys.mapper.SettingMapper;
import com.fh.sys.model.Setting;
import com.fh.sys.model.SettingExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettingService {
    @Autowired
    private SettingMapper settingMapper;

    private static final Logger logger = Logger.getLogger(SettingService.class);

    public int countByExample(SettingExample example) {
        return this.settingMapper.countByExample(example);
    }

    public Setting selectByPrimaryKey(String id) {
        return this.settingMapper.selectByPrimaryKey(id);
    }

    public List<Setting> selectByExample(SettingExample example) {
        return this.settingMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String id) {
        return this.settingMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Setting record) {
        return this.settingMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Setting record) {
        return this.settingMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(SettingExample example) {
        return this.settingMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Setting record, SettingExample example) {
        return this.settingMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Setting record, SettingExample example) {
        return this.settingMapper.updateByExample(record, example);
    }

    public int insert(Setting record) {
        return this.settingMapper.insert(record);
    }

    public int insertSelective(Setting record) {
        return this.settingMapper.insertSelective(record);
    }
}