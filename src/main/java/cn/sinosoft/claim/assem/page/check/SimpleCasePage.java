package cn.sinosoft.claim.assem.page.check;

import java.io.Serializable;

public class SimpleCasePage implements Serializable{

	private static final long serialVersionUID = 1L;
	private	String comCode;
	private double sumCarLoss;
	private double sumPropLoss;
	private double sumPersonLoss;
	private double sumLoss;
	private double sumRescueFee;
	private double registTime;
	private String valueUpper; 
	private String indemnityDuty;
	private int dangerTimes;
	private int involvedCars;
	public String getComCode() {
		return comCode;
	}
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	public double getSumCarLoss() {
		return sumCarLoss;
	}
	public void setSumCarLoss(double sumCarLoss) {
		this.sumCarLoss = sumCarLoss;
	}
	public double getSumPropLoss() {
		return sumPropLoss;
	}
	public void setSumPropLoss(double sumPropLoss) {
		this.sumPropLoss = sumPropLoss;
	}
	public double getSumPersonLoss() {
		return sumPersonLoss;
	}
	public void setSumPersonLoss(double sumPersonLoss) {
		this.sumPersonLoss = sumPersonLoss;
	}
	public double getSumLoss() {
		return sumLoss;
	}
	public void setSumLoss(double sumLoss) {
		this.sumLoss = sumLoss;
	}
	public double getSumRescueFee() {
		return sumRescueFee;
	}
	public void setSumRescueFee(double sumRescueFee) {
		this.sumRescueFee = sumRescueFee;
	}
	public double getRegistTime() {
		return registTime;
	}
	public void setRegistTime(double registTime) {
		this.registTime = registTime;
	}
	public String getIndemnityDuty() {
		return indemnityDuty;
	}
	public void setIndemnityDuty(String indemnityDuty) {
		this.indemnityDuty = indemnityDuty;
	}
	public int getDangerTimes() {
		return dangerTimes;
	}
	public void setDangerTimes(int dangerTimes) {
		this.dangerTimes = dangerTimes;
	}
	public int getInvolvedCars() {
		return involvedCars;
	}
	public void setInvolvedCars(int involvedCars) {
		this.involvedCars = involvedCars;
	}
	public String getValueUpper() {
		return valueUpper;
	}
	public void setValueUpper(String valueUpper) {
		this.valueUpper = valueUpper;
	}
}
