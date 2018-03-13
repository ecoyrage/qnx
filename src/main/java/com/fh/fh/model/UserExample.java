package com.fh.fh.model;

import java.util.List;
import java.util.ArrayList;

public class UserExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserExample(){
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

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

		public Criteria andRealNameIsNull() {
			addCriterion("real_name is null");
			return (Criteria) this;
		}

		public Criteria andRealNameIsNotNull() {
			addCriterion("real_name is not null");
			return (Criteria) this;
		}

		public Criteria andRealNameEqualTo(String value) {
			addCriterion("real_name =", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotEqualTo(String value) {
			addCriterion("real_name <>", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThan(String value) {
			addCriterion("real_name >", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameGreaterThanOrEqualTo(String value) {
			addCriterion("real_name >=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThan(String value) {
			addCriterion("real_name <", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLessThanOrEqualTo(String value) {
			addCriterion("real_name <=", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameLike(String value) {
			addCriterion("real_name like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotLike(String value) {
			addCriterion("real_name not like", value, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameIn(List<String> values) {
			addCriterion("real_name in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotIn(List<String> values) {
			addCriterion("real_name not in", values, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameBetween(String value1, String value2) {
			addCriterion("real_name between", value1, value2, "realName");
			return (Criteria) this;
		}

		public Criteria andRealNameNotBetween(String value1, String value2) {
			addCriterion("real_name not between", value1, value2, "realName");
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

		public Criteria andAccessTokenIsNull() {
			addCriterion("access_token is null");
			return (Criteria) this;
		}

		public Criteria andAccessTokenIsNotNull() {
			addCriterion("access_token is not null");
			return (Criteria) this;
		}

		public Criteria andAccessTokenEqualTo(String value) {
			addCriterion("access_token =", value, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenNotEqualTo(String value) {
			addCriterion("access_token <>", value, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenGreaterThan(String value) {
			addCriterion("access_token >", value, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
			addCriterion("access_token >=", value, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenLessThan(String value) {
			addCriterion("access_token <", value, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenLessThanOrEqualTo(String value) {
			addCriterion("access_token <=", value, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenLike(String value) {
			addCriterion("access_token like", value, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenNotLike(String value) {
			addCriterion("access_token not like", value, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenIn(List<String> values) {
			addCriterion("access_token in", values, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenNotIn(List<String> values) {
			addCriterion("access_token not in", values, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenBetween(String value1, String value2) {
			addCriterion("access_token between", value1, value2, "accessToken");
			return (Criteria) this;
		}

		public Criteria andAccessTokenNotBetween(String value1, String value2) {
			addCriterion("access_token not between", value1, value2, "accessToken");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeIsNull() {
			addCriterion("expired_time is null");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeIsNotNull() {
			addCriterion("expired_time is not null");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeEqualTo(java.util.Date value) {
			addCriterion("expired_time =", value, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeNotEqualTo(java.util.Date value) {
			addCriterion("expired_time <>", value, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeGreaterThan(java.util.Date value) {
			addCriterion("expired_time >", value, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeGreaterThanOrEqualTo(java.util.Date value) {
			addCriterion("expired_time >=", value, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeLessThan(java.util.Date value) {
			addCriterion("expired_time <", value, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeLessThanOrEqualTo(java.util.Date value) {
			addCriterion("expired_time <=", value, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeIn(List<java.util.Date> values) {
			addCriterion("expired_time in", values, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeNotIn(List<java.util.Date> values) {
			addCriterion("expired_time not in", values, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("expired_time between", value1, value2, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andExpiredTimeNotBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("expired_time not between", value1, value2, "expiredTime");
			return (Criteria) this;
		}

		public Criteria andLoginTypeIsNull() {
			addCriterion("login_type is null");
			return (Criteria) this;
		}

		public Criteria andLoginTypeIsNotNull() {
			addCriterion("login_type is not null");
			return (Criteria) this;
		}

		public Criteria andLoginTypeEqualTo(String value) {
			addCriterion("login_type =", value, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeNotEqualTo(String value) {
			addCriterion("login_type <>", value, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeGreaterThan(String value) {
			addCriterion("login_type >", value, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeGreaterThanOrEqualTo(String value) {
			addCriterion("login_type >=", value, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeLessThan(String value) {
			addCriterion("login_type <", value, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeLessThanOrEqualTo(String value) {
			addCriterion("login_type <=", value, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeLike(String value) {
			addCriterion("login_type like", value, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeNotLike(String value) {
			addCriterion("login_type not like", value, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeIn(List<String> values) {
			addCriterion("login_type in", values, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeNotIn(List<String> values) {
			addCriterion("login_type not in", values, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeBetween(String value1, String value2) {
			addCriterion("login_type between", value1, value2, "loginType");
			return (Criteria) this;
		}

		public Criteria andLoginTypeNotBetween(String value1, String value2) {
			addCriterion("login_type not between", value1, value2, "loginType");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
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

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(java.math.BigDecimal value) {
			addCriterion("amount =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(java.math.BigDecimal value) {
			addCriterion("amount <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(java.math.BigDecimal value) {
			addCriterion("amount >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(java.math.BigDecimal value) {
			addCriterion("amount >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(java.math.BigDecimal value) {
			addCriterion("amount <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(java.math.BigDecimal value) {
			addCriterion("amount <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<java.math.BigDecimal> values) {
			addCriterion("amount in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<java.math.BigDecimal> values) {
			addCriterion("amount not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
			addCriterion("amount between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(java.math.BigDecimal value1, java.math.BigDecimal value2) {
			addCriterion("amount not between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(java.util.Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(java.util.Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(java.util.Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(java.util.Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(java.util.Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(java.util.Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<java.util.Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<java.util.Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(java.util.Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(java.util.Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(java.util.Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(java.util.Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(java.util.Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<java.util.Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<java.util.Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
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