package com.fh.sys.model;

public class RoleMenuKey {
	private String roleId;
	private String menuId;

	public void setRoleId(String roleId) {
		this.roleId=roleId == null ? roleId : roleId.trim();
	}

	public String getRoleId() {
		return roleId;
	}

	public void setMenuId(String menuId) {
		this.menuId=menuId == null ? menuId : menuId.trim();
	}

	public String getMenuId() {
		return menuId;
	}

}
