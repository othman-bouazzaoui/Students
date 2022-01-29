package com.tawdi7atnet.metier;

import java.util.List;

import com.tawdi7atnet.entity.Etudiant;

public interface IEtudiantService {
	
	void addStudent(Etudiant e);
	
	List<Etudiant> allStudents();

}
