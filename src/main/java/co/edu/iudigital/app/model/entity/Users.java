package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.Column;




@Entity
@Table(name="users")

public class Users implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="users_Id")
	private int usersid;
	private String name;
	private String email;
	private String password;
	@Column(name="create_at")
	private LocalDateTime CreateAt;
	@ManyToOne
	@JoinColumn(name ="profile_id")
	private Profile profielId;
	public int getUsersid() {
		return usersid;
	}
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getCreateAt() {
		return CreateAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		CreateAt = createAt;
	}
	public Profile getProfielId() {
		return profielId;
	}
	public void setProfielId(Profile profielId) {
		this.profielId = profielId;
	}
	
	
	
	
}
