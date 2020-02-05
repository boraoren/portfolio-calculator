/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ResultResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-05T22:08:56.122Z[GMT]")
@Api(value = "addition", description = "the addition API")
public interface AdditionApi {

    @ApiOperation(value = "I want to add two numbers (Story #1) ", nickname = "addition", notes = "", response = ResultResponse.class, tags={ "addition", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "I can see what the total is", response = ResultResponse.class),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/addition/{number1}/{number2}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ResultResponse> addition(@ApiParam(value = "first number",required=true) @PathVariable("number1") Double number1,@ApiParam(value = "second number",required=true) @PathVariable("number2") Double number2);

}
