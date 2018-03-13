package com.fh.fh.model;

import java.util.List;
import java.util.ArrayList;

public class CourseExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CourseExample(){
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

		public Criteria andCourseIdIsNull() {
			addCriterion("course_id is null");
			return (Criteria) this;
		}

		public Criteria andCourseIdIsNotNull() {
			addCriterion("course_id is not null");
			return (Criteria) this;
		}

		public Criteria andCourseIdEqualTo(Integer value) {
			addCriterion("course_id =", value, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdNotEqualTo(Integer value) {
			addCriterion("course_id <>", value, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdGreaterThan(Integer value) {
			addCriterion("course_id >", value, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("course_id >=", value, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdLessThan(Integer value) {
			addCriterion("course_id <", value, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
			addCriterion("course_id <=", value, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdIn(List<Integer> values) {
			addCriterion("course_id in", values, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdNotIn(List<Integer> values) {
			addCriterion("course_id not in", values, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdBetween(Integer value1, Integer value2) {
			addCriterion("course_id between", value1, value2, "courseId");
			return (Criteria) this;
		}

		public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
			addCriterion("course_id not between", value1, value2, "courseId");
			return (Criteria) this;
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

		public Criteria andCourseNameIsNull() {
			addCriterion("course_name is null");
			return (Criteria) this;
		}

		public Criteria andCourseNameIsNotNull() {
			addCriterion("course_name is not null");
			return (Criteria) this;
		}

		public Criteria andCourseNameEqualTo(String value) {
			addCriterion("course_name =", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameNotEqualTo(String value) {
			addCriterion("course_name <>", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameGreaterThan(String value) {
			addCriterion("course_name >", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
			addCriterion("course_name >=", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameLessThan(String value) {
			addCriterion("course_name <", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameLessThanOrEqualTo(String value) {
			addCriterion("course_name <=", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameLike(String value) {
			addCriterion("course_name like", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameNotLike(String value) {
			addCriterion("course_name not like", value, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameIn(List<String> values) {
			addCriterion("course_name in", values, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameNotIn(List<String> values) {
			addCriterion("course_name not in", values, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameBetween(String value1, String value2) {
			addCriterion("course_name between", value1, value2, "courseName");
			return (Criteria) this;
		}

		public Criteria andCourseNameNotBetween(String value1, String value2) {
			addCriterion("course_name not between", value1, value2, "courseName");
			return (Criteria) this;
		}

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
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

		public Criteria andLevelEqualTo(String value) {
			addCriterion("level =", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotEqualTo(String value) {
			addCriterion("level <>", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelGreaterThan(String value) {
			addCriterion("level >", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelGreaterThanOrEqualTo(String value) {
			addCriterion("level >=", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLessThan(String value) {
			addCriterion("level <", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLessThanOrEqualTo(String value) {
			addCriterion("level <=", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLike(String value) {
			addCriterion("level like", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotLike(String value) {
			addCriterion("level not like", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelIn(List<String> values) {
			addCriterion("level in", values, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotIn(List<String> values) {
			addCriterion("level not in", values, "level");
			return (Criteria) this;
		}

		public Criteria andLevelBetween(String value1, String value2) {
			addCriterion("level between", value1, value2, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotBetween(String value1, String value2) {
			addCriterion("level not between", value1, value2, "level");
			return (Criteria) this;
		}

		public Criteria andCycleIsNull() {
			addCriterion("cycle is null");
			return (Criteria) this;
		}

		public Criteria andCycleIsNotNull() {
			addCriterion("cycle is not null");
			return (Criteria) this;
		}

		public Criteria andCycleEqualTo(String value) {
			addCriterion("cycle =", value, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleNotEqualTo(String value) {
			addCriterion("cycle <>", value, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleGreaterThan(String value) {
			addCriterion("cycle >", value, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleGreaterThanOrEqualTo(String value) {
			addCriterion("cycle >=", value, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleLessThan(String value) {
			addCriterion("cycle <", value, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleLessThanOrEqualTo(String value) {
			addCriterion("cycle <=", value, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleLike(String value) {
			addCriterion("cycle like", value, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleNotLike(String value) {
			addCriterion("cycle not like", value, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleIn(List<String> values) {
			addCriterion("cycle in", values, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleNotIn(List<String> values) {
			addCriterion("cycle not in", values, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleBetween(String value1, String value2) {
			addCriterion("cycle between", value1, value2, "cycle");
			return (Criteria) this;
		}

		public Criteria andCycleNotBetween(String value1, String value2) {
			addCriterion("cycle not between", value1, value2, "cycle");
			return (Criteria) this;
		}

		public Criteria andCourseTimeIsNull() {
			addCriterion("course_time is null");
			return (Criteria) this;
		}

		public Criteria andCourseTimeIsNotNull() {
			addCriterion("course_time is not null");
			return (Criteria) this;
		}

		public Criteria andCourseTimeEqualTo(String value) {
			addCriterion("course_time =", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeNotEqualTo(String value) {
			addCriterion("course_time <>", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeGreaterThan(String value) {
			addCriterion("course_time >", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeGreaterThanOrEqualTo(String value) {
			addCriterion("course_time >=", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeLessThan(String value) {
			addCriterion("course_time <", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeLessThanOrEqualTo(String value) {
			addCriterion("course_time <=", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeLike(String value) {
			addCriterion("course_time like", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeNotLike(String value) {
			addCriterion("course_time not like", value, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeIn(List<String> values) {
			addCriterion("course_time in", values, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeNotIn(List<String> values) {
			addCriterion("course_time not in", values, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeBetween(String value1, String value2) {
			addCriterion("course_time between", value1, value2, "courseTime");
			return (Criteria) this;
		}

		public Criteria andCourseTimeNotBetween(String value1, String value2) {
			addCriterion("course_time not between", value1, value2, "courseTime");
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