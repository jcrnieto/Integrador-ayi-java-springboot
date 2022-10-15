package com.ayi.integrador.rest.serv.app.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ApiModel(
        value = "CaloriesResponseDTO",
        description = "Formulario de creacion de recetas"
)
public class FormRecipesResponseDTO {

    @ApiModelProperty(position = 1, notes = "Non negative value. ID is required.")
    private String title;

    @ApiModelProperty(position = 2, notes = "Non negative value. ID is required.")
    private String description;
}
