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
@Table(name = "infoelection")

public class infoElection extends AbstractEntity{
    @Column( name = "dateDebutVote")
    private Date dateDebutVote ;
    @Column ( name = "dateFinVote")
    private Date dateFinVote ;
    @Column ( name = "nb_candidats")
    private int NB_Candidats ;
    @Column ( name = "nb_electeurs_inscrits")
    private int NB_Electeurs_Inscrits ;
    @Column ( name = "nb_votes_exprimes")
    private int NB_Votes_Exprimes ;
    @Column ( name = "statut_election")
    private statutElection statut_Election ;

}
