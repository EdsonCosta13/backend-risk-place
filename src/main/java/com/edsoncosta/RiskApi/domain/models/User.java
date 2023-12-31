package com.edsoncosta.RiskApi.domain.models;

import com.edsoncosta.RiskApi.domain.models.generics.GenericId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "users")
@Table(name = "users")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends GenericId {

    private String fullname;
    private String username;
    private String email;
    private String password;

}
