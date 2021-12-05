package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Patient;
import com.example.repo.PatientRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

	@Autowired
	private  PatientRepository patientRepository ;

    @GetMapping("/patients")
    public List<Patient> getpatients() {
        return (List<Patient>) patientRepository.findAll();
    }

    @PostMapping("/patients")
    void addPatient(@RequestBody Patient patient) {
    	patientRepository.save(patient);
    }
    
    @DeleteMapping("/patients/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
    	patientRepository.deleteById(id);
		return new ResponseEntity<String>("Patient has been deleted successfully.!", HttpStatus.OK);
	}
    
   
	
}
