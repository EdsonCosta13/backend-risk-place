package com.edsoncosta.RiskApi.domain.models;


import com.edsoncosta.RiskApi.domain.models.generics.GenericValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity(name = "places")
@Table(name = "places")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Place extends GenericValue {

    private String latitude;
    private String longitude;

}
