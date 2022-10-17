package com.ayi.integrador.rest.serv.app.mapper;

import com.ayi.integrador.rest.serv.app.dto.request.RecipesRequestDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FindAllRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FormRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.RecipesByIdResponseDTO;
import com.ayi.integrador.rest.serv.app.entity.Recipes;

public interface IRecipesMapper {

    FormRecipesResponseDTO entityToDTO(Recipes entity);

    Recipes dtoToEntity(RecipesRequestDTO requestDTO);

    FindAllRecipesResponseDTO FindAllEntityToDTO(Recipes entity);

    RecipesByIdResponseDTO recipesByIdEntityToDTO(Recipes entity);
}
