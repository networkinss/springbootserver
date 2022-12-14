/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.inss.springapichallenge.controller;

import ch.inss.springapichallenge.model.Customer;
import ch.inss.springapichallenge.model.CustomerResource;
import ch.inss.springapichallenge.model.ResourceCustomerResource;
import ch.inss.springapichallenge.model.Resourceobject;
import ch.inss.springapichallenge.model.ResourcesCustomerResource;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.virtualan.annotation.ApiVirtual;
import io.virtualan.annotation.VirtualService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-08T08:03:56.614987+01:00[Europe/Zurich]")
@Validated
@Tag(name = "customers", description = "the customers API")
@VirtualService
@RequestMapping("${openapi.apichallenger.base-path:/api/v3}")
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
    @ApiVirtual
    @Operation(
        operationId = "deleteUsingDELETE",
        summary = "delete",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/hal+json", schema = @Schema(implementation = Resourceobject.class))
            }),
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
        @Parameter(name = "id", description = "id", required = true) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/hal+json";
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
    @ApiVirtual
    @Operation(
        operationId = "getAllUsingGET1",
        summary = "getAll",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/hal+json", schema = @Schema(implementation = ResourcesCustomerResource.class))
            }),
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
                    String exampleString = "Custom MIME type example not yet supported: application/hal+json";
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
    @ApiVirtual
    @Operation(
        operationId = "getUsingGET",
        summary = "get",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/hal+json", schema = @Schema(implementation = ResourceCustomerResource.class))
            }),
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
        @Parameter(name = "id", description = "id", required = true) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/hal+json";
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
    @ApiVirtual
    @Operation(
        operationId = "getWithoutGeneralLinksUsingGET",
        summary = "getWithoutGeneralLinks",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/hal+json", schema = @Schema(implementation = CustomerResource.class))
            }),
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
        @Parameter(name = "id", description = "id", required = true) @PathVariable("id") Long id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/hal+json";
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
    @ApiVirtual
    @Operation(
        operationId = "insertUsingPOST",
        summary = "insert",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/hal+json", schema = @Schema(implementation = ResourceCustomerResource.class))
            }),
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
        @Parameter(name = "newCustomerResource", description = "newCustomerResource", required = true) @Valid @RequestBody Customer newCustomerResource
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/hal+json";
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
    @ApiVirtual
    @Operation(
        operationId = "updateUsingPUT",
        summary = "update",
        tags = { "customer-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/hal+json", schema = @Schema(implementation = ResourceCustomerResource.class))
            }),
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
        @Parameter(name = "updCustomerResource", description = "updCustomerResource", required = true) @Valid @RequestBody Customer updCustomerResource
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/hal+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/hal+json";
                    ApiUtil.setExampleResponse(request, "application/hal+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }

}
