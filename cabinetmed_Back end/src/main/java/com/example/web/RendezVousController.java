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
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Patient;
import com.example.entities.RendezVous;
import com.example.repo.RendezVousRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RendezVousController {

	@Autowired
	private RendezVousRepository rendezVousrepository;
	
	@GetMapping("/rendezVouses")
    public List<RendezVous> getRdvs() {
        return (List<RendezVous>) rendezVousrepository.findAll();

    }

    @PostMapping("/rendezVouses")
    void addPatient(@RequestBody RendezVous rdv) {
    	rendezVousrepository.save(rdv);
    }
    
    @DeleteMapping("/rendezVouses/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
    	rendezVousrepository.deleteById(id);
		return new ResponseEntity<String>("Rendez-Vous has been successfully.!", HttpStatus.OK);
	}
}
