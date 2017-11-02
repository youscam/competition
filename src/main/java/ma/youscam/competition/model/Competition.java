package ma.youscam.competition.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ma.youscam.competition.model.enumeration.Sexe;
import ma.youscam.competition.model.enumeration.SubClass;

@Entity
public class Competition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private final Sexe sexe;
	@Enumerated(EnumType.STRING)
	private final SubClass subclass;
	private Set<Secore> secores;
	
	public Competition() {
		super();
		this.sexe = Sexe.MASCULIN;
		this.subclass= SubClass.MINIME;
	}
	
	public Competition(Long id, Sexe sexe, SubClass subclass, Set<Secore> secores) {
		super();
		this.id = id;
		this.sexe = sexe;
		this.subclass = subclass;
		this.secores = secores;
	}
	
	public Competition(Sexe sexe, SubClass subclass, Set<Secore> secores) {
		super();
		this.sexe = sexe;
		this.subclass = subclass;
		this.secores = secores;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Set<Secore> getSecores() {
		return secores;
	}
	
	public void setSecores(Set<Secore> secores) {
		this.secores = secores;
	}
	
	public Sexe getSexe() {
		return sexe;
	}
	
	public SubClass getSubclass() {
		return subclass;
	}
	
	

}
