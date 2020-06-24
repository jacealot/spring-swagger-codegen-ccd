package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import nl.randstadgroep.poc2.ccd.model.ContactPosition;
import nl.randstadgroep.poc2.ccd.model.OpCo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the Contact
 */
@ApiModel(description = "Information about the Contact")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class Contact   {
  @JsonProperty("ContactNumber")
  private Long contactNumber = null;

  @JsonProperty("OpCo")
  private OpCo opCo = null;

  @JsonProperty("CoCContactNumber")
  private Integer coCContactNumber = null;

  @JsonProperty("Initials")
  private String initials = "";

  @JsonProperty("Surname")
  private String surname = "";

  @JsonProperty("Combiname")
  private String combiname = "";

  @JsonProperty("Language")
  private String language = "";

  @JsonProperty("Heading")
  private String heading = "";

  @JsonProperty("IsActive")
  private Boolean isActive = null;

  @JsonProperty("ContactPositions")
  @Valid
  private List<ContactPosition> contactPositions = null;

  public Contact contactNumber(Long contactNumber) {
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

  public Contact opCo(OpCo opCo) {
    this.opCo = opCo;
    return this;
  }

  /**
   * Get opCo
   * @return opCo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OpCo getOpCo() {
    return opCo;
  }

  public void setOpCo(OpCo opCo) {
    this.opCo = opCo;
  }

  public Contact coCContactNumber(Integer coCContactNumber) {
    this.coCContactNumber = coCContactNumber;
    return this;
  }

  /**
   * Unique number for the Contact
   * @return coCContactNumber
  **/
  @ApiModelProperty(example = "0", value = "Unique number for the Contact")
  
    public Integer getCoCContactNumber() {
    return coCContactNumber;
  }

  public void setCoCContactNumber(Integer coCContactNumber) {
    this.coCContactNumber = coCContactNumber;
  }

  public Contact initials(String initials) {
    this.initials = initials;
    return this;
  }

  /**
   * Initials of the contact person
   * @return initials
  **/
  @ApiModelProperty(value = "Initials of the contact person")
  
    public String getInitials() {
    return initials;
  }

  public void setInitials(String initials) {
    this.initials = initials;
  }

  public Contact surname(String surname) {
    this.surname = surname;
    return this;
  }

  /**
   * Surname of the contact person
   * @return surname
  **/
  @ApiModelProperty(value = "Surname of the contact person")
  
    public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Contact combiname(String combiname) {
    this.combiname = combiname;
    return this;
  }

  /**
   * Combination of Initials and Surname, divided by one space.
   * @return combiname
  **/
  @ApiModelProperty(required = true, value = "Combination of Initials and Surname, divided by one space.")
      @NotNull

    public String getCombiname() {
    return combiname;
  }

  public void setCombiname(String combiname) {
    this.combiname = combiname;
  }

  public Contact language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language
   * @return language
  **/
  @ApiModelProperty(value = "Language")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Contact heading(String heading) {
    this.heading = heading;
    return this;
  }

  /**
   * The title of the person like De heer or Mevrouw.
   * @return heading
  **/
  @ApiModelProperty(required = true, value = "The title of the person like De heer or Mevrouw.")
      @NotNull

    public String getHeading() {
    return heading;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }

  public Contact isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * IsActive
   * @return isActive
  **/
  @ApiModelProperty(example = "false", required = true, value = "IsActive")
      @NotNull

    public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public Contact contactPositions(List<ContactPosition> contactPositions) {
    this.contactPositions = contactPositions;
    return this;
  }

  public Contact addContactPositionsItem(ContactPosition contactPositionsItem) {
    if (this.contactPositions == null) {
      this.contactPositions = new ArrayList<ContactPosition>();
    }
    this.contactPositions.add(contactPositionsItem);
    return this;
  }

  /**
   * Get contactPositions
   * @return contactPositions
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ContactPosition> getContactPositions() {
    return contactPositions;
  }

  public void setContactPositions(List<ContactPosition> contactPositions) {
    this.contactPositions = contactPositions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.contactNumber, contact.contactNumber) &&
        Objects.equals(this.opCo, contact.opCo) &&
        Objects.equals(this.coCContactNumber, contact.coCContactNumber) &&
        Objects.equals(this.initials, contact.initials) &&
        Objects.equals(this.surname, contact.surname) &&
        Objects.equals(this.combiname, contact.combiname) &&
        Objects.equals(this.language, contact.language) &&
        Objects.equals(this.heading, contact.heading) &&
        Objects.equals(this.isActive, contact.isActive) &&
        Objects.equals(this.contactPositions, contact.contactPositions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactNumber, opCo, coCContactNumber, initials, surname, combiname, language, heading, isActive, contactPositions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    opCo: ").append(toIndentedString(opCo)).append("\n");
    sb.append("    coCContactNumber: ").append(toIndentedString(coCContactNumber)).append("\n");
    sb.append("    initials: ").append(toIndentedString(initials)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    combiname: ").append(toIndentedString(combiname)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    heading: ").append(toIndentedString(heading)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    contactPositions: ").append(toIndentedString(contactPositions)).append("\n");
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
