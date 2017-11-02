package ma.youscam.competition.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Club {
	
	@Id
	private String nom;
	@OneToMany
	private Set<Joueur> joueurs;
	
	
	public Club() {
		super();
	}
	
	public Club(String nom, Set<Joueur> joueurs) {
		super();
		this.nom = nom;
		this.joueurs = joueurs;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(Set<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	
	
	

}
