package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import nl.randstadgroep.poc2.ccd.model.BranchSpecificSearchCriteria;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Criteria for searching a branch
 */
@ApiModel(description = "Criteria for searching a branch")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class BranchSearchCriteria   {
  @JsonProperty("SearchText")
  private String searchText = "";

  @JsonProperty("Date")
  private LocalDate date = null;

  @JsonProperty("BranchSpecificCriteria")
  private BranchSpecificSearchCriteria branchSpecificCriteria = null;

  public BranchSearchCriteria searchText(String searchText) {
    this.searchText = searchText;
    return this;
  }

  /**
   * The generic search condition
   * @return searchText
  **/
  @ApiModelProperty(required = true, value = "The generic search condition")
      @NotNull

    public String getSearchText() {
    return searchText;
  }

  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public BranchSearchCriteria date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * The date for the Branch Data
   * @return date
  **/
  @ApiModelProperty(example = "Wed Dec 31 01:00:00 CET 2014", value = "The date for the Branch Data")
  
    @Valid
    public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public BranchSearchCriteria branchSpecificCriteria(BranchSpecificSearchCriteria branchSpecificCriteria) {
    this.branchSpecificCriteria = branchSpecificCriteria;
    return this;
  }

  /**
   * Get branchSpecificCriteria
   * @return branchSpecificCriteria
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BranchSpecificSearchCriteria getBranchSpecificCriteria() {
    return branchSpecificCriteria;
  }

  public void setBranchSpecificCriteria(BranchSpecificSearchCriteria branchSpecificCriteria) {
    this.branchSpecificCriteria = branchSpecificCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchSearchCriteria branchSearchCriteria = (BranchSearchCriteria) o;
    return Objects.equals(this.searchText, branchSearchCriteria.searchText) &&
        Objects.equals(this.date, branchSearchCriteria.date) &&
        Objects.equals(this.branchSpecificCriteria, branchSearchCriteria.branchSpecificCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchText, date, branchSpecificCriteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchSearchCriteria {\n");
    
    sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    branchSpecificCriteria: ").append(toIndentedString(branchSpecificCriteria)).append("\n");
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
