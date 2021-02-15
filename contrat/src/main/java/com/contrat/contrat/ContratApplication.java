package com.contrat.contrat;

import com.contrat.contrat.modeles.Contrat;
import com.contrat.contrat.repositories.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.sql.Date;


@EnableDiscoveryClient
@SpringBootApplication
public class ContratApplication implements CommandLineRunner {

    @Autowired
    ContratRepository contratRepository;

    public static void main(String[] args) {
        SpringApplication.run(ContratApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        contratRepository.save(new Contrat(1, new Date(13 - 05 - 2021), "pdt A", 13, "Nom A", "emailA", 0666666666));
        contratRepository.save(new Contrat(2, new Date(30 - 01 - 2021), "pdt B", 12, "Nom B", "emailB", 0677777777));
    }
}
