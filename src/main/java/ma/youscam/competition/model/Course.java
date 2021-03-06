package ma.youscam.competition.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String lieu;
	
	@OneToMany
	private Set<Competition> competitions;//normalement 8 competition
	
	public Course() {
		super();
	}

	public Course(Long id, String lieu, Set<Competition> competitions) {
		super();
		this.id = id;
		this.lieu = lieu;
		this.competitions = competitions;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public Set<Competition> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(Set<Competition> competitions) {
		this.competitions = competitions;
	}
	
	

}
