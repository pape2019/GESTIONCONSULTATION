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
public class FicheContraception implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private int fichecontrap;
 @ManyToOne
 @JoinColumn(name="num_mat")
 private Femme femme;
 @OneToMany(mappedBy="ficheContracep",fetch=FetchType.LAZY)
 private Collection<ConsultationPlanning> consultationplannings;
public int getFichecontrap() {
	return fichecontrap;
}
public void setFichecontrap(int fichecontrap) {
	this.fichecontrap = fichecontrap;
}
public Femme getFemme() {
	return femme;
}
public void setFemme(Femme femme) {
	this.femme = femme;
}
public Collection<ConsultationPlanning> getConsultationplannings() {
	return consultationplannings;
}
public void setConsultationplannings(Collection<ConsultationPlanning> consultationplannings) {
	this.consultationplannings = consultationplannings;
}
public FicheContraception() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
