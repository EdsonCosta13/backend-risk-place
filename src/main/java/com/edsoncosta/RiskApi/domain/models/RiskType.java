package com.edsoncosta.RiskApi.domain.models;


import com.edsoncosta.RiskApi.domain.models.generics.GenericValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "riskTypes")
@Table(name = "riskTypes")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RiskType extends GenericValue {
}
