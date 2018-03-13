package com.fh.fh.model;

import java.util.List;
import java.util.ArrayList;

public class FranchiseeExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public FranchiseeExample(){
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

		public Criteria andFranchiseeIdIsNull() {
			addCriterion("franchisee_id is null");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdIsNotNull() {
			addCriterion("franchisee_id is not null");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdEqualTo(Integer value) {
			addCriterion("franchisee_id =", value, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdNotEqualTo(Integer value) {
			addCriterion("franchisee_id <>", value, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdGreaterThan(Integer value) {
			addCriterion("franchisee_id >", value, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("franchisee_id >=", value, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdLessThan(Integer value) {
			addCriterion("franchisee_id <", value, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdLessThanOrEqualTo(Integer value) {
			addCriterion("franchisee_id <=", value, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdIn(List<Integer> values) {
			addCriterion("franchisee_id in", values, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdNotIn(List<Integer> values) {
			addCriterion("franchisee_id not in", values, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdBetween(Integer value1, Integer value2) {
			addCriterion("franchisee_id between", value1, value2, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeIdNotBetween(Integer value1, Integer value2) {
			addCriterion("franchisee_id not between", value1, value2, "franchiseeId");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameIsNull() {
			addCriterion("franchisee_name is null");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameIsNotNull() {
			addCriterion("franchisee_name is not null");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameEqualTo(String value) {
			addCriterion("franchisee_name =", value, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameNotEqualTo(String value) {
			addCriterion("franchisee_name <>", value, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameGreaterThan(String value) {
			addCriterion("franchisee_name >", value, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameGreaterThanOrEqualTo(String value) {
			addCriterion("franchisee_name >=", value, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameLessThan(String value) {
			addCriterion("franchisee_name <", value, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameLessThanOrEqualTo(String value) {
			addCriterion("franchisee_name <=", value, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameLike(String value) {
			addCriterion("franchisee_name like", value, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameNotLike(String value) {
			addCriterion("franchisee_name not like", value, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameIn(List<String> values) {
			addCriterion("franchisee_name in", values, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameNotIn(List<String> values) {
			addCriterion("franchisee_name not in", values, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameBetween(String value1, String value2) {
			addCriterion("franchisee_name between", value1, value2, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andFranchiseeNameNotBetween(String value1, String value2) {
			addCriterion("franchisee_name not between", value1, value2, "franchiseeName");
			return (Criteria) this;
		}

		public Criteria andLogoIsNull() {
			addCriterion("logo is null");
			return (Criteria) this;
		}

		public Criteria andLogoIsNotNull() {
			addCriterion("logo is not null");
			return (Criteria) this;
		}

		public Criteria andLogoEqualTo(String value) {
			addCriterion("logo =", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotEqualTo(String value) {
			addCriterion("logo <>", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoGreaterThan(String value) {
			addCriterion("logo >", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoGreaterThanOrEqualTo(String value) {
			addCriterion("logo >=", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoLessThan(String value) {
			addCriterion("logo <", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoLessThanOrEqualTo(String value) {
			addCriterion("logo <=", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoLike(String value) {
			addCriterion("logo like", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotLike(String value) {
			addCriterion("logo not like", value, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoIn(List<String> values) {
			addCriterion("logo in", values, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotIn(List<String> values) {
			addCriterion("logo not in", values, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoBetween(String value1, String value2) {
			addCriterion("logo between", value1, value2, "logo");
			return (Criteria) this;
		}

		public Criteria andLogoNotBetween(String value1, String value2) {
			addCriterion("logo not between", value1, value2, "logo");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(Integer value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(Integer value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(Integer value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(Integer value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(Integer value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(Integer value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<Integer> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<Integer> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(Integer value1, Integer value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(Integer value1, Integer value2) {
			addCriterion("state not between", value1, value2, "state");
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