package ma.youscam.competition.model;

import java.util.Set;

public class Course {
	private Long id;
	private String lieu;
	private Set<Joueur> joueurs;
	public Course() {
		super();
	}
	public Course(Long id, String lieu, Set<Joueur> joueurs) {
		super();
		this.id = id;
		this.lieu = lieu;
		this.joueurs = joueurs;
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
	
	

}
