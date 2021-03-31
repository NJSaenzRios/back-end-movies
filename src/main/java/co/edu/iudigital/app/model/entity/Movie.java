package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="movie")
public class Movie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	
	private int id;
	
	private String description;
	
	private String image;
	@Column(name = "create_at")
	private LocalDateTime creatAt;
	@Column(name="release_date)")
	private LocalDateTime releaseDate;
	private String actors;
	@ManyToOne
	@JoinColumn(name="gender_id")
	private String name;
	private int genderId;
	
	private int rating;
	public Movie() {
		}
	
	public Movie(int id, String description, String image, LocalDateTime creatAt, LocalDateTime releaseDate,
			String actors, Gender genderId, int rating, String name) {
		super();
		this.id = id;
		this.description = description;
		this.image = image;
		this.creatAt = creatAt;
		this.releaseDate = releaseDate;
		this.actors = actors;
		this.genderId = genderId;
		this.rating = rating;
		this.name = name;
				
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDateTime getCreatAt() {
		return creatAt;
	}

	public void setCreatAt(LocalDateTime creatAt) {
		this.creatAt = creatAt;
	}

	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
}
