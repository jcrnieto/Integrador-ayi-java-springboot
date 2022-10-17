package com.ayi.integrador.rest.serv.app.service.impl;

import com.ayi.integrador.rest.serv.app.dto.response.DietsResponseDTO;
import com.ayi.integrador.rest.serv.app.entity.Diets;
import com.ayi.integrador.rest.serv.app.mapper.IDietsMapper;
import com.ayi.integrador.rest.serv.app.repository.IDietsRepository;
import com.ayi.integrador.rest.serv.app.service.IDietsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DietsServiceImpl implements IDietsService {

    @Autowired
    private IDietsRepository iDietsRepository;

    @Autowired
    private IDietsMapper iDietsMapper;
    @Override
    public List<DietsResponseDTO> findAllDiets() {
        List<DietsResponseDTO> dietsResponseDTO;

        List<Diets> diets = iDietsRepository.findAll();

        dietsResponseDTO = diets.stream()
                          .map(diet -> iDietsMapper.entityToDto(diet))
                          .collect(Collectors.toList());

        return dietsResponseDTO;
    }
}
