package ma.projet.springdatarest.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private TypeCompte type;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Compte(double solde, TypeCompte type, Date dateCreation, Client client) {
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
        this.client = client;
    }

    public Compte() {
    }
}