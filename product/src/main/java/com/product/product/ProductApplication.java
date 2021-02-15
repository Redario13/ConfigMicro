package com.product.product;

import com.product.product.modeles.Product;
import com.product.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
public class ProductApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;


    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(1, "typeA", 15.5, "libA"));
        productRepository.save(new Product(2, "typeB", 10.75, "libB"));

    }
}
