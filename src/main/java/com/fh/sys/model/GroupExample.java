package com.fh.sys.model;

import java.util.List;
import java.util.ArrayList;

public class GroupExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public GroupExample(){
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

		public Criteria andRoleIdIsNull() {
			addCriterion("role_id is null");
			return (Criteria) this;
		}

		public Criteria andRoleIdIsNotNull() {
			addCriterion("role_id is not null");
			return (Criteria) this;
		}

		public Criteria andRoleIdEqualTo(String value) {
			addCriterion("role_id =", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotEqualTo(String value) {
			addCriterion("role_id <>", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThan(String value) {
			addCriterion("role_id >", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
			addCriterion("role_id >=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThan(String value) {
			addCriterion("role_id <", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLessThanOrEqualTo(String value) {
			addCriterion("role_id <=", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdLike(String value) {
			addCriterion("role_id like", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotLike(String value) {
			addCriterion("role_id not like", value, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdIn(List<String> values) {
			addCriterion("role_id in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotIn(List<String> values) {
			addCriterion("role_id not in", values, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdBetween(String value1, String value2) {
			addCriterion("role_id between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andRoleIdNotBetween(String value1, String value2) {
			addCriterion("role_id not between", value1, value2, "roleId");
			return (Criteria) this;
		}

		public Criteria andGroupTypeIsNull() {
			addCriterion("group_type is null");
			return (Criteria) this;
		}

		public Criteria andGroupTypeIsNotNull() {
			addCriterion("group_type is not null");
			return (Criteria) this;
		}

		public Criteria andGroupTypeEqualTo(String value) {
			addCriterion("group_type =", value, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeNotEqualTo(String value) {
			addCriterion("group_type <>", value, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeGreaterThan(String value) {
			addCriterion("group_type >", value, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeGreaterThanOrEqualTo(String value) {
			addCriterion("group_type >=", value, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeLessThan(String value) {
			addCriterion("group_type <", value, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeLessThanOrEqualTo(String value) {
			addCriterion("group_type <=", value, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeLike(String value) {
			addCriterion("group_type like", value, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeNotLike(String value) {
			addCriterion("group_type not like", value, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeIn(List<String> values) {
			addCriterion("group_type in", values, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeNotIn(List<String> values) {
			addCriterion("group_type not in", values, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeBetween(String value1, String value2) {
			addCriterion("group_type between", value1, value2, "groupType");
			return (Criteria) this;
		}

		public Criteria andGroupTypeNotBetween(String value1, String value2) {
			addCriterion("group_type not between", value1, value2, "groupType");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeIsNull() {
			addCriterion("province_code is null");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeIsNotNull() {
			addCriterion("province_code is not null");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeEqualTo(String value) {
			addCriterion("province_code =", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeNotEqualTo(String value) {
			addCriterion("province_code <>", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeGreaterThan(String value) {
			addCriterion("province_code >", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
			addCriterion("province_code >=", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeLessThan(String value) {
			addCriterion("province_code <", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
			addCriterion("province_code <=", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeLike(String value) {
			addCriterion("province_code like", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeNotLike(String value) {
			addCriterion("province_code not like", value, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeIn(List<String> values) {
			addCriterion("province_code in", values, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeNotIn(List<String> values) {
			addCriterion("province_code not in", values, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeBetween(String value1, String value2) {
			addCriterion("province_code between", value1, value2, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andProvinceCodeNotBetween(String value1, String value2) {
			addCriterion("province_code not between", value1, value2, "provinceCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeIsNull() {
			addCriterion("city_code is null");
			return (Criteria) this;
		}

		public Criteria andCityCodeIsNotNull() {
			addCriterion("city_code is not null");
			return (Criteria) this;
		}

		public Criteria andCityCodeEqualTo(String value) {
			addCriterion("city_code =", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeNotEqualTo(String value) {
			addCriterion("city_code <>", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeGreaterThan(String value) {
			addCriterion("city_code >", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
			addCriterion("city_code >=", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeLessThan(String value) {
			addCriterion("city_code <", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeLessThanOrEqualTo(String value) {
			addCriterion("city_code <=", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeLike(String value) {
			addCriterion("city_code like", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeNotLike(String value) {
			addCriterion("city_code not like", value, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeIn(List<String> values) {
			addCriterion("city_code in", values, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeNotIn(List<String> values) {
			addCriterion("city_code not in", values, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeBetween(String value1, String value2) {
			addCriterion("city_code between", value1, value2, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCityCodeNotBetween(String value1, String value2) {
			addCriterion("city_code not between", value1, value2, "cityCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeIsNull() {
			addCriterion("county_code is null");
			return (Criteria) this;
		}

		public Criteria andCountyCodeIsNotNull() {
			addCriterion("county_code is not null");
			return (Criteria) this;
		}

		public Criteria andCountyCodeEqualTo(String value) {
			addCriterion("county_code =", value, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeNotEqualTo(String value) {
			addCriterion("county_code <>", value, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeGreaterThan(String value) {
			addCriterion("county_code >", value, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeGreaterThanOrEqualTo(String value) {
			addCriterion("county_code >=", value, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeLessThan(String value) {
			addCriterion("county_code <", value, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeLessThanOrEqualTo(String value) {
			addCriterion("county_code <=", value, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeLike(String value) {
			addCriterion("county_code like", value, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeNotLike(String value) {
			addCriterion("county_code not like", value, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeIn(List<String> values) {
			addCriterion("county_code in", values, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeNotIn(List<String> values) {
			addCriterion("county_code not in", values, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeBetween(String value1, String value2) {
			addCriterion("county_code between", value1, value2, "countyCode");
			return (Criteria) this;
		}

		public Criteria andCountyCodeNotBetween(String value1, String value2) {
			addCriterion("county_code not between", value1, value2, "countyCode");
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

		public Criteria andZipCodeIsNull() {
			addCriterion("zip_code is null");
			return (Criteria) this;
		}

		public Criteria andZipCodeIsNotNull() {
			addCriterion("zip_code is not null");
			return (Criteria) this;
		}

		public Criteria andZipCodeEqualTo(String value) {
			addCriterion("zip_code =", value, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeNotEqualTo(String value) {
			addCriterion("zip_code <>", value, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeGreaterThan(String value) {
			addCriterion("zip_code >", value, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
			addCriterion("zip_code >=", value, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeLessThan(String value) {
			addCriterion("zip_code <", value, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeLessThanOrEqualTo(String value) {
			addCriterion("zip_code <=", value, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeLike(String value) {
			addCriterion("zip_code like", value, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeNotLike(String value) {
			addCriterion("zip_code not like", value, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeIn(List<String> values) {
			addCriterion("zip_code in", values, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeNotIn(List<String> values) {
			addCriterion("zip_code not in", values, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeBetween(String value1, String value2) {
			addCriterion("zip_code between", value1, value2, "zipCode");
			return (Criteria) this;
		}

		public Criteria andZipCodeNotBetween(String value1, String value2) {
			addCriterion("zip_code not between", value1, value2, "zipCode");
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

		public Criteria andFaxIsNull() {
			addCriterion("fax is null");
			return (Criteria) this;
		}

		public Criteria andFaxIsNotNull() {
			addCriterion("fax is not null");
			return (Criteria) this;
		}

		public Criteria andFaxEqualTo(String value) {
			addCriterion("fax =", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotEqualTo(String value) {
			addCriterion("fax <>", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxGreaterThan(String value) {
			addCriterion("fax >", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxGreaterThanOrEqualTo(String value) {
			addCriterion("fax >=", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLessThan(String value) {
			addCriterion("fax <", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLessThanOrEqualTo(String value) {
			addCriterion("fax <=", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxLike(String value) {
			addCriterion("fax like", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotLike(String value) {
			addCriterion("fax not like", value, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxIn(List<String> values) {
			addCriterion("fax in", values, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotIn(List<String> values) {
			addCriterion("fax not in", values, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxBetween(String value1, String value2) {
			addCriterion("fax between", value1, value2, "fax");
			return (Criteria) this;
		}

		public Criteria andFaxNotBetween(String value1, String value2) {
			addCriterion("fax not between", value1, value2, "fax");
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

		public Criteria andMasterIsNull() {
			addCriterion("master is null");
			return (Criteria) this;
		}

		public Criteria andMasterIsNotNull() {
			addCriterion("master is not null");
			return (Criteria) this;
		}

		public Criteria andMasterEqualTo(String value) {
			addCriterion("master =", value, "master");
			return (Criteria) this;
		}

		public Criteria andMasterNotEqualTo(String value) {
			addCriterion("master <>", value, "master");
			return (Criteria) this;
		}

		public Criteria andMasterGreaterThan(String value) {
			addCriterion("master >", value, "master");
			return (Criteria) this;
		}

		public Criteria andMasterGreaterThanOrEqualTo(String value) {
			addCriterion("master >=", value, "master");
			return (Criteria) this;
		}

		public Criteria andMasterLessThan(String value) {
			addCriterion("master <", value, "master");
			return (Criteria) this;
		}

		public Criteria andMasterLessThanOrEqualTo(String value) {
			addCriterion("master <=", value, "master");
			return (Criteria) this;
		}

		public Criteria andMasterLike(String value) {
			addCriterion("master like", value, "master");
			return (Criteria) this;
		}

		public Criteria andMasterNotLike(String value) {
			addCriterion("master not like", value, "master");
			return (Criteria) this;
		}

		public Criteria andMasterIn(List<String> values) {
			addCriterion("master in", values, "master");
			return (Criteria) this;
		}

		public Criteria andMasterNotIn(List<String> values) {
			addCriterion("master not in", values, "master");
			return (Criteria) this;
		}

		public Criteria andMasterBetween(String value1, String value2) {
			addCriterion("master between", value1, value2, "master");
			return (Criteria) this;
		}

		public Criteria andMasterNotBetween(String value1, String value2) {
			addCriterion("master not between", value1, value2, "master");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonIsNull() {
			addCriterion("primary_person is null");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonIsNotNull() {
			addCriterion("primary_person is not null");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonEqualTo(String value) {
			addCriterion("primary_person =", value, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonNotEqualTo(String value) {
			addCriterion("primary_person <>", value, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonGreaterThan(String value) {
			addCriterion("primary_person >", value, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonGreaterThanOrEqualTo(String value) {
			addCriterion("primary_person >=", value, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonLessThan(String value) {
			addCriterion("primary_person <", value, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonLessThanOrEqualTo(String value) {
			addCriterion("primary_person <=", value, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonLike(String value) {
			addCriterion("primary_person like", value, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonNotLike(String value) {
			addCriterion("primary_person not like", value, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonIn(List<String> values) {
			addCriterion("primary_person in", values, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonNotIn(List<String> values) {
			addCriterion("primary_person not in", values, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonBetween(String value1, String value2) {
			addCriterion("primary_person between", value1, value2, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andPrimaryPersonNotBetween(String value1, String value2) {
			addCriterion("primary_person not between", value1, value2, "primaryPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonIsNull() {
			addCriterion("deputy_person is null");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonIsNotNull() {
			addCriterion("deputy_person is not null");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonEqualTo(String value) {
			addCriterion("deputy_person =", value, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonNotEqualTo(String value) {
			addCriterion("deputy_person <>", value, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonGreaterThan(String value) {
			addCriterion("deputy_person >", value, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonGreaterThanOrEqualTo(String value) {
			addCriterion("deputy_person >=", value, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonLessThan(String value) {
			addCriterion("deputy_person <", value, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonLessThanOrEqualTo(String value) {
			addCriterion("deputy_person <=", value, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonLike(String value) {
			addCriterion("deputy_person like", value, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonNotLike(String value) {
			addCriterion("deputy_person not like", value, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonIn(List<String> values) {
			addCriterion("deputy_person in", values, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonNotIn(List<String> values) {
			addCriterion("deputy_person not in", values, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonBetween(String value1, String value2) {
			addCriterion("deputy_person between", value1, value2, "deputyPerson");
			return (Criteria) this;
		}

		public Criteria andDeputyPersonNotBetween(String value1, String value2) {
			addCriterion("deputy_person not between", value1, value2, "deputyPerson");
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