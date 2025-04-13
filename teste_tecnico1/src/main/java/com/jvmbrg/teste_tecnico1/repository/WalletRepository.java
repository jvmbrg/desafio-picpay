package com.jvmbrg.teste_tecnico1.repository;

import com.jvmbrg.teste_tecnico1.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

}
