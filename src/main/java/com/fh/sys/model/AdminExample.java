package com.fh.sys.model;

import java.util.List;
import java.util.ArrayList;

public class AdminExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public AdminExample(){
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

		public Criteria andUserCodeIsNull() {
			addCriterion("user_code is null");
			return (Criteria) this;
		}

		public Criteria andUserCodeIsNotNull() {
			addCriterion("user_code is not null");
			return (Criteria) this;
		}

		public Criteria andUserCodeEqualTo(String value) {
			addCriterion("user_code =", value, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeNotEqualTo(String value) {
			addCriterion("user_code <>", value, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeGreaterThan(String value) {
			addCriterion("user_code >", value, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
			addCriterion("user_code >=", value, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeLessThan(String value) {
			addCriterion("user_code <", value, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeLessThanOrEqualTo(String value) {
			addCriterion("user_code <=", value, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeLike(String value) {
			addCriterion("user_code like", value, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeNotLike(String value) {
			addCriterion("user_code not like", value, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeIn(List<String> values) {
			addCriterion("user_code in", values, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeNotIn(List<String> values) {
			addCriterion("user_code not in", values, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeBetween(String value1, String value2) {
			addCriterion("user_code between", value1, value2, "userCode");
			return (Criteria) this;
		}

		public Criteria andUserCodeNotBetween(String value1, String value2) {
			addCriterion("user_code not between", value1, value2, "userCode");
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

		public Criteria andRoleIdsIsNull() {
			addCriterion("role_ids is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdsIsNotNull() {
			addCriterion("role_ids is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdsEqualTo(String value) {
			addCriterion("role_ids =", value, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsNotEqualTo(String value) {
			addCriterion("role_ids <>", value, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsGreaterThan(String value) {
			addCriterion("role_ids >", value, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsGreaterThanOrEqualTo(String value) {
			addCriterion("role_ids >=", value, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsLessThan(String value) {
			addCriterion("role_ids <", value, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsLessThanOrEqualTo(String value) {
			addCriterion("role_ids <=", value, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsLike(String value) {
			addCriterion("role_ids like", value, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsNotLike(String value) {
			addCriterion("role_ids not like", value, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsIn(List<String> values) {
			addCriterion("role_ids in", values, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsNotIn(List<String> values) {
			addCriterion("role_ids not in", values, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsBetween(String value1, String value2) {
			addCriterion("role_ids between", value1, value2, "roleIds");
			return (Criteria) this;
		}

		public Criteria andRoleIdsNotBetween(String value1, String value2) {
			addCriterion("role_ids not between", value1, value2, "roleIds");
			return (Criteria) this;
		}

		public Criteria andLoginnameIsNull() {
			addCriterion("loginname is null");
			return (Criteria) this;
		}

		public Criteria andLoginnameIsNotNull() {
			addCriterion("loginname is not null");
			return (Criteria) this;
		}

		public Criteria andLoginnameEqualTo(String value) {
			addCriterion("loginname =", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotEqualTo(String value) {
			addCriterion("loginname <>", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameGreaterThan(String value) {
			addCriterion("loginname >", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
			addCriterion("loginname >=", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLessThan(String value) {
			addCriterion("loginname <", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLessThanOrEqualTo(String value) {
			addCriterion("loginname <=", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameLike(String value) {
			addCriterion("loginname like", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotLike(String value) {
			addCriterion("loginname not like", value, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameIn(List<String> values) {
			addCriterion("loginname in", values, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotIn(List<String> values) {
			addCriterion("loginname not in", values, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameBetween(String value1, String value2) {
			addCriterion("loginname between", value1, value2, "loginname");
			return (Criteria) this;
		}

		public Criteria andLoginnameNotBetween(String value1, String value2) {
			addCriterion("loginname not between", value1, value2, "loginname");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andJobnoIsNull() {
			addCriterion("jobno is null");
			return (Criteria) this;
		}

		public Criteria andJobnoIsNotNull() {
			addCriterion("jobno is not null");
			return (Criteria) this;
		}

		public Criteria andJobnoEqualTo(String value) {
			addCriterion("jobno =", value, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoNotEqualTo(String value) {
			addCriterion("jobno <>", value, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoGreaterThan(String value) {
			addCriterion("jobno >", value, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoGreaterThanOrEqualTo(String value) {
			addCriterion("jobno >=", value, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoLessThan(String value) {
			addCriterion("jobno <", value, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoLessThanOrEqualTo(String value) {
			addCriterion("jobno <=", value, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoLike(String value) {
			addCriterion("jobno like", value, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoNotLike(String value) {
			addCriterion("jobno not like", value, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoIn(List<String> values) {
			addCriterion("jobno in", values, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoNotIn(List<String> values) {
			addCriterion("jobno not in", values, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoBetween(String value1, String value2) {
			addCriterion("jobno between", value1, value2, "jobno");
			return (Criteria) this;
		}

		public Criteria andJobnoNotBetween(String value1, String value2) {
			addCriterion("jobno not between", value1, value2, "jobno");
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

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(Integer value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(Integer value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(Integer value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(Integer value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(Integer value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(Integer value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<Integer> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<Integer> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(Integer value1, Integer value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(Integer value1, Integer value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andMobileIsNull() {
			addCriterion("mobile is null");
			return (Criteria) this;
		}

		public Criteria andMobileIsNotNull() {
			addCriterion("mobile is not null");
			return (Criteria) this;
		}

		public Criteria andMobileEqualTo(String value) {
			addCriterion("mobile =", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotEqualTo(String value) {
			addCriterion("mobile <>", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThan(String value) {
			addCriterion("mobile >", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileGreaterThanOrEqualTo(String value) {
			addCriterion("mobile >=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThan(String value) {
			addCriterion("mobile <", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLessThanOrEqualTo(String value) {
			addCriterion("mobile <=", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileLike(String value) {
			addCriterion("mobile like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotLike(String value) {
			addCriterion("mobile not like", value, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileIn(List<String> values) {
			addCriterion("mobile in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotIn(List<String> values) {
			addCriterion("mobile not in", values, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileBetween(String value1, String value2) {
			addCriterion("mobile between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andMobileNotBetween(String value1, String value2) {
			addCriterion("mobile not between", value1, value2, "mobile");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNull() {
			addCriterion("user_type is null");
			return (Criteria) this;
		}

		public Criteria andUserTypeIsNotNull() {
			addCriterion("user_type is not null");
			return (Criteria) this;
		}

		public Criteria andUserTypeEqualTo(String value) {
			addCriterion("user_type =", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotEqualTo(String value) {
			addCriterion("user_type <>", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThan(String value) {
			addCriterion("user_type >", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
			addCriterion("user_type >=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThan(String value) {
			addCriterion("user_type <", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLessThanOrEqualTo(String value) {
			addCriterion("user_type <=", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeLike(String value) {
			addCriterion("user_type like", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotLike(String value) {
			addCriterion("user_type not like", value, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeIn(List<String> values) {
			addCriterion("user_type in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotIn(List<String> values) {
			addCriterion("user_type not in", values, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeBetween(String value1, String value2) {
			addCriterion("user_type between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andUserTypeNotBetween(String value1, String value2) {
			addCriterion("user_type not between", value1, value2, "userType");
			return (Criteria) this;
		}

		public Criteria andPhotoIsNull() {
			addCriterion("photo is null");
			return (Criteria) this;
		}

		public Criteria andPhotoIsNotNull() {
			addCriterion("photo is not null");
			return (Criteria) this;
		}

		public Criteria andPhotoEqualTo(String value) {
			addCriterion("photo =", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotEqualTo(String value) {
			addCriterion("photo <>", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoGreaterThan(String value) {
			addCriterion("photo >", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoGreaterThanOrEqualTo(String value) {
			addCriterion("photo >=", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLessThan(String value) {
			addCriterion("photo <", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLessThanOrEqualTo(String value) {
			addCriterion("photo <=", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLike(String value) {
			addCriterion("photo like", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotLike(String value) {
			addCriterion("photo not like", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoIn(List<String> values) {
			addCriterion("photo in", values, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotIn(List<String> values) {
			addCriterion("photo not in", values, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoBetween(String value1, String value2) {
			addCriterion("photo between", value1, value2, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotBetween(String value1, String value2) {
			addCriterion("photo not between", value1, value2, "photo");
			return (Criteria) this;
		}

		public Criteria andLoginIpIsNull() {
			addCriterion("login_ip is null");
			return (Criteria) this;
		}

		public Criteria andLoginIpIsNotNull() {
			addCriterion("login_ip is not null");
			return (Criteria) this;
		}

		public Criteria andLoginIpEqualTo(String value) {
			addCriterion("login_ip =", value, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpNotEqualTo(String value) {
			addCriterion("login_ip <>", value, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpGreaterThan(String value) {
			addCriterion("login_ip >", value, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
			addCriterion("login_ip >=", value, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpLessThan(String value) {
			addCriterion("login_ip <", value, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpLessThanOrEqualTo(String value) {
			addCriterion("login_ip <=", value, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpLike(String value) {
			addCriterion("login_ip like", value, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpNotLike(String value) {
			addCriterion("login_ip not like", value, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpIn(List<String> values) {
			addCriterion("login_ip in", values, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpNotIn(List<String> values) {
			addCriterion("login_ip not in", values, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpBetween(String value1, String value2) {
			addCriterion("login_ip between", value1, value2, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginIpNotBetween(String value1, String value2) {
			addCriterion("login_ip not between", value1, value2, "loginIp");
			return (Criteria) this;
		}

		public Criteria andLoginDateIsNull() {
			addCriterion("login_date is null");
			return (Criteria) this;
		}

		public Criteria andLoginDateIsNotNull() {
			addCriterion("login_date is not null");
			return (Criteria) this;
		}

		public Criteria andLoginDateEqualTo(java.util.Date value) {
			addCriterion("login_date =", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateNotEqualTo(java.util.Date value) {
			addCriterion("login_date <>", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateGreaterThan(java.util.Date value) {
			addCriterion("login_date >", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateGreaterThanOrEqualTo(java.util.Date value) {
			addCriterion("login_date >=", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateLessThan(java.util.Date value) {
			addCriterion("login_date <", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateLessThanOrEqualTo(java.util.Date value) {
			addCriterion("login_date <=", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateIn(List<java.util.Date> values) {
			addCriterion("login_date in", values, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateNotIn(List<java.util.Date> values) {
			addCriterion("login_date not in", values, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("login_date between", value1, value2, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLoginDateNotBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("login_date not between", value1, value2, "loginDate");
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