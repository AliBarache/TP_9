package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "cabinet", name = "consultation")
public class Consultation implements Serializable {

	private static final long serialVersionUID = -3669998604878710274L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date_consultation", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConsultation;

    // Relation ManyToOne avec Patient
    @ManyToOne
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient patient;

    // Relation OneToMany avec LigneConsultation (chaque consultation peut avoir plusieurs lignes de consultation)
    @OneToMany(mappedBy = "consultation")
    private List<LigneConsultation> ligneConsultations;

    // Constructeur par défaut
    public Consultation() {
    }

    // Constructeur avec paramètres
    public Consultation(int id, Date dateConsultation, Patient patient) {
        this.id = id;
        this.dateConsultation = dateConsultation;
        this.patient = patient;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<LigneConsultation> getLigneConsultations() {
        return ligneConsultations;
    }

    public void setLigneConsultations(List<LigneConsultation> ligneConsultations) {
        this.ligneConsultations = ligneConsultations;
    }
}
