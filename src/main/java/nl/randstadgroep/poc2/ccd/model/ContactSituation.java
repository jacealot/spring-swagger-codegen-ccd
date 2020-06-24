package nl.randstadgroep.poc2.ccd.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import nl.randstadgroep.poc2.ccd.model.Contact;
import nl.randstadgroep.poc2.ccd.model.Situation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactSituation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
public class ContactSituation   {
  @JsonProperty("Contact")
  private Contact contact = null;

  @JsonProperty("Situation")
  private Situation situation = null;

  public ContactSituation contact(Contact contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public ContactSituation situation(Situation situation) {
    this.situation = situation;
    return this;
  }

  /**
   * Get situation
   * @return situation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Situation getSituation() {
    return situation;
  }

  public void setSituation(Situation situation) {
    this.situation = situation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactSituation contactSituation = (ContactSituation) o;
    return Objects.equals(this.contact, contactSituation.contact) &&
        Objects.equals(this.situation, contactSituation.situation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, situation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactSituation {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
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
