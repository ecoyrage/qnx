package com.fh.sys.service;

import com.fh.sys.mapper.MenuMapper;
import com.fh.sys.model.Menu;
import com.fh.sys.model.MenuExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuMapper menuMapper;

    private static final Logger logger = Logger.getLogger(MenuService.class);

    public int countByExample(MenuExample example) {
        return this.menuMapper.countByExample(example);
    }

    public Menu selectByPrimaryKey(String id) {
        return this.menuMapper.selectByPrimaryKey(id);
    }

    public List<Menu> selectByExample(MenuExample example) {
        return this.menuMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String id) {
        return this.menuMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Menu record) {
        return this.menuMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Menu record) {
        return this.menuMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(MenuExample example) {
        return this.menuMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(Menu record, MenuExample example) {
        return this.menuMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Menu record, MenuExample example) {
        return this.menuMapper.updateByExample(record, example);
    }

    public int insert(Menu record) {
        return this.menuMapper.insert(record);
    }

    public int insertSelective(Menu record) {
        return this.menuMapper.insertSelective(record);
    }
}