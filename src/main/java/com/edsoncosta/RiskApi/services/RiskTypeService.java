package com.edsoncosta.RiskApi.services;

import com.edsoncosta.RiskApi.domain.dtos.RiskTypeDTO;
import com.edsoncosta.RiskApi.domain.models.RiskType;
import com.edsoncosta.RiskApi.domain.repositories.RiskTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RiskTypeService {

    @Autowired
    private RiskTypeRepository riskTypeRepository;

    public RiskType createRiskType(RiskTypeDTO data)
    {
        RiskType newRiskType=new RiskType(data);
        this.saveRiskType(newRiskType);

        return newRiskType;
    }

    public void saveRiskType(RiskType riskType)
    {
        this.riskTypeRepository.save(riskType);
    }

}
