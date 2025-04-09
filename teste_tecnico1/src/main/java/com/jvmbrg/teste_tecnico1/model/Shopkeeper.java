package com.jvmbrg.teste_tecnico1.model;

import com.jvmbrg.teste_tecnico1.base.BaseEntity;
import jakarta.persistence.Column;

import java.util.Objects;

public class Shopkeeper extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String cnpj;

    public Shopkeeper(Long id, String name, String email, String password, String cnpj) {
        super(id, name, email, password);
        this.cnpj = cnpj;
    }
    public Shopkeeper(){}

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shopkeeper that)) return false;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cnpj);
    }
}
