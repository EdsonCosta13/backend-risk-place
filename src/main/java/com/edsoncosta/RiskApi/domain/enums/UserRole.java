package com.edsoncosta.RiskApi.domain.enums;

public enum UserRole {
    COMMOM("Utilizador Normal"),
    OPERATOR("Operador"),
    ADMIN("Admin");

    private final String description;

    UserRole(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
