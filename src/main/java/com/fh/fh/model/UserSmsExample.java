package com.fh.fh.model;

import java.util.List;
import java.util.ArrayList;

public class UserSmsExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserSmsExample(){
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

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
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

		public Criteria andEndTimeIsNull() {
			addCriterion("end_time is null");
			return (Criteria) this;
		}

		public Criteria andEndTimeIsNotNull() {
			addCriterion("end_time is not null");
			return (Criteria) this;
		}

		public Criteria andEndTimeEqualTo(java.util.Date value) {
			addCriterion("end_time =", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotEqualTo(java.util.Date value) {
			addCriterion("end_time <>", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThan(java.util.Date value) {
			addCriterion("end_time >", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeGreaterThanOrEqualTo(java.util.Date value) {
			addCriterion("end_time >=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThan(java.util.Date value) {
			addCriterion("end_time <", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeLessThanOrEqualTo(java.util.Date value) {
			addCriterion("end_time <=", value, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeIn(List<java.util.Date> values) {
			addCriterion("end_time in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotIn(List<java.util.Date> values) {
			addCriterion("end_time not in", values, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("end_time between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andEndTimeNotBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("end_time not between", value1, value2, "endTime");
			return (Criteria) this;
		}

		public Criteria andFromNameIsNull() {
			addCriterion("from_name is null");
			return (Criteria) this;
		}

		public Criteria andFromNameIsNotNull() {
			addCriterion("from_name is not null");
			return (Criteria) this;
		}

		public Criteria andFromNameEqualTo(String value) {
			addCriterion("from_name =", value, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameNotEqualTo(String value) {
			addCriterion("from_name <>", value, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameGreaterThan(String value) {
			addCriterion("from_name >", value, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameGreaterThanOrEqualTo(String value) {
			addCriterion("from_name >=", value, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameLessThan(String value) {
			addCriterion("from_name <", value, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameLessThanOrEqualTo(String value) {
			addCriterion("from_name <=", value, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameLike(String value) {
			addCriterion("from_name like", value, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameNotLike(String value) {
			addCriterion("from_name not like", value, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameIn(List<String> values) {
			addCriterion("from_name in", values, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameNotIn(List<String> values) {
			addCriterion("from_name not in", values, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameBetween(String value1, String value2) {
			addCriterion("from_name between", value1, value2, "fromName");
			return (Criteria) this;
		}

		public Criteria andFromNameNotBetween(String value1, String value2) {
			addCriterion("from_name not between", value1, value2, "fromName");
			return (Criteria) this;
		}

		public Criteria andMethodIsNull() {
			addCriterion("method is null");
			return (Criteria) this;
		}

		public Criteria andMethodIsNotNull() {
			addCriterion("method is not null");
			return (Criteria) this;
		}

		public Criteria andMethodEqualTo(String value) {
			addCriterion("method =", value, "method");
			return (Criteria) this;
		}

		public Criteria andMethodNotEqualTo(String value) {
			addCriterion("method <>", value, "method");
			return (Criteria) this;
		}

		public Criteria andMethodGreaterThan(String value) {
			addCriterion("method >", value, "method");
			return (Criteria) this;
		}

		public Criteria andMethodGreaterThanOrEqualTo(String value) {
			addCriterion("method >=", value, "method");
			return (Criteria) this;
		}

		public Criteria andMethodLessThan(String value) {
			addCriterion("method <", value, "method");
			return (Criteria) this;
		}

		public Criteria andMethodLessThanOrEqualTo(String value) {
			addCriterion("method <=", value, "method");
			return (Criteria) this;
		}

		public Criteria andMethodLike(String value) {
			addCriterion("method like", value, "method");
			return (Criteria) this;
		}

		public Criteria andMethodNotLike(String value) {
			addCriterion("method not like", value, "method");
			return (Criteria) this;
		}

		public Criteria andMethodIn(List<String> values) {
			addCriterion("method in", values, "method");
			return (Criteria) this;
		}

		public Criteria andMethodNotIn(List<String> values) {
			addCriterion("method not in", values, "method");
			return (Criteria) this;
		}

		public Criteria andMethodBetween(String value1, String value2) {
			addCriterion("method between", value1, value2, "method");
			return (Criteria) this;
		}

		public Criteria andMethodNotBetween(String value1, String value2) {
			addCriterion("method not between", value1, value2, "method");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNull() {
			addCriterion("start_time is null");
			return (Criteria) this;
		}

		public Criteria andStartTimeIsNotNull() {
			addCriterion("start_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartTimeEqualTo(java.util.Date value) {
			addCriterion("start_time =", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotEqualTo(java.util.Date value) {
			addCriterion("start_time <>", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThan(java.util.Date value) {
			addCriterion("start_time >", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeGreaterThanOrEqualTo(java.util.Date value) {
			addCriterion("start_time >=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThan(java.util.Date value) {
			addCriterion("start_time <", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeLessThanOrEqualTo(java.util.Date value) {
			addCriterion("start_time <=", value, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeIn(List<java.util.Date> values) {
			addCriterion("start_time in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotIn(List<java.util.Date> values) {
			addCriterion("start_time not in", values, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("start_time between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStartTimeNotBetween(java.util.Date value1, java.util.Date value2) {
			addCriterion("start_time not between", value1, value2, "startTime");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
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

		public Criteria andVaildCodeIsNull() {
			addCriterion("vaild_code is null");
			return (Criteria) this;
		}

		public Criteria andVaildCodeIsNotNull() {
			addCriterion("vaild_code is not null");
			return (Criteria) this;
		}

		public Criteria andVaildCodeEqualTo(String value) {
			addCriterion("vaild_code =", value, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeNotEqualTo(String value) {
			addCriterion("vaild_code <>", value, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeGreaterThan(String value) {
			addCriterion("vaild_code >", value, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeGreaterThanOrEqualTo(String value) {
			addCriterion("vaild_code >=", value, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeLessThan(String value) {
			addCriterion("vaild_code <", value, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeLessThanOrEqualTo(String value) {
			addCriterion("vaild_code <=", value, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeLike(String value) {
			addCriterion("vaild_code like", value, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeNotLike(String value) {
			addCriterion("vaild_code not like", value, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeIn(List<String> values) {
			addCriterion("vaild_code in", values, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeNotIn(List<String> values) {
			addCriterion("vaild_code not in", values, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeBetween(String value1, String value2) {
			addCriterion("vaild_code between", value1, value2, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildCodeNotBetween(String value1, String value2) {
			addCriterion("vaild_code not between", value1, value2, "vaildCode");
			return (Criteria) this;
		}

		public Criteria andVaildTimesIsNull() {
			addCriterion("vaild_times is null");
			return (Criteria) this;
		}

		public Criteria andVaildTimesIsNotNull() {
			addCriterion("vaild_times is not null");
			return (Criteria) this;
		}

		public Criteria andVaildTimesEqualTo(Integer value) {
			addCriterion("vaild_times =", value, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesNotEqualTo(Integer value) {
			addCriterion("vaild_times <>", value, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesGreaterThan(Integer value) {
			addCriterion("vaild_times >", value, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesGreaterThanOrEqualTo(Integer value) {
			addCriterion("vaild_times >=", value, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesLessThan(Integer value) {
			addCriterion("vaild_times <", value, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesLessThanOrEqualTo(Integer value) {
			addCriterion("vaild_times <=", value, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesIn(List<Integer> values) {
			addCriterion("vaild_times in", values, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesNotIn(List<Integer> values) {
			addCriterion("vaild_times not in", values, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesBetween(Integer value1, Integer value2) {
			addCriterion("vaild_times between", value1, value2, "vaildTimes");
			return (Criteria) this;
		}

		public Criteria andVaildTimesNotBetween(Integer value1, Integer value2) {
			addCriterion("vaild_times not between", value1, value2, "vaildTimes");
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