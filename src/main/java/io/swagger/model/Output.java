package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Output
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-05T22:08:56.122Z[GMT]")
public class Output   {
  @JsonProperty("number3")
  private Double number3 = null;

  public Output number3(Double number3) {
    this.number3 = number3;
    return this;
  }

  /**
   * Get number3
   * @return number3
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Double getNumber3() {
    return number3;
  }

  public void setNumber3(Double number3) {
    this.number3 = number3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Output output = (Output) o;
    return Objects.equals(this.number3, output.number3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Output {\n");
    
    sb.append("    number3: ").append(toIndentedString(number3)).append("\n");
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
