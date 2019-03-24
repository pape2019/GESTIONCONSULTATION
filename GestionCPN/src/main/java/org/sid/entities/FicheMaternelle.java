package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class FicheMaternelle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private int ficheMat;
 @OneToMany(mappedBy="fichematernelle",fetch=FetchType.LAZY)
 private Collection<ConsultationPrenatale> consultationprenatales;
 @OneToMany(mappedBy="fichematernelle",fetch=FetchType.LAZY)
 private Collection<ConsultationPostnatale> consultationpostnatales;
 @OneToMany(mappedBy="fichematernelle",fetch=FetchType.LAZY)
 private Collection<Femme> femmes;
public int getFicheMat() {
	return ficheMat;
}
public void setFicheMat(int ficheMat) {
	this.ficheMat = ficheMat;
}
public Collection<ConsultationPrenatale> getConsultationprenatales() {
	return consultationprenatales;
}
public void setConsultationprenatales(Collection<ConsultationPrenatale> consultationprenatales) {
	this.consultationprenatales = consultationprenatales;
}
public Collection<ConsultationPostnatale> getConsultationpostnatales() {
	return consultationpostnatales;
}
public void setConsultationpostnatales(Collection<ConsultationPostnatale> consultationpostnatales) {
	this.consultationpostnatales = consultationpostnatales;
}
public Collection<Femme> getFemmes() {
	return femmes;
}
public void setFemmes(Collection<Femme> femmes) {
	this.femmes = femmes;
}
public FicheMaternelle() {
	super();
	// TODO Auto-generated constructor stub
}
 
}

