package tn.esprit.twin.projet_spring.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;
    private Float imc;
    private TypeComposant TypeComposant;

    public DetailComposant(Long idDetailComposant, Float imc, TypeComposant typeComposant) {
        this.idDetailComposant = idDetailComposant;
        this.imc = imc;
        TypeComposant = typeComposant;
    }

    public Long getIdDetailComposant() {
        return idDetailComposant;
    }

    public void setIdDetailComposant(Long idDetailComposant) {
        this.idDetailComposant = idDetailComposant;
    }

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public TypeComposant getTypeComposant() {
        return TypeComposant;
    }

    public void setTypeComposant(TypeComposant typeComposant) {
        TypeComposant = typeComposant;
    }
}
