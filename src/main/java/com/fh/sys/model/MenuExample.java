package com.fh.sys.model;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public MenuExample(){
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

		public Criteria andParentIdIsNull() {
			addCriterion("parent_id is null");
			return (Criteria) this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("parent_id is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdEqualTo(String value) {
			addCriterion("parent_id =", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotEqualTo(String value) {
			addCriterion("parent_id <>", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThan(String value) {
			addCriterion("parent_id >", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(String value) {
			addCriterion("parent_id >=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThan(String value) {
			addCriterion("parent_id <", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLessThanOrEqualTo(String value) {
			addCriterion("parent_id <=", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdLike(String value) {
			addCriterion("parent_id like", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotLike(String value) {
			addCriterion("parent_id not like", value, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdIn(List<String> values) {
			addCriterion("parent_id in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotIn(List<String> values) {
			addCriterion("parent_id not in", values, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdBetween(String value1, String value2) {
			addCriterion("parent_id between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdNotBetween(String value1, String value2) {
			addCriterion("parent_id not between", value1, value2, "parentId");
			return (Criteria) this;
		}

		public Criteria andParentIdsIsNull() {
			addCriterion("parent_ids is null");
			return (Criteria) this;
		}

		public Criteria andParentIdsIsNotNull() {
			addCriterion("parent_ids is not null");
			return (Criteria) this;
		}

		public Criteria andParentIdsEqualTo(String value) {
			addCriterion("parent_ids =", value, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsNotEqualTo(String value) {
			addCriterion("parent_ids <>", value, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsGreaterThan(String value) {
			addCriterion("parent_ids >", value, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsGreaterThanOrEqualTo(String value) {
			addCriterion("parent_ids >=", value, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsLessThan(String value) {
			addCriterion("parent_ids <", value, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsLessThanOrEqualTo(String value) {
			addCriterion("parent_ids <=", value, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsLike(String value) {
			addCriterion("parent_ids like", value, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsNotLike(String value) {
			addCriterion("parent_ids not like", value, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsIn(List<String> values) {
			addCriterion("parent_ids in", values, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsNotIn(List<String> values) {
			addCriterion("parent_ids not in", values, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsBetween(String value1, String value2) {
			addCriterion("parent_ids between", value1, value2, "parentIds");
			return (Criteria) this;
		}

		public Criteria andParentIdsNotBetween(String value1, String value2) {
			addCriterion("parent_ids not between", value1, value2, "parentIds");
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

		public Criteria andRightsCodeIsNull() {
			addCriterion("rights_code is null");
			return (Criteria) this;
		}

		public Criteria andRightsCodeIsNotNull() {
			addCriterion("rights_code is not null");
			return (Criteria) this;
		}

		public Criteria andRightsCodeEqualTo(String value) {
			addCriterion("rights_code =", value, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeNotEqualTo(String value) {
			addCriterion("rights_code <>", value, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeGreaterThan(String value) {
			addCriterion("rights_code >", value, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeGreaterThanOrEqualTo(String value) {
			addCriterion("rights_code >=", value, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeLessThan(String value) {
			addCriterion("rights_code <", value, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeLessThanOrEqualTo(String value) {
			addCriterion("rights_code <=", value, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeLike(String value) {
			addCriterion("rights_code like", value, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeNotLike(String value) {
			addCriterion("rights_code not like", value, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeIn(List<String> values) {
			addCriterion("rights_code in", values, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeNotIn(List<String> values) {
			addCriterion("rights_code not in", values, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeBetween(String value1, String value2) {
			addCriterion("rights_code between", value1, value2, "rightsCode");
			return (Criteria) this;
		}

		public Criteria andRightsCodeNotBetween(String value1, String value2) {
			addCriterion("rights_code not between", value1, value2, "rightsCode");
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

		public Criteria andSortIsNull() {
			addCriterion("sort is null");
			return (Criteria) this;
		}

		public Criteria andSortIsNotNull() {
			addCriterion("sort is not null");
			return (Criteria) this;
		}

		public Criteria andSortEqualTo(Integer value) {
			addCriterion("sort =", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotEqualTo(Integer value) {
			addCriterion("sort <>", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortGreaterThan(Integer value) {
			addCriterion("sort >", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortGreaterThanOrEqualTo(Integer value) {
			addCriterion("sort >=", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortLessThan(Integer value) {
			addCriterion("sort <", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortLessThanOrEqualTo(Integer value) {
			addCriterion("sort <=", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortIn(List<Integer> values) {
			addCriterion("sort in", values, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotIn(List<Integer> values) {
			addCriterion("sort not in", values, "sort");
			return (Criteria) this;
		}

		public Criteria andSortBetween(Integer value1, Integer value2) {
			addCriterion("sort between", value1, value2, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotBetween(Integer value1, Integer value2) {
			addCriterion("sort not between", value1, value2, "sort");
			return (Criteria) this;
		}

		public Criteria andHrefIsNull() {
			addCriterion("href is null");
			return (Criteria) this;
		}

		public Criteria andHrefIsNotNull() {
			addCriterion("href is not null");
			return (Criteria) this;
		}

		public Criteria andHrefEqualTo(String value) {
			addCriterion("href =", value, "href");
			return (Criteria) this;
		}

		public Criteria andHrefNotEqualTo(String value) {
			addCriterion("href <>", value, "href");
			return (Criteria) this;
		}

		public Criteria andHrefGreaterThan(String value) {
			addCriterion("href >", value, "href");
			return (Criteria) this;
		}

		public Criteria andHrefGreaterThanOrEqualTo(String value) {
			addCriterion("href >=", value, "href");
			return (Criteria) this;
		}

		public Criteria andHrefLessThan(String value) {
			addCriterion("href <", value, "href");
			return (Criteria) this;
		}

		public Criteria andHrefLessThanOrEqualTo(String value) {
			addCriterion("href <=", value, "href");
			return (Criteria) this;
		}

		public Criteria andHrefLike(String value) {
			addCriterion("href like", value, "href");
			return (Criteria) this;
		}

		public Criteria andHrefNotLike(String value) {
			addCriterion("href not like", value, "href");
			return (Criteria) this;
		}

		public Criteria andHrefIn(List<String> values) {
			addCriterion("href in", values, "href");
			return (Criteria) this;
		}

		public Criteria andHrefNotIn(List<String> values) {
			addCriterion("href not in", values, "href");
			return (Criteria) this;
		}

		public Criteria andHrefBetween(String value1, String value2) {
			addCriterion("href between", value1, value2, "href");
			return (Criteria) this;
		}

		public Criteria andHrefNotBetween(String value1, String value2) {
			addCriterion("href not between", value1, value2, "href");
			return (Criteria) this;
		}

		public Criteria andTargetIsNull() {
			addCriterion("target is null");
			return (Criteria) this;
		}

		public Criteria andTargetIsNotNull() {
			addCriterion("target is not null");
			return (Criteria) this;
		}

		public Criteria andTargetEqualTo(String value) {
			addCriterion("target =", value, "target");
			return (Criteria) this;
		}

		public Criteria andTargetNotEqualTo(String value) {
			addCriterion("target <>", value, "target");
			return (Criteria) this;
		}

		public Criteria andTargetGreaterThan(String value) {
			addCriterion("target >", value, "target");
			return (Criteria) this;
		}

		public Criteria andTargetGreaterThanOrEqualTo(String value) {
			addCriterion("target >=", value, "target");
			return (Criteria) this;
		}

		public Criteria andTargetLessThan(String value) {
			addCriterion("target <", value, "target");
			return (Criteria) this;
		}

		public Criteria andTargetLessThanOrEqualTo(String value) {
			addCriterion("target <=", value, "target");
			return (Criteria) this;
		}

		public Criteria andTargetLike(String value) {
			addCriterion("target like", value, "target");
			return (Criteria) this;
		}

		public Criteria andTargetNotLike(String value) {
			addCriterion("target not like", value, "target");
			return (Criteria) this;
		}

		public Criteria andTargetIn(List<String> values) {
			addCriterion("target in", values, "target");
			return (Criteria) this;
		}

		public Criteria andTargetNotIn(List<String> values) {
			addCriterion("target not in", values, "target");
			return (Criteria) this;
		}

		public Criteria andTargetBetween(String value1, String value2) {
			addCriterion("target between", value1, value2, "target");
			return (Criteria) this;
		}

		public Criteria andTargetNotBetween(String value1, String value2) {
			addCriterion("target not between", value1, value2, "target");
			return (Criteria) this;
		}

		public Criteria andIconIsNull() {
			addCriterion("icon is null");
			return (Criteria) this;
		}

		public Criteria andIconIsNotNull() {
			addCriterion("icon is not null");
			return (Criteria) this;
		}

		public Criteria andIconEqualTo(String value) {
			addCriterion("icon =", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotEqualTo(String value) {
			addCriterion("icon <>", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconGreaterThan(String value) {
			addCriterion("icon >", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconGreaterThanOrEqualTo(String value) {
			addCriterion("icon >=", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLessThan(String value) {
			addCriterion("icon <", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLessThanOrEqualTo(String value) {
			addCriterion("icon <=", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconLike(String value) {
			addCriterion("icon like", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotLike(String value) {
			addCriterion("icon not like", value, "icon");
			return (Criteria) this;
		}

		public Criteria andIconIn(List<String> values) {
			addCriterion("icon in", values, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotIn(List<String> values) {
			addCriterion("icon not in", values, "icon");
			return (Criteria) this;
		}

		public Criteria andIconBetween(String value1, String value2) {
			addCriterion("icon between", value1, value2, "icon");
			return (Criteria) this;
		}

		public Criteria andIconNotBetween(String value1, String value2) {
			addCriterion("icon not between", value1, value2, "icon");
			return (Criteria) this;
		}

		public Criteria andIsHideIsNull() {
			addCriterion("is_hide is null");
			return (Criteria) this;
		}

		public Criteria andIsHideIsNotNull() {
			addCriterion("is_hide is not null");
			return (Criteria) this;
		}

		public Criteria andIsHideEqualTo(Integer value) {
			addCriterion("is_hide =", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideNotEqualTo(Integer value) {
			addCriterion("is_hide <>", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideGreaterThan(Integer value) {
			addCriterion("is_hide >", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_hide >=", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideLessThan(Integer value) {
			addCriterion("is_hide <", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideLessThanOrEqualTo(Integer value) {
			addCriterion("is_hide <=", value, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideIn(List<Integer> values) {
			addCriterion("is_hide in", values, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideNotIn(List<Integer> values) {
			addCriterion("is_hide not in", values, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideBetween(Integer value1, Integer value2) {
			addCriterion("is_hide between", value1, value2, "isHide");
			return (Criteria) this;
		}

		public Criteria andIsHideNotBetween(Integer value1, Integer value2) {
			addCriterion("is_hide not between", value1, value2, "isHide");
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