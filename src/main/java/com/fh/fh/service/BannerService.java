package com.fh.fh.service;

import com.fh.fh.mapper.BannerMapper;
import com.fh.fh.mapperEx.BannerMapperEx;
import com.fh.fh.model.Banner;
import com.fh.fh.model.BannerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BannerService {
	@Autowired
	private BannerMapper bannerMapper;
	@Autowired
	private BannerMapperEx bannerMapperEx;

	public int countByExample(BannerExample example) {
		return this.bannerMapper.countByExample(example);
	}

	public Banner selectByPrimaryKey(String id) {
		return this.bannerMapper.selectByPrimaryKey(id);
	}

	public List<Banner> selectByExample(BannerExample example) {
		return this.bannerMapper.selectByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		return this.bannerMapper.deleteByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(Banner record) {
		return this.bannerMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Banner record) {
		return this.bannerMapper.updateByPrimaryKey(record);
	}

	public int deleteByExample(BannerExample example) {
		return this.bannerMapper.deleteByExample(example);
	}

	public int updateByExampleSelective(Banner record, BannerExample example) {
		return this.bannerMapper.updateByExampleSelective(record, example);
	}

	public int updateByExample(Banner record, BannerExample example) {
		return this.bannerMapper.updateByExample(record, example);
	}

	public int insertSelective(Banner record) {
		return this.bannerMapper.insertSelective(record);
	}

	public List<Banner> selectBannerList(Map map) {
		return this.bannerMapperEx.selectBannerList(map);
	}
}
