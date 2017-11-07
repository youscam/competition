package ma.youscam.competition.service;

import java.util.Set;

import ma.youscam.competition.model.Club;
import ma.youscam.competition.model.Player;
import ma.youscam.competition.model.Secore;

public class ResultClub implements Comparable<ResultClub>{
	private Club club;
	private int position;
	private int note;
	private Set<Player> joueursgagnes;
	
	public ResultClub(Club club, Set<Secore> secores) {
		super();
		this.club = club;
//		this.position = position;
//		this.note = note;
//		this.joueursgagnes = joueursgagnes;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Set<Player> getJoueursgagnes() {
		return joueursgagnes;
	}

	public void setJoueursgagnes(Set<Player> joueursgagnes) {
		this.joueursgagnes = joueursgagnes;
	}

	@Override
	public int compareTo(ResultClub o) {
		if(this.getNote()>o.getNote()) return -1;
		if(this.getNote()<o.getNote()) return  1;
		return 0;
	}
	
	

}
