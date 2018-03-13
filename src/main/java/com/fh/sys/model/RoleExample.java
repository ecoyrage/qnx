package com.fh.sys.model;

import java.util.List;
import java.util.ArrayList;

public class RoleExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public RoleExample(){
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andGroupIdIsNull() {
			addCriterion("group_id is null");
			return (Criteria) this;
		}

		public Criteria andGroupIdIsNotNull() {
			addCriterion("group_id is not null");
			return (Criteria) this;
		}

		public Criteria andGroupIdEqualTo(String value) {
			addCriterion("group_id =", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotEqualTo(String value) {
			addCriterion("group_id <>", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdGreaterThan(String value) {
			addCriterion("group_id >", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
			addCriterion("group_id >=", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdLessThan(String value) {
			addCriterion("group_id <", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdLessThanOrEqualTo(String value) {
			addCriterion("group_id <=", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdLike(String value) {
			addCriterion("group_id like", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotLike(String value) {
			addCriterion("group_id not like", value, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdIn(List<String> values) {
			addCriterion("group_id in", values, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotIn(List<String> values) {
			addCriterion("group_id not in", values, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdBetween(String value1, String value2) {
			addCriterion("group_id between", value1, value2, "groupId");
			return (Criteria) this;
		}

		public Criteria andGroupIdNotBetween(String value1, String value2) {
			addCriterion("group_id not between", value1, value2, "groupId");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andEnnameIsNull() {
			addCriterion("enname is null");
			return (Criteria) this;
		}

		public Criteria andEnnameIsNotNull() {
			addCriterion("enname is not null");
			return (Criteria) this;
		}

		public Criteria andEnnameEqualTo(String value) {
			addCriterion("enname =", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotEqualTo(String value) {
			addCriterion("enname <>", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameGreaterThan(String value) {
			addCriterion("enname >", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameGreaterThanOrEqualTo(String value) {
			addCriterion("enname >=", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLessThan(String value) {
			addCriterion("enname <", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLessThanOrEqualTo(String value) {
			addCriterion("enname <=", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameLike(String value) {
			addCriterion("enname like", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotLike(String value) {
			addCriterion("enname not like", value, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameIn(List<String> values) {
			addCriterion("enname in", values, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotIn(List<String> values) {
			addCriterion("enname not in", values, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameBetween(String value1, String value2) {
			addCriterion("enname between", value1, value2, "enname");
			return (Criteria) this;
		}

		public Criteria andEnnameNotBetween(String value1, String value2) {
			addCriterion("enname not between", value1, value2, "enname");
			return (Criteria) this;
		}

		public Criteria andRoleTypeIsNull() {
			addCriterion("role_type is null");
			return (Criteria) this;
		}

		public Criteria andRoleTypeIsNotNull() {
			addCriterion("role_type is not null");
			return (Criteria) this;
		}

		public Criteria andRoleTypeEqualTo(String value) {
			addCriterion("role_type =", value, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeNotEqualTo(String value) {
			addCriterion("role_type <>", value, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeGreaterThan(String value) {
			addCriterion("role_type >", value, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
			addCriterion("role_type >=", value, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeLessThan(String value) {
			addCriterion("role_type <", value, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeLessThanOrEqualTo(String value) {
			addCriterion("role_type <=", value, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeLike(String value) {
			addCriterion("role_type like", value, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeNotLike(String value) {
			addCriterion("role_type not like", value, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeIn(List<String> values) {
			addCriterion("role_type in", values, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeNotIn(List<String> values) {
			addCriterion("role_type not in", values, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeBetween(String value1, String value2) {
			addCriterion("role_type between", value1, value2, "roleType");
			return (Criteria) this;
		}

		public Criteria andRoleTypeNotBetween(String value1, String value2) {
			addCriterion("role_type not between", value1, value2, "roleType");
			return (Criteria) this;
		}

		public Criteria andRemarksIsNull() {
			addCriterion("remarks is null");
			return (Criteria) this;
		}

		public Criteria andRemarksIsNotNull() {
			addCriterion("remarks is not null");
			return (Criteria) this;
		}

		public Criteria andRemarksEqualTo(String value) {
			addCriterion("remarks =", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotEqualTo(String value) {
			addCriterion("remarks <>", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksGreaterThan(String value) {
			addCriterion("remarks >", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksGreaterThanOrEqualTo(String value) {
			addCriterion("remarks >=", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLessThan(String value) {
			addCriterion("remarks <", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLessThanOrEqualTo(String value) {
			addCriterion("remarks <=", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksLike(String value) {
			addCriterion("remarks like", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotLike(String value) {
			addCriterion("remarks not like", value, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksIn(List<String> values) {
			addCriterion("remarks in", values, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotIn(List<String> values) {
			addCriterion("remarks not in", values, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksBetween(String value1, String value2) {
			addCriterion("remarks between", value1, value2, "remarks");
			return (Criteria) this;
		}

		public Criteria andRemarksNotBetween(String value1, String value2) {
			addCriterion("remarks not between", value1, value2, "remarks");
			return (Criteria) this;
		}

		public Criteria andUseableIsNull() {
			addCriterion("useable is null");
			return (Criteria) this;
		}

		public Criteria andUseableIsNotNull() {
			addCriterion("useable is not null");
			return (Criteria) this;
		}

		public Criteria andUseableEqualTo(Integer value) {
			addCriterion("useable =", value, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableNotEqualTo(Integer value) {
			addCriterion("useable <>", value, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableGreaterThan(Integer value) {
			addCriterion("useable >", value, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableGreaterThanOrEqualTo(Integer value) {
			addCriterion("useable >=", value, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableLessThan(Integer value) {
			addCriterion("useable <", value, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableLessThanOrEqualTo(Integer value) {
			addCriterion("useable <=", value, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableIn(List<Integer> values) {
			addCriterion("useable in", values, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableNotIn(List<Integer> values) {
			addCriterion("useable not in", values, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableBetween(Integer value1, Integer value2) {
			addCriterion("useable between", value1, value2, "useable");
			return (Criteria) this;
		}

		public Criteria andUseableNotBetween(Integer value1, Integer value2) {
			addCriterion("useable not between", value1, value2, "useable");
			return (Criteria) this;
		}

		public Criteria andCreateByIsNull() {
			addCriterion("create_by is null");
			return (Criteria) this;
		}

		public Criteria andCreateByIsNotNull() {
			addCriterion("create_by is not null");
			return (Criteria) this;
		}

		public Criteria andCreateByEqualTo(String value) {
			addCriterion("create_by =", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByNotEqualTo(String value) {
			addCriterion("create_by <>", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByGreaterThan(String value) {
			addCriterion("create_by >", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByGreaterThanOrEqualTo(String value) {
			addCriterion("create_by >=", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByLessThan(String value) {
			addCriterion("create_by <", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByLessThanOrEqualTo(String value) {
			addCriterion("create_by <=", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByLike(String value) {
			addCriterion("create_by like", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByNotLike(String value) {
			addCriterion("create_by not like", value, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByIn(List<String> values) {
			addCriterion("create_by in", values, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByNotIn(List<String> values) {
			addCriterion("create_by not in", values, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByBetween(String value1, String value2) {
			addCriterion("create_by between", value1, value2, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateByNotBetween(String value1, String value2) {
			addCriterion("create_by not between", value1, value2, "createBy");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}

		public Criteria andCreateDateIsNotNull() {
			addCriterion("create_date is not null");
			return (Criteria) this;
		}

		public Criteria andCreateDateEqualTo(java.util.Date value) {
			addCriterion("create_date =", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotEqualTo(java.util.Date value) {
			addCriterion("create_date <>", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThan(java.util.Date value) {
			addCriterion("create_date >", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateGreaterThanOrEqualTo(java.util.Date value) {
			addCriterion("create_date >=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThan(java.util.Date value) {
			addCriterion("create_date <", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateLessThanOrEqualTo(java.util.Date value) {
			addCriterion("create_date <=", value, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateIn(List<java.util.Date> values) {
			addCriterion("create_date in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotIn(List<java.util.Date> values) {
			addCriterion("create_date not in", values, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andCreateDateNotBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (Criteria) this;
		}

		public Criteria andUpdateByIsNull() {
			addCriterion("update_by is null");
			return (Criteria) this;
		}

		public Criteria andUpdateByIsNotNull() {
			addCriterion("update_by is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateByEqualTo(String value) {
			addCriterion("update_by =", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByNotEqualTo(String value) {
			addCriterion("update_by <>", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByGreaterThan(String value) {
			addCriterion("update_by >", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
			addCriterion("update_by >=", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByLessThan(String value) {
			addCriterion("update_by <", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByLessThanOrEqualTo(String value) {
			addCriterion("update_by <=", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByLike(String value) {
			addCriterion("update_by like", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByNotLike(String value) {
			addCriterion("update_by not like", value, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByIn(List<String> values) {
			addCriterion("update_by in", values, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByNotIn(List<String> values) {
			addCriterion("update_by not in", values, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByBetween(String value1, String value2) {
			addCriterion("update_by between", value1, value2, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateByNotBetween(String value1, String value2) {
			addCriterion("update_by not between", value1, value2, "updateBy");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateEqualTo(java.util.Date value) {
			addCriterion("update_date =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(java.util.Date value) {
			addCriterion("update_date <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(java.util.Date value) {
			addCriterion("update_date >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(java.util.Date value) {
			addCriterion("update_date >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(java.util.Date value) {
			addCriterion("update_date <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(java.util.Date value) {
			addCriterion("update_date <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<java.util.Date> values) {
			addCriterion("update_date in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<java.util.Date> values) {
			addCriterion("update_date not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("update_date between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("update_date not between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andDelFlagIsNull() {
			addCriterion("del_flag is null");
			return (Criteria) this;
		}

		public Criteria andDelFlagIsNotNull() {
			addCriterion("del_flag is not null");
			return (Criteria) this;
		}

		public Criteria andDelFlagEqualTo(Integer value) {
			addCriterion("del_flag =", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagNotEqualTo(Integer value) {
			addCriterion("del_flag <>", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagGreaterThan(Integer value) {
			addCriterion("del_flag >", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
			addCriterion("del_flag >=", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagLessThan(Integer value) {
			addCriterion("del_flag <", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
			addCriterion("del_flag <=", value, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagIn(List<Integer> values) {
			addCriterion("del_flag in", values, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagNotIn(List<Integer> values) {
			addCriterion("del_flag not in", values, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagBetween(Integer value1, Integer value2) {
			addCriterion("del_flag between", value1, value2, "delFlag");
			return (Criteria) this;
		}

		public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
			addCriterion("del_flag not between", value1, value2, "delFlag");
			return (Criteria) this;
		}

}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
		return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}