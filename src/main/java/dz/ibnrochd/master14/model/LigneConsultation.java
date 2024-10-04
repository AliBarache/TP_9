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
@Table(schema = "cabinet", name = "ligne_consultation")
public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Description du traitement ou diagnostic
    @Column(name = "description", nullable = false, length = 500)
    private String description;

    // Dose ou quantité de médicaments prescrits
    @Column(name = "dose", nullable = true, length = 100)
    private String dose;

    // Relation avec la Consultation (ManyToOne)
    @ManyToOne
    @JoinColumn(name = "id_consultation", nullable = false)
    private Consultation consultation;

    // Constructeurs
    public LigneConsultation() {
    }

    public LigneConsultation(int id, String description, String dose, Consultation consultation) {
        this.id = id;
        this.description = description;
        this.dose = dose;
        this.consultation = consultation;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
