package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import nl.randstadgroep.poc2.ccd.model.BranchStruct;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of branches returned when using pagination services
 */
@ApiModel(description = "List of branches returned when using pagination services")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class BranchListPagination   {
  @JsonProperty("PageNumber")
  private Integer pageNumber = null;

  @JsonProperty("PageSize")
  private Integer pageSize = null;

  @JsonProperty("TotalCount")
  private Integer totalCount = null;

  @JsonProperty("Branches")
  @Valid
  private List<BranchStruct> branches = null;

  public BranchListPagination pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Number of the page requested
   * @return pageNumber
  **/
  @ApiModelProperty(example = "0", value = "Number of the page requested")
  
    public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public BranchListPagination pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Size of the page requested
   * @return pageSize
  **/
  @ApiModelProperty(example = "0", value = "Size of the page requested")
  
    public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public BranchListPagination totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Total records retrieved from the call
   * @return totalCount
  **/
  @ApiModelProperty(example = "0", value = "Total records retrieved from the call")
  
    public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public BranchListPagination branches(List<BranchStruct> branches) {
    this.branches = branches;
    return this;
  }

  public BranchListPagination addBranchesItem(BranchStruct branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<BranchStruct>();
    }
    this.branches.add(branchesItem);
    return this;
  }

  /**
   * List of branches returned
   * @return branches
  **/
  @ApiModelProperty(value = "List of branches returned")
      @Valid
    public List<BranchStruct> getBranches() {
    return branches;
  }

  public void setBranches(List<BranchStruct> branches) {
    this.branches = branches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchListPagination branchListPagination = (BranchListPagination) o;
    return Objects.equals(this.pageNumber, branchListPagination.pageNumber) &&
        Objects.equals(this.pageSize, branchListPagination.pageSize) &&
        Objects.equals(this.totalCount, branchListPagination.totalCount) &&
        Objects.equals(this.branches, branchListPagination.branches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalCount, branches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchListPagination {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
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
