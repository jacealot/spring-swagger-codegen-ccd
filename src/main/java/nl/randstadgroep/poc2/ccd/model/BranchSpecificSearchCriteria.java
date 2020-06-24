package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Criteria for searching a specific branch
 */
@ApiModel(description = "Criteria for searching a specific branch")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class BranchSpecificSearchCriteria   {
  @JsonProperty("isActive")
  private String isActive = "";

  @JsonProperty("COCNumber")
  private String coCNumber = "";

  @JsonProperty("BranchTypeExternalIdentifier")
  private String branchTypeExternalIdentifier = "";

  @JsonProperty("isHeadquarter")
  private String isHeadquarter = "";

  @JsonProperty("AddressLine")
  private String addressLine = "";

  @JsonProperty("PostCode")
  private String postCode = "";

  @JsonProperty("Place")
  private String place = "";

  @JsonProperty("Name")
  private String name = "";

  public BranchSpecificSearchCriteria isActive(String isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Is the branch active true false
   * @return isActive
  **/
  @ApiModelProperty(value = "Is the branch active true false")
  
    public String getIsActive() {
    return isActive;
  }

  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }

  public BranchSpecificSearchCriteria coCNumber(String coCNumber) {
    this.coCNumber = coCNumber;
    return this;
  }

  /**
   * The COC number of the branch
   * @return coCNumber
  **/
  @ApiModelProperty(value = "The COC number of the branch")
  
    public String getCoCNumber() {
    return coCNumber;
  }

  public void setCoCNumber(String coCNumber) {
    this.coCNumber = coCNumber;
  }

  public BranchSpecificSearchCriteria branchTypeExternalIdentifier(String branchTypeExternalIdentifier) {
    this.branchTypeExternalIdentifier = branchTypeExternalIdentifier;
    return this;
  }

  /**
   * The type of the branch e.g. Commercial
   * @return branchTypeExternalIdentifier
  **/
  @ApiModelProperty(value = "The type of the branch e.g. Commercial")
  
    public String getBranchTypeExternalIdentifier() {
    return branchTypeExternalIdentifier;
  }

  public void setBranchTypeExternalIdentifier(String branchTypeExternalIdentifier) {
    this.branchTypeExternalIdentifier = branchTypeExternalIdentifier;
  }

  public BranchSpecificSearchCriteria isHeadquarter(String isHeadquarter) {
    this.isHeadquarter = isHeadquarter;
    return this;
  }

  /**
   * Is the branch a headquarter true false
   * @return isHeadquarter
  **/
  @ApiModelProperty(value = "Is the branch a headquarter true false")
  
    public String getIsHeadquarter() {
    return isHeadquarter;
  }

  public void setIsHeadquarter(String isHeadquarter) {
    this.isHeadquarter = isHeadquarter;
  }

  public BranchSpecificSearchCriteria addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * The Address Line of the branch
   * @return addressLine
  **/
  @ApiModelProperty(value = "The Address Line of the branch")
  
    public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public BranchSpecificSearchCriteria postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * The Postal code of the branch
   * @return postCode
  **/
  @ApiModelProperty(value = "The Postal code of the branch")
  
    public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public BranchSpecificSearchCriteria place(String place) {
    this.place = place;
    return this;
  }

  /**
   * The place of the branch
   * @return place
  **/
  @ApiModelProperty(value = "The place of the branch")
  
    public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public BranchSpecificSearchCriteria name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Branch
   * @return name
  **/
  @ApiModelProperty(value = "The name of the Branch")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchSpecificSearchCriteria branchSpecificSearchCriteria = (BranchSpecificSearchCriteria) o;
    return Objects.equals(this.isActive, branchSpecificSearchCriteria.isActive) &&
        Objects.equals(this.coCNumber, branchSpecificSearchCriteria.coCNumber) &&
        Objects.equals(this.branchTypeExternalIdentifier, branchSpecificSearchCriteria.branchTypeExternalIdentifier) &&
        Objects.equals(this.isHeadquarter, branchSpecificSearchCriteria.isHeadquarter) &&
        Objects.equals(this.addressLine, branchSpecificSearchCriteria.addressLine) &&
        Objects.equals(this.postCode, branchSpecificSearchCriteria.postCode) &&
        Objects.equals(this.place, branchSpecificSearchCriteria.place) &&
        Objects.equals(this.name, branchSpecificSearchCriteria.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive, coCNumber, branchTypeExternalIdentifier, isHeadquarter, addressLine, postCode, place, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchSpecificSearchCriteria {\n");
    
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    coCNumber: ").append(toIndentedString(coCNumber)).append("\n");
    sb.append("    branchTypeExternalIdentifier: ").append(toIndentedString(branchTypeExternalIdentifier)).append("\n");
    sb.append("    isHeadquarter: ").append(toIndentedString(isHeadquarter)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
