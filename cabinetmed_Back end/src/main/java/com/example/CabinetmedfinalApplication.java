package com.example;

import java.util.Calendar;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.example.entities.Patient;
import com.example.entities.RendezVous;
import com.example.repo.PatientRepository;
import com.example.repo.RendezVousRepository;

@SpringBootApplication
public class CabinetmedfinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabinetmedfinalApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(PatientRepository patientRepository,RendezVousRepository rdvRepository) {
        return args -> {
        	Calendar calendar = Calendar.getInstance();
        	calendar.clear(); // Sets hours/minutes/seconds/milliseconds to zero
        	calendar.set(94 + 1900, 06, 20);
               Patient patient = new Patient(null,"madihi","zakaria","bk611321",calendar.getTime(),"oulfa",06455154566L);
                patientRepository.save(patient);
                calendar.set(97 + 1900, 01, 28);
                Patient patient2 = new Patient(null,"eljamil","hafsa","bk64521",calendar.getTime(),"el oulfa",0645324566L);
                patientRepository.save(patient2);
                calendar.set(99 + 1900, 02, 10);
                Patient patient3 = new Patient(null,"lwakili","ayman","bk614721",calendar.getTime(),"hay hassani",0645174533L);
                patientRepository.save(patient3);
                calendar.set(92 + 1900, 03, 25);
                Patient patient4 = new Patient(null,"lmanssori","mustapha","bk61748",calendar.getTime(),"sidi maarouf",06474354566L);
                patientRepository.save(patient4);
                calendar.set(98 + 1900, 06, 01);
                Patient patient5 = new Patient(null,"elhamdaoui","karam","bk475321",calendar.getTime(),"errehma",06451436566L);
                patientRepository.save(patient5);
                calendar.set(90 + 1900, 05, 05);
                Patient patient6 = new Patient(null,"elomari","khadija","bk617891",calendar.getTime(),"barnoussi",06433321566L);
                patientRepository.save(patient6);
                calendar.set(94 + 1900, 02, 29);
                RendezVous rdv = new RendezVous(null,"20-12-2021","20:12",false,patient);
                rdvRepository.save(rdv);
            
                patientRepository.findAll().forEach(System.out::println);
        };
    }

}
