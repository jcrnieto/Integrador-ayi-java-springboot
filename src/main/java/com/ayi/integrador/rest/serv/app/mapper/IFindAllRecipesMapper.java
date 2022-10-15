package com.ayi.integrador.rest.serv.app.mapper;

import com.ayi.integrador.rest.serv.app.dto.response.FindAllRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.entity.Recipes;

public interface IFindAllRecipesMapper {

    FindAllRecipesResponseDTO entityToDTO(Recipes entity);
}
