package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Medecin implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricule;
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;

}
