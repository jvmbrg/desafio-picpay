package com.jvmbrg.teste_tecnico1.repository;

import com.jvmbrg.teste_tecnico1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }
