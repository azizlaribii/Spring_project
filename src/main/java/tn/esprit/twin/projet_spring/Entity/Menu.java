package tn.esprit.twin.projet_spring.Entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private Float prix;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private Set<Composant> composants;

    @ManyToMany(mappedBy = "menus")
    private Set<Commande> commandes;

    // Relation ManyToMany avec ChefCuisinier
    @ManyToMany(mappedBy = "menus")
    private Set<ChefCuisinier> chefCuisiniers;

    public Menu(Long idMenu, String libelleMenu, TypeMenu typeMenu, Float prix) {
        this.idMenu = idMenu;
        this.libelleMenu = libelleMenu;
        this.typeMenu = typeMenu;
        this.prix = prix;
    }

    public Menu() {
    }

    // Getters and Setters
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public void setLibelleMenu(String libelleMenu) {
        this.libelleMenu = libelleMenu;
    }

    public TypeMenu getTypeMenu() {
        return typeMenu;
    }

    public void setTypeMenu(TypeMenu typeMenu) {
        this.typeMenu = typeMenu;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Set<Composant> getComposants() {
        return composants;
    }

    public void setComposants(Set<Composant> composants) {
        this.composants = composants;
    }

    public Set<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Set<Commande> commandes) {
        this.commandes = commandes;
    }

    public Set<ChefCuisinier> getChefCuisiniers() {
        return chefCuisiniers;
    }

    public void setChefCuisiniers(Set<ChefCuisinier> chefCuisiniers) {
        this.chefCuisiniers = chefCuisiniers;
    }
}