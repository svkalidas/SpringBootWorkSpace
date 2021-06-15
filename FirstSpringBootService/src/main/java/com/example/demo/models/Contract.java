package com.example.demo.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Contract {

	private String policyNumber;
	private String policyHolder;
	private String insuredObject;
	private String sumInsured;
	private String premium;
	
	public Contract() {
	}
	
	public Contract(String policyNumber, String policyHolder, String insuredObject, String sumInsured, String premium) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolder = policyHolder;
		this.insuredObject = insuredObject;
		this.sumInsured = sumInsured;
		this.premium = premium;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolder() {
		return policyHolder;
	}
	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}
	public String getInsuredObject() {
		return insuredObject;
	}
	public void setInsuredObject(String insuredObject) {
		this.insuredObject = insuredObject;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	
	
}
