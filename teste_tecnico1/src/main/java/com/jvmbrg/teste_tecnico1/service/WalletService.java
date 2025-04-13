package com.jvmbrg.teste_tecnico1.service;

import com.jvmbrg.teste_tecnico1.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    WalletRepository walletRepository;
    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }
}
