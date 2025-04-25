package com.allyRx.AvisMotion.Entity;

import com.allyRx.AvisMotion.Enums.TypeSentiment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "SENTIMENT")
public class Sentiment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String Avis;
    private TypeSentiment type;

    @ManyToOne(cascade = {PERSIST , MERGE})  //pour relier l'id de client et le merger dans la table sentiment
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

}
