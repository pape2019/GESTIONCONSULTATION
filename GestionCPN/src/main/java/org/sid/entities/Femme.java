package org.sid.entities;

import java.io.Serializable;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Femme implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int numMat;
    private String prenom;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date datenaiss;
    private int age;
    private String adresse;
    @ManyToOne
    @JoinColumn(name="num_contracep")
    private MethodeContraception methodecontraception; 
    @OneToOne
    @JoinColumn(name="num_ficheMat")
    private FicheMaternelle fichematernelle;
    @ManyToOne
    @JoinColumn(name="num_depis")
    private Depistage depistage;
    @ManyToOne
    @JoinColumn(name="num_seropos")
    private SuiviSeropositives suiviseropositives;
    @OneToMany(mappedBy="femme",fetch=FetchType.LAZY)
    private Collection<ConsultationPlanning> consultationplannings;
   @OneToMany(mappedBy="femme",fetch=FetchType.LAZY)
   private Collection<FicheContraception> fichescontraception;
   @ManyToMany
   @JoinTable(name="Femme_ConsPrenat")
   private Collection<ConsultationPrenatale> consultationprenatales;
public int getNumMat() {
	return numMat;
}
public void setNumMat(int numMat) {
	this.numMat = numMat;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Date getDatenaiss() {
	return datenaiss;
}
public void setDatenaiss(Date datenaiss) {
	this.datenaiss = datenaiss;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public MethodeContraception getMethodecontraception() {
	return methodecontraception;
}
public void setMethodecontraception(MethodeContraception methodecontraception) {
	this.methodecontraception = methodecontraception;
}
public FicheMaternelle getFichematernelle() {
	return fichematernelle;
}
public void setFichematernelle(FicheMaternelle fichematernelle) {
	this.fichematernelle = fichematernelle;
}
public Depistage getDepistage() {
	return depistage;
}
public void setDepistage(Depistage depistage) {
	this.depistage = depistage;
}
public SuiviSeropositives getSuiviseropositives() {
	return suiviseropositives;
}
public void setSuiviseropositives(SuiviSeropositives suiviseropositives) {
	this.suiviseropositives = suiviseropositives;
}
public Collection<ConsultationPlanning> getConsultationplannings() {
	return consultationplannings;
}
public void setConsultationplannings(Collection<ConsultationPlanning> consultationplannings) {
	this.consultationplannings = consultationplannings;
}
public Collection<FicheContraception> getFichescontraception() {
	return fichescontraception;
}
public void setFichescontraception(Collection<FicheContraception> fichescontraception) {
	this.fichescontraception = fichescontraception;
}

public Femme() {
	super();
	// TODO Auto-generated constructor stub
}
public Femme(String prenom, String nom, Date datenaiss, int age, String adresse) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.datenaiss = datenaiss;
	this.age = age;
	this.adresse = adresse;
}



}
