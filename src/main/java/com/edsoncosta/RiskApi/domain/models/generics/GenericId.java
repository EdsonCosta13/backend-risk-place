package com.edsoncosta.RiskApi.domain.models.generics;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor
@AllArgsConstructor
public class GenericId {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id = null;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updateddAt;

    public GenericId(UUID id) {
        this.id = id;
    }
}
