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
	private Set<Player> players;

	public Club() {
		super();
	}

	public Club(String nom, Set<Player> players) {
		super();
		this.nom = nom;
		this.players = players;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Player> getJoueurs() {
		return players;
	}

	public void setJoueurs(Set<Player> players) {
		this.players = players;
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
	    result = prime * result + ((players == null) ? 0 : players.hashCode());
	    return result;
	}

	
}
