package nl.randstadgroep.poc2.ccd.api;

import nl.randstadgroep.poc2.ccd.model.BranchType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
@Controller
public class GetBranchTypesApiController implements GetBranchTypesApi {

    private static final Logger log = LoggerFactory.getLogger(GetBranchTypesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetBranchTypesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<BranchType>> getBranchTypes() {
        String accept = request.getHeader("Accept");

        log.info("Set Accept value in http header: [" + accept.toString() + "]");

        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<BranchType>>(objectMapper.readValue("[ {\n  \"ExternalId\" : \"1234\",\n  \"Name\" : \"Branch-A\"\n}, {\n  \"ExternalId\" : \"5678\",\n  \"Name\" : \"Branch-B\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<BranchType>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        } else {
            log.error("Set Accept value not 'application/json' in http header");
        }

        return new ResponseEntity<List<BranchType>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
