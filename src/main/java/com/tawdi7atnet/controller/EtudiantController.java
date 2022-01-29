package com.tawdi7atnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tawdi7atnet.entity.Etudiant;
import com.tawdi7atnet.metier.IEtudiantService;

@RestController
@RequestMapping(path = "students")
public class EtudiantController {
	
	@Autowired
	private IEtudiantService etudiantService;
	
	@GetMapping(value = "")
	public List<Etudiant> allStudents(){
		return etudiantService.allStudents();
	}
	

}
