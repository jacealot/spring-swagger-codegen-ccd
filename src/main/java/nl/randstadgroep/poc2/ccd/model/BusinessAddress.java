package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Branch address
 */
@ApiModel(description = "Branch address")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class BusinessAddress   {
  @JsonProperty("AddressLine1")
  private String addressLine1 = "";

  @JsonProperty("AddressLine2")
  private String addressLine2 = "";

  @JsonProperty("PostCode")
  private String postCode = "";

  @JsonProperty("Place")
  private String place = "";

  @JsonProperty("Province")
  private String province = "";

  @JsonProperty("Country")
  private String country = "";

  @JsonProperty("Continent")
  private String continent = "";

  @JsonProperty("StartDate")
  private LocalDate startDate = null;

  @JsonProperty("BAGId")
  private Long baGId = null;

  @JsonProperty("BAGStreet")
  private String baGStreet = "";

  @JsonProperty("BAGPlace")
  private String baGPlace = "";

  @JsonProperty("BAGHouseNumber")
  private Integer baGHouseNumber = null;

  @JsonProperty("BAGHouseNumberLetter")
  private String baGHouseNumberLetter = "";

  @JsonProperty("BAGHouseNumberAddition")
  private String baGHouseNumberAddition = "";

  @JsonProperty("BAGPostCode")
  private String baGPostCode = "";

  @JsonProperty("BAGMunicipalityCode")
  private Integer baGMunicipalityCode = null;

  @JsonProperty("BAGMunicipalityName")
  private String baGMunicipalityName = "";

  @JsonProperty("IsBAGIndicatorChecked")
  private Boolean isBAGIndicatorChecked = null;

  @JsonProperty("BAGObjectType")
  private String baGObjectType = "";

  @JsonProperty("BAGStartDate")
  private LocalDate baGStartDate = null;

  @JsonProperty("BAGIsUnderInvestigation")
  private Boolean baGIsUnderInvestigation = null;

  @JsonProperty("BAGDocumentID")
  private String baGDocumentID = "";

  @JsonProperty("BAGDocumentDate")
  private LocalDate baGDocumentDate = null;

  @JsonProperty("BAGChangeDate")
  private LocalDate baGChangeDate = null;

  @JsonProperty("BAGArea")
  private Integer baGArea = null;

  @JsonProperty("IsBAGPurposeLiving")
  private Boolean isBAGPurposeLiving = null;

  @JsonProperty("IsBAGPurposeMeeting")
  private Boolean isBAGPurposeMeeting = null;

  @JsonProperty("IsBAGPurposeJail")
  private Boolean isBAGPurposeJail = null;

  @JsonProperty("IsBAGPurposeHealthcare")
  private Boolean isBAGPurposeHealthcare = null;

  @JsonProperty("IsBAGPurposeIndustry")
  private Boolean isBAGPurposeIndustry = null;

  @JsonProperty("IsBAGPurposeOffice")
  private Boolean isBAGPurposeOffice = null;

  @JsonProperty("IsBAGPurposeLodging")
  private Boolean isBAGPurposeLodging = null;

  @JsonProperty("IsBAGPurposeEducation")
  private Boolean isBAGPurposeEducation = null;

  @JsonProperty("IsBAGPurposeSports")
  private Boolean isBAGPurposeSports = null;

  @JsonProperty("IsBAGPurposeShop")
  private Boolean isBAGPurposeShop = null;

  @JsonProperty("IsBAGPurposeRemaining")
  private Boolean isBAGPurposeRemaining = null;

  @JsonProperty("BAGConstructionYear1")
  private Integer baGConstructionYear1 = null;

  @JsonProperty("BAGConstructionYear2")
  private Integer baGConstructionYear2 = null;

  @JsonProperty("BAGConstructionYear3")
  private Integer baGConstructionYear3 = null;

  @JsonProperty("BAGConstructionYear4")
  private Integer baGConstructionYear4 = null;

  @JsonProperty("BAGConstructionYear5")
  private Integer baGConstructionYear5 = null;

  @JsonProperty("IsBAGLicensed")
  private Boolean isBAGLicensed = null;

  @JsonProperty("IsBAGNotRealisedBuilding")
  private Boolean isBAGNotRealisedBuilding = null;

  @JsonProperty("IsBAGConstructionStarted")
  private Boolean isBAGConstructionStarted = null;

  @JsonProperty("IsBAGInUseNotMeasured")
  private Boolean isBAGInUseNotMeasured = null;

  @JsonProperty("IsBAGInUse")
  private Boolean isBAGInUse = null;

  @JsonProperty("IsBAGDemolitionPermit")
  private Boolean isBAGDemolitionPermit = null;

  @JsonProperty("IsBAGDemolished")
  private Boolean isBAGDemolished = null;

  @JsonProperty("IsBAGNotInUse")
  private Boolean isBAGNotInUse = null;

  @JsonProperty("BAGX")
  private String BAGX = "";

  @JsonProperty("BAGY")
  private String BAGY = "";

  @JsonProperty("BAGRDX")
  private String BAGRDX = "";

  @JsonProperty("BAGRDY")
  private String BAGRDY = "";

  public BusinessAddress addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * Address Line 1
   * @return addressLine1
  **/
  @ApiModelProperty(required = true, value = "Address Line 1")
      @NotNull

    public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public BusinessAddress addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Address Line 2
   * @return addressLine2
  **/
  @ApiModelProperty(required = true, value = "Address Line 2")
      @NotNull

    public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public BusinessAddress postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Post Code
   * @return postCode
  **/
  @ApiModelProperty(value = "Post Code")
  
    public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public BusinessAddress place(String place) {
    this.place = place;
    return this;
  }

  /**
   * Place
   * @return place
  **/
  @ApiModelProperty(required = true, value = "Place")
      @NotNull

    public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public BusinessAddress province(String province) {
    this.province = province;
    return this;
  }

  /**
   * Province
   * @return province
  **/
  @ApiModelProperty(value = "Province")
  
    public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public BusinessAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country
   * @return country
  **/
  @ApiModelProperty(value = "Country")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public BusinessAddress continent(String continent) {
    this.continent = continent;
    return this;
  }

  /**
   * Continent
   * @return continent
  **/
  @ApiModelProperty(value = "Continent")
  
    public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public BusinessAddress startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date when the Branch actually moved to the address
   * @return startDate
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "Date when the Branch actually moved to the address")
  
    @Valid
    public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public BusinessAddress baGId(Long baGId) {
    this.baGId = baGId;
    return this;
  }

  /**
   * The ID in the original BAG register.
   * @return baGId
  **/
  @ApiModelProperty(example = "1234567891234567", value = "The ID in the original BAG register.")
  
    public Long getBaGId() {
    return baGId;
  }

  public void setBaGId(Long baGId) {
    this.baGId = baGId;
  }

  public BusinessAddress baGStreet(String baGStreet) {
    this.baGStreet = baGStreet;
    return this;
  }

  /**
   * BAGStreet
   * @return baGStreet
  **/
  @ApiModelProperty(value = "BAGStreet")
  
    public String getBaGStreet() {
    return baGStreet;
  }

  public void setBaGStreet(String baGStreet) {
    this.baGStreet = baGStreet;
  }

  public BusinessAddress baGPlace(String baGPlace) {
    this.baGPlace = baGPlace;
    return this;
  }

  /**
   * BAGPlace
   * @return baGPlace
  **/
  @ApiModelProperty(value = "BAGPlace")
  
    public String getBaGPlace() {
    return baGPlace;
  }

  public void setBaGPlace(String baGPlace) {
    this.baGPlace = baGPlace;
  }

  public BusinessAddress baGHouseNumber(Integer baGHouseNumber) {
    this.baGHouseNumber = baGHouseNumber;
    return this;
  }

  /**
   * BAGHouseNumber
   * @return baGHouseNumber
  **/
  @ApiModelProperty(example = "0", value = "BAGHouseNumber")
  
    public Integer getBaGHouseNumber() {
    return baGHouseNumber;
  }

  public void setBaGHouseNumber(Integer baGHouseNumber) {
    this.baGHouseNumber = baGHouseNumber;
  }

  public BusinessAddress baGHouseNumberLetter(String baGHouseNumberLetter) {
    this.baGHouseNumberLetter = baGHouseNumberLetter;
    return this;
  }

  /**
   * BAGHouseNumberLetter
   * @return baGHouseNumberLetter
  **/
  @ApiModelProperty(value = "BAGHouseNumberLetter")
  
    public String getBaGHouseNumberLetter() {
    return baGHouseNumberLetter;
  }

  public void setBaGHouseNumberLetter(String baGHouseNumberLetter) {
    this.baGHouseNumberLetter = baGHouseNumberLetter;
  }

  public BusinessAddress baGHouseNumberAddition(String baGHouseNumberAddition) {
    this.baGHouseNumberAddition = baGHouseNumberAddition;
    return this;
  }

  /**
   * BAGHouseNumberAddition
   * @return baGHouseNumberAddition
  **/
  @ApiModelProperty(value = "BAGHouseNumberAddition")
  
    public String getBaGHouseNumberAddition() {
    return baGHouseNumberAddition;
  }

  public void setBaGHouseNumberAddition(String baGHouseNumberAddition) {
    this.baGHouseNumberAddition = baGHouseNumberAddition;
  }

  public BusinessAddress baGPostCode(String baGPostCode) {
    this.baGPostCode = baGPostCode;
    return this;
  }

  /**
   * BAGPostCode
   * @return baGPostCode
  **/
  @ApiModelProperty(value = "BAGPostCode")
  
    public String getBaGPostCode() {
    return baGPostCode;
  }

  public void setBaGPostCode(String baGPostCode) {
    this.baGPostCode = baGPostCode;
  }

  public BusinessAddress baGMunicipalityCode(Integer baGMunicipalityCode) {
    this.baGMunicipalityCode = baGMunicipalityCode;
    return this;
  }

  /**
   * BAG Code of the Municipality
   * @return baGMunicipalityCode
  **/
  @ApiModelProperty(example = "0", value = "BAG Code of the Municipality")
  
    public Integer getBaGMunicipalityCode() {
    return baGMunicipalityCode;
  }

  public void setBaGMunicipalityCode(Integer baGMunicipalityCode) {
    this.baGMunicipalityCode = baGMunicipalityCode;
  }

  public BusinessAddress baGMunicipalityName(String baGMunicipalityName) {
    this.baGMunicipalityName = baGMunicipalityName;
    return this;
  }

  /**
   * BAG name of the Municipality
   * @return baGMunicipalityName
  **/
  @ApiModelProperty(value = "BAG name of the Municipality")
  
    public String getBaGMunicipalityName() {
    return baGMunicipalityName;
  }

  public void setBaGMunicipalityName(String baGMunicipalityName) {
    this.baGMunicipalityName = baGMunicipalityName;
  }

  public BusinessAddress isBAGIndicatorChecked(Boolean isBAGIndicatorChecked) {
    this.isBAGIndicatorChecked = isBAGIndicatorChecked;
    return this;
  }

  /**
   * Checked by Kadaster
   * @return isBAGIndicatorChecked
  **/
  @ApiModelProperty(example = "false", required = true, value = "Checked by Kadaster")
      @NotNull

    public Boolean isIsBAGIndicatorChecked() {
    return isBAGIndicatorChecked;
  }

  public void setIsBAGIndicatorChecked(Boolean isBAGIndicatorChecked) {
    this.isBAGIndicatorChecked = isBAGIndicatorChecked;
  }

  public BusinessAddress baGObjectType(String baGObjectType) {
    this.baGObjectType = baGObjectType;
    return this;
  }

  /**
   * Type of object
   * @return baGObjectType
  **/
  @ApiModelProperty(value = "Type of object")
  
    public String getBaGObjectType() {
    return baGObjectType;
  }

  public void setBaGObjectType(String baGObjectType) {
    this.baGObjectType = baGObjectType;
  }

  public BusinessAddress baGStartDate(LocalDate baGStartDate) {
    this.baGStartDate = baGStartDate;
    return this;
  }

  /**
   * Startdate of the BAG data
   * @return baGStartDate
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "Startdate of the BAG data")
  
    @Valid
    public LocalDate getBaGStartDate() {
    return baGStartDate;
  }

  public void setBaGStartDate(LocalDate baGStartDate) {
    this.baGStartDate = baGStartDate;
  }

  public BusinessAddress baGIsUnderInvestigation(Boolean baGIsUnderInvestigation) {
    this.baGIsUnderInvestigation = baGIsUnderInvestigation;
    return this;
  }

  /**
   * Is this object under investigation at the Kadaster
   * @return baGIsUnderInvestigation
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is this object under investigation at the Kadaster")
      @NotNull

    public Boolean isBaGIsUnderInvestigation() {
    return baGIsUnderInvestigation;
  }

  public void setBaGIsUnderInvestigation(Boolean baGIsUnderInvestigation) {
    this.baGIsUnderInvestigation = baGIsUnderInvestigation;
  }

  public BusinessAddress baGDocumentID(String baGDocumentID) {
    this.baGDocumentID = baGDocumentID;
    return this;
  }

  /**
   * The documentid about this object at the Kadaster
   * @return baGDocumentID
  **/
  @ApiModelProperty(value = "The documentid about this object at the Kadaster")
  
    public String getBaGDocumentID() {
    return baGDocumentID;
  }

  public void setBaGDocumentID(String baGDocumentID) {
    this.baGDocumentID = baGDocumentID;
  }

  public BusinessAddress baGDocumentDate(LocalDate baGDocumentDate) {
    this.baGDocumentDate = baGDocumentDate;
    return this;
  }

  /**
   * The date of the document about this object at the Kadaster
   * @return baGDocumentDate
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "The date of the document about this object at the Kadaster")
  
    @Valid
    public LocalDate getBaGDocumentDate() {
    return baGDocumentDate;
  }

  public void setBaGDocumentDate(LocalDate baGDocumentDate) {
    this.baGDocumentDate = baGDocumentDate;
  }

  public BusinessAddress baGChangeDate(LocalDate baGChangeDate) {
    this.baGChangeDate = baGChangeDate;
    return this;
  }

  /**
   * The date the registration in the BAG has changed
   * @return baGChangeDate
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "The date the registration in the BAG has changed")
  
    @Valid
    public LocalDate getBaGChangeDate() {
    return baGChangeDate;
  }

  public void setBaGChangeDate(LocalDate baGChangeDate) {
    this.baGChangeDate = baGChangeDate;
  }

  public BusinessAddress baGArea(Integer baGArea) {
    this.baGArea = baGArea;
    return this;
  }

  /**
   * The amount of available square meters of this object.
   * @return baGArea
  **/
  @ApiModelProperty(example = "0", value = "The amount of available square meters of this object.")
  
    public Integer getBaGArea() {
    return baGArea;
  }

  public void setBaGArea(Integer baGArea) {
    this.baGArea = baGArea;
  }

  public BusinessAddress isBAGPurposeLiving(Boolean isBAGPurposeLiving) {
    this.isBAGPurposeLiving = isBAGPurposeLiving;
    return this;
  }

  /**
   * The purpose of the building is living
   * @return isBAGPurposeLiving
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is living")
      @NotNull

    public Boolean isIsBAGPurposeLiving() {
    return isBAGPurposeLiving;
  }

  public void setIsBAGPurposeLiving(Boolean isBAGPurposeLiving) {
    this.isBAGPurposeLiving = isBAGPurposeLiving;
  }

  public BusinessAddress isBAGPurposeMeeting(Boolean isBAGPurposeMeeting) {
    this.isBAGPurposeMeeting = isBAGPurposeMeeting;
    return this;
  }

  /**
   * The purpose of the building is meeting
   * @return isBAGPurposeMeeting
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is meeting")
      @NotNull

    public Boolean isIsBAGPurposeMeeting() {
    return isBAGPurposeMeeting;
  }

  public void setIsBAGPurposeMeeting(Boolean isBAGPurposeMeeting) {
    this.isBAGPurposeMeeting = isBAGPurposeMeeting;
  }

  public BusinessAddress isBAGPurposeJail(Boolean isBAGPurposeJail) {
    this.isBAGPurposeJail = isBAGPurposeJail;
    return this;
  }

  /**
   * The purpose of the building is jail
   * @return isBAGPurposeJail
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is jail")
      @NotNull

    public Boolean isIsBAGPurposeJail() {
    return isBAGPurposeJail;
  }

  public void setIsBAGPurposeJail(Boolean isBAGPurposeJail) {
    this.isBAGPurposeJail = isBAGPurposeJail;
  }

  public BusinessAddress isBAGPurposeHealthcare(Boolean isBAGPurposeHealthcare) {
    this.isBAGPurposeHealthcare = isBAGPurposeHealthcare;
    return this;
  }

  /**
   * The purpose of the building is healthcare
   * @return isBAGPurposeHealthcare
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is healthcare")
      @NotNull

    public Boolean isIsBAGPurposeHealthcare() {
    return isBAGPurposeHealthcare;
  }

  public void setIsBAGPurposeHealthcare(Boolean isBAGPurposeHealthcare) {
    this.isBAGPurposeHealthcare = isBAGPurposeHealthcare;
  }

  public BusinessAddress isBAGPurposeIndustry(Boolean isBAGPurposeIndustry) {
    this.isBAGPurposeIndustry = isBAGPurposeIndustry;
    return this;
  }

  /**
   * The purpose of the building is industry
   * @return isBAGPurposeIndustry
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is industry")
      @NotNull

    public Boolean isIsBAGPurposeIndustry() {
    return isBAGPurposeIndustry;
  }

  public void setIsBAGPurposeIndustry(Boolean isBAGPurposeIndustry) {
    this.isBAGPurposeIndustry = isBAGPurposeIndustry;
  }

  public BusinessAddress isBAGPurposeOffice(Boolean isBAGPurposeOffice) {
    this.isBAGPurposeOffice = isBAGPurposeOffice;
    return this;
  }

  /**
   * The purpose of the building is office
   * @return isBAGPurposeOffice
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is office")
      @NotNull

    public Boolean isIsBAGPurposeOffice() {
    return isBAGPurposeOffice;
  }

  public void setIsBAGPurposeOffice(Boolean isBAGPurposeOffice) {
    this.isBAGPurposeOffice = isBAGPurposeOffice;
  }

  public BusinessAddress isBAGPurposeLodging(Boolean isBAGPurposeLodging) {
    this.isBAGPurposeLodging = isBAGPurposeLodging;
    return this;
  }

  /**
   * The purpose of the building is lodging
   * @return isBAGPurposeLodging
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is lodging")
      @NotNull

    public Boolean isIsBAGPurposeLodging() {
    return isBAGPurposeLodging;
  }

  public void setIsBAGPurposeLodging(Boolean isBAGPurposeLodging) {
    this.isBAGPurposeLodging = isBAGPurposeLodging;
  }

  public BusinessAddress isBAGPurposeEducation(Boolean isBAGPurposeEducation) {
    this.isBAGPurposeEducation = isBAGPurposeEducation;
    return this;
  }

  /**
   * The purpose of the building is education
   * @return isBAGPurposeEducation
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is education")
      @NotNull

    public Boolean isIsBAGPurposeEducation() {
    return isBAGPurposeEducation;
  }

  public void setIsBAGPurposeEducation(Boolean isBAGPurposeEducation) {
    this.isBAGPurposeEducation = isBAGPurposeEducation;
  }

  public BusinessAddress isBAGPurposeSports(Boolean isBAGPurposeSports) {
    this.isBAGPurposeSports = isBAGPurposeSports;
    return this;
  }

  /**
   * The purpose of the building is sports
   * @return isBAGPurposeSports
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is sports")
      @NotNull

    public Boolean isIsBAGPurposeSports() {
    return isBAGPurposeSports;
  }

  public void setIsBAGPurposeSports(Boolean isBAGPurposeSports) {
    this.isBAGPurposeSports = isBAGPurposeSports;
  }

  public BusinessAddress isBAGPurposeShop(Boolean isBAGPurposeShop) {
    this.isBAGPurposeShop = isBAGPurposeShop;
    return this;
  }

  /**
   * The purpose of the building is sports
   * @return isBAGPurposeShop
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is sports")
      @NotNull

    public Boolean isIsBAGPurposeShop() {
    return isBAGPurposeShop;
  }

  public void setIsBAGPurposeShop(Boolean isBAGPurposeShop) {
    this.isBAGPurposeShop = isBAGPurposeShop;
  }

  public BusinessAddress isBAGPurposeRemaining(Boolean isBAGPurposeRemaining) {
    this.isBAGPurposeRemaining = isBAGPurposeRemaining;
    return this;
  }

  /**
   * The purpose of the building is other
   * @return isBAGPurposeRemaining
  **/
  @ApiModelProperty(example = "false", required = true, value = "The purpose of the building is other")
      @NotNull

    public Boolean isIsBAGPurposeRemaining() {
    return isBAGPurposeRemaining;
  }

  public void setIsBAGPurposeRemaining(Boolean isBAGPurposeRemaining) {
    this.isBAGPurposeRemaining = isBAGPurposeRemaining;
  }

  public BusinessAddress baGConstructionYear1(Integer baGConstructionYear1) {
    this.baGConstructionYear1 = baGConstructionYear1;
    return this;
  }

  /**
   * Year of initial building
   * @return baGConstructionYear1
  **/
  @ApiModelProperty(example = "0", value = "Year of initial building")
  
    public Integer getBaGConstructionYear1() {
    return baGConstructionYear1;
  }

  public void setBaGConstructionYear1(Integer baGConstructionYear1) {
    this.baGConstructionYear1 = baGConstructionYear1;
  }

  public BusinessAddress baGConstructionYear2(Integer baGConstructionYear2) {
    this.baGConstructionYear2 = baGConstructionYear2;
    return this;
  }

  /**
   * The year of extension other part of the building
   * @return baGConstructionYear2
  **/
  @ApiModelProperty(example = "0", value = "The year of extension other part of the building")
  
    public Integer getBaGConstructionYear2() {
    return baGConstructionYear2;
  }

  public void setBaGConstructionYear2(Integer baGConstructionYear2) {
    this.baGConstructionYear2 = baGConstructionYear2;
  }

  public BusinessAddress baGConstructionYear3(Integer baGConstructionYear3) {
    this.baGConstructionYear3 = baGConstructionYear3;
    return this;
  }

  /**
   * The year of extension other part of the building
   * @return baGConstructionYear3
  **/
  @ApiModelProperty(example = "0", value = "The year of extension other part of the building")
  
    public Integer getBaGConstructionYear3() {
    return baGConstructionYear3;
  }

  public void setBaGConstructionYear3(Integer baGConstructionYear3) {
    this.baGConstructionYear3 = baGConstructionYear3;
  }

  public BusinessAddress baGConstructionYear4(Integer baGConstructionYear4) {
    this.baGConstructionYear4 = baGConstructionYear4;
    return this;
  }

  /**
   * The year of extension other part of the building
   * @return baGConstructionYear4
  **/
  @ApiModelProperty(example = "0", value = "The year of extension other part of the building")
  
    public Integer getBaGConstructionYear4() {
    return baGConstructionYear4;
  }

  public void setBaGConstructionYear4(Integer baGConstructionYear4) {
    this.baGConstructionYear4 = baGConstructionYear4;
  }

  public BusinessAddress baGConstructionYear5(Integer baGConstructionYear5) {
    this.baGConstructionYear5 = baGConstructionYear5;
    return this;
  }

  /**
   * The year of extension other part of the building
   * @return baGConstructionYear5
  **/
  @ApiModelProperty(example = "0", value = "The year of extension other part of the building")
  
    public Integer getBaGConstructionYear5() {
    return baGConstructionYear5;
  }

  public void setBaGConstructionYear5(Integer baGConstructionYear5) {
    this.baGConstructionYear5 = baGConstructionYear5;
  }

  public BusinessAddress isBAGLicensed(Boolean isBAGLicensed) {
    this.isBAGLicensed = isBAGLicensed;
    return this;
  }

  /**
   * License for building is granted
   * @return isBAGLicensed
  **/
  @ApiModelProperty(example = "false", required = true, value = "License for building is granted")
      @NotNull

    public Boolean isIsBAGLicensed() {
    return isBAGLicensed;
  }

  public void setIsBAGLicensed(Boolean isBAGLicensed) {
    this.isBAGLicensed = isBAGLicensed;
  }

  public BusinessAddress isBAGNotRealisedBuilding(Boolean isBAGNotRealisedBuilding) {
    this.isBAGNotRealisedBuilding = isBAGNotRealisedBuilding;
    return this;
  }

  /**
   * Building not realized finished
   * @return isBAGNotRealisedBuilding
  **/
  @ApiModelProperty(example = "false", required = true, value = "Building not realized finished")
      @NotNull

    public Boolean isIsBAGNotRealisedBuilding() {
    return isBAGNotRealisedBuilding;
  }

  public void setIsBAGNotRealisedBuilding(Boolean isBAGNotRealisedBuilding) {
    this.isBAGNotRealisedBuilding = isBAGNotRealisedBuilding;
  }

  public BusinessAddress isBAGConstructionStarted(Boolean isBAGConstructionStarted) {
    this.isBAGConstructionStarted = isBAGConstructionStarted;
    return this;
  }

  /**
   * Construction works started
   * @return isBAGConstructionStarted
  **/
  @ApiModelProperty(example = "false", required = true, value = "Construction works started")
      @NotNull

    public Boolean isIsBAGConstructionStarted() {
    return isBAGConstructionStarted;
  }

  public void setIsBAGConstructionStarted(Boolean isBAGConstructionStarted) {
    this.isBAGConstructionStarted = isBAGConstructionStarted;
  }

  public BusinessAddress isBAGInUseNotMeasured(Boolean isBAGInUseNotMeasured) {
    this.isBAGInUseNotMeasured = isBAGInUseNotMeasured;
    return this;
  }

  /**
   * Building is in use, but not yet measured
   * @return isBAGInUseNotMeasured
  **/
  @ApiModelProperty(example = "false", required = true, value = "Building is in use, but not yet measured")
      @NotNull

    public Boolean isIsBAGInUseNotMeasured() {
    return isBAGInUseNotMeasured;
  }

  public void setIsBAGInUseNotMeasured(Boolean isBAGInUseNotMeasured) {
    this.isBAGInUseNotMeasured = isBAGInUseNotMeasured;
  }

  public BusinessAddress isBAGInUse(Boolean isBAGInUse) {
    this.isBAGInUse = isBAGInUse;
    return this;
  }

  /**
   * Building is in use
   * @return isBAGInUse
  **/
  @ApiModelProperty(example = "false", required = true, value = "Building is in use")
      @NotNull

    public Boolean isIsBAGInUse() {
    return isBAGInUse;
  }

  public void setIsBAGInUse(Boolean isBAGInUse) {
    this.isBAGInUse = isBAGInUse;
  }

  public BusinessAddress isBAGDemolitionPermit(Boolean isBAGDemolitionPermit) {
    this.isBAGDemolitionPermit = isBAGDemolitionPermit;
    return this;
  }

  /**
   * Licence for demolition is granted
   * @return isBAGDemolitionPermit
  **/
  @ApiModelProperty(example = "false", required = true, value = "Licence for demolition is granted")
      @NotNull

    public Boolean isIsBAGDemolitionPermit() {
    return isBAGDemolitionPermit;
  }

  public void setIsBAGDemolitionPermit(Boolean isBAGDemolitionPermit) {
    this.isBAGDemolitionPermit = isBAGDemolitionPermit;
  }

  public BusinessAddress isBAGDemolished(Boolean isBAGDemolished) {
    this.isBAGDemolished = isBAGDemolished;
    return this;
  }

  /**
   * Building is demolished
   * @return isBAGDemolished
  **/
  @ApiModelProperty(example = "false", required = true, value = "Building is demolished")
      @NotNull

    public Boolean isIsBAGDemolished() {
    return isBAGDemolished;
  }

  public void setIsBAGDemolished(Boolean isBAGDemolished) {
    this.isBAGDemolished = isBAGDemolished;
  }

  public BusinessAddress isBAGNotInUse(Boolean isBAGNotInUse) {
    this.isBAGNotInUse = isBAGNotInUse;
    return this;
  }

  /**
   * Building is not in use
   * @return isBAGNotInUse
  **/
  @ApiModelProperty(example = "false", required = true, value = "Building is not in use")
      @NotNull

    public Boolean isIsBAGNotInUse() {
    return isBAGNotInUse;
  }

  public void setIsBAGNotInUse(Boolean isBAGNotInUse) {
    this.isBAGNotInUse = isBAGNotInUse;
  }

  public BusinessAddress BAGX(String BAGX) {
    this.BAGX = BAGX;
    return this;
  }

  /**
   * x-coordinate of building latitude
   * @return BAGX
  **/
  @ApiModelProperty(value = "x-coordinate of building latitude")
  
    public String getBAGX() {
    return BAGX;
  }

  public void setBAGX(String BAGX) {
    this.BAGX = BAGX;
  }

  public BusinessAddress BAGY(String BAGY) {
    this.BAGY = BAGY;
    return this;
  }

  /**
   * y-coordinate of building longitude
   * @return BAGY
  **/
  @ApiModelProperty(value = "y-coordinate of building longitude")
  
    public String getBAGY() {
    return BAGY;
  }

  public void setBAGY(String BAGY) {
    this.BAGY = BAGY;
  }

  public BusinessAddress BAGRDX(String BAGRDX) {
    this.BAGRDX = BAGRDX;
    return this;
  }

  /**
   * X coordinate national triangulation
   * @return BAGRDX
  **/
  @ApiModelProperty(value = "X coordinate national triangulation")
  
    public String getBAGRDX() {
    return BAGRDX;
  }

  public void setBAGRDX(String BAGRDX) {
    this.BAGRDX = BAGRDX;
  }

  public BusinessAddress BAGRDY(String BAGRDY) {
    this.BAGRDY = BAGRDY;
    return this;
  }

  /**
   * Y coordinate national triangulation
   * @return BAGRDY
  **/
  @ApiModelProperty(value = "Y coordinate national triangulation")
  
    public String getBAGRDY() {
    return BAGRDY;
  }

  public void setBAGRDY(String BAGRDY) {
    this.BAGRDY = BAGRDY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessAddress businessAddress = (BusinessAddress) o;
    return Objects.equals(this.addressLine1, businessAddress.addressLine1) &&
        Objects.equals(this.addressLine2, businessAddress.addressLine2) &&
        Objects.equals(this.postCode, businessAddress.postCode) &&
        Objects.equals(this.place, businessAddress.place) &&
        Objects.equals(this.province, businessAddress.province) &&
        Objects.equals(this.country, businessAddress.country) &&
        Objects.equals(this.continent, businessAddress.continent) &&
        Objects.equals(this.startDate, businessAddress.startDate) &&
        Objects.equals(this.baGId, businessAddress.baGId) &&
        Objects.equals(this.baGStreet, businessAddress.baGStreet) &&
        Objects.equals(this.baGPlace, businessAddress.baGPlace) &&
        Objects.equals(this.baGHouseNumber, businessAddress.baGHouseNumber) &&
        Objects.equals(this.baGHouseNumberLetter, businessAddress.baGHouseNumberLetter) &&
        Objects.equals(this.baGHouseNumberAddition, businessAddress.baGHouseNumberAddition) &&
        Objects.equals(this.baGPostCode, businessAddress.baGPostCode) &&
        Objects.equals(this.baGMunicipalityCode, businessAddress.baGMunicipalityCode) &&
        Objects.equals(this.baGMunicipalityName, businessAddress.baGMunicipalityName) &&
        Objects.equals(this.isBAGIndicatorChecked, businessAddress.isBAGIndicatorChecked) &&
        Objects.equals(this.baGObjectType, businessAddress.baGObjectType) &&
        Objects.equals(this.baGStartDate, businessAddress.baGStartDate) &&
        Objects.equals(this.baGIsUnderInvestigation, businessAddress.baGIsUnderInvestigation) &&
        Objects.equals(this.baGDocumentID, businessAddress.baGDocumentID) &&
        Objects.equals(this.baGDocumentDate, businessAddress.baGDocumentDate) &&
        Objects.equals(this.baGChangeDate, businessAddress.baGChangeDate) &&
        Objects.equals(this.baGArea, businessAddress.baGArea) &&
        Objects.equals(this.isBAGPurposeLiving, businessAddress.isBAGPurposeLiving) &&
        Objects.equals(this.isBAGPurposeMeeting, businessAddress.isBAGPurposeMeeting) &&
        Objects.equals(this.isBAGPurposeJail, businessAddress.isBAGPurposeJail) &&
        Objects.equals(this.isBAGPurposeHealthcare, businessAddress.isBAGPurposeHealthcare) &&
        Objects.equals(this.isBAGPurposeIndustry, businessAddress.isBAGPurposeIndustry) &&
        Objects.equals(this.isBAGPurposeOffice, businessAddress.isBAGPurposeOffice) &&
        Objects.equals(this.isBAGPurposeLodging, businessAddress.isBAGPurposeLodging) &&
        Objects.equals(this.isBAGPurposeEducation, businessAddress.isBAGPurposeEducation) &&
        Objects.equals(this.isBAGPurposeSports, businessAddress.isBAGPurposeSports) &&
        Objects.equals(this.isBAGPurposeShop, businessAddress.isBAGPurposeShop) &&
        Objects.equals(this.isBAGPurposeRemaining, businessAddress.isBAGPurposeRemaining) &&
        Objects.equals(this.baGConstructionYear1, businessAddress.baGConstructionYear1) &&
        Objects.equals(this.baGConstructionYear2, businessAddress.baGConstructionYear2) &&
        Objects.equals(this.baGConstructionYear3, businessAddress.baGConstructionYear3) &&
        Objects.equals(this.baGConstructionYear4, businessAddress.baGConstructionYear4) &&
        Objects.equals(this.baGConstructionYear5, businessAddress.baGConstructionYear5) &&
        Objects.equals(this.isBAGLicensed, businessAddress.isBAGLicensed) &&
        Objects.equals(this.isBAGNotRealisedBuilding, businessAddress.isBAGNotRealisedBuilding) &&
        Objects.equals(this.isBAGConstructionStarted, businessAddress.isBAGConstructionStarted) &&
        Objects.equals(this.isBAGInUseNotMeasured, businessAddress.isBAGInUseNotMeasured) &&
        Objects.equals(this.isBAGInUse, businessAddress.isBAGInUse) &&
        Objects.equals(this.isBAGDemolitionPermit, businessAddress.isBAGDemolitionPermit) &&
        Objects.equals(this.isBAGDemolished, businessAddress.isBAGDemolished) &&
        Objects.equals(this.isBAGNotInUse, businessAddress.isBAGNotInUse) &&
        Objects.equals(this.BAGX, businessAddress.BAGX) &&
        Objects.equals(this.BAGY, businessAddress.BAGY) &&
        Objects.equals(this.BAGRDX, businessAddress.BAGRDX) &&
        Objects.equals(this.BAGRDY, businessAddress.BAGRDY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, postCode, place, province, country, continent, startDate, baGId, baGStreet, baGPlace, baGHouseNumber, baGHouseNumberLetter, baGHouseNumberAddition, baGPostCode, baGMunicipalityCode, baGMunicipalityName, isBAGIndicatorChecked, baGObjectType, baGStartDate, baGIsUnderInvestigation, baGDocumentID, baGDocumentDate, baGChangeDate, baGArea, isBAGPurposeLiving, isBAGPurposeMeeting, isBAGPurposeJail, isBAGPurposeHealthcare, isBAGPurposeIndustry, isBAGPurposeOffice, isBAGPurposeLodging, isBAGPurposeEducation, isBAGPurposeSports, isBAGPurposeShop, isBAGPurposeRemaining, baGConstructionYear1, baGConstructionYear2, baGConstructionYear3, baGConstructionYear4, baGConstructionYear5, isBAGLicensed, isBAGNotRealisedBuilding, isBAGConstructionStarted, isBAGInUseNotMeasured, isBAGInUse, isBAGDemolitionPermit, isBAGDemolished, isBAGNotInUse, BAGX, BAGY, BAGRDX, BAGRDY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAddress {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    baGId: ").append(toIndentedString(baGId)).append("\n");
    sb.append("    baGStreet: ").append(toIndentedString(baGStreet)).append("\n");
    sb.append("    baGPlace: ").append(toIndentedString(baGPlace)).append("\n");
    sb.append("    baGHouseNumber: ").append(toIndentedString(baGHouseNumber)).append("\n");
    sb.append("    baGHouseNumberLetter: ").append(toIndentedString(baGHouseNumberLetter)).append("\n");
    sb.append("    baGHouseNumberAddition: ").append(toIndentedString(baGHouseNumberAddition)).append("\n");
    sb.append("    baGPostCode: ").append(toIndentedString(baGPostCode)).append("\n");
    sb.append("    baGMunicipalityCode: ").append(toIndentedString(baGMunicipalityCode)).append("\n");
    sb.append("    baGMunicipalityName: ").append(toIndentedString(baGMunicipalityName)).append("\n");
    sb.append("    isBAGIndicatorChecked: ").append(toIndentedString(isBAGIndicatorChecked)).append("\n");
    sb.append("    baGObjectType: ").append(toIndentedString(baGObjectType)).append("\n");
    sb.append("    baGStartDate: ").append(toIndentedString(baGStartDate)).append("\n");
    sb.append("    baGIsUnderInvestigation: ").append(toIndentedString(baGIsUnderInvestigation)).append("\n");
    sb.append("    baGDocumentID: ").append(toIndentedString(baGDocumentID)).append("\n");
    sb.append("    baGDocumentDate: ").append(toIndentedString(baGDocumentDate)).append("\n");
    sb.append("    baGChangeDate: ").append(toIndentedString(baGChangeDate)).append("\n");
    sb.append("    baGArea: ").append(toIndentedString(baGArea)).append("\n");
    sb.append("    isBAGPurposeLiving: ").append(toIndentedString(isBAGPurposeLiving)).append("\n");
    sb.append("    isBAGPurposeMeeting: ").append(toIndentedString(isBAGPurposeMeeting)).append("\n");
    sb.append("    isBAGPurposeJail: ").append(toIndentedString(isBAGPurposeJail)).append("\n");
    sb.append("    isBAGPurposeHealthcare: ").append(toIndentedString(isBAGPurposeHealthcare)).append("\n");
    sb.append("    isBAGPurposeIndustry: ").append(toIndentedString(isBAGPurposeIndustry)).append("\n");
    sb.append("    isBAGPurposeOffice: ").append(toIndentedString(isBAGPurposeOffice)).append("\n");
    sb.append("    isBAGPurposeLodging: ").append(toIndentedString(isBAGPurposeLodging)).append("\n");
    sb.append("    isBAGPurposeEducation: ").append(toIndentedString(isBAGPurposeEducation)).append("\n");
    sb.append("    isBAGPurposeSports: ").append(toIndentedString(isBAGPurposeSports)).append("\n");
    sb.append("    isBAGPurposeShop: ").append(toIndentedString(isBAGPurposeShop)).append("\n");
    sb.append("    isBAGPurposeRemaining: ").append(toIndentedString(isBAGPurposeRemaining)).append("\n");
    sb.append("    baGConstructionYear1: ").append(toIndentedString(baGConstructionYear1)).append("\n");
    sb.append("    baGConstructionYear2: ").append(toIndentedString(baGConstructionYear2)).append("\n");
    sb.append("    baGConstructionYear3: ").append(toIndentedString(baGConstructionYear3)).append("\n");
    sb.append("    baGConstructionYear4: ").append(toIndentedString(baGConstructionYear4)).append("\n");
    sb.append("    baGConstructionYear5: ").append(toIndentedString(baGConstructionYear5)).append("\n");
    sb.append("    isBAGLicensed: ").append(toIndentedString(isBAGLicensed)).append("\n");
    sb.append("    isBAGNotRealisedBuilding: ").append(toIndentedString(isBAGNotRealisedBuilding)).append("\n");
    sb.append("    isBAGConstructionStarted: ").append(toIndentedString(isBAGConstructionStarted)).append("\n");
    sb.append("    isBAGInUseNotMeasured: ").append(toIndentedString(isBAGInUseNotMeasured)).append("\n");
    sb.append("    isBAGInUse: ").append(toIndentedString(isBAGInUse)).append("\n");
    sb.append("    isBAGDemolitionPermit: ").append(toIndentedString(isBAGDemolitionPermit)).append("\n");
    sb.append("    isBAGDemolished: ").append(toIndentedString(isBAGDemolished)).append("\n");
    sb.append("    isBAGNotInUse: ").append(toIndentedString(isBAGNotInUse)).append("\n");
    sb.append("    BAGX: ").append(toIndentedString(BAGX)).append("\n");
    sb.append("    BAGY: ").append(toIndentedString(BAGY)).append("\n");
    sb.append("    BAGRDX: ").append(toIndentedString(BAGRDX)).append("\n");
    sb.append("    BAGRDY: ").append(toIndentedString(BAGRDY)).append("\n");
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
