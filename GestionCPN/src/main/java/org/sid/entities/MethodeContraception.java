package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class MethodeContraception implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private int numContracep;
     private String nomMethode;
     private String duree;
     @ManyToOne
     @JoinColumn(name="num_consPlan")
     private ConsultationPlanning consultationplanning;
     @OneToMany(mappedBy="methodecontraception",fetch=FetchType.LAZY)
     private Collection<Femme> femmes;
	public int getNumContracep() {
		return numContracep;
	}
	public void setNumContracep(int numContracep) {
		this.numContracep = numContracep;
	}
	public String getNomMethode() {
		return nomMethode;
	}
	public void setNomMethode(String nomMethode) {
		this.nomMethode = nomMethode;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public ConsultationPlanning getConsultationplanning() {
		return consultationplanning;
	}
	public void setConsultationplanning(ConsultationPlanning consultationplanning) {
		this.consultationplanning = consultationplanning;
	}
	public Collection<Femme> getFemmes() {
		return femmes;
	}
	public void setFemmes(Collection<Femme> femmes) {
		this.femmes = femmes;
	}
	public MethodeContraception() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MethodeContraception(String nomMethode, String duree) {
		super();
		this.nomMethode = nomMethode;
		this.duree = duree;
	}
     
}
