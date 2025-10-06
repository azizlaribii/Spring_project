package tn.esprit.twin.projet_spring.Entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    @JoinColumn(name = "chaine_restauration_id")
    private ChaineRestauration chaineRestauration;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private Set<Menu> menus;

    @OneToOne(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private ChefCuisinier chefCuisinier;

    public Restaurant(Long idRestaurant, String nom, Long nbPlacesMax) {
        this.idRestaurant = idRestaurant;
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
    }

    public Restaurant() {}

    // Getters and Setters
    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(Long nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }

    public ChaineRestauration getChaineRestauration() {
        return chaineRestauration;
    }

    public void setChaineRestauration(ChaineRestauration chaineRestauration) {
        this.chaineRestauration = chaineRestauration;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    public ChefCuisinier getChefCuisinier() {
        return chefCuisinier;
    }

    public void setChefCuisinier(ChefCuisinier chefCuisinier) {
        this.chefCuisinier = chefCuisinier;
    }
}