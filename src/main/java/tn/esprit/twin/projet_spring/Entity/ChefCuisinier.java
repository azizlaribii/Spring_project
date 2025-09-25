package tn.esprit.twin.projet_spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    private TypeChef TypeChef;
    public ChefCuisinier() {}

    public ChefCuisinier(Long idChefCuisinier, String nom, String prenom, TypeChef typeChef) {
        this.idChefCuisinier = idChefCuisinier;
        this.nom = nom;
        this.prenom = prenom;
        TypeChef = typeChef;
    }

    public Long getIdChefCuisinier() {
        return idChefCuisinier;
    }

    public void setIdChefCuisinier(Long idChefCuisinier) {
        this.idChefCuisinier = idChefCuisinier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public TypeChef getTypeChef() {
        return TypeChef;
    }

    public void setTypeChef(TypeChef typeChef) {
        TypeChef = typeChef;
    }
}
