package cn.sinosoft.claim.base.entity.rulerisk;

public class PrplAutoUndwrtRuleInfoEntity implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	private PrplAutoUndwrtRuleInfoEntityId id;
	private java.lang.String ruleId;
	private java.lang.String description;
	private java.lang.String ruleStatus;
	private java.lang.String rulesetName;
	private java.lang.String ruleRiskLevel;
	private java.lang.String ruleType;
	private java.lang.String argument;
	private java.lang.String flag;
	private java.lang.String evaluateContent;
	private java.lang.String evaluateCode;
	
	public PrplAutoUndwrtRuleInfoEntityId getId() {
		return id;
	}

	public void setId(PrplAutoUndwrtRuleInfoEntityId id) {
		this.id = id;
	}

	public java.lang.String getRuleId() {
		return ruleId;
	}
	
	public void setRuleId(java.lang.String ruleId) {
		this.ruleId = ruleId;
	}
	
	public java.lang.String getDescription() {
		return description;
	}
	
	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	
	public java.lang.String getRuleStatus() {
		return ruleStatus;
	}
	
	public void setRuleStatus(java.lang.String ruleStatus) {
		this.ruleStatus = ruleStatus;
	}
	
	public java.lang.String getRulesetName() {
		return rulesetName;
	}
	
	public void setRulesetName(java.lang.String rulesetName) {
		this.rulesetName = rulesetName;
	}
	
	public java.lang.String getRuleRiskLevel() {
		return ruleRiskLevel;
	}
	
	public void setRuleRiskLevel(java.lang.String ruleRiskLevel) {
		this.ruleRiskLevel = ruleRiskLevel;
	}
	
	public java.lang.String getRuleType() {
		return ruleType;
	}
	
	public void setRuleType(java.lang.String ruleType) {
		this.ruleType = ruleType;
	}
	
	public java.lang.String getArgument() {
		return argument;
	}
	
	public void setArgument(java.lang.String argument) {
		this.argument = argument;
	}
	
	public java.lang.String getFlag() {
		return flag;
	}
	
	public void setFlag(java.lang.String flag) {
		this.flag = flag;
	}
	
	public java.lang.String getEvaluateContent() {
		return evaluateContent;
	}
	
	public void setEvaluateContent(java.lang.String evaluateContent) {
		this.evaluateContent = evaluateContent;
	}
	
	public java.lang.String getEvaluateCode() {
		return evaluateCode;
	}
	
	public void setEvaluateCode(java.lang.String evaluateCode) {
		this.evaluateCode = evaluateCode;
	}
}
