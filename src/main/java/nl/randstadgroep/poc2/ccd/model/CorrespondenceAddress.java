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
public class CorrespondenceAddress   {
  @JsonProperty("AddressLine")
  private String addressLine = "";

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

  public CorrespondenceAddress addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Address Line
   * @return addressLine
  **/
  @ApiModelProperty(required = true, value = "Address Line")
      @NotNull

    public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public CorrespondenceAddress postCode(String postCode) {
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

  public CorrespondenceAddress place(String place) {
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

  public CorrespondenceAddress province(String province) {
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

  public CorrespondenceAddress country(String country) {
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

  public CorrespondenceAddress continent(String continent) {
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

  public CorrespondenceAddress startDate(LocalDate startDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrespondenceAddress correspondenceAddress = (CorrespondenceAddress) o;
    return Objects.equals(this.addressLine, correspondenceAddress.addressLine) &&
        Objects.equals(this.postCode, correspondenceAddress.postCode) &&
        Objects.equals(this.place, correspondenceAddress.place) &&
        Objects.equals(this.province, correspondenceAddress.province) &&
        Objects.equals(this.country, correspondenceAddress.country) &&
        Objects.equals(this.continent, correspondenceAddress.continent) &&
        Objects.equals(this.startDate, correspondenceAddress.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, postCode, place, province, country, continent, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrespondenceAddress {\n");
    
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
