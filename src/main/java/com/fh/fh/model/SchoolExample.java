package com.fh.fh.model;

import java.util.List;
import java.util.ArrayList;

public class SchoolExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public SchoolExample(){
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

		public Criteria andSchoolIdIsNull() {
			addCriterion("school_id is null");
			return (Criteria) this;
		}

		public Criteria andSchoolIdIsNotNull() {
			addCriterion("school_id is not null");
			return (Criteria) this;
		}

		public Criteria andSchoolIdEqualTo(Integer value) {
			addCriterion("school_id =", value, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdNotEqualTo(Integer value) {
			addCriterion("school_id <>", value, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdGreaterThan(Integer value) {
			addCriterion("school_id >", value, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("school_id >=", value, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdLessThan(Integer value) {
			addCriterion("school_id <", value, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
			addCriterion("school_id <=", value, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdIn(List<Integer> values) {
			addCriterion("school_id in", values, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdNotIn(List<Integer> values) {
			addCriterion("school_id not in", values, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
			addCriterion("school_id between", value1, value2, "schoolId");
			return (Criteria) this;
		}

		public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
			addCriterion("school_id not between", value1, value2, "schoolId");
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

		public Criteria andTelIsNull() {
			addCriterion("tel is null");
			return (Criteria) this;
		}

		public Criteria andTelIsNotNull() {
			addCriterion("tel is not null");
			return (Criteria) this;
		}

		public Criteria andTelEqualTo(String value) {
			addCriterion("tel =", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotEqualTo(String value) {
			addCriterion("tel <>", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelGreaterThan(String value) {
			addCriterion("tel >", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelGreaterThanOrEqualTo(String value) {
			addCriterion("tel >=", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLessThan(String value) {
			addCriterion("tel <", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLessThanOrEqualTo(String value) {
			addCriterion("tel <=", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelLike(String value) {
			addCriterion("tel like", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotLike(String value) {
			addCriterion("tel not like", value, "tel");
			return (Criteria) this;
		}

		public Criteria andTelIn(List<String> values) {
			addCriterion("tel in", values, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotIn(List<String> values) {
			addCriterion("tel not in", values, "tel");
			return (Criteria) this;
		}

		public Criteria andTelBetween(String value1, String value2) {
			addCriterion("tel between", value1, value2, "tel");
			return (Criteria) this;
		}

		public Criteria andTelNotBetween(String value1, String value2) {
			addCriterion("tel not between", value1, value2, "tel");
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

		public Criteria andHotIsNull() {
			addCriterion("hot is null");
			return (Criteria) this;
		}

		public Criteria andHotIsNotNull() {
			addCriterion("hot is not null");
			return (Criteria) this;
		}

		public Criteria andHotEqualTo(Integer value) {
			addCriterion("hot =", value, "hot");
			return (Criteria) this;
		}

		public Criteria andHotNotEqualTo(Integer value) {
			addCriterion("hot <>", value, "hot");
			return (Criteria) this;
		}

		public Criteria andHotGreaterThan(Integer value) {
			addCriterion("hot >", value, "hot");
			return (Criteria) this;
		}

		public Criteria andHotGreaterThanOrEqualTo(Integer value) {
			addCriterion("hot >=", value, "hot");
			return (Criteria) this;
		}

		public Criteria andHotLessThan(Integer value) {
			addCriterion("hot <", value, "hot");
			return (Criteria) this;
		}

		public Criteria andHotLessThanOrEqualTo(Integer value) {
			addCriterion("hot <=", value, "hot");
			return (Criteria) this;
		}

		public Criteria andHotIn(List<Integer> values) {
			addCriterion("hot in", values, "hot");
			return (Criteria) this;
		}

		public Criteria andHotNotIn(List<Integer> values) {
			addCriterion("hot not in", values, "hot");
			return (Criteria) this;
		}

		public Criteria andHotBetween(Integer value1, Integer value2) {
			addCriterion("hot between", value1, value2, "hot");
			return (Criteria) this;
		}

		public Criteria andHotNotBetween(Integer value1, Integer value2) {
			addCriterion("hot not between", value1, value2, "hot");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeIsNull() {
			addCriterion("training_type is null");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeIsNotNull() {
			addCriterion("training_type is not null");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeEqualTo(String value) {
			addCriterion("training_type =", value, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeNotEqualTo(String value) {
			addCriterion("training_type <>", value, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeGreaterThan(String value) {
			addCriterion("training_type >", value, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeGreaterThanOrEqualTo(String value) {
			addCriterion("training_type >=", value, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeLessThan(String value) {
			addCriterion("training_type <", value, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeLessThanOrEqualTo(String value) {
			addCriterion("training_type <=", value, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeLike(String value) {
			addCriterion("training_type like", value, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeNotLike(String value) {
			addCriterion("training_type not like", value, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeIn(List<String> values) {
			addCriterion("training_type in", values, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeNotIn(List<String> values) {
			addCriterion("training_type not in", values, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeBetween(String value1, String value2) {
			addCriterion("training_type between", value1, value2, "trainingType");
			return (Criteria) this;
		}

		public Criteria andTrainingTypeNotBetween(String value1, String value2) {
			addCriterion("training_type not between", value1, value2, "trainingType");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleIsNull() {
			addCriterion("business_circle is null");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleIsNotNull() {
			addCriterion("business_circle is not null");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleEqualTo(String value) {
			addCriterion("business_circle =", value, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleNotEqualTo(String value) {
			addCriterion("business_circle <>", value, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleGreaterThan(String value) {
			addCriterion("business_circle >", value, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleGreaterThanOrEqualTo(String value) {
			addCriterion("business_circle >=", value, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleLessThan(String value) {
			addCriterion("business_circle <", value, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleLessThanOrEqualTo(String value) {
			addCriterion("business_circle <=", value, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleLike(String value) {
			addCriterion("business_circle like", value, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleNotLike(String value) {
			addCriterion("business_circle not like", value, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleIn(List<String> values) {
			addCriterion("business_circle in", values, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleNotIn(List<String> values) {
			addCriterion("business_circle not in", values, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleBetween(String value1, String value2) {
			addCriterion("business_circle between", value1, value2, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andBusinessCircleNotBetween(String value1, String value2) {
			addCriterion("business_circle not between", value1, value2, "businessCircle");
			return (Criteria) this;
		}

		public Criteria andIntroductionIsNull() {
			addCriterion("introduction is null");
			return (Criteria) this;
		}

		public Criteria andIntroductionIsNotNull() {
			addCriterion("introduction is not null");
			return (Criteria) this;
		}

		public Criteria andIntroductionEqualTo(String value) {
			addCriterion("introduction =", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotEqualTo(String value) {
			addCriterion("introduction <>", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionGreaterThan(String value) {
			addCriterion("introduction >", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
			addCriterion("introduction >=", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLessThan(String value) {
			addCriterion("introduction <", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLessThanOrEqualTo(String value) {
			addCriterion("introduction <=", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLike(String value) {
			addCriterion("introduction like", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotLike(String value) {
			addCriterion("introduction not like", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionIn(List<String> values) {
			addCriterion("introduction in", values, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotIn(List<String> values) {
			addCriterion("introduction not in", values, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionBetween(String value1, String value2) {
			addCriterion("introduction between", value1, value2, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotBetween(String value1, String value2) {
			addCriterion("introduction not between", value1, value2, "introduction");
			return (Criteria) this;
		}

		public Criteria andLabelIsNull() {
			addCriterion("label is null");
			return (Criteria) this;
		}

		public Criteria andLabelIsNotNull() {
			addCriterion("label is not null");
			return (Criteria) this;
		}

		public Criteria andLabelEqualTo(String value) {
			addCriterion("label =", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelNotEqualTo(String value) {
			addCriterion("label <>", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelGreaterThan(String value) {
			addCriterion("label >", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelGreaterThanOrEqualTo(String value) {
			addCriterion("label >=", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelLessThan(String value) {
			addCriterion("label <", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelLessThanOrEqualTo(String value) {
			addCriterion("label <=", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelLike(String value) {
			addCriterion("label like", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelNotLike(String value) {
			addCriterion("label not like", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelIn(List<String> values) {
			addCriterion("label in", values, "label");
			return (Criteria) this;
		}

		public Criteria andLabelNotIn(List<String> values) {
			addCriterion("label not in", values, "label");
			return (Criteria) this;
		}

		public Criteria andLabelBetween(String value1, String value2) {
			addCriterion("label between", value1, value2, "label");
			return (Criteria) this;
		}

		public Criteria andLabelNotBetween(String value1, String value2) {
			addCriterion("label not between", value1, value2, "label");
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