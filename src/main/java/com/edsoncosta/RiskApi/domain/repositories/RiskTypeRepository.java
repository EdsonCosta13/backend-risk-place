package com.edsoncosta.RiskApi.domain.repositories;

import com.edsoncosta.RiskApi.domain.models.Place;
import com.edsoncosta.RiskApi.domain.models.RiskType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RiskTypeRepository extends JpaRepository<RiskType, UUID> {
    boolean existsRiskTypeByName(String name);
    RiskType getRiskTypeByName(String name);
}
