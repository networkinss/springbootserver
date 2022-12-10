package ch.inss.springapichallenge.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ModelApiResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-08T07:12:03.998292+01:00[Europe/Zurich]")
public class ModelApiResponse {

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("type")
  private String type;

  @JsonProperty("message")
  private String message;

  public ModelApiResponse code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Code
   * @return code
  */
  
  @Schema(name = "code", example = "123", description = "Code", required = false)
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ModelApiResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Response type
   * @return type
  */
  
  @Schema(name = "type", example = "responsetype", description = "Response type", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ModelApiResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message.
   * @return message
  */
  
  @Schema(name = "message", example = "Message.", description = "The message.", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse modelApiResponse = (ModelApiResponse) o;
    return Objects.equals(this.code, modelApiResponse.code) &&
        Objects.equals(this.type, modelApiResponse.type) &&
        Objects.equals(this.message, modelApiResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

