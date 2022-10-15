package com.ayi.integrador.rest.serv.app.mapper.impl;

import com.ayi.integrador.rest.serv.app.dto.request.DietsRequestDTO;
import com.ayi.integrador.rest.serv.app.dto.response.DietsResponseDTO;
import com.ayi.integrador.rest.serv.app.entity.Diets;
import com.ayi.integrador.rest.serv.app.mapper.IDietsMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DietsMapperImpl implements IDietsMapper {

    private final ModelMapper modelMapper;

    @Override
    public DietsResponseDTO entityToDto(Diets entity) {
        return modelMapper.map(entity, DietsResponseDTO.class);
    }

    @Override
    public Diets dtoToEntity(DietsRequestDTO requestDTO) {
        return modelMapper.map(requestDTO, Diets.class);
    }
}
