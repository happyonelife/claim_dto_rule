package com.sinosoft.bpm.rule.bean.dto;
/**
 * 垫付信息
 * @author chao
 *
 */
public class RuleAdvance {
	/**	核赔金额*/
	private	Double  undwrtAmount;
	/**	核赔任务提交方式*/
	private	 String undwrtSubmitType;
	
	public String getUndwrtSubmitType() {
		return undwrtSubmitType;
	}

	public void setUndwrtSubmitType(String undwrtSubmitType) {
		this.undwrtSubmitType = undwrtSubmitType;
	}

	public Double getUndwrtAmount() {
		return undwrtAmount;
	}

	public void setUndwrtAmount(Double undwrtAmount) {
		this.undwrtAmount = undwrtAmount;
	}

	
	
}
