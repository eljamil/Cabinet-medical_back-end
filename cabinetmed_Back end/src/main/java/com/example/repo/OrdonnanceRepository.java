package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Ordonnance;


@RepositoryRestResource
public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Long> {

}
