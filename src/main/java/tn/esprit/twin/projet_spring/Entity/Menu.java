package tn.esprit.twin.projet_spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    private TypeMenu TypeMenu;
    private Float prix;

    public Menu(Long idMenu, String libelleMenu, TypeMenu typeMenu, Float prix) {
        this.idMenu = idMenu;
        this.libelleMenu = libelleMenu;
        TypeMenu = typeMenu;
        this.prix = prix;
    }

    public Menu() {

    }

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
        return TypeMenu;
    }

    public void setTypeMenu(TypeMenu typeMenu) {
        TypeMenu = typeMenu;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }
}
