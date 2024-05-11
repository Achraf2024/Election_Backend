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
@Table(name = "infovote")

public class infoVote extends AbstractEntity {
    @Column( name = "date_heure_vote")
    private Date Date_Heure_Vote ;
    @Column( name = "statut_vote")
    private statutVote statutVote ;
    @ManyToOne
    @JoinColumn(name = "id_electeur")
    private Electeur electeur;
    @ManyToOne
    @JoinColumn(name = "id_candidat")
    private Candidat candidat;
}
