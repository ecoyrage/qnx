package com.fh.sys.model;

import java.util.List;
import java.util.ArrayList;

public class SettingExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public SettingExample(){
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

		public Criteria andAdminsiteNameIsNull() {
			addCriterion("adminsite_name is null");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameIsNotNull() {
			addCriterion("adminsite_name is not null");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameEqualTo(String value) {
			addCriterion("adminsite_name =", value, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameNotEqualTo(String value) {
			addCriterion("adminsite_name <>", value, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameGreaterThan(String value) {
			addCriterion("adminsite_name >", value, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameGreaterThanOrEqualTo(String value) {
			addCriterion("adminsite_name >=", value, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameLessThan(String value) {
			addCriterion("adminsite_name <", value, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameLessThanOrEqualTo(String value) {
			addCriterion("adminsite_name <=", value, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameLike(String value) {
			addCriterion("adminsite_name like", value, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameNotLike(String value) {
			addCriterion("adminsite_name not like", value, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameIn(List<String> values) {
			addCriterion("adminsite_name in", values, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameNotIn(List<String> values) {
			addCriterion("adminsite_name not in", values, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameBetween(String value1, String value2) {
			addCriterion("adminsite_name between", value1, value2, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteNameNotBetween(String value1, String value2) {
			addCriterion("adminsite_name not between", value1, value2, "adminsiteName");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoIsNull() {
			addCriterion("adminsite_logo is null");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoIsNotNull() {
			addCriterion("adminsite_logo is not null");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoEqualTo(String value) {
			addCriterion("adminsite_logo =", value, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoNotEqualTo(String value) {
			addCriterion("adminsite_logo <>", value, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoGreaterThan(String value) {
			addCriterion("adminsite_logo >", value, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoGreaterThanOrEqualTo(String value) {
			addCriterion("adminsite_logo >=", value, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoLessThan(String value) {
			addCriterion("adminsite_logo <", value, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoLessThanOrEqualTo(String value) {
			addCriterion("adminsite_logo <=", value, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoLike(String value) {
			addCriterion("adminsite_logo like", value, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoNotLike(String value) {
			addCriterion("adminsite_logo not like", value, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoIn(List<String> values) {
			addCriterion("adminsite_logo in", values, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoNotIn(List<String> values) {
			addCriterion("adminsite_logo not in", values, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoBetween(String value1, String value2) {
			addCriterion("adminsite_logo between", value1, value2, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andAdminsiteLogoNotBetween(String value1, String value2) {
			addCriterion("adminsite_logo not between", value1, value2, "adminsiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameIsNull() {
			addCriterion("website_name is null");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameIsNotNull() {
			addCriterion("website_name is not null");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameEqualTo(String value) {
			addCriterion("website_name =", value, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameNotEqualTo(String value) {
			addCriterion("website_name <>", value, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameGreaterThan(String value) {
			addCriterion("website_name >", value, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameGreaterThanOrEqualTo(String value) {
			addCriterion("website_name >=", value, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameLessThan(String value) {
			addCriterion("website_name <", value, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameLessThanOrEqualTo(String value) {
			addCriterion("website_name <=", value, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameLike(String value) {
			addCriterion("website_name like", value, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameNotLike(String value) {
			addCriterion("website_name not like", value, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameIn(List<String> values) {
			addCriterion("website_name in", values, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameNotIn(List<String> values) {
			addCriterion("website_name not in", values, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameBetween(String value1, String value2) {
			addCriterion("website_name between", value1, value2, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteNameNotBetween(String value1, String value2) {
			addCriterion("website_name not between", value1, value2, "websiteName");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoIsNull() {
			addCriterion("website_logo is null");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoIsNotNull() {
			addCriterion("website_logo is not null");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoEqualTo(String value) {
			addCriterion("website_logo =", value, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoNotEqualTo(String value) {
			addCriterion("website_logo <>", value, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoGreaterThan(String value) {
			addCriterion("website_logo >", value, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoGreaterThanOrEqualTo(String value) {
			addCriterion("website_logo >=", value, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoLessThan(String value) {
			addCriterion("website_logo <", value, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoLessThanOrEqualTo(String value) {
			addCriterion("website_logo <=", value, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoLike(String value) {
			addCriterion("website_logo like", value, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoNotLike(String value) {
			addCriterion("website_logo not like", value, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoIn(List<String> values) {
			addCriterion("website_logo in", values, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoNotIn(List<String> values) {
			addCriterion("website_logo not in", values, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoBetween(String value1, String value2) {
			addCriterion("website_logo between", value1, value2, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andWebsiteLogoNotBetween(String value1, String value2) {
			addCriterion("website_logo not between", value1, value2, "websiteLogo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoIsNull() {
			addCriterion("copyright_info is null");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoIsNotNull() {
			addCriterion("copyright_info is not null");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoEqualTo(String value) {
			addCriterion("copyright_info =", value, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoNotEqualTo(String value) {
			addCriterion("copyright_info <>", value, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoGreaterThan(String value) {
			addCriterion("copyright_info >", value, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoGreaterThanOrEqualTo(String value) {
			addCriterion("copyright_info >=", value, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoLessThan(String value) {
			addCriterion("copyright_info <", value, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoLessThanOrEqualTo(String value) {
			addCriterion("copyright_info <=", value, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoLike(String value) {
			addCriterion("copyright_info like", value, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoNotLike(String value) {
			addCriterion("copyright_info not like", value, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoIn(List<String> values) {
			addCriterion("copyright_info in", values, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoNotIn(List<String> values) {
			addCriterion("copyright_info not in", values, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoBetween(String value1, String value2) {
			addCriterion("copyright_info between", value1, value2, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andCopyrightInfoNotBetween(String value1, String value2) {
			addCriterion("copyright_info not between", value1, value2, "copyrightInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoIsNull() {
			addCriterion("filing_info is null");
			return (Criteria) this;
		}

		public Criteria andFilingInfoIsNotNull() {
			addCriterion("filing_info is not null");
			return (Criteria) this;
		}

		public Criteria andFilingInfoEqualTo(String value) {
			addCriterion("filing_info =", value, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoNotEqualTo(String value) {
			addCriterion("filing_info <>", value, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoGreaterThan(String value) {
			addCriterion("filing_info >", value, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoGreaterThanOrEqualTo(String value) {
			addCriterion("filing_info >=", value, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoLessThan(String value) {
			addCriterion("filing_info <", value, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoLessThanOrEqualTo(String value) {
			addCriterion("filing_info <=", value, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoLike(String value) {
			addCriterion("filing_info like", value, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoNotLike(String value) {
			addCriterion("filing_info not like", value, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoIn(List<String> values) {
			addCriterion("filing_info in", values, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoNotIn(List<String> values) {
			addCriterion("filing_info not in", values, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoBetween(String value1, String value2) {
			addCriterion("filing_info between", value1, value2, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andFilingInfoNotBetween(String value1, String value2) {
			addCriterion("filing_info not between", value1, value2, "filingInfo");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescIsNull() {
			addCriterion("website_desc is null");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescIsNotNull() {
			addCriterion("website_desc is not null");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescEqualTo(String value) {
			addCriterion("website_desc =", value, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescNotEqualTo(String value) {
			addCriterion("website_desc <>", value, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescGreaterThan(String value) {
			addCriterion("website_desc >", value, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescGreaterThanOrEqualTo(String value) {
			addCriterion("website_desc >=", value, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescLessThan(String value) {
			addCriterion("website_desc <", value, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescLessThanOrEqualTo(String value) {
			addCriterion("website_desc <=", value, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescLike(String value) {
			addCriterion("website_desc like", value, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescNotLike(String value) {
			addCriterion("website_desc not like", value, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescIn(List<String> values) {
			addCriterion("website_desc in", values, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescNotIn(List<String> values) {
			addCriterion("website_desc not in", values, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescBetween(String value1, String value2) {
			addCriterion("website_desc between", value1, value2, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andWebsiteDescNotBetween(String value1, String value2) {
			addCriterion("website_desc not between", value1, value2, "websiteDesc");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeIsNull() {
			addCriterion("statistical_code is null");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeIsNotNull() {
			addCriterion("statistical_code is not null");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeEqualTo(String value) {
			addCriterion("statistical_code =", value, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeNotEqualTo(String value) {
			addCriterion("statistical_code <>", value, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeGreaterThan(String value) {
			addCriterion("statistical_code >", value, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeGreaterThanOrEqualTo(String value) {
			addCriterion("statistical_code >=", value, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeLessThan(String value) {
			addCriterion("statistical_code <", value, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeLessThanOrEqualTo(String value) {
			addCriterion("statistical_code <=", value, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeLike(String value) {
			addCriterion("statistical_code like", value, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeNotLike(String value) {
			addCriterion("statistical_code not like", value, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeIn(List<String> values) {
			addCriterion("statistical_code in", values, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeNotIn(List<String> values) {
			addCriterion("statistical_code not in", values, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeBetween(String value1, String value2) {
			addCriterion("statistical_code between", value1, value2, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andStatisticalCodeNotBetween(String value1, String value2) {
			addCriterion("statistical_code not between", value1, value2, "statisticalCode");
			return (Criteria) this;
		}

		public Criteria andSeoTitleIsNull() {
			addCriterion("seo_title is null");
			return (Criteria) this;
		}

		public Criteria andSeoTitleIsNotNull() {
			addCriterion("seo_title is not null");
			return (Criteria) this;
		}

		public Criteria andSeoTitleEqualTo(String value) {
			addCriterion("seo_title =", value, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleNotEqualTo(String value) {
			addCriterion("seo_title <>", value, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleGreaterThan(String value) {
			addCriterion("seo_title >", value, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleGreaterThanOrEqualTo(String value) {
			addCriterion("seo_title >=", value, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleLessThan(String value) {
			addCriterion("seo_title <", value, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleLessThanOrEqualTo(String value) {
			addCriterion("seo_title <=", value, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleLike(String value) {
			addCriterion("seo_title like", value, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleNotLike(String value) {
			addCriterion("seo_title not like", value, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleIn(List<String> values) {
			addCriterion("seo_title in", values, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleNotIn(List<String> values) {
			addCriterion("seo_title not in", values, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleBetween(String value1, String value2) {
			addCriterion("seo_title between", value1, value2, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoTitleNotBetween(String value1, String value2) {
			addCriterion("seo_title not between", value1, value2, "seoTitle");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsIsNull() {
			addCriterion("seo_keywords is null");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsIsNotNull() {
			addCriterion("seo_keywords is not null");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsEqualTo(String value) {
			addCriterion("seo_keywords =", value, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsNotEqualTo(String value) {
			addCriterion("seo_keywords <>", value, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsGreaterThan(String value) {
			addCriterion("seo_keywords >", value, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsGreaterThanOrEqualTo(String value) {
			addCriterion("seo_keywords >=", value, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsLessThan(String value) {
			addCriterion("seo_keywords <", value, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsLessThanOrEqualTo(String value) {
			addCriterion("seo_keywords <=", value, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsLike(String value) {
			addCriterion("seo_keywords like", value, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsNotLike(String value) {
			addCriterion("seo_keywords not like", value, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsIn(List<String> values) {
			addCriterion("seo_keywords in", values, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsNotIn(List<String> values) {
			addCriterion("seo_keywords not in", values, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsBetween(String value1, String value2) {
			addCriterion("seo_keywords between", value1, value2, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoKeywordsNotBetween(String value1, String value2) {
			addCriterion("seo_keywords not between", value1, value2, "seoKeywords");
			return (Criteria) this;
		}

		public Criteria andSeoDescIsNull() {
			addCriterion("seo_desc is null");
			return (Criteria) this;
		}

		public Criteria andSeoDescIsNotNull() {
			addCriterion("seo_desc is not null");
			return (Criteria) this;
		}

		public Criteria andSeoDescEqualTo(String value) {
			addCriterion("seo_desc =", value, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescNotEqualTo(String value) {
			addCriterion("seo_desc <>", value, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescGreaterThan(String value) {
			addCriterion("seo_desc >", value, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescGreaterThanOrEqualTo(String value) {
			addCriterion("seo_desc >=", value, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescLessThan(String value) {
			addCriterion("seo_desc <", value, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescLessThanOrEqualTo(String value) {
			addCriterion("seo_desc <=", value, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescLike(String value) {
			addCriterion("seo_desc like", value, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescNotLike(String value) {
			addCriterion("seo_desc not like", value, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescIn(List<String> values) {
			addCriterion("seo_desc in", values, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescNotIn(List<String> values) {
			addCriterion("seo_desc not in", values, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescBetween(String value1, String value2) {
			addCriterion("seo_desc between", value1, value2, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andSeoDescNotBetween(String value1, String value2) {
			addCriterion("seo_desc not between", value1, value2, "seoDesc");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementIsNull() {
			addCriterion("register_agreement is null");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementIsNotNull() {
			addCriterion("register_agreement is not null");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementEqualTo(String value) {
			addCriterion("register_agreement =", value, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementNotEqualTo(String value) {
			addCriterion("register_agreement <>", value, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementGreaterThan(String value) {
			addCriterion("register_agreement >", value, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementGreaterThanOrEqualTo(String value) {
			addCriterion("register_agreement >=", value, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementLessThan(String value) {
			addCriterion("register_agreement <", value, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementLessThanOrEqualTo(String value) {
			addCriterion("register_agreement <=", value, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementLike(String value) {
			addCriterion("register_agreement like", value, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementNotLike(String value) {
			addCriterion("register_agreement not like", value, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementIn(List<String> values) {
			addCriterion("register_agreement in", values, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementNotIn(List<String> values) {
			addCriterion("register_agreement not in", values, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementBetween(String value1, String value2) {
			addCriterion("register_agreement between", value1, value2, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterAgreementNotBetween(String value1, String value2) {
			addCriterion("register_agreement not between", value1, value2, "registerAgreement");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileIsNull() {
			addCriterion("register_verify_mobile is null");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileIsNotNull() {
			addCriterion("register_verify_mobile is not null");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileEqualTo(Integer value) {
			addCriterion("register_verify_mobile =", value, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileNotEqualTo(Integer value) {
			addCriterion("register_verify_mobile <>", value, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileGreaterThan(Integer value) {
			addCriterion("register_verify_mobile >", value, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileGreaterThanOrEqualTo(Integer value) {
			addCriterion("register_verify_mobile >=", value, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileLessThan(Integer value) {
			addCriterion("register_verify_mobile <", value, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileLessThanOrEqualTo(Integer value) {
			addCriterion("register_verify_mobile <=", value, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileIn(List<Integer> values) {
			addCriterion("register_verify_mobile in", values, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileNotIn(List<Integer> values) {
			addCriterion("register_verify_mobile not in", values, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileBetween(Integer value1, Integer value2) {
			addCriterion("register_verify_mobile between", value1, value2, "registerVerifyMobile");
			return (Criteria) this;
		}

		public Criteria andRegisterVerifyMobileNotBetween(Integer value1, Integer value2) {
			addCriterion("register_verify_mobile not between", value1, value2, "registerVerifyMobile");
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