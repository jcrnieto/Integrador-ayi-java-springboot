package com.ayi.integrador.rest.serv.app.controller;

import com.ayi.integrador.rest.serv.app.dto.response.DietsResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FindAllRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.service.IDietsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@Api(value = "Invoice Api", tags = {"Invoice Service"})
@RestController
@RequestMapping(value = "/Diets", produces = {MediaType.APPLICATION_JSON_VALUE})
@Slf4j
public class DietsControllers {

    private IDietsService iDietsService;

    @GetMapping(value = "/getAllDiets")
    @ApiOperation(
            value = "Retrieves List of all Invoice",
            httpMethod = "GET",
            response = DietsResponseDTO[].class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200,
                    message = "Body content with basic information about persons",
                    response = DietsResponseDTO[].class),
            @ApiResponse(
                    code = 400,
                    message = "Describes errors on invalid payload received, e.g: missing fields, invalid data formats, etc.")
    })
    public ResponseEntity<DietsResponseDTO> getAllDiets() {

       DietsResponseDTO dietsResponseDTOS =  iDietsService.findAllDiets();
        return  ResponseEntity.ok(dietsResponseDTOS);
    }
}
