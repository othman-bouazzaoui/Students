package com.tawdi7atnet;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tawdi7atnet.dao.EtudiantRepository;
import com.tawdi7atnet.entity.Etudiant;
import com.tawdi7atnet.entity.School;
import com.tawdi7atnet.metier.IEtudiantService;
import com.tawdi7atnet.metier.ISchoolService;

@SpringBootApplication
public class EtudiantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantsApplication.class, args);
	}

	@Autowired
	private IEtudiantService etudiantservice;
	
	//W
	@Autowired
	private ISchoolService schoolService;
	
	@Bean
	CommandLineRunner start() {
		return args->{
			
			Stream.of(new School(null,"School",null))
			.forEach(e -> schoolService.addSchool(e));
			
			Stream.of(new Etudiant("Wafae", "Nabet"),new Etudiant("Othman", "BOUAZZAOUI"))
			.forEach(e -> etudiantservice.addStudent(e));
			
		};
	}

}
