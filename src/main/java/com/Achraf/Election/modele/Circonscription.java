package com.Achraf.Election.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "circonscription")

public class Circonscription extends AbstractEntity{
    @Column(name = "nom")
    private String nom ;
    @Column ( name = "gouvernorat")
    private String gouvernorat ;
    @Column ( name = "pays")
    private String pays ;
    @Column ( name = "nb_electeurs")
    private int NB_Electeurs ;
    @OneToMany (mappedBy = "circonscription")
    private List<Electeur> electeurs ;
}
