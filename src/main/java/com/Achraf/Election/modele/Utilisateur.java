package com.Achraf.Election.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Utilisateur extends AbstractEntity {
    @Column (name ="identifiant")
    private String identifiant ;
    @Column (name ="motdepasse")
    private String motDePasse ;
    @Column (name ="nom")
    private String nom ;
    @Column (name ="prenom")
    private String prenom;
    @Column (name ="tel")
    private String tel ;
    @Column (name ="cin")
    private String Cin ;
    @Column (name ="email")
    private String email ;

}
