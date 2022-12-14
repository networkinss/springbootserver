/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.inss.springapichallenge.controller;

import ch.inss.springapichallenge.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T19:49:48.701044+01:00[Europe/Zurich]")
@Validated
@Tag(name = "customers", description = "the customers API")
public interface CustomersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /customers/{id} : delete
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or No Content (status code 204)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     */
    @Operation(
        operationId = "deleteUsingDELETE",
        summary = "delete",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Resourceobject.class))),
            @ApiResponse(responseCode = "204", description = "No Content"),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/customers/{id}",
        produces = { "application/hal+json" }
    )
    default ResponseEntity<Resourceobject> deleteUsingDELETE(
        @Parameter(name = "id", description = "id", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "application/hal+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * GET /customers : getAll
     *
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(
        operationId = "getAllUsingGET1",
        summary = "getAll",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ResourcesCustomerResource.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not Found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers",
        produces = { "application/hal+json" }
    )
    default ResponseEntity<ResourcesCustomerResource> getAllUsingGET1(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "application/hal+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * GET /customers/{id} : get
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(
        operationId = "getUsingGET",
        summary = "get",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ResourceCustomerResource.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not Found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers/{id}",
        produces = { "application/hal+json" }
    )
    default ResponseEntity<ResourceCustomerResource> getUsingGET(
        @Parameter(name = "id", description = "id", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "application/hal+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * GET /customers/{id}/v2 : getWithoutGeneralLinks
     *
     * @param id id (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(
        operationId = "getWithoutGeneralLinksUsingGET",
        summary = "getWithoutGeneralLinks",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  CustomerResource.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not Found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers/{id}/v2",
        produces = { "application/hal+json" }
    )
    default ResponseEntity<CustomerResource> getWithoutGeneralLinksUsingGET(
        @Parameter(name = "id", description = "id", required = true, schema = @Schema(description = "")) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "application/hal+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * POST /customers : insert
     *
     * @param newCustomerResource newCustomerResource (required)
     * @return OK (status code 200)
     *         or Created (status code 201)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(
        operationId = "insertUsingPOST",
        summary = "insert",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ResourceCustomerResource.class))),
            @ApiResponse(responseCode = "201", description = "Created"),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not Found")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/customers",
        produces = { "application/hal+json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ResourceCustomerResource> insertUsingPOST(
        @Parameter(name = "newCustomerResource", description = "newCustomerResource", required = true, schema = @Schema(description = "")) @Valid @RequestBody Customer newCustomerResource
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "application/hal+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * PUT /customers : update
     *
     * @param updCustomerResource updCustomerResource (required)
     * @return OK (status code 200)
     *         or Created (status code 201)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     */
    @Operation(
        operationId = "updateUsingPUT",
        summary = "update",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ResourceCustomerResource.class))),
            @ApiResponse(responseCode = "201", description = "Created"),
            @ApiResponse(responseCode = "401", description = "Unauthorized"),
            @ApiResponse(responseCode = "403", description = "Forbidden"),
            @ApiResponse(responseCode = "404", description = "Not Found")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/customers",
        produces = { "application/hal+json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ResourceCustomerResource> updateUsingPUT(
        @Parameter(name = "updCustomerResource", description = "updCustomerResource", required = true, schema = @Schema(description = "")) @Valid @RequestBody Customer updCustomerResource
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "application/hal+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

}
