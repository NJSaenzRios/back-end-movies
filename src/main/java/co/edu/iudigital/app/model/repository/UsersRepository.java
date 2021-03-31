package co.edu.iudigital.app.model.repository;
import org.springframework.data.repository.CrudRepository;

import com.sun.xml.bind.v2.model.core.ID;

import co.edu.iudigital.app.model.entity.Users;

public interface UsersRepository extends CrudRepository<Users, ID>{
	
public Users findByEmailAndPassword(String email, String pasword);

	
}
