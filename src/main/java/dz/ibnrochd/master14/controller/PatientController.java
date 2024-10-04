package dz.ibnrochd.master14.controller;

import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // Récupérer tous les patients
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    // Ajouter un nouveau patient
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }

    // Récupérer un patient par ID
    @GetMapping("/{id}")
    public Optional<Patient> getPatientById(@PathVariable int id) {
        return patientService.getPatientById(id);
    }

    
}
