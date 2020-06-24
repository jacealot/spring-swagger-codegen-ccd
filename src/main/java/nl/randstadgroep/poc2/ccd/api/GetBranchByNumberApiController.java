package nl.randstadgroep.poc2.ccd.api;

import nl.randstadgroep.poc2.ccd.model.BranchSituation;
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
public class GetBranchByNumberApiController implements GetBranchByNumberApi {

    private static final Logger log = LoggerFactory.getLogger(GetBranchByNumberApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetBranchByNumberApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BranchSituation> getBranchByNumber(@NotNull @ApiParam(value = "Branch unique number", required = true) @Valid @RequestParam(value = "BranchNumber", required = true) Long branchNumber
,@ApiParam(value = "The date for the Branch Data") @Valid @RequestParam(value = "Date", required = false) LocalDate date
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BranchSituation>(objectMapper.readValue("{\n  \"Branch\" : {\n    \"RSIN\" : \"RSIN\",\n    \"OperationalActivity\" : false,\n    \"PrimaryLocalActivityCode\" : 0,\n    \"IsBankruptcy\" : false,\n    \"CorrespondenceAddress\" : {\n      \"StartDate\" : \"2014-12-31T00:00:00.000+0000\",\n      \"Continent\" : \"Continent\",\n      \"AddressLine\" : \"AddressLine\",\n      \"Country\" : \"Country\",\n      \"PostCode\" : \"PostCode\",\n      \"Place\" : \"Place\",\n      \"Province\" : \"Province\"\n    },\n    \"IsHeadquarter\" : false,\n    \"BranchNumberReference\" : 1234567891234567,\n    \"StartDate\" : \"2014-12-31T00:00:00.000+0000\",\n    \"CompanyName\" : \"CompanyName\",\n    \"BranchNumber\" : 1234567891234567,\n    \"IsDirectMarketingPermitted\" : false,\n    \"CommercialActivity\" : false,\n    \"BranchNumberPartOwnership\" : 1234567891234567,\n    \"TradeName\" : \"TradeName\",\n    \"Telex\" : \"Telex\",\n    \"PercentageOwnership\" : 0,\n    \"WebsiteURL\" : \"WebsiteURL\",\n    \"ActivityIndicator\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"IsEconomicallyActive\" : false,\n    \"IsExport\" : false,\n    \"BranchNumberOrganizationParent\" : 1234567891234567,\n    \"IsDaughterSince\" : \"2014-12-31T00:00:00.000+0000\",\n    \"CommercialBranchType\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"IsZZP\" : false,\n    \"IsActive\" : false,\n    \"OurName\" : \"OurName\",\n    \"ReportDate\" : \"2014-12-31T00:00:00.000+0000\",\n    \"StartDateBankruptcy\" : \"2014-12-31T00:00:00.000+0000\",\n    \"BranchOldNumber\" : 1234567891234567,\n    \"Relevance\" : 0,\n    \"LegalFormDutch\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"SICCode1\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"DisplayName\" : \"DisplayName\",\n    \"LegalFormInternational\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"CommercialName\" : \"CommercialName\",\n    \"BranchType\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"IsImport\" : false,\n    \"EmployeesNrBranch\" : 0,\n    \"CoCNumber\" : 0,\n    \"DateOOB\" : \"2014-12-31T00:00:00.000+0000\",\n    \"AnnualSalesIndicator\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"BranchNumberParent\" : 1234567891234567,\n    \"BusinessAddress\" : {\n      \"BAGHouseNumberLetter\" : \"BAGHouseNumberLetter\",\n      \"IsBAGPurposeLiving\" : false,\n      \"IsBAGDemolitionPermit\" : false,\n      \"BAGChangeDate\" : \"2014-12-31T00:00:00.000+0000\",\n      \"StartDate\" : \"2014-12-31T00:00:00.000+0000\",\n      \"BAGStartDate\" : \"2014-12-31T00:00:00.000+0000\",\n      \"IsBAGPurposeRemaining\" : false,\n      \"BAGObjectType\" : \"BAGObjectType\",\n      \"IsBAGPurposeEducation\" : false,\n      \"IsBAGPurposeOffice\" : false,\n      \"IsBAGIndicatorChecked\" : false,\n      \"IsBAGPurposeIndustry\" : false,\n      \"BAGRDY\" : \"BAGRDY\",\n      \"BAGRDX\" : \"BAGRDX\",\n      \"BAGMunicipalityName\" : \"BAGMunicipalityName\",\n      \"Province\" : \"Province\",\n      \"IsBAGInUseNotMeasured\" : false,\n      \"AddressLine2\" : \"AddressLine2\",\n      \"AddressLine1\" : \"AddressLine1\",\n      \"IsBAGPurposeJail\" : false,\n      \"Country\" : \"Country\",\n      \"BAGPlace\" : \"BAGPlace\",\n      \"PostCode\" : \"PostCode\",\n      \"BAGPostCode\" : \"BAGPostCode\",\n      \"IsBAGPurposeMeeting\" : false,\n      \"BAGConstructionYear1\" : 0,\n      \"BAGConstructionYear4\" : 0,\n      \"BAGConstructionYear5\" : 0,\n      \"BAGConstructionYear2\" : 0,\n      \"BAGConstructionYear3\" : 0,\n      \"IsBAGDemolished\" : false,\n      \"IsBAGPurposeLodging\" : false,\n      \"IsBAGNotInUse\" : false,\n      \"BAGArea\" : 0,\n      \"IsBAGPurposeShop\" : false,\n      \"BAGDocumentDate\" : \"2014-12-31T00:00:00.000+0000\",\n      \"BAGId\" : 1234567891234567,\n      \"BAGHouseNumber\" : 0,\n      \"BAGIsUnderInvestigation\" : false,\n      \"IsBAGConstructionStarted\" : false,\n      \"BAGStreet\" : \"BAGStreet\",\n      \"BAGX\" : \"BAGX\",\n      \"BAGMunicipalityCode\" : 0,\n      \"BAGY\" : \"BAGY\",\n      \"BAGDocumentID\" : \"BAGDocumentID\",\n      \"Continent\" : \"Continent\",\n      \"BAGHouseNumberAddition\" : \"BAGHouseNumberAddition\",\n      \"IsBAGInUse\" : false,\n      \"IsBAGPurposeHealthcare\" : false,\n      \"IsBAGLicensed\" : false,\n      \"IsBAGNotRealisedBuilding\" : false,\n      \"Place\" : \"Place\",\n      \"IsBAGPurposeSports\" : false\n    },\n    \"IsAgent\" : false,\n    \"AnnualSales\" : 0.1,\n    \"EmployeesNrTotal\" : 0,\n    \"References\" : [ {\n      \"ReferenceBranchNumber\" : 0\n    }, {\n      \"ReferenceBranchNumber\" : 0\n    } ],\n    \"SBICode1\" : {\n      \"ExternalId\" : \"ExternalId\",\n      \"Name\" : \"Name\"\n    },\n    \"CoCBranchNumber\" : 0,\n    \"LineOfBusiness\" : \"LineOfBusiness\",\n    \"PhoneNumber\" : \"PhoneNumber\",\n    \"Fax\" : \"Fax\"\n  },\n  \"Situation\" : {\n    \"ExternalId\" : \"ExternalId\",\n    \"Name\" : \"Name\"\n  }\n}", BranchSituation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BranchSituation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BranchSituation>(HttpStatus.NOT_IMPLEMENTED);
    }

}
