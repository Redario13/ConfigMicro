package com.product.product.controller;


import com.product.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;


    @GetMapping(value = ("/messages"))
    public String message() {
        System.out.println("Hallo World ");
        //Product prod = productRepository.getOne(new Long(1));
        return "halllooo world";
    }


}
