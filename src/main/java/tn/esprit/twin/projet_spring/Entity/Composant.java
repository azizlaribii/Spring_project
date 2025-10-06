package tn.esprit.twin.projet_spring.Entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;
    private String nomComposant;
    private Float prix;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @OneToMany(mappedBy = "composant", cascade = CascadeType.ALL)
    private Set<DetailComposant> detailComposants;

    public Composant() {}

    public Composant(Long idComposant, String nomComposant, Float prix) {
        this.idComposant = idComposant;
        this.nomComposant = nomComposant;
        this.prix = prix;
    }

    // Getters and Setters
    public Long getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(Long idComposant) {
        this.idComposant = idComposant;
    }

    public String getNomComposant() {
        return nomComposant;
    }

    public void setNomComposant(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Set<DetailComposant> getDetailComposants() {
        return detailComposants;
    }

    public void setDetailComposants(Set<DetailComposant> detailComposants) {
        this.detailComposants = detailComposants;
    }
}