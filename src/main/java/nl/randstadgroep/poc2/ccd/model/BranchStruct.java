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
 * Branch Structure to be used in the search UI
 */
@ApiModel(description = "Branch Structure to be used in the search UI")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class BranchStruct   {
  @JsonProperty("BranchId")
  private Integer branchId = null;

  @JsonProperty("BranchTypeId")
  private Integer branchTypeId = null;

  @JsonProperty("BranchTypeName")
  private String branchTypeName = "";

  @JsonProperty("Name")
  private String name = "";

  @JsonProperty("IsHeadquarter")
  private Boolean isHeadquarter = null;

  @JsonProperty("CoCNumber")
  private Integer coCNumber = null;

  @JsonProperty("LegalFormDutchId")
  private Integer legalFormDutchId = null;

  @JsonProperty("LegalFormDutchName")
  private String legalFormDutchName = "";

  @JsonProperty("IsZZP")
  private Boolean isZZP = null;

  @JsonProperty("AddressLine1BusinessAddress")
  private String addressLine1BusinessAddress = "";

  @JsonProperty("AddressLine2BusinessAddress")
  private String addressLine2BusinessAddress = "";

  @JsonProperty("BusinessPostCode")
  private String businessPostCode = "";

  @JsonProperty("BusinessPlace")
  private String businessPlace = "";

  @JsonProperty("BusinessProvinceId")
  private Integer businessProvinceId = null;

  @JsonProperty("BusinessProvinceName")
  private String businessProvinceName = "";

  @JsonProperty("BusinessCountryId")
  private Long businessCountryId = null;

  @JsonProperty("BusinessCountryName")
  private String businessCountryName = "";

  @JsonProperty("BranchOrganizationParentId")
  private Integer branchOrganizationParentId = null;

  @JsonProperty("IsActive")
  private Boolean isActive = null;

  @JsonProperty("Ranking_Search")
  private Integer rankingSearch = null;

  @JsonProperty("TradeName")
  private String tradeName = "";

  @JsonProperty("CommercialName")
  private String commercialName = "";

  @JsonProperty("OurName")
  private String ourName = "";

  @JsonProperty("CompanyName")
  private String companyName = "";

  public BranchStruct branchId(Integer branchId) {
    this.branchId = branchId;
    return this;
  }

  /**
   * Branch Identifier
   * @return branchId
  **/
  @ApiModelProperty(example = "0", required = true, value = "Branch Identifier")
      @NotNull

    public Integer getBranchId() {
    return branchId;
  }

  public void setBranchId(Integer branchId) {
    this.branchId = branchId;
  }

  public BranchStruct branchTypeId(Integer branchTypeId) {
    this.branchTypeId = branchTypeId;
    return this;
  }

  /**
   * BranchType Identifier
   * @return branchTypeId
  **/
  @ApiModelProperty(example = "0", value = "BranchType Identifier")
  
    public Integer getBranchTypeId() {
    return branchTypeId;
  }

  public void setBranchTypeId(Integer branchTypeId) {
    this.branchTypeId = branchTypeId;
  }

  public BranchStruct branchTypeName(String branchTypeName) {
    this.branchTypeName = branchTypeName;
    return this;
  }

  /**
   * Branch Type Name
   * @return branchTypeName
  **/
  @ApiModelProperty(value = "Branch Type Name")
  
    public String getBranchTypeName() {
    return branchTypeName;
  }

  public void setBranchTypeName(String branchTypeName) {
    this.branchTypeName = branchTypeName;
  }

  public BranchStruct name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchStruct isHeadquarter(Boolean isHeadquarter) {
    this.isHeadquarter = isHeadquarter;
    return this;
  }

  /**
   * Is Headquarter
   * @return isHeadquarter
  **/
  @ApiModelProperty(example = "false", value = "Is Headquarter")
  
    public Boolean isIsHeadquarter() {
    return isHeadquarter;
  }

  public void setIsHeadquarter(Boolean isHeadquarter) {
    this.isHeadquarter = isHeadquarter;
  }

  public BranchStruct coCNumber(Integer coCNumber) {
    this.coCNumber = coCNumber;
    return this;
  }

  /**
   * Empty if this is an exception, a commercial branch or a reference.
   * @return coCNumber
  **/
  @ApiModelProperty(example = "0", value = "Empty if this is an exception, a commercial branch or a reference.")
  
    public Integer getCoCNumber() {
    return coCNumber;
  }

  public void setCoCNumber(Integer coCNumber) {
    this.coCNumber = coCNumber;
  }

  public BranchStruct legalFormDutchId(Integer legalFormDutchId) {
    this.legalFormDutchId = legalFormDutchId;
    return this;
  }

  /**
   * The id of the dutch legal form
   * @return legalFormDutchId
  **/
  @ApiModelProperty(example = "0", value = "The id of the dutch legal form")
  
    public Integer getLegalFormDutchId() {
    return legalFormDutchId;
  }

  public void setLegalFormDutchId(Integer legalFormDutchId) {
    this.legalFormDutchId = legalFormDutchId;
  }

  public BranchStruct legalFormDutchName(String legalFormDutchName) {
    this.legalFormDutchName = legalFormDutchName;
    return this;
  }

  /**
   * Legal Form Dutch Name
   * @return legalFormDutchName
  **/
  @ApiModelProperty(value = "Legal Form Dutch Name")
  
    public String getLegalFormDutchName() {
    return legalFormDutchName;
  }

  public void setLegalFormDutchName(String legalFormDutchName) {
    this.legalFormDutchName = legalFormDutchName;
  }

  public BranchStruct isZZP(Boolean isZZP) {
    this.isZZP = isZZP;
    return this;
  }

  /**
   * Indicates if branch is ZZP
   * @return isZZP
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicates if branch is ZZP")
      @NotNull

    public Boolean isIsZZP() {
    return isZZP;
  }

  public void setIsZZP(Boolean isZZP) {
    this.isZZP = isZZP;
  }

  public BranchStruct addressLine1BusinessAddress(String addressLine1BusinessAddress) {
    this.addressLine1BusinessAddress = addressLine1BusinessAddress;
    return this;
  }

  /**
   * Address Line 1Business Address
   * @return addressLine1BusinessAddress
  **/
  @ApiModelProperty(value = "Address Line 1Business Address")
  
    public String getAddressLine1BusinessAddress() {
    return addressLine1BusinessAddress;
  }

  public void setAddressLine1BusinessAddress(String addressLine1BusinessAddress) {
    this.addressLine1BusinessAddress = addressLine1BusinessAddress;
  }

  public BranchStruct addressLine2BusinessAddress(String addressLine2BusinessAddress) {
    this.addressLine2BusinessAddress = addressLine2BusinessAddress;
    return this;
  }

  /**
   * Address Line 2Business Address
   * @return addressLine2BusinessAddress
  **/
  @ApiModelProperty(value = "Address Line 2Business Address")
  
    public String getAddressLine2BusinessAddress() {
    return addressLine2BusinessAddress;
  }

  public void setAddressLine2BusinessAddress(String addressLine2BusinessAddress) {
    this.addressLine2BusinessAddress = addressLine2BusinessAddress;
  }

  public BranchStruct businessPostCode(String businessPostCode) {
    this.businessPostCode = businessPostCode;
    return this;
  }

  /**
   * Post Code Business Address
   * @return businessPostCode
  **/
  @ApiModelProperty(value = "Post Code Business Address")
  
    public String getBusinessPostCode() {
    return businessPostCode;
  }

  public void setBusinessPostCode(String businessPostCode) {
    this.businessPostCode = businessPostCode;
  }

  public BranchStruct businessPlace(String businessPlace) {
    this.businessPlace = businessPlace;
    return this;
  }

  /**
   * Place Business Address
   * @return businessPlace
  **/
  @ApiModelProperty(value = "Place Business Address")
  
    public String getBusinessPlace() {
    return businessPlace;
  }

  public void setBusinessPlace(String businessPlace) {
    this.businessPlace = businessPlace;
  }

  public BranchStruct businessProvinceId(Integer businessProvinceId) {
    this.businessProvinceId = businessProvinceId;
    return this;
  }

  /**
   * The id of the province
   * @return businessProvinceId
  **/
  @ApiModelProperty(example = "0", value = "The id of the province")
  
    public Integer getBusinessProvinceId() {
    return businessProvinceId;
  }

  public void setBusinessProvinceId(Integer businessProvinceId) {
    this.businessProvinceId = businessProvinceId;
  }

  public BranchStruct businessProvinceName(String businessProvinceName) {
    this.businessProvinceName = businessProvinceName;
    return this;
  }

  /**
   * Business Province Name
   * @return businessProvinceName
  **/
  @ApiModelProperty(value = "Business Province Name")
  
    public String getBusinessProvinceName() {
    return businessProvinceName;
  }

  public void setBusinessProvinceName(String businessProvinceName) {
    this.businessProvinceName = businessProvinceName;
  }

  public BranchStruct businessCountryId(Long businessCountryId) {
    this.businessCountryId = businessCountryId;
    return this;
  }

  /**
   * The id of the country
   * @return businessCountryId
  **/
  @ApiModelProperty(example = "1234567891234567", value = "The id of the country")
  
    public Long getBusinessCountryId() {
    return businessCountryId;
  }

  public void setBusinessCountryId(Long businessCountryId) {
    this.businessCountryId = businessCountryId;
  }

  public BranchStruct businessCountryName(String businessCountryName) {
    this.businessCountryName = businessCountryName;
    return this;
  }

  /**
   * Name of the Country
   * @return businessCountryName
  **/
  @ApiModelProperty(value = "Name of the Country")
  
    public String getBusinessCountryName() {
    return businessCountryName;
  }

  public void setBusinessCountryName(String businessCountryName) {
    this.businessCountryName = businessCountryName;
  }

  public BranchStruct branchOrganizationParentId(Integer branchOrganizationParentId) {
    this.branchOrganizationParentId = branchOrganizationParentId;
    return this;
  }

  /**
   * This is the reference to the highest level of the organization. This also makes it the unique number of the whole organization.
   * @return branchOrganizationParentId
  **/
  @ApiModelProperty(example = "0", value = "This is the reference to the highest level of the organization. This also makes it the unique number of the whole organization.")
  
    public Integer getBranchOrganizationParentId() {
    return branchOrganizationParentId;
  }

  public void setBranchOrganizationParentId(Integer branchOrganizationParentId) {
    this.branchOrganizationParentId = branchOrganizationParentId;
  }

  public BranchStruct isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * If the branch is active
   * @return isActive
  **/
  @ApiModelProperty(example = "false", value = "If the branch is active")
  
    public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public BranchStruct rankingSearch(Integer rankingSearch) {
    this.rankingSearch = rankingSearch;
    return this;
  }

  /**
   * Ranking based on the SQL Server CONTAINSTABLE 
   * @return rankingSearch
  **/
  @ApiModelProperty(example = "0", value = "Ranking based on the SQL Server CONTAINSTABLE ")
  
    public Integer getRankingSearch() {
    return rankingSearch;
  }

  public void setRankingSearch(Integer rankingSearch) {
    this.rankingSearch = rankingSearch;
  }

  public BranchStruct tradeName(String tradeName) {
    this.tradeName = tradeName;
    return this;
  }

  /**
   * Trade Name
   * @return tradeName
  **/
  @ApiModelProperty(value = "Trade Name")
  
    public String getTradeName() {
    return tradeName;
  }

  public void setTradeName(String tradeName) {
    this.tradeName = tradeName;
  }

  public BranchStruct commercialName(String commercialName) {
    this.commercialName = commercialName;
    return this;
  }

  /**
   * Commercial Name
   * @return commercialName
  **/
  @ApiModelProperty(value = "Commercial Name")
  
    public String getCommercialName() {
    return commercialName;
  }

  public void setCommercialName(String commercialName) {
    this.commercialName = commercialName;
  }

  public BranchStruct ourName(String ourName) {
    this.ourName = ourName;
    return this;
  }

  /**
   * Our Name
   * @return ourName
  **/
  @ApiModelProperty(value = "Our Name")
  
    public String getOurName() {
    return ourName;
  }

  public void setOurName(String ourName) {
    this.ourName = ourName;
  }

  public BranchStruct companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Company Name
   * @return companyName
  **/
  @ApiModelProperty(value = "Company Name")
  
    public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchStruct branchStruct = (BranchStruct) o;
    return Objects.equals(this.branchId, branchStruct.branchId) &&
        Objects.equals(this.branchTypeId, branchStruct.branchTypeId) &&
        Objects.equals(this.branchTypeName, branchStruct.branchTypeName) &&
        Objects.equals(this.name, branchStruct.name) &&
        Objects.equals(this.isHeadquarter, branchStruct.isHeadquarter) &&
        Objects.equals(this.coCNumber, branchStruct.coCNumber) &&
        Objects.equals(this.legalFormDutchId, branchStruct.legalFormDutchId) &&
        Objects.equals(this.legalFormDutchName, branchStruct.legalFormDutchName) &&
        Objects.equals(this.isZZP, branchStruct.isZZP) &&
        Objects.equals(this.addressLine1BusinessAddress, branchStruct.addressLine1BusinessAddress) &&
        Objects.equals(this.addressLine2BusinessAddress, branchStruct.addressLine2BusinessAddress) &&
        Objects.equals(this.businessPostCode, branchStruct.businessPostCode) &&
        Objects.equals(this.businessPlace, branchStruct.businessPlace) &&
        Objects.equals(this.businessProvinceId, branchStruct.businessProvinceId) &&
        Objects.equals(this.businessProvinceName, branchStruct.businessProvinceName) &&
        Objects.equals(this.businessCountryId, branchStruct.businessCountryId) &&
        Objects.equals(this.businessCountryName, branchStruct.businessCountryName) &&
        Objects.equals(this.branchOrganizationParentId, branchStruct.branchOrganizationParentId) &&
        Objects.equals(this.isActive, branchStruct.isActive) &&
        Objects.equals(this.rankingSearch, branchStruct.rankingSearch) &&
        Objects.equals(this.tradeName, branchStruct.tradeName) &&
        Objects.equals(this.commercialName, branchStruct.commercialName) &&
        Objects.equals(this.ourName, branchStruct.ourName) &&
        Objects.equals(this.companyName, branchStruct.companyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, branchTypeId, branchTypeName, name, isHeadquarter, coCNumber, legalFormDutchId, legalFormDutchName, isZZP, addressLine1BusinessAddress, addressLine2BusinessAddress, businessPostCode, businessPlace, businessProvinceId, businessProvinceName, businessCountryId, businessCountryName, branchOrganizationParentId, isActive, rankingSearch, tradeName, commercialName, ourName, companyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchStruct {\n");
    
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    branchTypeId: ").append(toIndentedString(branchTypeId)).append("\n");
    sb.append("    branchTypeName: ").append(toIndentedString(branchTypeName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isHeadquarter: ").append(toIndentedString(isHeadquarter)).append("\n");
    sb.append("    coCNumber: ").append(toIndentedString(coCNumber)).append("\n");
    sb.append("    legalFormDutchId: ").append(toIndentedString(legalFormDutchId)).append("\n");
    sb.append("    legalFormDutchName: ").append(toIndentedString(legalFormDutchName)).append("\n");
    sb.append("    isZZP: ").append(toIndentedString(isZZP)).append("\n");
    sb.append("    addressLine1BusinessAddress: ").append(toIndentedString(addressLine1BusinessAddress)).append("\n");
    sb.append("    addressLine2BusinessAddress: ").append(toIndentedString(addressLine2BusinessAddress)).append("\n");
    sb.append("    businessPostCode: ").append(toIndentedString(businessPostCode)).append("\n");
    sb.append("    businessPlace: ").append(toIndentedString(businessPlace)).append("\n");
    sb.append("    businessProvinceId: ").append(toIndentedString(businessProvinceId)).append("\n");
    sb.append("    businessProvinceName: ").append(toIndentedString(businessProvinceName)).append("\n");
    sb.append("    businessCountryId: ").append(toIndentedString(businessCountryId)).append("\n");
    sb.append("    businessCountryName: ").append(toIndentedString(businessCountryName)).append("\n");
    sb.append("    branchOrganizationParentId: ").append(toIndentedString(branchOrganizationParentId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    rankingSearch: ").append(toIndentedString(rankingSearch)).append("\n");
    sb.append("    tradeName: ").append(toIndentedString(tradeName)).append("\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    ourName: ").append(toIndentedString(ourName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
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
