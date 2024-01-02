package com.edsoncosta.RiskApi.services;

import com.edsoncosta.RiskApi.domain.dtos.RiskTypeDTO;
import com.edsoncosta.RiskApi.domain.models.RiskType;
import com.edsoncosta.RiskApi.domain.repositories.RiskTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class RiskTypeService {

    @Autowired
    private RiskTypeRepository riskTypeRepository;

    public RiskType createRiskType(RiskTypeDTO data) throws Exception {
        RiskType newRiskType=new RiskType(data);
        this.saveRiskType(newRiskType);

        boolean existsRiskType=this.existsRiskType(data.name());

        if(existsRiskType==true)
        {
            throw new Exception("This data just exists!");
        }

        return newRiskType;
    }

    public void saveRiskType(RiskType riskType)
    {
        this.riskTypeRepository.save(riskType);
    }


    public List<RiskType> getAllRiskTypes()
    {
        return this.riskTypeRepository.findAll();
    }

    public RiskType getRiskTypeById(UUID id) throws Exception {
        return this.riskTypeRepository
                .findById(id)
                .orElseThrow(()->new Exception("RiskType with ID " + id + " not found"));
    }

    public RiskType getRiskTypeByName(String name) throws Exception {
        RiskType riskType=this.riskTypeRepository.getRiskTypeByName(name);

        if(riskType==null)
        {
            throw new Exception("RiskType with name " + name + " not found");
        }

        return riskType;
    }

    public RiskType editRiskType(UUID id,RiskTypeDTO data) throws Exception {
        RiskType riskType=this.riskTypeRepository
                .findById(id)
                .orElseThrow(()->new Exception("RiskType with ID " + id + " not found"));

        riskType.setName(data.name());
        riskType.setDescription(data.description());
        riskType.setUpdateddAt(LocalDateTime.now());

        return this.riskTypeRepository.save(riskType);
    }

    public boolean existsRiskType(String name)
    {
        return riskTypeRepository.existsRiskTypeByName(name);
    }

}
