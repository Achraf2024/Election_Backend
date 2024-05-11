package com.Achraf.Election.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidat")

public class Candidat extends Electeur {

    @Column(name = "plateforme")
    private String plateforme ;
    @Column(name = "parti")
    private String parti ;
    @Column(name = "photo")
    private String nom ;
    @Column(name = "nb_voix")
    private int nb_voix;
    
}
