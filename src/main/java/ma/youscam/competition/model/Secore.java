package ma.youscam.competition.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Secore implements Comparable<Secore> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private LocalDate timing;
	private Player player;
	
	public Secore(LocalDate timing, Player player) {
		super();
		this.timing = timing;
		this.player = player;
	}

	public Secore() {
		super();
		this.timing=null;
		this.player=null;
	}

	public LocalDate getTiming() {
		return timing;
	}

	public Player getJoueur() {
		return player;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTiming(LocalDate timing) {
		this.timing = timing;
	}

	public void setJoueur(Player player) {
		this.player = player;
	}

	@Override
	public int compareTo(Secore o) {
		return this.getTiming().compareTo(o.getTiming());
	}
	

}
