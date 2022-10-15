package com.ayi.integrador.rest.serv.app.service.impl;

import com.ayi.integrador.rest.serv.app.dto.request.RecipesRequestDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FindAllRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FormRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.RecipesByIdResponseDTO;
import com.ayi.integrador.rest.serv.app.entity.Recipes;
import com.ayi.integrador.rest.serv.app.mapper.IRecipesMapper;
import com.ayi.integrador.rest.serv.app.repository.IRecipesRepository;
import com.ayi.integrador.rest.serv.app.service.IRecipesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipesServiceImpl implements IRecipesService {

    @Autowired
    private IRecipesMapper recipesMapper;

    @Autowired
    private IRecipesRepository recipesRepository;
    @Override
    public RecipesByIdResponseDTO findRecipeById(Long idRecipes) {
        return null;
    }

    @Override
    public FindAllRecipesResponseDTO findAll() {
        return null;
    }

    @Override
    public FormRecipesResponseDTO addRecipe(RecipesRequestDTO requestDTO) {
        Recipes recipes = recipesMapper.dtoToEntity(requestDTO);

        recipesRepository.save(recipes);

        return recipesMapper.entityToDTO(recipes);
    }
}
