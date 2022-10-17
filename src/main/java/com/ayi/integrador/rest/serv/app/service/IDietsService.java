package com.ayi.integrador.rest.serv.app.service;

import com.ayi.integrador.rest.serv.app.dto.response.DietsResponseDTO;

import java.util.List;

public interface IDietsService {

    List<DietsResponseDTO> findAllDiets();
}
