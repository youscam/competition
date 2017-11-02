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

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Club other = (Club) obj;
		return nom != other.nom ? false : true;
	}

	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	    result = prime * result + ((joueurs == null) ? 0 : joueurs.hashCode());
	    return result;
	}

	
}
