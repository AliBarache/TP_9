package dz.ibnrochd.master14.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "cabinet", name = "traitement")
public class Traitement implements Serializable {

    private static final long serialVersionUID = 8248365590951840055L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Nom du traitement
    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    // Description du traitement
    @Column(name = "description", nullable = true, length = 500)
    private String description;

    // Relation ManyToOne avec LigneConsultation (un traitement peut être lié à plusieurs lignes de consultation)
    @ManyToOne
    @JoinColumn(name = "id_ligne_consultation", nullable = false)
    private LigneConsultation ligneConsultation;

    // Constructeurs
    public Traitement() {
    }

    public Traitement(int id, String nom, String description, LigneConsultation ligneConsultation) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.ligneConsultation = ligneConsultation;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LigneConsultation getLigneConsultation() {
        return ligneConsultation;
    }

    public void setLigneConsultation(LigneConsultation ligneConsultation) {
        this.ligneConsultation = ligneConsultation;
    }
}
