package com.edsoncosta.RiskApi.domain.repositories;

import com.edsoncosta.RiskApi.domain.models.Place;
import com.edsoncosta.RiskApi.domain.models.PlaceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlaceTypeRepository extends JpaRepository<PlaceType, UUID> {
}
