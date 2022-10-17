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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RecipesServiceImpl implements IRecipesService {

    @Autowired
    private IRecipesMapper recipesMapper;

    @Autowired
    private IRecipesRepository recipesRepository;
   @Override
    public RecipesByIdResponseDTO findRecipeById(Long idRecipes) {
        RecipesByIdResponseDTO recipesByIdResponseDTO;

        Optional<Recipes> recipes = recipesRepository.findById(idRecipes);

        recipesByIdResponseDTO = recipesMapper.recipesByIdEntityToDTO(recipes.get());

        return recipesByIdResponseDTO;

    }

    @Override
    public List<FindAllRecipesResponseDTO> findAll() {

        List<FindAllRecipesResponseDTO> findAllRecipesResponseDTOS;

        List<Recipes> recipes = recipesRepository.findAll();

        findAllRecipesResponseDTOS = recipes.stream()
                .map(recipe -> recipesMapper.FindAllEntityToDTO(recipe))
                .collect(Collectors.toList());
                return findAllRecipesResponseDTOS;
    }

    @Override
    public FormRecipesResponseDTO addRecipe(RecipesRequestDTO requestDTO) {
        Recipes recipes = recipesMapper.dtoToEntity(requestDTO);

        recipesRepository.save(recipes);

        return recipesMapper.entityToDTO(recipes);
    }

    @Override
    public List<FindAllRecipesResponseDTO> searchByTitle(String title) {

       List<Recipes> listRecipes = recipesRepository.findByTitle(title);

       List<FindAllRecipesResponseDTO> listResponse = new ArrayList<>();

       listRecipes.forEach(recipes -> {
             FindAllRecipesResponseDTO findAllRecipesResponseDTO = recipesMapper.FindAllEntityToDTO(recipes);
             listResponse.add(findAllRecipesResponseDTO);
       });

       return listResponse;
    }
}
