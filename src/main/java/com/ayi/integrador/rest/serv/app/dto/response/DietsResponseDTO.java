package com.ayi.integrador.rest.serv.app.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ApiModel(
        value = "DietsResponseDTO",
        description = "Me traigo todas las dietas para poder filtrarlas"
)
public class DietsResponseDTO {

    @ApiModelProperty(position = 1, notes = "Non negative value. ID is required.")
    private Long idDiets;

    @ApiModelProperty(position = 2, notes = "Non negative value. typeOfDiet is required.")
    private String typeOfDiet;
}
