package org.sid.entities;
import java.sql.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("ExamLabo")
public class ExamenLabo extends Examen {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String groupeSanguin;
	private String electrophorese;
	private String glycemie;
	private String cholesterol;
	private String lipide;
	public ExamenLabo() {
		super();
	}
	public ExamenLabo(String nomExam, Date dateExamen, String groupeSanguin, String electrophorese, String glycemie,
			String cholesterol, String lipide) {
		super(nomExam, dateExamen);
		this.groupeSanguin = groupeSanguin;
		this.electrophorese = electrophorese;
		this.glycemie = glycemie;
		this.cholesterol = cholesterol;
		this.lipide = lipide;
	}
	public String getGroupeSanguin() {
		return groupeSanguin;
	}
	public void setGroupeSanguin(String groupeSanguin) {
		this.groupeSanguin = groupeSanguin;
	}
	public String getElectrophorese() {
		return electrophorese;
	}
	public void setElectrophorese(String electrophorese) {
		this.electrophorese = electrophorese;
	}
	public String getGlycemie() {
		return glycemie;
	}
	public void setGlycemie(String glycemie) {
		this.glycemie = glycemie;
	}
	public String getCholesterol() {
		return cholesterol;
	}
	public void setCholesterol(String cholesterol) {
		this.cholesterol = cholesterol;
	}
	public String getLipide() {
		return lipide;
	}
	public void setLipide(String lipide) {
		this.lipide = lipide;
	}
	

}
