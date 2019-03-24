package org.sid.entities;

import java.io.Serializable;
import java.sql.Date;
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
public class SuiviSeropositives implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int numSuivi;
	private Date dateSuivi;
	private String traitement;
	@ManyToOne
    @JoinColumn(name="num_depistage")
	private Depistage depistage;
	@OneToMany(mappedBy="suiviseropositives",fetch=FetchType.LAZY)
	private Collection<Femme> femmes;
	public int getNumSuivi() {
		return numSuivi;
	}
	public void setNumSuivi(int numSuivi) {
		this.numSuivi = numSuivi;
	}
	public Date getDateSuivi() {
		return dateSuivi;
	}
	public void setDateSuivi(Date dateSuivi) {
		this.dateSuivi = dateSuivi;
	}
	public String getTraitement() {
		return traitement;
	}
	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}
	public Depistage getDepistage() {
		return depistage;
	}
	public void setDepistage(Depistage depistage) {
		this.depistage = depistage;
	}
	public Collection<Femme> getFemmes() {
		return femmes;
	}
	public void setFemmes(Collection<Femme> femmes) {
		this.femmes = femmes;
	}
	public SuiviSeropositives() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuiviSeropositives(Date dateSuivi, String traitement) {
		super();
		this.dateSuivi = dateSuivi;
		this.traitement = traitement;
	}
	
}
 
