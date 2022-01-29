package com.tawdi7atnet.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tawdi7atnet.dao.EtudiantRepository;
import com.tawdi7atnet.entity.Etudiant;

@Service
public class EtudiantServiceImpl implements IEtudiantService {

	@Autowired
	private EtudiantRepository etudiantrepo;
	
	@Override
	public void addStudent(Etudiant e) {
		System.out.println("***** Add Test ****");
		etudiantrepo.save(e);
		
	}

	@Override
	public List<Etudiant> allStudents() {
		// TODO Auto-generated method stub
		return etudiantrepo.findAll();
	}

}
