package com.fh.sys.model;

import java.util.List;

public class RoleMenu extends RoleMenuKey {
	private Integer editable;

	public void setEditable(Integer editable) {
		this.editable=editable;
	}

	public Integer getEditable() {
		return editable;
	}
	
	public boolean beContains(List<RoleMenu> roleMenuList){
		for (RoleMenu roleMenu : roleMenuList) {
			if(roleMenu.getMenuId().equals(this.getMenuId())){
				return true;
			}
		}
		return false;
	}

}
