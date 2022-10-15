package com.ayi.integrador.rest.serv.app.mapper.impl;

import com.ayi.integrador.rest.serv.app.dto.response.FindAllRecipesResponseDTO;
import com.ayi.integrador.rest.serv.app.entity.Recipes;
import com.ayi.integrador.rest.serv.app.mapper.IFindAllRecipesMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FindAllRecipesMapperImpl implements IFindAllRecipesMapper {

    private final ModelMapper modelMapper;

    @Override
    public FindAllRecipesResponseDTO entityToDTO(Recipes entity) {
        return modelMapper.map(entity, FindAllRecipesResponseDTO.class);
    }
}
