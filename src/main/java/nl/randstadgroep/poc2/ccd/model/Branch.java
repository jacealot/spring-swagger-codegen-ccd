package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import nl.randstadgroep.poc2.ccd.model.ActivityIndicator;
import nl.randstadgroep.poc2.ccd.model.BranchType;
import nl.randstadgroep.poc2.ccd.model.BusinessAddress;
import nl.randstadgroep.poc2.ccd.model.CommercialBranchType;
import nl.randstadgroep.poc2.ccd.model.CorrespondenceAddress;
import nl.randstadgroep.poc2.ccd.model.LegalFormDutch;
import nl.randstadgroep.poc2.ccd.model.LegalFormInternational;
import nl.randstadgroep.poc2.ccd.model.Reference;
import nl.randstadgroep.poc2.ccd.model.ReliabilityIndicator;
import nl.randstadgroep.poc2.ccd.model.SBICode;
import nl.randstadgroep.poc2.ccd.model.SICCode;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the Branch
 */
@ApiModel(description = "Information about the Branch")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class Branch   {
  @JsonProperty("BranchNumber")
  private Long branchNumber = null;

  @JsonProperty("BranchOldNumber")
  private Long branchOldNumber = null;

  @JsonProperty("BranchNumberParent")
  private Long branchNumberParent = null;

  @JsonProperty("BranchNumberPartOwnership")
  private Long branchNumberPartOwnership = null;

  @JsonProperty("BranchNumberReference")
  private Long branchNumberReference = null;

  @JsonProperty("BranchNumberOrganizationParent")
  private Long branchNumberOrganizationParent = null;

  @JsonProperty("BranchType")
  private BranchType branchType = null;

  @JsonProperty("CommercialBranchType")
  private CommercialBranchType commercialBranchType = null;

  @JsonProperty("PercentageOwnership")
  private Integer percentageOwnership = null;

  @JsonProperty("DisplayName")
  private String displayName = "";

  @JsonProperty("TradeName")
  private String tradeName = "";

  @JsonProperty("CommercialName")
  private String commercialName = "";

  @JsonProperty("OurName")
  private String ourName = "";

  @JsonProperty("CompanyName")
  private String companyName = "";

  @JsonProperty("Relevance")
  private Integer relevance = null;

  @JsonProperty("CoCNumber")
  private Integer coCNumber = null;

  @JsonProperty("CoCBranchNumber")
  private Integer coCBranchNumber = null;

  @JsonProperty("IsHeadquarter")
  private Boolean isHeadquarter = null;

  @JsonProperty("RSIN")
  private String RSIN = "";

  @JsonProperty("IsEconomicallyActive")
  private Boolean isEconomicallyActive = null;

  @JsonProperty("StartDate")
  private LocalDate startDate = null;

  @JsonProperty("IsDirectMarketingPermitted")
  private Boolean isDirectMarketingPermitted = null;

  @JsonProperty("IsZZP")
  private Boolean isZZP = null;

  @JsonProperty("IsBankruptcy")
  private Boolean isBankruptcy = null;

  @JsonProperty("StartDateBankruptcy")
  private LocalDate startDateBankruptcy = null;

  @JsonProperty("ReportDate")
  private LocalDate reportDate = null;

  @JsonProperty("LegalFormDutch")
  private LegalFormDutch legalFormDutch = null;

  @JsonProperty("LegalFormInternational")
  private LegalFormInternational legalFormInternational = null;

  @JsonProperty("SBICode1")
  private SBICode sbICode1 = null;

  @JsonProperty("SBICode2")
  private SBICode sbICode2 = null;

  @JsonProperty("SBICode3")
  private SBICode sbICode3 = null;

  @JsonProperty("SBICode4")
  private SBICode sbICode4 = null;

  @JsonProperty("SBICode5")
  private SBICode sbICode5 = null;

  @JsonProperty("SBICode6")
  private SBICode sbICode6 = null;

  @JsonProperty("SBICode7")
  private SBICode sbICode7 = null;

  @JsonProperty("SBICode8")
  private SBICode sbICode8 = null;

  @JsonProperty("SBICode9")
  private SBICode sbICode9 = null;

  @JsonProperty("SBICode10")
  private SBICode sbICode10 = null;

  @JsonProperty("SICCode1")
  private SICCode siCCode1 = null;

  @JsonProperty("SICCode2")
  private SICCode siCCode2 = null;

  @JsonProperty("SICCode3")
  private SICCode siCCode3 = null;

  @JsonProperty("SICCode4")
  private SICCode siCCode4 = null;

  @JsonProperty("SICCode5")
  private SICCode siCCode5 = null;

  @JsonProperty("SICCode6")
  private SICCode siCCode6 = null;

  @JsonProperty("PrimaryLocalActivityCode")
  private Integer primaryLocalActivityCode = null;

  @JsonProperty("ActivityIndicator")
  private ActivityIndicator activityIndicator = null;

  @JsonProperty("LineOfBusiness")
  private String lineOfBusiness = "";

  @JsonProperty("PhoneNumber")
  private String phoneNumber = "";

  @JsonProperty("IsImport")
  private Boolean isImport = null;

  @JsonProperty("IsExport")
  private Boolean isExport = null;

  @JsonProperty("IsAgent")
  private Boolean isAgent = null;

  @JsonProperty("IsDaughterSince")
  private LocalDate isDaughterSince = null;

  @JsonProperty("Fax")
  private String fax = "";

  @JsonProperty("Telex")
  private String telex = "";

  @JsonProperty("WebsiteURL")
  private String websiteURL = "";

  @JsonProperty("AnnualSales")
  private BigDecimal annualSales = null;

  @JsonProperty("AnnualSalesIndicator")
  private ReliabilityIndicator annualSalesIndicator = null;

  @JsonProperty("EmployeesNrBranch")
  private Integer employeesNrBranch = null;

  @JsonProperty("EmployeesNrBranchIndicator")
  private ReliabilityIndicator employeesNrBranchIndicator = null;

  @JsonProperty("EmployeesNrTotal")
  private Integer employeesNrTotal = null;

  @JsonProperty("EmployeesNrTotalIndicator")
  private ReliabilityIndicator employeesNrTotalIndicator = null;

  @JsonProperty("CommercialActivity")
  private Boolean commercialActivity = null;

  @JsonProperty("OperationalActivity")
  private Boolean operationalActivity = null;

  @JsonProperty("DateOOB")
  private LocalDate dateOOB = null;

  @JsonProperty("IsActive")
  private Boolean isActive = null;

  @JsonProperty("CorrespondenceAddress")
  private CorrespondenceAddress correspondenceAddress = null;

  @JsonProperty("BusinessAddress")
  private BusinessAddress businessAddress = null;

  @JsonProperty("References")
  @Valid
  private List<Reference> references = null;

  public Branch branchNumber(Long branchNumber) {
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

  public Branch branchOldNumber(Long branchOldNumber) {
    this.branchOldNumber = branchOldNumber;
    return this;
  }

  /**
   * Old number for the Branch 
   * @return branchOldNumber
  **/
  @ApiModelProperty(example = "1234567891234567", value = "Old number for the Branch ")
  
    public Long getBranchOldNumber() {
    return branchOldNumber;
  }

  public void setBranchOldNumber(Long branchOldNumber) {
    this.branchOldNumber = branchOldNumber;
  }

  public Branch branchNumberParent(Long branchNumberParent) {
    this.branchNumberParent = branchNumberParent;
    return this;
  }

  /**
   * Branch Number Parent
   * @return branchNumberParent
  **/
  @ApiModelProperty(example = "1234567891234567", value = "Branch Number Parent")
  
    public Long getBranchNumberParent() {
    return branchNumberParent;
  }

  public void setBranchNumberParent(Long branchNumberParent) {
    this.branchNumberParent = branchNumberParent;
  }

  public Branch branchNumberPartOwnership(Long branchNumberPartOwnership) {
    this.branchNumberPartOwnership = branchNumberPartOwnership;
    return this;
  }

  /**
   * Branch Number Part Ownership
   * @return branchNumberPartOwnership
  **/
  @ApiModelProperty(example = "1234567891234567", value = "Branch Number Part Ownership")
  
    public Long getBranchNumberPartOwnership() {
    return branchNumberPartOwnership;
  }

  public void setBranchNumberPartOwnership(Long branchNumberPartOwnership) {
    this.branchNumberPartOwnership = branchNumberPartOwnership;
  }

  public Branch branchNumberReference(Long branchNumberReference) {
    this.branchNumberReference = branchNumberReference;
    return this;
  }

  /**
   * Branch Number Reference
   * @return branchNumberReference
  **/
  @ApiModelProperty(example = "1234567891234567", value = "Branch Number Reference")
  
    public Long getBranchNumberReference() {
    return branchNumberReference;
  }

  public void setBranchNumberReference(Long branchNumberReference) {
    this.branchNumberReference = branchNumberReference;
  }

  public Branch branchNumberOrganizationParent(Long branchNumberOrganizationParent) {
    this.branchNumberOrganizationParent = branchNumberOrganizationParent;
    return this;
  }

  /**
   * Branch Number Organization Parent
   * @return branchNumberOrganizationParent
  **/
  @ApiModelProperty(example = "1234567891234567", value = "Branch Number Organization Parent")
  
    public Long getBranchNumberOrganizationParent() {
    return branchNumberOrganizationParent;
  }

  public void setBranchNumberOrganizationParent(Long branchNumberOrganizationParent) {
    this.branchNumberOrganizationParent = branchNumberOrganizationParent;
  }

  public Branch branchType(BranchType branchType) {
    this.branchType = branchType;
    return this;
  }

  /**
   * Get branchType
   * @return branchType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public BranchType getBranchType() {
    return branchType;
  }

  public void setBranchType(BranchType branchType) {
    this.branchType = branchType;
  }

  public Branch commercialBranchType(CommercialBranchType commercialBranchType) {
    this.commercialBranchType = commercialBranchType;
    return this;
  }

  /**
   * Get commercialBranchType
   * @return commercialBranchType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CommercialBranchType getCommercialBranchType() {
    return commercialBranchType;
  }

  public void setCommercialBranchType(CommercialBranchType commercialBranchType) {
    this.commercialBranchType = commercialBranchType;
  }

  public Branch percentageOwnership(Integer percentageOwnership) {
    this.percentageOwnership = percentageOwnership;
    return this;
  }

  /**
   * Percentage Ownership
   * @return percentageOwnership
  **/
  @ApiModelProperty(example = "0", value = "Percentage Ownership")
  
    public Integer getPercentageOwnership() {
    return percentageOwnership;
  }

  public void setPercentageOwnership(Integer percentageOwnership) {
    this.percentageOwnership = percentageOwnership;
  }

  public Branch displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display Name
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "Display Name")
      @NotNull

    public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Branch tradeName(String tradeName) {
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

  public Branch commercialName(String commercialName) {
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

  public Branch ourName(String ourName) {
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

  public Branch companyName(String companyName) {
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

  public Branch relevance(Integer relevance) {
    this.relevance = relevance;
    return this;
  }

  /**
   * Relevance
   * @return relevance
  **/
  @ApiModelProperty(example = "0", required = true, value = "Relevance")
      @NotNull

    public Integer getRelevance() {
    return relevance;
  }

  public void setRelevance(Integer relevance) {
    this.relevance = relevance;
  }

  public Branch coCNumber(Integer coCNumber) {
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

  public Branch coCBranchNumber(Integer coCBranchNumber) {
    this.coCBranchNumber = coCBranchNumber;
    return this;
  }

  /**
   * Empty if this is an exception, a commercial branch or a reference.
   * @return coCBranchNumber
  **/
  @ApiModelProperty(example = "0", value = "Empty if this is an exception, a commercial branch or a reference.")
  
    public Integer getCoCBranchNumber() {
    return coCBranchNumber;
  }

  public void setCoCBranchNumber(Integer coCBranchNumber) {
    this.coCBranchNumber = coCBranchNumber;
  }

  public Branch isHeadquarter(Boolean isHeadquarter) {
    this.isHeadquarter = isHeadquarter;
    return this;
  }

  /**
   * CoC Headquarter Branch Office
   * @return isHeadquarter
  **/
  @ApiModelProperty(example = "false", required = true, value = "CoC Headquarter Branch Office")
      @NotNull

    public Boolean isIsHeadquarter() {
    return isHeadquarter;
  }

  public void setIsHeadquarter(Boolean isHeadquarter) {
    this.isHeadquarter = isHeadquarter;
  }

  public Branch RSIN(String RSIN) {
    this.RSIN = RSIN;
    return this;
  }

  /**
   * Legal entities joint ventures information number
   * @return RSIN
  **/
  @ApiModelProperty(value = "Legal entities joint ventures information number")
  
    public String getRSIN() {
    return RSIN;
  }

  public void setRSIN(String RSIN) {
    this.RSIN = RSIN;
  }

  public Branch isEconomicallyActive(Boolean isEconomicallyActive) {
    this.isEconomicallyActive = isEconomicallyActive;
    return this;
  }

  /**
   * Is Economically Active
   * @return isEconomicallyActive
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is Economically Active")
      @NotNull

    public Boolean isIsEconomicallyActive() {
    return isEconomicallyActive;
  }

  public void setIsEconomicallyActive(Boolean isEconomicallyActive) {
    this.isEconomicallyActive = isEconomicallyActive;
  }

  public Branch startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start Date
   * @return startDate
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "Start Date")
  
    @Valid
    public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public Branch isDirectMarketingPermitted(Boolean isDirectMarketingPermitted) {
    this.isDirectMarketingPermitted = isDirectMarketingPermitted;
    return this;
  }

  /**
   * Is Direct Marketing Permitted
   * @return isDirectMarketingPermitted
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is Direct Marketing Permitted")
      @NotNull

    public Boolean isIsDirectMarketingPermitted() {
    return isDirectMarketingPermitted;
  }

  public void setIsDirectMarketingPermitted(Boolean isDirectMarketingPermitted) {
    this.isDirectMarketingPermitted = isDirectMarketingPermitted;
  }

  public Branch isZZP(Boolean isZZP) {
    this.isZZP = isZZP;
    return this;
  }

  /**
   * Is ZZP
   * @return isZZP
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is ZZP")
      @NotNull

    public Boolean isIsZZP() {
    return isZZP;
  }

  public void setIsZZP(Boolean isZZP) {
    this.isZZP = isZZP;
  }

  public Branch isBankruptcy(Boolean isBankruptcy) {
    this.isBankruptcy = isBankruptcy;
    return this;
  }

  /**
   * Is Bankruptcy
   * @return isBankruptcy
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is Bankruptcy")
      @NotNull

    public Boolean isIsBankruptcy() {
    return isBankruptcy;
  }

  public void setIsBankruptcy(Boolean isBankruptcy) {
    this.isBankruptcy = isBankruptcy;
  }

  public Branch startDateBankruptcy(LocalDate startDateBankruptcy) {
    this.startDateBankruptcy = startDateBankruptcy;
    return this;
  }

  /**
   * Start Date Bankruptcy
   * @return startDateBankruptcy
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "Start Date Bankruptcy")
  
    @Valid
    public LocalDate getStartDateBankruptcy() {
    return startDateBankruptcy;
  }

  public void setStartDateBankruptcy(LocalDate startDateBankruptcy) {
    this.startDateBankruptcy = startDateBankruptcy;
  }

  public Branch reportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * The date when a complete review of all Business Information Report data was updated on the business.
   * @return reportDate
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "The date when a complete review of all Business Information Report data was updated on the business.")
  
    @Valid
    public LocalDate getReportDate() {
    return reportDate;
  }

  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }

  public Branch legalFormDutch(LegalFormDutch legalFormDutch) {
    this.legalFormDutch = legalFormDutch;
    return this;
  }

  /**
   * Get legalFormDutch
   * @return legalFormDutch
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LegalFormDutch getLegalFormDutch() {
    return legalFormDutch;
  }

  public void setLegalFormDutch(LegalFormDutch legalFormDutch) {
    this.legalFormDutch = legalFormDutch;
  }

  public Branch legalFormInternational(LegalFormInternational legalFormInternational) {
    this.legalFormInternational = legalFormInternational;
    return this;
  }

  /**
   * Get legalFormInternational
   * @return legalFormInternational
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LegalFormInternational getLegalFormInternational() {
    return legalFormInternational;
  }

  public void setLegalFormInternational(LegalFormInternational legalFormInternational) {
    this.legalFormInternational = legalFormInternational;
  }

  public Branch sbICode1(SBICode sbICode1) {
    this.sbICode1 = sbICode1;
    return this;
  }

  /**
   * Get sbICode1
   * @return sbICode1
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode1() {
    return sbICode1;
  }

  public void setSbICode1(SBICode sbICode1) {
    this.sbICode1 = sbICode1;
  }

  public Branch sbICode2(SBICode sbICode2) {
    this.sbICode2 = sbICode2;
    return this;
  }

  /**
   * Get sbICode2
   * @return sbICode2
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode2() {
    return sbICode2;
  }

  public void setSbICode2(SBICode sbICode2) {
    this.sbICode2 = sbICode2;
  }

  public Branch sbICode3(SBICode sbICode3) {
    this.sbICode3 = sbICode3;
    return this;
  }

  /**
   * Get sbICode3
   * @return sbICode3
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode3() {
    return sbICode3;
  }

  public void setSbICode3(SBICode sbICode3) {
    this.sbICode3 = sbICode3;
  }

  public Branch sbICode4(SBICode sbICode4) {
    this.sbICode4 = sbICode4;
    return this;
  }

  /**
   * Get sbICode4
   * @return sbICode4
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode4() {
    return sbICode4;
  }

  public void setSbICode4(SBICode sbICode4) {
    this.sbICode4 = sbICode4;
  }

  public Branch sbICode5(SBICode sbICode5) {
    this.sbICode5 = sbICode5;
    return this;
  }

  /**
   * Get sbICode5
   * @return sbICode5
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode5() {
    return sbICode5;
  }

  public void setSbICode5(SBICode sbICode5) {
    this.sbICode5 = sbICode5;
  }

  public Branch sbICode6(SBICode sbICode6) {
    this.sbICode6 = sbICode6;
    return this;
  }

  /**
   * Get sbICode6
   * @return sbICode6
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode6() {
    return sbICode6;
  }

  public void setSbICode6(SBICode sbICode6) {
    this.sbICode6 = sbICode6;
  }

  public Branch sbICode7(SBICode sbICode7) {
    this.sbICode7 = sbICode7;
    return this;
  }

  /**
   * Get sbICode7
   * @return sbICode7
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode7() {
    return sbICode7;
  }

  public void setSbICode7(SBICode sbICode7) {
    this.sbICode7 = sbICode7;
  }

  public Branch sbICode8(SBICode sbICode8) {
    this.sbICode8 = sbICode8;
    return this;
  }

  /**
   * Get sbICode8
   * @return sbICode8
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode8() {
    return sbICode8;
  }

  public void setSbICode8(SBICode sbICode8) {
    this.sbICode8 = sbICode8;
  }

  public Branch sbICode9(SBICode sbICode9) {
    this.sbICode9 = sbICode9;
    return this;
  }

  /**
   * Get sbICode9
   * @return sbICode9
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode9() {
    return sbICode9;
  }

  public void setSbICode9(SBICode sbICode9) {
    this.sbICode9 = sbICode9;
  }

  public Branch sbICode10(SBICode sbICode10) {
    this.sbICode10 = sbICode10;
    return this;
  }

  /**
   * Get sbICode10
   * @return sbICode10
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SBICode getSbICode10() {
    return sbICode10;
  }

  public void setSbICode10(SBICode sbICode10) {
    this.sbICode10 = sbICode10;
  }

  public Branch siCCode1(SICCode siCCode1) {
    this.siCCode1 = siCCode1;
    return this;
  }

  /**
   * Get siCCode1
   * @return siCCode1
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SICCode getSiCCode1() {
    return siCCode1;
  }

  public void setSiCCode1(SICCode siCCode1) {
    this.siCCode1 = siCCode1;
  }

  public Branch siCCode2(SICCode siCCode2) {
    this.siCCode2 = siCCode2;
    return this;
  }

  /**
   * Get siCCode2
   * @return siCCode2
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SICCode getSiCCode2() {
    return siCCode2;
  }

  public void setSiCCode2(SICCode siCCode2) {
    this.siCCode2 = siCCode2;
  }

  public Branch siCCode3(SICCode siCCode3) {
    this.siCCode3 = siCCode3;
    return this;
  }

  /**
   * Get siCCode3
   * @return siCCode3
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SICCode getSiCCode3() {
    return siCCode3;
  }

  public void setSiCCode3(SICCode siCCode3) {
    this.siCCode3 = siCCode3;
  }

  public Branch siCCode4(SICCode siCCode4) {
    this.siCCode4 = siCCode4;
    return this;
  }

  /**
   * Get siCCode4
   * @return siCCode4
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SICCode getSiCCode4() {
    return siCCode4;
  }

  public void setSiCCode4(SICCode siCCode4) {
    this.siCCode4 = siCCode4;
  }

  public Branch siCCode5(SICCode siCCode5) {
    this.siCCode5 = siCCode5;
    return this;
  }

  /**
   * Get siCCode5
   * @return siCCode5
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SICCode getSiCCode5() {
    return siCCode5;
  }

  public void setSiCCode5(SICCode siCCode5) {
    this.siCCode5 = siCCode5;
  }

  public Branch siCCode6(SICCode siCCode6) {
    this.siCCode6 = siCCode6;
    return this;
  }

  /**
   * Get siCCode6
   * @return siCCode6
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SICCode getSiCCode6() {
    return siCCode6;
  }

  public void setSiCCode6(SICCode siCCode6) {
    this.siCCode6 = siCCode6;
  }

  public Branch primaryLocalActivityCode(Integer primaryLocalActivityCode) {
    this.primaryLocalActivityCode = primaryLocalActivityCode;
    return this;
  }

  /**
   * Primary Local Activity Code
   * @return primaryLocalActivityCode
  **/
  @ApiModelProperty(example = "0", value = "Primary Local Activity Code")
  
    public Integer getPrimaryLocalActivityCode() {
    return primaryLocalActivityCode;
  }

  public void setPrimaryLocalActivityCode(Integer primaryLocalActivityCode) {
    this.primaryLocalActivityCode = primaryLocalActivityCode;
  }

  public Branch activityIndicator(ActivityIndicator activityIndicator) {
    this.activityIndicator = activityIndicator;
    return this;
  }

  /**
   * Get activityIndicator
   * @return activityIndicator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ActivityIndicator getActivityIndicator() {
    return activityIndicator;
  }

  public void setActivityIndicator(ActivityIndicator activityIndicator) {
    this.activityIndicator = activityIndicator;
  }

  public Branch lineOfBusiness(String lineOfBusiness) {
    this.lineOfBusiness = lineOfBusiness;
    return this;
  }

  /**
   * LineOfBusiness
   * @return lineOfBusiness
  **/
  @ApiModelProperty(value = "LineOfBusiness")
  
    public String getLineOfBusiness() {
    return lineOfBusiness;
  }

  public void setLineOfBusiness(String lineOfBusiness) {
    this.lineOfBusiness = lineOfBusiness;
  }

  public Branch phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone Number
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Phone Number")
  
    public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Branch isImport(Boolean isImport) {
    this.isImport = isImport;
    return this;
  }

  /**
   * Is Import
   * @return isImport
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is Import")
      @NotNull

    public Boolean isIsImport() {
    return isImport;
  }

  public void setIsImport(Boolean isImport) {
    this.isImport = isImport;
  }

  public Branch isExport(Boolean isExport) {
    this.isExport = isExport;
    return this;
  }

  /**
   * Indicates that the business exports products to other countries.
   * @return isExport
  **/
  @ApiModelProperty(example = "false", required = true, value = "Indicates that the business exports products to other countries.")
      @NotNull

    public Boolean isIsExport() {
    return isExport;
  }

  public void setIsExport(Boolean isExport) {
    this.isExport = isExport;
  }

  public Branch isAgent(Boolean isAgent) {
    this.isAgent = isAgent;
    return this;
  }

  /**
   * Is Agent
   * @return isAgent
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is Agent")
      @NotNull

    public Boolean isIsAgent() {
    return isAgent;
  }

  public void setIsAgent(Boolean isAgent) {
    this.isAgent = isAgent;
  }

  public Branch isDaughterSince(LocalDate isDaughterSince) {
    this.isDaughterSince = isDaughterSince;
    return this;
  }

  /**
   * Is Daughter Since
   * @return isDaughterSince
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "Is Daughter Since")
  
    @Valid
    public LocalDate getIsDaughterSince() {
    return isDaughterSince;
  }

  public void setIsDaughterSince(LocalDate isDaughterSince) {
    this.isDaughterSince = isDaughterSince;
  }

  public Branch fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Fax
   * @return fax
  **/
  @ApiModelProperty(value = "Fax")
  
    public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Branch telex(String telex) {
    this.telex = telex;
    return this;
  }

  /**
   * Telex
   * @return telex
  **/
  @ApiModelProperty(value = "Telex")
  
    public String getTelex() {
    return telex;
  }

  public void setTelex(String telex) {
    this.telex = telex;
  }

  public Branch websiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
    return this;
  }

  /**
   * Website URL
   * @return websiteURL
  **/
  @ApiModelProperty(value = "Website URL")
  
    public String getWebsiteURL() {
    return websiteURL;
  }

  public void setWebsiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
  }

  public Branch annualSales(BigDecimal annualSales) {
    this.annualSales = annualSales;
    return this;
  }

  /**
   * Turnover in Dollars.
   * @return annualSales
  **/
  @ApiModelProperty(example = "0.1", value = "Turnover in Dollars.")
  
    @Valid
    public BigDecimal getAnnualSales() {
    return annualSales;
  }

  public void setAnnualSales(BigDecimal annualSales) {
    this.annualSales = annualSales;
  }

  public Branch annualSalesIndicator(ReliabilityIndicator annualSalesIndicator) {
    this.annualSalesIndicator = annualSalesIndicator;
    return this;
  }

  /**
   * Get annualSalesIndicator
   * @return annualSalesIndicator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ReliabilityIndicator getAnnualSalesIndicator() {
    return annualSalesIndicator;
  }

  public void setAnnualSalesIndicator(ReliabilityIndicator annualSalesIndicator) {
    this.annualSalesIndicator = annualSalesIndicator;
  }

  public Branch employeesNrBranch(Integer employeesNrBranch) {
    this.employeesNrBranch = employeesNrBranch;
    return this;
  }

  /**
   * Employees Number
   * @return employeesNrBranch
  **/
  @ApiModelProperty(example = "0", value = "Employees Number")
  
    public Integer getEmployeesNrBranch() {
    return employeesNrBranch;
  }

  public void setEmployeesNrBranch(Integer employeesNrBranch) {
    this.employeesNrBranch = employeesNrBranch;
  }

  public Branch employeesNrBranchIndicator(ReliabilityIndicator employeesNrBranchIndicator) {
    this.employeesNrBranchIndicator = employeesNrBranchIndicator;
    return this;
  }

  /**
   * Get employeesNrBranchIndicator
   * @return employeesNrBranchIndicator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ReliabilityIndicator getEmployeesNrBranchIndicator() {
    return employeesNrBranchIndicator;
  }

  public void setEmployeesNrBranchIndicator(ReliabilityIndicator employeesNrBranchIndicator) {
    this.employeesNrBranchIndicator = employeesNrBranchIndicator;
  }

  public Branch employeesNrTotal(Integer employeesNrTotal) {
    this.employeesNrTotal = employeesNrTotal;
    return this;
  }

  /**
   * Total number of employees at this company, principals included.
   * @return employeesNrTotal
  **/
  @ApiModelProperty(example = "0", value = "Total number of employees at this company, principals included.")
  
    public Integer getEmployeesNrTotal() {
    return employeesNrTotal;
  }

  public void setEmployeesNrTotal(Integer employeesNrTotal) {
    this.employeesNrTotal = employeesNrTotal;
  }

  public Branch employeesNrTotalIndicator(ReliabilityIndicator employeesNrTotalIndicator) {
    this.employeesNrTotalIndicator = employeesNrTotalIndicator;
    return this;
  }

  /**
   * Get employeesNrTotalIndicator
   * @return employeesNrTotalIndicator
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ReliabilityIndicator getEmployeesNrTotalIndicator() {
    return employeesNrTotalIndicator;
  }

  public void setEmployeesNrTotalIndicator(ReliabilityIndicator employeesNrTotalIndicator) {
    this.employeesNrTotalIndicator = employeesNrTotalIndicator;
  }

  public Branch commercialActivity(Boolean commercialActivity) {
    this.commercialActivity = commercialActivity;
    return this;
  }

  /**
   * Commercial Activity
   * @return commercialActivity
  **/
  @ApiModelProperty(example = "false", required = true, value = "Commercial Activity")
      @NotNull

    public Boolean isCommercialActivity() {
    return commercialActivity;
  }

  public void setCommercialActivity(Boolean commercialActivity) {
    this.commercialActivity = commercialActivity;
  }

  public Branch operationalActivity(Boolean operationalActivity) {
    this.operationalActivity = operationalActivity;
    return this;
  }

  /**
   * Operational Activity
   * @return operationalActivity
  **/
  @ApiModelProperty(example = "false", required = true, value = "Operational Activity")
      @NotNull

    public Boolean isOperationalActivity() {
    return operationalActivity;
  }

  public void setOperationalActivity(Boolean operationalActivity) {
    this.operationalActivity = operationalActivity;
  }

  public Branch dateOOB(LocalDate dateOOB) {
    this.dateOOB = dateOOB;
    return this;
  }

  /**
   * Datetime the branch went Out Of Business OOB
   * @return dateOOB
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "Datetime the branch went Out Of Business OOB")
  
    @Valid
    public LocalDate getDateOOB() {
    return dateOOB;
  }

  public void setDateOOB(LocalDate dateOOB) {
    this.dateOOB = dateOOB;
  }

  public Branch isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Is Active
   * @return isActive
  **/
  @ApiModelProperty(example = "false", required = true, value = "Is Active")
      @NotNull

    public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Branch correspondenceAddress(CorrespondenceAddress correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
    return this;
  }

  /**
   * Get correspondenceAddress
   * @return correspondenceAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CorrespondenceAddress getCorrespondenceAddress() {
    return correspondenceAddress;
  }

  public void setCorrespondenceAddress(CorrespondenceAddress correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
  }

  public Branch businessAddress(BusinessAddress businessAddress) {
    this.businessAddress = businessAddress;
    return this;
  }

  /**
   * Get businessAddress
   * @return businessAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BusinessAddress getBusinessAddress() {
    return businessAddress;
  }

  public void setBusinessAddress(BusinessAddress businessAddress) {
    this.businessAddress = businessAddress;
  }

  public Branch references(List<Reference> references) {
    this.references = references;
    return this;
  }

  public Branch addReferencesItem(Reference referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<Reference>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * A list of references
   * @return references
  **/
  @ApiModelProperty(value = "A list of references")
      @Valid
    public List<Reference> getReferences() {
    return references;
  }

  public void setReferences(List<Reference> references) {
    this.references = references;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(this.branchNumber, branch.branchNumber) &&
        Objects.equals(this.branchOldNumber, branch.branchOldNumber) &&
        Objects.equals(this.branchNumberParent, branch.branchNumberParent) &&
        Objects.equals(this.branchNumberPartOwnership, branch.branchNumberPartOwnership) &&
        Objects.equals(this.branchNumberReference, branch.branchNumberReference) &&
        Objects.equals(this.branchNumberOrganizationParent, branch.branchNumberOrganizationParent) &&
        Objects.equals(this.branchType, branch.branchType) &&
        Objects.equals(this.commercialBranchType, branch.commercialBranchType) &&
        Objects.equals(this.percentageOwnership, branch.percentageOwnership) &&
        Objects.equals(this.displayName, branch.displayName) &&
        Objects.equals(this.tradeName, branch.tradeName) &&
        Objects.equals(this.commercialName, branch.commercialName) &&
        Objects.equals(this.ourName, branch.ourName) &&
        Objects.equals(this.companyName, branch.companyName) &&
        Objects.equals(this.relevance, branch.relevance) &&
        Objects.equals(this.coCNumber, branch.coCNumber) &&
        Objects.equals(this.coCBranchNumber, branch.coCBranchNumber) &&
        Objects.equals(this.isHeadquarter, branch.isHeadquarter) &&
        Objects.equals(this.RSIN, branch.RSIN) &&
        Objects.equals(this.isEconomicallyActive, branch.isEconomicallyActive) &&
        Objects.equals(this.startDate, branch.startDate) &&
        Objects.equals(this.isDirectMarketingPermitted, branch.isDirectMarketingPermitted) &&
        Objects.equals(this.isZZP, branch.isZZP) &&
        Objects.equals(this.isBankruptcy, branch.isBankruptcy) &&
        Objects.equals(this.startDateBankruptcy, branch.startDateBankruptcy) &&
        Objects.equals(this.reportDate, branch.reportDate) &&
        Objects.equals(this.legalFormDutch, branch.legalFormDutch) &&
        Objects.equals(this.legalFormInternational, branch.legalFormInternational) &&
        Objects.equals(this.sbICode1, branch.sbICode1) &&
        Objects.equals(this.sbICode2, branch.sbICode2) &&
        Objects.equals(this.sbICode3, branch.sbICode3) &&
        Objects.equals(this.sbICode4, branch.sbICode4) &&
        Objects.equals(this.sbICode5, branch.sbICode5) &&
        Objects.equals(this.sbICode6, branch.sbICode6) &&
        Objects.equals(this.sbICode7, branch.sbICode7) &&
        Objects.equals(this.sbICode8, branch.sbICode8) &&
        Objects.equals(this.sbICode9, branch.sbICode9) &&
        Objects.equals(this.sbICode10, branch.sbICode10) &&
        Objects.equals(this.siCCode1, branch.siCCode1) &&
        Objects.equals(this.siCCode2, branch.siCCode2) &&
        Objects.equals(this.siCCode3, branch.siCCode3) &&
        Objects.equals(this.siCCode4, branch.siCCode4) &&
        Objects.equals(this.siCCode5, branch.siCCode5) &&
        Objects.equals(this.siCCode6, branch.siCCode6) &&
        Objects.equals(this.primaryLocalActivityCode, branch.primaryLocalActivityCode) &&
        Objects.equals(this.activityIndicator, branch.activityIndicator) &&
        Objects.equals(this.lineOfBusiness, branch.lineOfBusiness) &&
        Objects.equals(this.phoneNumber, branch.phoneNumber) &&
        Objects.equals(this.isImport, branch.isImport) &&
        Objects.equals(this.isExport, branch.isExport) &&
        Objects.equals(this.isAgent, branch.isAgent) &&
        Objects.equals(this.isDaughterSince, branch.isDaughterSince) &&
        Objects.equals(this.fax, branch.fax) &&
        Objects.equals(this.telex, branch.telex) &&
        Objects.equals(this.websiteURL, branch.websiteURL) &&
        Objects.equals(this.annualSales, branch.annualSales) &&
        Objects.equals(this.annualSalesIndicator, branch.annualSalesIndicator) &&
        Objects.equals(this.employeesNrBranch, branch.employeesNrBranch) &&
        Objects.equals(this.employeesNrBranchIndicator, branch.employeesNrBranchIndicator) &&
        Objects.equals(this.employeesNrTotal, branch.employeesNrTotal) &&
        Objects.equals(this.employeesNrTotalIndicator, branch.employeesNrTotalIndicator) &&
        Objects.equals(this.commercialActivity, branch.commercialActivity) &&
        Objects.equals(this.operationalActivity, branch.operationalActivity) &&
        Objects.equals(this.dateOOB, branch.dateOOB) &&
        Objects.equals(this.isActive, branch.isActive) &&
        Objects.equals(this.correspondenceAddress, branch.correspondenceAddress) &&
        Objects.equals(this.businessAddress, branch.businessAddress) &&
        Objects.equals(this.references, branch.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchNumber, branchOldNumber, branchNumberParent, branchNumberPartOwnership, branchNumberReference, branchNumberOrganizationParent, branchType, commercialBranchType, percentageOwnership, displayName, tradeName, commercialName, ourName, companyName, relevance, coCNumber, coCBranchNumber, isHeadquarter, RSIN, isEconomicallyActive, startDate, isDirectMarketingPermitted, isZZP, isBankruptcy, startDateBankruptcy, reportDate, legalFormDutch, legalFormInternational, sbICode1, sbICode2, sbICode3, sbICode4, sbICode5, sbICode6, sbICode7, sbICode8, sbICode9, sbICode10, siCCode1, siCCode2, siCCode3, siCCode4, siCCode5, siCCode6, primaryLocalActivityCode, activityIndicator, lineOfBusiness, phoneNumber, isImport, isExport, isAgent, isDaughterSince, fax, telex, websiteURL, annualSales, annualSalesIndicator, employeesNrBranch, employeesNrBranchIndicator, employeesNrTotal, employeesNrTotalIndicator, commercialActivity, operationalActivity, dateOOB, isActive, correspondenceAddress, businessAddress, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    branchOldNumber: ").append(toIndentedString(branchOldNumber)).append("\n");
    sb.append("    branchNumberParent: ").append(toIndentedString(branchNumberParent)).append("\n");
    sb.append("    branchNumberPartOwnership: ").append(toIndentedString(branchNumberPartOwnership)).append("\n");
    sb.append("    branchNumberReference: ").append(toIndentedString(branchNumberReference)).append("\n");
    sb.append("    branchNumberOrganizationParent: ").append(toIndentedString(branchNumberOrganizationParent)).append("\n");
    sb.append("    branchType: ").append(toIndentedString(branchType)).append("\n");
    sb.append("    commercialBranchType: ").append(toIndentedString(commercialBranchType)).append("\n");
    sb.append("    percentageOwnership: ").append(toIndentedString(percentageOwnership)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    tradeName: ").append(toIndentedString(tradeName)).append("\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    ourName: ").append(toIndentedString(ourName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    relevance: ").append(toIndentedString(relevance)).append("\n");
    sb.append("    coCNumber: ").append(toIndentedString(coCNumber)).append("\n");
    sb.append("    coCBranchNumber: ").append(toIndentedString(coCBranchNumber)).append("\n");
    sb.append("    isHeadquarter: ").append(toIndentedString(isHeadquarter)).append("\n");
    sb.append("    RSIN: ").append(toIndentedString(RSIN)).append("\n");
    sb.append("    isEconomicallyActive: ").append(toIndentedString(isEconomicallyActive)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    isDirectMarketingPermitted: ").append(toIndentedString(isDirectMarketingPermitted)).append("\n");
    sb.append("    isZZP: ").append(toIndentedString(isZZP)).append("\n");
    sb.append("    isBankruptcy: ").append(toIndentedString(isBankruptcy)).append("\n");
    sb.append("    startDateBankruptcy: ").append(toIndentedString(startDateBankruptcy)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    legalFormDutch: ").append(toIndentedString(legalFormDutch)).append("\n");
    sb.append("    legalFormInternational: ").append(toIndentedString(legalFormInternational)).append("\n");
    sb.append("    sbICode1: ").append(toIndentedString(sbICode1)).append("\n");
    sb.append("    sbICode2: ").append(toIndentedString(sbICode2)).append("\n");
    sb.append("    sbICode3: ").append(toIndentedString(sbICode3)).append("\n");
    sb.append("    sbICode4: ").append(toIndentedString(sbICode4)).append("\n");
    sb.append("    sbICode5: ").append(toIndentedString(sbICode5)).append("\n");
    sb.append("    sbICode6: ").append(toIndentedString(sbICode6)).append("\n");
    sb.append("    sbICode7: ").append(toIndentedString(sbICode7)).append("\n");
    sb.append("    sbICode8: ").append(toIndentedString(sbICode8)).append("\n");
    sb.append("    sbICode9: ").append(toIndentedString(sbICode9)).append("\n");
    sb.append("    sbICode10: ").append(toIndentedString(sbICode10)).append("\n");
    sb.append("    siCCode1: ").append(toIndentedString(siCCode1)).append("\n");
    sb.append("    siCCode2: ").append(toIndentedString(siCCode2)).append("\n");
    sb.append("    siCCode3: ").append(toIndentedString(siCCode3)).append("\n");
    sb.append("    siCCode4: ").append(toIndentedString(siCCode4)).append("\n");
    sb.append("    siCCode5: ").append(toIndentedString(siCCode5)).append("\n");
    sb.append("    siCCode6: ").append(toIndentedString(siCCode6)).append("\n");
    sb.append("    primaryLocalActivityCode: ").append(toIndentedString(primaryLocalActivityCode)).append("\n");
    sb.append("    activityIndicator: ").append(toIndentedString(activityIndicator)).append("\n");
    sb.append("    lineOfBusiness: ").append(toIndentedString(lineOfBusiness)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    isImport: ").append(toIndentedString(isImport)).append("\n");
    sb.append("    isExport: ").append(toIndentedString(isExport)).append("\n");
    sb.append("    isAgent: ").append(toIndentedString(isAgent)).append("\n");
    sb.append("    isDaughterSince: ").append(toIndentedString(isDaughterSince)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    telex: ").append(toIndentedString(telex)).append("\n");
    sb.append("    websiteURL: ").append(toIndentedString(websiteURL)).append("\n");
    sb.append("    annualSales: ").append(toIndentedString(annualSales)).append("\n");
    sb.append("    annualSalesIndicator: ").append(toIndentedString(annualSalesIndicator)).append("\n");
    sb.append("    employeesNrBranch: ").append(toIndentedString(employeesNrBranch)).append("\n");
    sb.append("    employeesNrBranchIndicator: ").append(toIndentedString(employeesNrBranchIndicator)).append("\n");
    sb.append("    employeesNrTotal: ").append(toIndentedString(employeesNrTotal)).append("\n");
    sb.append("    employeesNrTotalIndicator: ").append(toIndentedString(employeesNrTotalIndicator)).append("\n");
    sb.append("    commercialActivity: ").append(toIndentedString(commercialActivity)).append("\n");
    sb.append("    operationalActivity: ").append(toIndentedString(operationalActivity)).append("\n");
    sb.append("    dateOOB: ").append(toIndentedString(dateOOB)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
    sb.append("    businessAddress: ").append(toIndentedString(businessAddress)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
