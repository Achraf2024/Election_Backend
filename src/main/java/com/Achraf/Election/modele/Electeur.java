package com.Achraf.Election.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "electeur")

public class Electeur extends Utilisateur{
    @Column ( name = "adresse")
    private String adresse ;
    @Column ( name = "datenaissance")
    private Date dateNaissance ;
    @Column ( name = "genre")
    private Genre genre ;
    @Column ( name = "avote")
    private boolean aVote ;
    @ManyToOne
    @JoinColumn(name = "idcirconscription")
    private Circonscription circonscription ;

}
