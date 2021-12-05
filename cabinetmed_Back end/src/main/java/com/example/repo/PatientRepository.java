package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Patient;

@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient,Long>,CrudRepository<Patient, Long> {
	public List<Patient> findByNom(String nom);
}
