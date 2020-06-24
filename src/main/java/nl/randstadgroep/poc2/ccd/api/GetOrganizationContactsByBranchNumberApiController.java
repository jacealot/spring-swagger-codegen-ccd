package nl.randstadgroep.poc2.ccd.api;

import nl.randstadgroep.poc2.ccd.model.ContactSituation;
import org.threeten.bp.LocalDate;
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
public class GetOrganizationContactsByBranchNumberApiController implements GetOrganizationContactsByBranchNumberApi {

    private static final Logger log = LoggerFactory.getLogger(GetOrganizationContactsByBranchNumberApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetOrganizationContactsByBranchNumberApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ContactSituation>> getOrganizationContactsByBranchNumber(@NotNull @ApiParam(value = "Branch unique number", required = true) @Valid @RequestParam(value = "BranchNumber", required = true) Long branchNumber
,@ApiParam(value = "The date for the Contact Data") @Valid @RequestParam(value = "Date", required = false) LocalDate date
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ContactSituation>>(objectMapper.readValue("[ {\n  \"Situation\" : {\n    \"ExternalId\" : \"ExternalId\",\n    \"Name\" : \"Name\"\n  },\n  \"Contact\" : {\n    \"Heading\" : \"Heading\",\n    \"Language\" : \"Language\",\n    \"IsActive\" : false,\n    \"OpCo\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"ContactNumber\" : 1234567891234567,\n    \"Combiname\" : \"Combiname\",\n    \"Initials\" : \"Initials\",\n    \"ContactPositions\" : [ {\n      \"PositionType\" : {\n        \"ExternalId\" : \"ExternalId\",\n        \"Name\" : \"Name\"\n      },\n      \"CustomerFunctionTitle\" : \"CustomerFunctionTitle\",\n      \"BranchNumber\" : 1234567891234567,\n      \"StartdatePosition\" : \"2014-12-31T00:00:00.000+0000\",\n      \"ContactNumber\" : 1234567891234567,\n      \"EnddatePosition\" : \"2014-12-31T00:00:00.000+0000\"\n    }, {\n      \"PositionType\" : {\n        \"ExternalId\" : \"ExternalId\",\n        \"Name\" : \"Name\"\n      },\n      \"CustomerFunctionTitle\" : \"CustomerFunctionTitle\",\n      \"BranchNumber\" : 1234567891234567,\n      \"StartdatePosition\" : \"2014-12-31T00:00:00.000+0000\",\n      \"ContactNumber\" : 1234567891234567,\n      \"EnddatePosition\" : \"2014-12-31T00:00:00.000+0000\"\n    } ],\n    \"Surname\" : \"Surname\",\n    \"CoCContactNumber\" : 0\n  }\n}, {\n  \"Situation\" : {\n    \"ExternalId\" : \"ExternalId\",\n    \"Name\" : \"Name\"\n  },\n  \"Contact\" : {\n    \"Heading\" : \"Heading\",\n    \"Language\" : \"Language\",\n    \"IsActive\" : false,\n    \"OpCo\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"ContactNumber\" : 1234567891234567,\n    \"Combiname\" : \"Combiname\",\n    \"Initials\" : \"Initials\",\n    \"ContactPositions\" : [ {\n      \"PositionType\" : {\n        \"ExternalId\" : \"ExternalId\",\n        \"Name\" : \"Name\"\n      },\n      \"CustomerFunctionTitle\" : \"CustomerFunctionTitle\",\n      \"BranchNumber\" : 1234567891234567,\n      \"StartdatePosition\" : \"2014-12-31T00:00:00.000+0000\",\n      \"ContactNumber\" : 1234567891234567,\n      \"EnddatePosition\" : \"2014-12-31T00:00:00.000+0000\"\n    }, {\n      \"PositionType\" : {\n        \"ExternalId\" : \"ExternalId\",\n        \"Name\" : \"Name\"\n      },\n      \"CustomerFunctionTitle\" : \"CustomerFunctionTitle\",\n      \"BranchNumber\" : 1234567891234567,\n      \"StartdatePosition\" : \"2014-12-31T00:00:00.000+0000\",\n      \"ContactNumber\" : 1234567891234567,\n      \"EnddatePosition\" : \"2014-12-31T00:00:00.000+0000\"\n    } ],\n    \"Surname\" : \"Surname\",\n    \"CoCContactNumber\" : 0\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ContactSituation>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ContactSituation>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
