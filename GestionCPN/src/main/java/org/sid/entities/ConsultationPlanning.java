package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class ConsultationPlanning implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int numConsPlan;
	@Temporal(TemporalType.DATE)
 private Date dateConsPlan;
	@Temporal(TemporalType.DATE)
 private Date dateProcCons;
 @ManyToOne
 @JoinColumn(name="num_fichecontracep")
 private FicheContraception ficheContracep;
 @ManyToOne
 @JoinColumn(name="num_mat")
 private Femme femme;
 @OneToMany(mappedBy="consultationplanning",fetch=FetchType.LAZY)
 private Collection<Examen> examens;
 @OneToMany(mappedBy="consultationplanning",fetch=FetchType.LAZY)
 private Collection<MethodeContraception> methodecontreceptions;
public int getNumConsPlan() {
	return numConsPlan;
}
public void setNumConsPlan(int numConsPlan) {
	this.numConsPlan = numConsPlan;
}
public Date getDateConsPlan() {
	return dateConsPlan;
}
public void setDateConsPlan(Date dateConsPlan) {
	this.dateConsPlan = dateConsPlan;
}
public Date getDateProcCons() {
	return dateProcCons;
}
public void setDateProcCons(Date dateProcCons) {
	this.dateProcCons = dateProcCons;
}
public FicheContraception getFicheContracep() {
	return ficheContracep;
}
public void setFicheContracep(FicheContraception ficheContracep) {
	this.ficheContracep = ficheContracep;
}
public Femme getFemme() {
	return femme;
}
public void setFemme(Femme femme) {
	this.femme = femme;
}
public ConsultationPlanning() {
	super();
	// TODO Auto-generated constructor stub
}
public ConsultationPlanning(Date dateConsPlan, Date dateProcCons) {
	super();
	this.dateConsPlan = dateConsPlan;
	this.dateProcCons = dateProcCons;
}
 
 
}
