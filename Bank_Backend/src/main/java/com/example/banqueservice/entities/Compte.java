package com.example.banqueservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity@Data@NoArgsConstructor@AllArgsConstructor
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double solde;
    @Temporal(TemporalType.DATE) 
    private LocalDate dateCreation = LocalDate.now(); // Utilisation de LocalDate au lieu de Date
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
}
