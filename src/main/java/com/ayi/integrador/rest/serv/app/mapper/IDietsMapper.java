package com.ayi.integrador.rest.serv.app.mapper;

import com.ayi.integrador.rest.serv.app.dto.request.DietsRequestDTO;
import com.ayi.integrador.rest.serv.app.dto.response.DietsResponseDTO;
import com.ayi.integrador.rest.serv.app.entity.Diets;

public interface IDietsMapper {

    DietsResponseDTO entityToDto(Diets entity);

    Diets dtoToEntity(DietsRequestDTO requestDTO);
}
