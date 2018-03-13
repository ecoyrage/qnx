package com.fh.sys.model;

public class Setting {
	private String id;
	private String adminsiteName;
	private String adminsiteLogo;
	private String websiteName;
	private String websiteLogo;
	private String copyrightInfo;
	private String filingInfo;
	private String websiteDesc;
	private String statisticalCode;
	private String seoTitle;
	private String seoKeywords;
	private String seoDesc;
	private String registerAgreement;
	private Integer registerVerifyMobile;

	public void setId(String id) {
		this.id=id == null ? id : id.trim();
	}

	public String getId() {
		return id;
	}

	public void setAdminsiteName(String adminsiteName) {
		this.adminsiteName=adminsiteName == null ? adminsiteName : adminsiteName.trim();
	}

	public String getAdminsiteName() {
		return adminsiteName;
	}

	public void setAdminsiteLogo(String adminsiteLogo) {
		this.adminsiteLogo=adminsiteLogo == null ? adminsiteLogo : adminsiteLogo.trim();
	}

	public String getAdminsiteLogo() {
		return adminsiteLogo;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName=websiteName == null ? websiteName : websiteName.trim();
	}

	public String getWebsiteName() {
		return websiteName;
	}

	public void setWebsiteLogo(String websiteLogo) {
		this.websiteLogo=websiteLogo == null ? websiteLogo : websiteLogo.trim();
	}

	public String getWebsiteLogo() {
		return websiteLogo;
	}

	public void setCopyrightInfo(String copyrightInfo) {
		this.copyrightInfo=copyrightInfo == null ? copyrightInfo : copyrightInfo.trim();
	}

	public String getCopyrightInfo() {
		return copyrightInfo;
	}

	public void setFilingInfo(String filingInfo) {
		this.filingInfo=filingInfo == null ? filingInfo : filingInfo.trim();
	}

	public String getFilingInfo() {
		return filingInfo;
	}

	public void setWebsiteDesc(String websiteDesc) {
		this.websiteDesc=websiteDesc == null ? websiteDesc : websiteDesc.trim();
	}

	public String getWebsiteDesc() {
		return websiteDesc;
	}

	public void setStatisticalCode(String statisticalCode) {
		this.statisticalCode=statisticalCode == null ? statisticalCode : statisticalCode.trim();
	}

	public String getStatisticalCode() {
		return statisticalCode;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle=seoTitle == null ? seoTitle : seoTitle.trim();
	}

	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords=seoKeywords == null ? seoKeywords : seoKeywords.trim();
	}

	public String getSeoKeywords() {
		return seoKeywords;
	}

	public void setSeoDesc(String seoDesc) {
		this.seoDesc=seoDesc == null ? seoDesc : seoDesc.trim();
	}

	public String getSeoDesc() {
		return seoDesc;
	}

	public void setRegisterAgreement(String registerAgreement) {
		this.registerAgreement=registerAgreement == null ? registerAgreement : registerAgreement.trim();
	}

	public String getRegisterAgreement() {
		return registerAgreement;
	}

	public void setRegisterVerifyMobile(Integer registerVerifyMobile) {
		this.registerVerifyMobile=registerVerifyMobile;
	}

	public Integer getRegisterVerifyMobile() {
		return registerVerifyMobile;
	}

}
