package tn.esprit.twin.projet_spring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDateTime dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;

    public Commande(Long idCommande, LocalDateTime dateCommande, Integer pourcentageRemise, Float totalRemise, Float totalCommande, Long note) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.pourcentageRemise = pourcentageRemise;
        this.totalRemise = totalRemise;
        this.totalCommande = totalCommande;
        this.note = note;
    }

    public Commande() {

    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public LocalDateTime getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDateTime dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Integer getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(Integer pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public Float getTotalRemise() {
        return totalRemise;
    }

    public void setTotalRemise(Float totalRemise) {
        this.totalRemise = totalRemise;
    }

    public Float getTotalCommande() {
        return totalCommande;
    }

    public void setTotalCommande(Float totalCommande) {
        this.totalCommande = totalCommande;
    }

    public Long getNote() {
        return note;
    }

    public void setNote(Long note) {
        this.note = note;
    }
}
