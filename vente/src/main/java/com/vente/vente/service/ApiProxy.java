package com.vente.vente.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(url = "${product-service-url}", name = "product-service")
public interface ApiProxy {
    @GetMapping("/product/messages")
    String hallo();
}
