package nl.randstadgroep.poc2.ccd.api;

import nl.randstadgroep.poc2.ccd.model.*;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
@Controller
public class GetBranchesApiController implements GetBranchesApi {

    private static final Logger log = LoggerFactory.getLogger(GetBranchesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetBranchesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BranchListPagination> getBranches(@ApiParam(value = "Criteria of searching a branch" ,required=true )  @Valid @RequestBody BranchSearchCriteria body
,@NotNull @ApiParam(value = "Size of the page (minimum size: 1)", required = true) @Valid @RequestParam(value = "PageSize", required = true) Integer pageSize
,@NotNull @ApiParam(value = "Page to start the search (from page 1)", required = true) @Valid @RequestParam(value = "PageNumber", required = true) Integer pageNumber
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            try {
                BranchListPagination branchListPagination = new BranchListPagination();
                branchListPagination.setTotalCount(0);
                branchListPagination.setPageSize(0);
                branchListPagination.setPageNumber(0);

                BranchStruct branchStruct = new BranchStruct();
                List<BranchStruct> branchStructs = new ArrayList<>();
                branchStructs.add(branchStruct);

                branchListPagination.setBranches(branchStructs);

                return new ResponseEntity<BranchListPagination>(branchListPagination, HttpStatus.NOT_IMPLEMENTED);
                //return new ResponseEntity<BranchListPagination>(objectMapper.readValue("{\n  \"TotalCount\" : 0,\n  \"PageSize\" : 0,\n  \"PageNumber\" : 0,\n  \"Branches\" : [ {\n    \"AddressLine1BusinessAddress\" : \"AddressLine1BusinessAddress\",\n    \"TradeName\" : \"TradeName\",\n    \"CommercialName\" : \"CommercialName\",\n    \"IsActive\" : false,\n    \"BranchTypeId\" : 0,\n    \"BusinessProvinceId\" : 0,\n    \"BusinessProvinceName\" : \"BusinessProvinceName\",\n    \"OurName\" : \"OurName\",\n    \"CoCNumber\" : 0,\n    \"LegalFormDutchId\" : 0,\n    \"BranchId\" : 0,\n    \"Name\" : \"Name\",\n    \"IsHeadquarter\" : false,\n    \"BusinessCountryName\" : \"BusinessCountryName\",\n    \"BranchTypeName\" : \"BranchTypeName\",\n    \"LegalFormDutchName\" : \"LegalFormDutchName\",\n    \"BusinessPlace\" : \"BusinessPlace\",\n    \"CompanyName\" : \"CompanyName\",\n    \"BusinessPostCode\" : \"BusinessPostCode\",\n    \"AddressLine2BusinessAddress\" : \"AddressLine2BusinessAddress\",\n    \"BranchOrganizationParentId\" : 0,\n    \"Ranking_Search\" : 0,\n    \"IsZZP\" : false,\n    \"BusinessCountryId\" : 1234567891234567\n  }, {\n    \"AddressLine1BusinessAddress\" : \"AddressLine1BusinessAddress\",\n    \"TradeName\" : \"TradeName\",\n    \"CommercialName\" : \"CommercialName\",\n    \"IsActive\" : false,\n    \"BranchTypeId\" : 0,\n    \"BusinessProvinceId\" : 0,\n    \"BusinessProvinceName\" : \"BusinessProvinceName\",\n    \"OurName\" : \"OurName\",\n    \"CoCNumber\" : 0,\n    \"LegalFormDutchId\" : 0,\n    \"BranchId\" : 0,\n    \"Name\" : \"Name\",\n    \"IsHeadquarter\" : false,\n    \"BusinessCountryName\" : \"BusinessCountryName\",\n    \"BranchTypeName\" : \"BranchTypeName\",\n    \"LegalFormDutchName\" : \"LegalFormDutchName\",\n    \"BusinessPlace\" : \"BusinessPlace\",\n    \"CompanyName\" : \"CompanyName\",\n    \"BusinessPostCode\" : \"BusinessPostCode\",\n    \"AddressLine2BusinessAddress\" : \"AddressLine2BusinessAddress\",\n    \"BranchOrganizationParentId\" : 0,\n    \"Ranking_Search\" : 0,\n    \"IsZZP\" : false,\n    \"BusinessCountryId\" : 1234567891234567\n  } ]\n}", BranchListPagination.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<BranchListPagination>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        }

        return new ResponseEntity<BranchListPagination>(HttpStatus.NOT_IMPLEMENTED);
    }

}
