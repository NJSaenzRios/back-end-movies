package co.edu.iudigital.app.service.iface;
import co.edu.iudigital.app.model.entity.Users;

public interface UsersService {

	public void create(Users users);
	
    public Users login(Users users) throws Exception;

}