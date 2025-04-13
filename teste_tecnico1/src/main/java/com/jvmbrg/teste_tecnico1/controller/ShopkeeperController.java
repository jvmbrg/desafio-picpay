package com.jvmbrg.teste_tecnico1.controller;

import com.jvmbrg.teste_tecnico1.service.ShopkeeperService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/shopkeeper")
public class ShopkeeperController {

    ShopkeeperService shopkeeperService;
    public ShopkeeperController(ShopkeeperService shopkeeperService) {
        this.shopkeeperService = shopkeeperService;
    }

}
