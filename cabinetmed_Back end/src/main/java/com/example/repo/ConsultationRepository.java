package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Consultation;

@RepositoryRestResource
public interface ConsultationRepository extends JpaRepository<Consultation,Long> {

}
