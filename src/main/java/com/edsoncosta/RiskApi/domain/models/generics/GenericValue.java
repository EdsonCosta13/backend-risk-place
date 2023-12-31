package com.edsoncosta.RiskApi.domain.models.generics;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor
@AllArgsConstructor
public class GenericValue extends GenericId {

    private String name;
    private String description;

    public GenericValue(UUID id)
    {
        super(id);
    }
}
