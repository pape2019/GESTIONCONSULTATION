package org.sid.entities;

import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("ExamGyne")
public class ExamenGynecologique extends Examen {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tv ;
	private String uterus;
	private String leucorrhées;
	private String doigtier;
	private String dureeRegle;
	private String cycle ;
	private String abondance;
	private String taille;
	private String positionUterus;
	private String forme;
	private String consistance;
	private String dysmenorrhee;
	private String metrorragie;
	private String traitement;
	private String annexe;
	public ExamenGynecologique() {
		super();
	}
	public ExamenGynecologique(String nomExam, Date dateExamen, String tv, String uterus, String leucorrhées,
			String doigtier, String traitement, String annexe) {
		super(nomExam, dateExamen);
		this.tv = tv;
		this.uterus = uterus;
		this.leucorrhées = leucorrhées;
		this.doigtier = doigtier;
		this.traitement = traitement;
		this.annexe = annexe;
	}
	public String getTv() {
		return tv;
	}
	public void setTv(String tv) {
		this.tv = tv;
	}
	public String getUterus() {
		return uterus;
	}
	public void setUterus(String uterus) {
		this.uterus = uterus;
	}
	public String getLeucorrhées() {
		return leucorrhées;
	}
	public void setLeucorrhées(String leucorrhées) {
		this.leucorrhées = leucorrhées;
	}
	public String getDoigtier() {
		return doigtier;
	}
	public void setDoigtier(String doigtier) {
		this.doigtier = doigtier;
	}
	public String getTraitement() {
		return traitement;
	}
	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}
	public String getAnnexe() {
		return annexe;
	}
	public void setAnnexe(String annexe) {
		this.annexe = annexe;
	}
	public String getDureeRegle() {
		return dureeRegle;
	}
	public void setDureeRegle(String dureeRegle) {
		this.dureeRegle = dureeRegle;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public String getAbondance() {
		return abondance;
	}
	public void setAbondance(String abondance) {
		this.abondance = abondance;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public String getPositionUterus() {
		return positionUterus;
	}
	public void setPositionUterus(String positionUterus) {
		this.positionUterus = positionUterus;
	}
	public String getForme() {
		return forme;
	}
	public void setForme(String forme) {
		this.forme = forme;
	}
	public String getConsistance() {
		return consistance;
	}
	public void setConsistance(String consistance) {
		this.consistance = consistance;
	}
	public String getDysmenorrhee() {
		return dysmenorrhee;
	}
	public void setDysmenorrhee(String dysmenorrhee) {
		this.dysmenorrhee = dysmenorrhee;
	}
	public String getMetrorragie() {
		return metrorragie;
	}
	public void setMetrorragie(String metrorragie) {
		this.metrorragie = metrorragie;
	}

}
