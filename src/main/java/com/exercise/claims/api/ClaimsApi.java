/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.exercise.claims.api;

import com.exercise.claims.model.Claim;
import com.exercise.claims.model.Claims;
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
@Api(value = "claims", description = "the claims API")
public interface ClaimsApi {

    @ApiOperation(value = "Add a new claim", nickname = "addClaim", notes = "", response = Claim.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The claim added", response = Claim.class) })
    @RequestMapping(value = "/claims",
        produces = { "*/*", "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Claim> addClaim(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Claim body
);


    @ApiOperation(value = "Get all claims", nickname = "getAllClaims", notes = "", response = Claims.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All claims", response = Claims.class) })
    @RequestMapping(value = "/claims",
        produces = { "*/*", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Claims> getAllClaims();


    @ApiOperation(value = "Get an claim by claimId", nickname = "getClaimById", notes = "", response = Claim.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Get claim with the given ID", response = Claim.class) })
    @RequestMapping(value = "/claims/{claimId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Claim> getClaimById(@ApiParam(value = "claim ID",required=true) @PathVariable("claimId") Integer claimId
);

}
