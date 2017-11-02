package ma.youscam.competition.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Secore {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private final LocalDate timing;
	private final Joueur joueur;
	
	public Secore(LocalDate timing, Joueur joueur) {
		super();
		this.timing = timing;
		this.joueur = joueur;
	}

	public Secore() {
		super();
		this.timing=null;
		this.joueur=null;
	}

	public LocalDate getTiming() {
		return timing;
	}

	public Joueur getJoueur() {
		return joueur;
	}
	

}
