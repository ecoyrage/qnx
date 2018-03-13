package com.fh.framework.util;

import com.fh.common.core.SpringContextHolder;
import com.fh.sys.model.Setting;
import com.fh.sys.service.SettingService;

public class SettingUtils {
	private static SettingService settingService = SpringContextHolder.getBean(SettingService.class);
	private static Setting setting;
	public static void initConfig(){
		setting = settingService.selectByPrimaryKey("1");
	}
	public static Setting getSetting() {
		if(setting == null){
			initConfig();
		}
		return setting;
	}
	
	
	
}
