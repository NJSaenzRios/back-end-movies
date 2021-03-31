package co.edu.iudigital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import co.edu.iudigital.app.service.iface.GenderService;
import co.edu.iudigital.app.model.entity.Gender;
import co.edu.iudigital.app.model.repository.GenderRepository;

@Service
public class GenderServiceimpl implements GenderService  {
	//inyeccion de dependencias mediante atributo
	
	@Autowired 
	private GenderRepository genderRepository;
	
	@Override	
	public List<Gender> getAll() {
		List<Gender> genders = new ArrayList<>();
		genders = (List<Gender>) genderRepository.findAll();
		return genders;
	
	}
	
}
