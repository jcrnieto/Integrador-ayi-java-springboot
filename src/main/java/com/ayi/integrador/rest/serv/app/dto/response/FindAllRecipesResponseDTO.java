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
        value = "ClientResponseDTO",
        description = "Me traigo todas las recetas que van a estar cuando renderice la página"
)
public class FindAllRecipesResponseDTO {

    @ApiModelProperty(position = 1, notes = "Non negative value. ID is required.")
    private Long idRecipes;

    @ApiModelProperty(position = 2, notes = "Non negative value. typeOfDiet is required.")
    private String title;

    @ApiModelProperty(position = 3, notes = "Non negative value. ID is required.")
    private String image;

    @ApiModelProperty(position = 4, notes = "Non negative value. typeOfDiet is required.")
    private String score;

    @ApiModelProperty(position = 6, notes = "Non negative value. typeOfDiet is required.")
    private Integer calories;

    @ApiModelProperty(position = 7, notes = "Non negative value. ID is required.")
    private List<Diets> diets;
}
