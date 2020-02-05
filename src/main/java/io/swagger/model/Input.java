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
 * Input
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-05T22:08:56.122Z[GMT]")
public class Input   {
  @JsonProperty("number1")
  private Double number1 = null;

  @JsonProperty("number2")
  private Double number2 = null;

  @JsonProperty("operators")
  private String operators = null;

  public Input number1(Double number1) {
    this.number1 = number1;
    return this;
  }

  /**
   * Get number1
   * @return number1
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
      @NotNull

    public Double getNumber1() {
    return number1;
  }

  public void setNumber1(Double number1) {
    this.number1 = number1;
  }

  public Input number2(Double number2) {
    this.number2 = number2;
    return this;
  }

  /**
   * Get number2
   * @return number2
  **/
  @ApiModelProperty(example = "2", required = true, value = "")
      @NotNull

    public Double getNumber2() {
    return number2;
  }

  public void setNumber2(Double number2) {
    this.number2 = number2;
  }

  public Input operators(String operators) {
    this.operators = operators;
    return this;
  }

  /**
   * Get operators
   * @return operators
  **/
  @ApiModelProperty(example = "addition", required = true, value = "")
      @NotNull

    public String getOperators() {
    return operators;
  }

  public void setOperators(String operators) {
    this.operators = operators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;
    return Objects.equals(this.number1, input.number1) &&
        Objects.equals(this.number2, input.number2) &&
        Objects.equals(this.operators, input.operators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number1, number2, operators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    number1: ").append(toIndentedString(number1)).append("\n");
    sb.append("    number2: ").append(toIndentedString(number2)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
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
