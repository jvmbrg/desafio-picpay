package com.jvmbrg.teste_tecnico1.model;

import com.jvmbrg.teste_tecnico1.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.UniqueConstraint;

import java.util.Objects;

public class User extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String cpf;

    public User(Long id, String name, String email, String password, String cpf) {
        super(id, name, email, password);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return Objects.equals(cpf, user.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
