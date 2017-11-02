package ma.youscam.competition.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ma.youscam.competition.model.enumeration.Sexe;
import ma.youscam.competition.model.enumeration.SubClass;

@Entity
public class Joueur {
	@Id
	private int bn;
	private String nom;
	private String prenom;
	private LocalDate datenaissance;
	private Sexe sexe;
	private SubClass subclass;
	@ManyToOne
	private Club club;
	
	
	
	public Joueur() {
		super();
	}

	public Joueur(int bn, String nom, String prenom, LocalDate datenaissance, Sexe sexe, SubClass subclass, Club club) {
		super();
		this.bn = bn;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.sexe = sexe;
		this.subclass = subclass;
		this.club = club;
	}

	public int getBn() {
		return bn;
	}

	public void setBn(int bn) {
		this.bn = bn;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(LocalDate datenaissance) {
		this.datenaissance = datenaissance;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public SubClass getSubclass() {
		return subclass;
	}

	public void setSubclass(SubClass subclass) {
		this.subclass = subclass;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	
	

}
