package co.edu.iudigital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.Users;
import co.edu.iudigital.app.model.repository.UsersRepository;
import co.edu.iudigital.app.service.iface.UsersService;

@Service
public class UsersServiceimpl implements UsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	
	@Override
	public void create(Users users){
	}
	
	@Override
	public Users login(Users users) throws Exception{
	Users existsUsers = usersRepository.findByEmailAndPassword(users.getEmail(), users.getPassword());
	
	if (existsUsers == null) {
		throw new Exception ("Usuario y/o contraseña invalido!");
	}
	
	return existsUsers;
	
	}
}
