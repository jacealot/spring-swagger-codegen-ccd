package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import nl.randstadgroep.poc2.ccd.model.PositionType;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactPosition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class ContactPosition   {
  @JsonProperty("ContactNumber")
  private Long contactNumber = null;

  @JsonProperty("BranchNumber")
  private Long branchNumber = null;

  @JsonProperty("PositionType")
  private PositionType positionType = null;

  @JsonProperty("CustomerFunctionTitle")
  private String customerFunctionTitle = "";

  @JsonProperty("StartdatePosition")
  private LocalDate startdatePosition = null;

  @JsonProperty("EnddatePosition")
  private LocalDate enddatePosition = null;

  public ContactPosition contactNumber(Long contactNumber) {
    this.contactNumber = contactNumber;
    return this;
  }

  /**
   * Unique number for the Contact
   * @return contactNumber
  **/
  @ApiModelProperty(example = "1234567891234567", required = true, value = "Unique number for the Contact")
      @NotNull

    public Long getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(Long contactNumber) {
    this.contactNumber = contactNumber;
  }

  public ContactPosition branchNumber(Long branchNumber) {
    this.branchNumber = branchNumber;
    return this;
  }

  /**
   * Unique number for the Branch 
   * @return branchNumber
  **/
  @ApiModelProperty(example = "1234567891234567", required = true, value = "Unique number for the Branch ")
      @NotNull

    public Long getBranchNumber() {
    return branchNumber;
  }

  public void setBranchNumber(Long branchNumber) {
    this.branchNumber = branchNumber;
  }

  public ContactPosition positionType(PositionType positionType) {
    this.positionType = positionType;
    return this;
  }

  /**
   * Get positionType
   * @return positionType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public PositionType getPositionType() {
    return positionType;
  }

  public void setPositionType(PositionType positionType) {
    this.positionType = positionType;
  }

  public ContactPosition customerFunctionTitle(String customerFunctionTitle) {
    this.customerFunctionTitle = customerFunctionTitle;
    return this;
  }

  /**
   * The function name according to the customer themselves
   * @return customerFunctionTitle
  **/
  @ApiModelProperty(value = "The function name according to the customer themselves")
  
    public String getCustomerFunctionTitle() {
    return customerFunctionTitle;
  }

  public void setCustomerFunctionTitle(String customerFunctionTitle) {
    this.customerFunctionTitle = customerFunctionTitle;
  }

  public ContactPosition startdatePosition(LocalDate startdatePosition) {
    this.startdatePosition = startdatePosition;
    return this;
  }

  /**
   * Startdate at this position by the contact
   * @return startdatePosition
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", required = true, value = "Startdate at this position by the contact")
      @NotNull

    @Valid
    public LocalDate getStartdatePosition() {
    return startdatePosition;
  }

  public void setStartdatePosition(LocalDate startdatePosition) {
    this.startdatePosition = startdatePosition;
  }

  public ContactPosition enddatePosition(LocalDate enddatePosition) {
    this.enddatePosition = enddatePosition;
    return this;
  }

  /**
   * Enddate of this position of the contact
   * @return enddatePosition
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "Enddate of this position of the contact")
  
    @Valid
    public LocalDate getEnddatePosition() {
    return enddatePosition;
  }

  public void setEnddatePosition(LocalDate enddatePosition) {
    this.enddatePosition = enddatePosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPosition contactPosition = (ContactPosition) o;
    return Objects.equals(this.contactNumber, contactPosition.contactNumber) &&
        Objects.equals(this.branchNumber, contactPosition.branchNumber) &&
        Objects.equals(this.positionType, contactPosition.positionType) &&
        Objects.equals(this.customerFunctionTitle, contactPosition.customerFunctionTitle) &&
        Objects.equals(this.startdatePosition, contactPosition.startdatePosition) &&
        Objects.equals(this.enddatePosition, contactPosition.enddatePosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactNumber, branchNumber, positionType, customerFunctionTitle, startdatePosition, enddatePosition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPosition {\n");
    
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
    sb.append("    customerFunctionTitle: ").append(toIndentedString(customerFunctionTitle)).append("\n");
    sb.append("    startdatePosition: ").append(toIndentedString(startdatePosition)).append("\n");
    sb.append("    enddatePosition: ").append(toIndentedString(enddatePosition)).append("\n");
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
