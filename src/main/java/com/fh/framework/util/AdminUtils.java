package com.fh.framework.util;

import com.fh.common.core.SpringContextHolder;
import com.fh.common.util.SerializeUtils;
import com.fh.common.util.ServletUtils;
import com.fh.sys.model.*;
import com.fh.sys.service.GroupService;
import com.fh.sys.service.MenuService;
import com.fh.sys.service.RoleMenuService;
import com.google.common.collect.Lists;
import org.springframework.web.util.WebUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdminUtils {
	private static MenuService menuService = SpringContextHolder.getBean(MenuService.class);
	private static RoleMenuService roleMenuService = SpringContextHolder.getBean(RoleMenuService.class);
	private static GroupService groupService= SpringContextHolder.getBean(GroupService.class);
	private static List<Menu> systemMenuList;
	public static List<Menu> getSystemMenuList(){
		if(systemMenuList == null){
			MenuExample ex = new MenuExample();
			ex.createCriteria().andDelFlagEqualTo(0);
			ex.setOrderByClause("sort asc");
			List<Menu> sourceList = menuService.selectByExample(ex);
			List<Menu> list = new ArrayList<Menu>();
			Menu.sortList(list, sourceList, Menu.getRootPId(), true);
			systemMenuList = list;
		}
		return SerializeUtils.deepClone(systemMenuList);
	}
	public static Admin getAdmin() {
		return (Admin) WebUtils.getSessionAttribute(ServletUtils.getRequest(), "admin");
	}
	public static String getGroupId() {
		return getAdmin().getGroupId();
	}
	public static boolean isSystemAdmin(){
		return "1".equals(getAdmin().getId());
	}
	public static List<Menu> getMenuList(){
		if (isSystemAdmin()) {
			return getSystemMenuList();
		}
		List<Menu> menuList = (List<Menu>) WebUtils.getSessionAttribute(ServletUtils.getRequest(), "menuList");
		if(menuList == null) {
			String groupId = getGroupId();
			Group group = groupService.selectByPrimaryKey(groupId);
			RoleMenuExample rmEx = new RoleMenuExample();
			rmEx.createCriteria().andRoleIdEqualTo(group.getRoleId());
			List<RoleMenu> rmList = roleMenuService.selectByExample(rmEx);
			List<String> menuIds = Lists.newArrayList();
			for (RoleMenu roleMenu : rmList) {
				menuIds.add(roleMenu.getMenuId());
			}
			menuList = getSystemMenuList();
			for (Iterator<Menu> iterator = menuList.iterator(); iterator.hasNext();) {
				Menu menu = (Menu) iterator.next();
				if (!menuIds.contains(menu.getId())) {
					iterator.remove();
				}
			}
			WebUtils.setSessionAttribute(ServletUtils.getRequest(), "menuList", menuList);
		}
		return menuList;
	}
	public static List<Menu> getMenuTree(){
		return getMenuTree(Menu.getRootId());
	}
	public static List<Menu> getMenuTree(String rootId){
		List<Menu> sourceList = getMenuList();
		List<Menu> menuTree = new ArrayList<Menu>();
		for (Menu menu : sourceList) {
			if(rootId.equals(menu.getId())){
				menuTree.add(menu);
			}
		}
		buildChildList(menuTree, sourceList);
		return menuTree;
	}
	public static void buildChildList(List<Menu> menuTree, List<Menu> sourcelist){
		for (Menu menu : menuTree) {
			Iterator<Menu> sourcelistItr = sourcelist.iterator();
			while (sourcelistItr.hasNext()) {
				Menu child = (Menu) sourcelistItr.next();
				if(menu.getId().equals(child.getParentId())){
					menu.getChildren().add(child);
					sourcelistItr.remove();//
				}
			}
			buildChildList(menu.getChildren(), sourcelist);
		}
	}
}
