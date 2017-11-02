package ma.youscam.competition.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String lieu;
	private Set<Joueur> joueurs;
	private Set<Competition> competitions;//normalement 8 competition
	
	public Course() {
		super();
	}

	public Course(Long id, String lieu, Set<Joueur> joueurs, Set<Competition> competitions) {
		super();
		this.id = id;
		this.lieu = lieu;
		this.joueurs = joueurs;
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
	public Set<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(Set<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	public Set<Competition> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(Set<Competition> competitions) {
		this.competitions = competitions;
	}
	
	

}
