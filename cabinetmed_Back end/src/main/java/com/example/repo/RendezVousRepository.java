package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.example.entities.RendezVous;

@RepositoryRestResource
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {

}
