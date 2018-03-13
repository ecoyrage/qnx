package com.fh.fh.mapperEx;


import com.fh.fh.model.Banner;

import java.util.List;
import java.util.Map;

public interface BannerMapperEx{

    List<Banner> selectBannerList(Map map);
}