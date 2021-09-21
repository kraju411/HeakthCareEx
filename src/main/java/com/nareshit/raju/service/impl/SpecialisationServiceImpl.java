package com.nareshit.raju.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.raju.entity.Specialisation;
import com.nareshit.raju.repo.SpecialisationRepository;
import com.nareshit.raju.service.SpecialisationService;
@Service
public class SpecialisationServiceImpl implements SpecialisationService{
	@Autowired
	private SpecialisationRepository repo;
	@Override
	public List<Specialisation> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public Long saveSpecialisation(Specialisation spec) {
		// TODO Auto-generated method stub
		return repo.save(spec).getId();
	}
	@Override
	public void removeSpecialisation(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Specialisation getOneSpecialization(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateSpecialization(Specialisation spec) {
		// TODO Auto-generated method stub
		
	}
	

}
