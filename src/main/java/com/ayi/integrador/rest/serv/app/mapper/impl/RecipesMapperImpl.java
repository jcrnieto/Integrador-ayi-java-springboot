package com.ayi.integrador.rest.serv.app.mapper.impl;

import com.ayi.integrador.rest.serv.app.dto.request.RecipesRequestDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FindAllRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.FormRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.dto.response.RecipesByIdResponseDTO;
import com.ayi.integrador.rest.serv.app.entity.Recipes;
import com.ayi.integrador.rest.serv.app.mapper.IRecipesMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RecipesMapperImpl implements IRecipesMapper {

    private final ModelMapper modelMapper;

    @Override
    public FormRecipesResponseDTO entityToDTO(Recipes entity) {
        return modelMapper.map(entity, FormRecipesResponseDTO.class);
    }

    @Override
    public Recipes dtoToEntity(RecipesRequestDTO requestDTO) {
        return modelMapper.map(requestDTO, Recipes.class);
    }

    @Override
    public FindAllRecipesResponseDTO FindAllEntityToDTO(Recipes entity) {
        return modelMapper.map(entity, FindAllRecipesResponseDTO.class);
    }
    @Override
    public RecipesByIdResponseDTO recipesByIdEntityToDTO(Recipes entity) {
        return modelMapper.map(entity, RecipesByIdResponseDTO.class);
    }


}
