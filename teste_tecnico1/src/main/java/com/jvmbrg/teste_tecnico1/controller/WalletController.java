package com.jvmbrg.teste_tecnico1.controller;

import com.jvmbrg.teste_tecnico1.service.WalletService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    WalletService walletService;
    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }
}
