package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Exam",discriminatorType=DiscriminatorType.STRING,length=8)
public abstract class Examen implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int numExam;
  private String nomExam;
  @Temporal(TemporalType.DATE)
  private Date dateExamen;
  @ManyToOne
  @JoinColumn(name="num_consPlan")
  private ConsultationPlanning consultationplanning;
public int getNumExam() {
	return numExam;
}
public void setNumExam(int numExam) {
	this.numExam = numExam;
}
public String getNomExam() {
	return nomExam;
}
public void setNomExam(String nomExam) {
	this.nomExam = nomExam;
}
public Date getDateExamen() {
	return dateExamen;
}
public void setDateExamen(Date dateExamen) {
	this.dateExamen = dateExamen;
}
public ConsultationPlanning getConsultationPlanning() {
	return consultationplanning;
}
public void setConsultationPlanning(ConsultationPlanning consultationPlanning) {
	this.consultationplanning = consultationPlanning;
}
public Examen() {
	super();
	// TODO Auto-generated constructor stub
}
public Examen(String nomExam, Date dateExamen) {
	super();
	this.nomExam = nomExam;
	this.dateExamen = dateExamen;
}

  
}
