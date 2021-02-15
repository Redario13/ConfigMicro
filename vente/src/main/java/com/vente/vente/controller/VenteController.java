package com.vente.vente.controller;

import com.vente.vente.service.ApiProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableFeignClients(basePackageClasses = ApiProxy.class)
public class VenteController implements ApiProxy {

    @Autowired
    private ApiProxy apiProxy;

    @Override
    @GetMapping("/hallovente")
    public String hallo() {
        System.out.println("proxy " + apiProxy.hallo());
        return apiProxy.hallo();
    }


}
