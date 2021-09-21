package com.nareshit.raju.service;

import java.util.List;

import com.nareshit.raju.entity.Specialisation;

public interface SpecialisationService {

	public Long saveSpecialisation(Specialisation spec);
	public List<Specialisation> getAll();
	public void removeSpecialisation(Long id);
	public Specialisation getOneSpecialization(Long id);
	public void updateSpecialization(Specialisation spec);
	
}
