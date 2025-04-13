package com.jvmbrg.teste_tecnico1.service;

import com.jvmbrg.teste_tecnico1.repository.ShopkeeperRepository;
import org.springframework.stereotype.Service;

@Service
public class ShopkeeperService {

    ShopkeeperRepository shopkeeperRepository;
    public ShopkeeperService(ShopkeeperRepository shopkeeperRepository) {
        this.shopkeeperRepository = shopkeeperRepository;
    }

}
