package com.exercise.claims.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Claim
 */
@Validated
public class Claim   {
  @JsonProperty("claimId")
  private Integer claimId = null;

  @JsonProperty("applicationDate")
  private Integer applicationDate = null;

  @JsonProperty("policyNo")
  private String policyNo = null;

  public Claim claimId(Integer claimId) {
    this.claimId = claimId;
    return this;
  }

  /**
   * Get claimId
   * @return claimId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getClaimId() {
    return claimId;
  }

  public void setClaimId(Integer claimId) {
    this.claimId = claimId;
  }

  public Claim applicationDate(Integer applicationDate) {
    this.applicationDate = applicationDate;
    return this;
  }

  /**
   * Get applicationDate
   * @return applicationDate
  **/
  @ApiModelProperty(value = "")
  
    public Integer getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(Integer applicationDate) {
    this.applicationDate = applicationDate;
  }

  public Claim policyNo(String policyNo) {
    this.policyNo = policyNo;
    return this;
  }

  /**
   * Get policyNo
   * @return policyNo
  **/
  @ApiModelProperty(value = "")
  
    public String getPolicyNo() {
    return policyNo;
  }

  public void setPolicyNo(String policyNo) {
    this.policyNo = policyNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Claim claim = (Claim) o;
    return Objects.equals(this.claimId, claim.claimId) &&
        Objects.equals(this.applicationDate, claim.applicationDate) &&
        Objects.equals(this.policyNo, claim.policyNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId, applicationDate, policyNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Claim {\n");
    
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    policyNo: ").append(toIndentedString(policyNo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
