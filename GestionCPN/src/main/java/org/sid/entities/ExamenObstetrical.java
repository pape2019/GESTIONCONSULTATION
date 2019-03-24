package org.sid.entities;
import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("ExamObst")
public class ExamenObstetrical extends Examen {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Date dateRetCouche;
 private String typeAllaitement;
public ExamenObstetrical() {
	super();
}
public ExamenObstetrical(String nomExam, Date dateExamen, Date dateRetCouche, String typeAllaitement) {
	super(nomExam, dateExamen);
	this.dateRetCouche = dateRetCouche;
	this.typeAllaitement = typeAllaitement;
}
public Date getDateRetCouche() {
	return dateRetCouche;
}
public void setDateRetCouche(Date dateRetCouche) {
	this.dateRetCouche = dateRetCouche;
}
public String getTypeAllaitement() {
	return typeAllaitement;
}
public void setTypeAllaitement(String typeAllaitement) {
	this.typeAllaitement = typeAllaitement;
}
 
 
}
