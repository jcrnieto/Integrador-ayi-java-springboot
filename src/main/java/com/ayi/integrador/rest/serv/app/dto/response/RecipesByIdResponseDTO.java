package com.ayi.integrador.rest.serv.app.dto.response;

import com.ayi.integrador.rest.serv.app.entity.Diets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ApiModel(
        value = "RecipeByIdResponseDTO",
        description = "Me traigo los detalles de recetas por id"
)
public class RecipesByIdResponseDTO {

    @ApiModelProperty(position = 1, notes = "Non negative value. ID is required.")
    private Long idRecipes;

    @ApiModelProperty(position = 2, notes = "Non negative value. typeOfDiet is required.")
    private String title;

    @ApiModelProperty(position = 3, notes = "Non negative value. ID is required.")
    private String image;

    @ApiModelProperty(position = 4, notes = "Non negative value. typeOfDiet is required.")
    private String score;

    @ApiModelProperty(position = 5, notes = "Non negative value. ID is required.")
    private String description;

    @ApiModelProperty(position = 6, notes = "Non negative value. typeOfDiet is required.")
    private Integer calories;

    @ApiModelProperty(position = 7, notes = "Non negative value. ID is required.")
    private List<Diets> diets;


}
