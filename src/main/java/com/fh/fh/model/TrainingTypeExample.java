package com.fh.fh.model;

import java.util.List;
import java.util.ArrayList;

public class TrainingTypeExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public TrainingTypeExample(){
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

		public Criteria andLevelIsNull() {
			addCriterion("level is null");
			return (Criteria) this;
		}

		public Criteria andLevelIsNotNull() {
			addCriterion("level is not null");
			return (Criteria) this;
		}

		public Criteria andLevelEqualTo(Integer value) {
			addCriterion("level =", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotEqualTo(Integer value) {
			addCriterion("level <>", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelGreaterThan(Integer value) {
			addCriterion("level >", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("level >=", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLessThan(Integer value) {
			addCriterion("level <", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLessThanOrEqualTo(Integer value) {
			addCriterion("level <=", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelIn(List<Integer> values) {
			addCriterion("level in", values, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotIn(List<Integer> values) {
			addCriterion("level not in", values, "level");
			return (Criteria) this;
		}

		public Criteria andLevelBetween(Integer value1, Integer value2) {
			addCriterion("level between", value1, value2, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("level not between", value1, value2, "level");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(Integer value) {
			addCriterion("parent_id =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(Integer value) {
			addCriterion("parent_id <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(Integer value) {
			addCriterion("parent_id >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("parent_id >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(Integer value) {
			addCriterion("parent_id <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(Integer value) {
			addCriterion("parent_id <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<Integer> values) {
			addCriterion("parent_id in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<Integer> values) {
			addCriterion("parent_id not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(Integer value1, Integer value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andRankIsNull() {
			addCriterion("rank is null");
			return (Criteria) this;
		}

		public Criteria andRankIsNotNull() {
			addCriterion("rank is not null");
			return (Criteria) this;
		}

		public Criteria andRankEqualTo(Integer value) {
			addCriterion("rank =", value, "rank");
			return (Criteria) this;
		}

		public Criteria andRankNotEqualTo(Integer value) {
			addCriterion("rank <>", value, "rank");
			return (Criteria) this;
		}

		public Criteria andRankGreaterThan(Integer value) {
			addCriterion("rank >", value, "rank");
			return (Criteria) this;
		}

		public Criteria andRankGreaterThanOrEqualTo(Integer value) {
			addCriterion("rank >=", value, "rank");
			return (Criteria) this;
		}

		public Criteria andRankLessThan(Integer value) {
			addCriterion("rank <", value, "rank");
			return (Criteria) this;
		}

		public Criteria andRankLessThanOrEqualTo(Integer value) {
			addCriterion("rank <=", value, "rank");
			return (Criteria) this;
		}

		public Criteria andRankIn(List<Integer> values) {
			addCriterion("rank in", values, "rank");
			return (Criteria) this;
		}

		public Criteria andRankNotIn(List<Integer> values) {
			addCriterion("rank not in", values, "rank");
			return (Criteria) this;
		}

		public Criteria andRankBetween(Integer value1, Integer value2) {
			addCriterion("rank between", value1, value2, "rank");
			return (Criteria) this;
		}

		public Criteria andRankNotBetween(Integer value1, Integer value2) {
			addCriterion("rank not between", value1, value2, "rank");
			return (Criteria) this;
		}

		public Criteria andTreePathIsNull() {
			addCriterion("tree_path is null");
			return (Criteria) this;
		}

		public Criteria andTreePathIsNotNull() {
			addCriterion("tree_path is not null");
			return (Criteria) this;
		}

		public Criteria andTreePathEqualTo(String value) {
			addCriterion("tree_path =", value, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathNotEqualTo(String value) {
			addCriterion("tree_path <>", value, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathGreaterThan(String value) {
			addCriterion("tree_path >", value, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathGreaterThanOrEqualTo(String value) {
			addCriterion("tree_path >=", value, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathLessThan(String value) {
			addCriterion("tree_path <", value, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathLessThanOrEqualTo(String value) {
			addCriterion("tree_path <=", value, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathLike(String value) {
			addCriterion("tree_path like", value, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathNotLike(String value) {
			addCriterion("tree_path not like", value, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathIn(List<String> values) {
			addCriterion("tree_path in", values, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathNotIn(List<String> values) {
			addCriterion("tree_path not in", values, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathBetween(String value1, String value2) {
			addCriterion("tree_path between", value1, value2, "treePath");
			return (Criteria) this;
		}

		public Criteria andTreePathNotBetween(String value1, String value2) {
			addCriterion("tree_path not between", value1, value2, "treePath");
			return (Criteria) this;
		}

		public Criteria andFullNameIsNull() {
			addCriterion("full_name is null");
			return (Criteria) this;
		}

		public Criteria andFullNameIsNotNull() {
			addCriterion("full_name is not null");
			return (Criteria) this;
		}

		public Criteria andFullNameEqualTo(String value) {
			addCriterion("full_name =", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameNotEqualTo(String value) {
			addCriterion("full_name <>", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameGreaterThan(String value) {
			addCriterion("full_name >", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameGreaterThanOrEqualTo(String value) {
			addCriterion("full_name >=", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameLessThan(String value) {
			addCriterion("full_name <", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameLessThanOrEqualTo(String value) {
			addCriterion("full_name <=", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameLike(String value) {
			addCriterion("full_name like", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameNotLike(String value) {
			addCriterion("full_name not like", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameIn(List<String> values) {
			addCriterion("full_name in", values, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameNotIn(List<String> values) {
			addCriterion("full_name not in", values, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameBetween(String value1, String value2) {
			addCriterion("full_name between", value1, value2, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameNotBetween(String value1, String value2) {
			addCriterion("full_name not between", value1, value2, "fullName");
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