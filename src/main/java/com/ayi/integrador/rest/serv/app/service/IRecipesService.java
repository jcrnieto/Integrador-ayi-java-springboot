package com.ayi.integrador.rest.serv.app.service;

import com.ayi.integrador.rest.serv.app.dto.request.RecipesRequestDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FindAllRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FormRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.RecipesByIdResponseDTO;

import java.util.List;

public interface IRecipesService {

    RecipesByIdResponseDTO findRecipeById(Long idRecipes);

    List<FindAllRecipesResponseDTO> findAll();

    FormRecipesResponseDTO addRecipe(RecipesRequestDTO requestDTO);

    List<FindAllRecipesResponseDTO> searchByTitle(String title);
}
