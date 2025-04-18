package com.jvmbrg.teste_tecnico1.repository;

import com.jvmbrg.teste_tecnico1.model.Shopkeeper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopkeeperRepository extends JpaRepository<Shopkeeper, Long> {
}
