package com.sinosoft.bpm.rule.bean.dto;

public class RuleBigCase {
	//定损环节手动
	private String bigCaseType = "";

	//自动环节
	private Double carPropLossApprovalAmount = 0d;
	private Double personLossApprovalAmount = 0D;
	public String getBigCaseType() {
		return bigCaseType;
	}

	public void setBigCaseType(String bigCaseType) {
		this.bigCaseType = bigCaseType;
	}

	public Double getCarPropLossApprovalAmount() {
		return carPropLossApprovalAmount;
	}

	public void setCarPropLossApprovalAmount(Double carPropLossApprovalAmount) {
		this.carPropLossApprovalAmount = carPropLossApprovalAmount;
	}

	public Double getPersonLossApprovalAmount() {
		return personLossApprovalAmount;
	}

	public void setPersonLossApprovalAmount(Double personLossApprovalAmount) {
		this.personLossApprovalAmount = personLossApprovalAmount;
	}
	
}
