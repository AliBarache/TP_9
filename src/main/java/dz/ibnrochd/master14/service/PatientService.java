package dz.ibnrochd.master14.service;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // Récupérer tous les patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Ajouter un nouveau patient
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Récupérer un patient par ID
    public Optional<Patient> getPatientById(int id) {
        return patientRepository.findById(id);
    }

    
}
