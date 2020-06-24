package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import nl.randstadgroep.poc2.ccd.model.BranchType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * References
 */
@ApiModel(description = "References")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class Reference   {
  @JsonProperty("ReferenceBranchNumber")
  private Integer referenceBranchNumber = null;

  @JsonProperty("CommercialBranchType")
  private BranchType commercialBranchType = null;

  public Reference referenceBranchNumber(Integer referenceBranchNumber) {
    this.referenceBranchNumber = referenceBranchNumber;
    return this;
  }

  /**
   * Reference branch number
   * @return referenceBranchNumber
  **/
  @ApiModelProperty(example = "0", value = "Reference branch number")
  
    public Integer getReferenceBranchNumber() {
    return referenceBranchNumber;
  }

  public void setReferenceBranchNumber(Integer referenceBranchNumber) {
    this.referenceBranchNumber = referenceBranchNumber;
  }

  public Reference commercialBranchType(BranchType commercialBranchType) {
    this.commercialBranchType = commercialBranchType;
    return this;
  }

  /**
   * Get commercialBranchType
   * @return commercialBranchType
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BranchType getCommercialBranchType() {
    return commercialBranchType;
  }

  public void setCommercialBranchType(BranchType commercialBranchType) {
    this.commercialBranchType = commercialBranchType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.referenceBranchNumber, reference.referenceBranchNumber) &&
        Objects.equals(this.commercialBranchType, reference.commercialBranchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceBranchNumber, commercialBranchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    
    sb.append("    referenceBranchNumber: ").append(toIndentedString(referenceBranchNumber)).append("\n");
    sb.append("    commercialBranchType: ").append(toIndentedString(commercialBranchType)).append("\n");
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
