package com.fh.common.util;

import com.fh.sys.model.Menu;

import java.util.List;



public class SortUtils {

	public static String getRootId(){
		return "1";
	}
	public static String getRootPId(){
		return "0";
	}
	public static void sortMenuList(List<Menu> list, List<Menu> sourceList, String parentId, boolean cascade){
		for (int i=0; i<sourceList.size(); i++){
			Menu e = sourceList.get(i);
			if (e.getParentId().equals(parentId)){
				list.add(e);
				if (cascade){
					// 判断是否还有子节点, 有则继续获取子节点
					for (int j=0; j<sourceList.size(); j++){
						Menu child = sourceList.get(j);
						if (child.getParentId().equals(e.getId())){
							sortMenuList(list, sourceList, e.getId(), true);
							break;
						}
					}
				}
			}
		}
	}


}
