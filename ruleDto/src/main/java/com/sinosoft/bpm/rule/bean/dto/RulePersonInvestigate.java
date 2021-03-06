package com.sinosoft.bpm.rule.bean.dto;


/**
 * 人伤首次调查
 * @author chao
 *
 */
public class RulePersonInvestigate {
	/**	是否小额人伤*/
	private	String	isSmallAmountInjury;
	/**估损金额*/
	private Double personInvestigateEstimateLoss = 0d;

	public String getIsSmallAmountInjury() {
		return isSmallAmountInjury;
	}

	public void setIsSmallAmountInjury(String isSmallAmountInjury) {
		this.isSmallAmountInjury = isSmallAmountInjury;
	}

	public Double getPersonInvestigateEstimateLoss() {
		return personInvestigateEstimateLoss;
	}

	public void setPersonInvestigateEstimateLoss(
			Double personInvestigateEstimateLoss) {
		this.personInvestigateEstimateLoss = personInvestigateEstimateLoss;
	}
	
}
