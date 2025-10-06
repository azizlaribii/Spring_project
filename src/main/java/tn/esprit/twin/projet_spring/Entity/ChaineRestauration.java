package tn.esprit.twin.projet_spring.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration", cascade = CascadeType.ALL)
    private Set<Restaurant> restaurants;

    public ChaineRestauration() {
    }

    public ChaineRestauration(Long idChaineRestauration, String libelle, LocalDate dateCreation) {
        this.idChaineRestauration = idChaineRestauration;
        this.libelle = libelle;
        this.dateCreation = dateCreation;
    }

    // Getters and Setters
    public Long getIdChaineRestauration() {
        return idChaineRestauration;
    }

    public void setIdChaineRestauration(Long idChaineRestauration) {
        this.idChaineRestauration = idChaineRestauration;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}