/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ch.inss.springapichallenge.controller;

import ch.inss.springapichallenge.model.User;
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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-26T19:49:48.701044+01:00[Europe/Zurich]")
@Validated
@Tag(name = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param user Created user object (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Create user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  User.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<User> createUser(
        @Parameter(name = "User", description = "Created user object", schema = @Schema(description = "")) @Valid @RequestBody(required = false) User user
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"James\", \"password\" : \"password\", \"userStatus\" : 1, \"phone\" : \"012345\", \"id\" : 10, \"email\" : \"john@email.com\", \"username\" : \"theUser\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * POST /user/createwithlist : Creates list of users with given input array
     * Creates list of users with given input array
     *
     * @param user  (optional)
     * @return Successful operation (status code 200)
     *         or successful operation (status code 200)
     */
    @Operation(
        operationId = "createUsersWithListInput",
        summary = "Creates list of users with given input array",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  User.class))),
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createwithlist",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<User> createUsersWithListInput(
        @Parameter(name = "User", description = "", schema = @Schema(description = "")) @Valid @RequestBody(required = false) List<User> user
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"James\", \"password\" : \"password\", \"userStatus\" : 1, \"phone\" : \"012345\", \"id\" : 10, \"email\" : \"john@email.com\", \"username\" : \"theUser\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "Delete user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{username}"
    )
    default ResponseEntity<Void> deleteUser(
        @Parameter(name = "username", description = "The name that needs to be deleted", required = true, schema = @Schema(description = "")) @PathVariable("username") String username
    ) {
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * GET /user/{username} : Get user by user name
     * Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing.  (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserByName",
        summary = "Get user by user name",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  User.class))),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}",
        produces = { "application/json" }
    )
    default ResponseEntity<User> getUserByName(
        @Parameter(name = "username", description = "The name that needs to be fetched. Use user1 for testing. ", required = true, schema = @Schema(description = "")) @PathVariable("username") String username
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"James\", \"password\" : \"password\", \"userStatus\" : 1, \"phone\" : \"012345\", \"id\" : 10, \"email\" : \"john@email.com\", \"username\" : \"theUser\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.valueOf(200));

    }


    /**
     * GET /user/login : Logs user into the system
     * Logs user into the system
     *
     * @param username The user name for login (optional)
     * @param password The password for login in clear text (optional)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @Operation(
        operationId = "loginUser",
        summary = "Logs user into the system",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  String.class))),
            @ApiResponse(responseCode = "400", description = "Invalid username/password supplied")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/login",
        produces = { "application/json" }
    )
    default ResponseEntity<String> loginUser(
        @Parameter(name = "username", description = "The user name for login", schema = @Schema(description = "")) @Valid @RequestParam(value = "username", required = false) String username,
        @Parameter(name = "password", description = "The password for login in clear text", schema = @Schema(description = "")) @Valid @RequestParam(value = "password", required = false) String password
    ) {
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * GET /user/logout : Logs out current logged in user session
     * Logs out current logged in user session
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "logoutUser",
        summary = "Logs out current logged in user session",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/logout"
    )
    default ResponseEntity<Void> logoutUser(
        
    ) {
        return new ResponseEntity<>(HttpStatus.OK);

    }


    /**
     * PUT /user/{username} : Update user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param user Update an existent user in the store (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Update user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{username}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateUser(
        @Parameter(name = "username", description = "name that need to be deleted", required = true, schema = @Schema(description = "")) @PathVariable("username") String username,
        @Parameter(name = "User", description = "Update an existent user in the store", schema = @Schema(description = "")) @Valid @RequestBody(required = false) User user
    ) {
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
