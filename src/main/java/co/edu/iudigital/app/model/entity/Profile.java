package co.edu.iudigital.app.model.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name="profile")


public class Profile implements Serializable{

	@Id
	@Column(name="profile_id")
	private int id;
	private String name;
	
	
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	
}
