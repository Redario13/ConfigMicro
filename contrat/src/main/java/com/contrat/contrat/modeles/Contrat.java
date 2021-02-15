package com.contrat.contrat.modeles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date date_creation;
    private String produit;
    private int numcontrat;
    private String nomclient;
    private String email;
    private long tel;
}
