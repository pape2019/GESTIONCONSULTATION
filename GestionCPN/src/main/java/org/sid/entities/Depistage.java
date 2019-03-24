package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Depistage implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int numDepis;
 @Temporal(TemporalType.DATE)
 private Date dateDepis;
 private String resultat;
 @OneToMany(mappedBy="depistage",fetch=FetchType.LAZY)
 private Collection<Femme> femmes;
public int getNumDepis() {
	return numDepis;
}
public void setNumDepis(int numDepis) {
	this.numDepis = numDepis;
}
public Date getDateDepis() {
	return dateDepis;
}
public void setDateDepis(Date dateDepis) {
	this.dateDepis = dateDepis;
}
public String getResultat() {
	return resultat;
}
public void setResultat(String resultat) {
	this.resultat = resultat;
}
public Collection<Femme> getFemmes() {
	return femmes;
}
public void setFemmes(Collection<Femme> femmes) {
	this.femmes = femmes;
}
public Depistage() {
	super();
	// TODO Auto-generated constructor stub
}
public Depistage(Date dateDepis, String resultat) {
	super();
	this.dateDepis = dateDepis;
	this.resultat = resultat;
}
 
 }
