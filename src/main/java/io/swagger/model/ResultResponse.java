package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Input;
import io.swagger.model.Output;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-05T22:08:56.122Z[GMT]")
public class ResultResponse   {
  @JsonProperty("input")
  private Input input = null;

  @JsonProperty("output")
  private Output output = null;

  public ResultResponse input(Input input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Input getInput() {
    return input;
  }

  public void setInput(Input input) {
    this.input = input;
  }

  public ResultResponse output(Output output) {
    this.output = output;
    return this;
  }

  /**
   * Get output
   * @return output
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Output getOutput() {
    return output;
  }

  public void setOutput(Output output) {
    this.output = output;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultResponse resultResponse = (ResultResponse) o;
    return Objects.equals(this.input, resultResponse.input) &&
        Objects.equals(this.output, resultResponse.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultResponse {\n");
    
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
