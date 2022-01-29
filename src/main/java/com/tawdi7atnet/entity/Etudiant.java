package com.tawdi7atnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prenom")
	private String firstName;
	
	@Column(name ="nom")
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name = "ecole_id")
	private School school;
	
	public Etudiant(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
		
}
