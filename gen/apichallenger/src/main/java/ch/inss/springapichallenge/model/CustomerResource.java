package ch.inss.springapichallenge.model;

import java.net.URI;
import java.util.Objects;
import ch.inss.springapichallenge.model.Customer;
import ch.inss.springapichallenge.model.Link;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomerResource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-08T08:03:56.614987+01:00[Europe/Zurich]")
public class CustomerResource {

  @JsonProperty("_links")
  @Valid
  private List<Link> links = null;

  @JsonProperty("customer")
  private Customer customer;

  public CustomerResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CustomerResource addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", required = false)
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public CustomerResource customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @Valid 
  @Schema(name = "customer", required = false)
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerResource customerResource = (CustomerResource) o;
    return Objects.equals(this.links, customerResource.links) &&
        Objects.equals(this.customer, customerResource.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerResource {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

