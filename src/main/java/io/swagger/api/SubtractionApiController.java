package io.swagger.api;

import io.swagger.model.ResultResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-05T22:08:56.122Z[GMT]")
@Controller
public class SubtractionApiController implements SubtractionApi {

    private static final Logger log = LoggerFactory.getLogger(SubtractionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SubtractionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResultResponse> subtraction(@ApiParam(value = "first number",required=true) @PathVariable("number1") Double number1,@ApiParam(value = "second number",required=true) @PathVariable("number2") Double number2) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResultResponse>(objectMapper.readValue("{\n  \"output\" : {\n    \"number3\" : 0.8008281904610115\n  },\n  \"input\" : {\n    \"operators\" : \"addition\",\n    \"number1\" : 1,\n    \"number2\" : 2\n  }\n}", ResultResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResultResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResultResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
