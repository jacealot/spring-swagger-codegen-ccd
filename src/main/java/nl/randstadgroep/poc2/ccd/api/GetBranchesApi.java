/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.20).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package nl.randstadgroep.poc2.ccd.api;

import nl.randstadgroep.poc2.ccd.model.BranchListPagination;
import nl.randstadgroep.poc2.ccd.model.BranchSearchCriteria;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-06-24T13:20:18.302050+02:00[Europe/Amsterdam]")
@Api(value = "GetBranches", description = "the GetBranches API")
public interface GetBranchesApi {

    @ApiOperation(value = "", nickname = "getBranches", notes = "Returns Branches Structure by Name (Same as the generic search)", response = BranchListPagination.class, tags={ "CCDAPI", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = BranchListPagination.class) })
    @RequestMapping(value = "/GetBranches",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<BranchListPagination> getBranches(@ApiParam(value = "Criteria of searching a branch" ,required=true )  @Valid @RequestBody BranchSearchCriteria body
,@NotNull @ApiParam(value = "Size of the page (minimum size: 1)", required = true) @Valid @RequestParam(value = "PageSize", required = true) Integer pageSize
,@NotNull @ApiParam(value = "Page to start the search (from page 1)", required = true) @Valid @RequestParam(value = "PageNumber", required = true) Integer pageNumber
);

}