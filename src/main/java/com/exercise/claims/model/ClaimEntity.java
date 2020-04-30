package com.exercise.claims.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claims")
public class ClaimEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer claimId;
	
	private Integer applicationDate;
	private String policyNo;
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Integer applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	  
}
