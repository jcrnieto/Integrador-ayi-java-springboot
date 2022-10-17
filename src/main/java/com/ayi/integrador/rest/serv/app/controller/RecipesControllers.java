package com.ayi.integrador.rest.serv.app.controller;

import com.ayi.integrador.rest.serv.app.dto.request.RecipesRequestDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FindAllRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FormRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.RecipesByIdResponseDTO;
import com.ayi.integrador.rest.serv.app.service.IRecipesService;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Api(value = "Invoice Api", tags = {"Invoice Service"})
@RestController
@RequestMapping(value = "/Recipes", produces = {MediaType.APPLICATION_JSON_VALUE})
@Slf4j
public class RecipesControllers {

    private IRecipesService recipesService;



    @GetMapping(
            value = "/getRecipesById/{id}", produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ApiOperation(
            value = "Retrieves data associated to Master List by Id",
            httpMethod = "GET",
            response = RecipesByIdResponseDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "Body content with basic information for Master List  by Id"
            ),
            @ApiResponse(
                    code = 400,
                    message = "Describes errors on invalid payload received, e.g: missing fields, invalid data formats, etc.")
    })
    public ResponseEntity<RecipesByIdResponseDTO> getRecipesById(
            @ApiParam(name = "id", required = true, value = "Direction Id", example = "1")
            @PathVariable("id") Long id){

        return ResponseEntity.ok(recipesService.findRecipeById(id));
    }


    @GetMapping(value = "/getAllRecipes")
    @ApiOperation(
            value = "Retrieves List of all Invoice",
            httpMethod = "GET",
            response = FindAllRecipesResponseDTO[].class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200,
                    message = "Body content with basic information about persons",
                    response = FindAllRecipesResponseDTO[].class),
            @ApiResponse(
                    code = 400,
                    message = "Describes errors on invalid payload received, e.g: missing fields, invalid data formats, etc.")
    })
    public ResponseEntity<List<FindAllRecipesResponseDTO>> getAllRecipes() {

        List<FindAllRecipesResponseDTO> findAllRecipesResponseDTOS = (List<FindAllRecipesResponseDTO>) recipesService.findAll();
        return ResponseEntity.ok(findAllRecipesResponseDTOS);
    }


    @PostMapping(value = "/addRecipes", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(
            value ="Save a person and return it.",
            httpMethod = "POST",
            response = FormRecipesResponseDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 201,
                    message = "CREATED - Person was successfully created",
                    response = FormRecipesResponseDTO.class),
            @ApiResponse(code = 400,
                    message = "INVALID_ARGUMENT - Certain arguments "
                            + "cannot be empty or null.")
    })

    public ResponseEntity<FormRecipesResponseDTO> addRecieps(
            @ApiParam(name = "Client", required = true, value = "add client", example = "1")
            @RequestBody RecipesRequestDTO requestDTO) {
        return new ResponseEntity<>(recipesService.addRecipe(requestDTO), HttpStatus.CREATED);
    }

    @GetMapping(
            value = "/searchRecipesByTitle/{title}", produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @ApiOperation(
            value = "Retrieves data associated to Master List by Id",
            httpMethod = "GET",
            response = FindAllRecipesResponseDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "Body content with basic information for Master List  by Id"
            ),
            @ApiResponse(
                    code = 400,
                    message = "Describes errors on invalid payload received, e.g: missing fields, invalid data formats, etc.")
    })
    public ResponseEntity<List<FindAllRecipesResponseDTO>> searchRecipesByTitle(
            @ApiParam(name = "title", required = true, value = "Direction Id", example = "1")
            @PathVariable("title") String title){

        return ResponseEntity.ok(recipesService.searchByTitle(title));
    }
}


