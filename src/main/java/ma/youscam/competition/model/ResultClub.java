package ma.youscam.competition.model;

import java.util.Set;

public class ResultClub {
	private Club club;
	private int position;
	private int note;
	private Set<Joueur> joueursgagnes;
	
	public ResultClub(Club club, int position, int note, Set<Joueur> joueursgagnes) {
		super();
		this.club = club;
		this.position = position;
		this.note = note;
		this.joueursgagnes = joueursgagnes;
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

	public Set<Joueur> getJoueursgagnes() {
		return joueursgagnes;
	}

	public void setJoueursgagnes(Set<Joueur> joueursgagnes) {
		this.joueursgagnes = joueursgagnes;
	}
	
	

}
