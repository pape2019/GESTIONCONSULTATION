package org.sid.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ExamMedi")
public class ExamenMedical extends Examen{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String poids;
	private String taille;
	private float tension;
	private String hauteur_uterine;
	private String albumine;
	private String creatine;
	private String conjonctives;
	private String oedeme;
	private String bruitCoeur;
	private String presentation;
	private String varices;
	public ExamenMedical() {
		super();
	}
	public ExamenMedical(String poids, String taille, float tension, String hauteur_uterine, String albumine,
			String creatine, String conjonctives, String oedeme, String bruitCoeur, String presentation,
			String varices) {
		super();
		this.poids = poids;
		this.taille = taille;
		this.tension = tension;
		this.hauteur_uterine = hauteur_uterine;
		this.albumine = albumine;
		this.creatine = creatine;
		this.conjonctives = conjonctives;
		this.oedeme = oedeme;
		this.bruitCoeur = bruitCoeur;
		this.presentation = presentation;
		this.varices = varices;
	}
	public String getPoids() {
		return poids;
	}
	public void setPoids(String poids) {
		this.poids = poids;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public float getTension() {
		return tension;
	}
	public void setTension(float tension) {
		this.tension = tension;
	}
	public String getHauteur_uterine() {
		return hauteur_uterine;
	}
	public void setHauteur_uterine(String hauteur_uterine) {
		this.hauteur_uterine = hauteur_uterine;
	}
	public String getAlbumine() {
		return albumine;
	}
	public void setAlbumine(String albumine) {
		this.albumine = albumine;
	}
	public String getCreatine() {
		return creatine;
	}
	public void setCreatine(String creatine) {
		this.creatine = creatine;
	}
	public String getConjonctives() {
		return conjonctives;
	}
	public void setConjonctives(String conjonctives) {
		this.conjonctives = conjonctives;
	}
	public String getOedeme() {
		return oedeme;
	}
	public void setOedeme(String oedeme) {
		this.oedeme = oedeme;
	}
	public String getBruitCoeur() {
		return bruitCoeur;
	}
	public void setBruitCoeur(String bruitCoeur) {
		this.bruitCoeur = bruitCoeur;
	}
	public String getPresentation() {
		return presentation;
	}
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	public String getVarices() {
		return varices;
	}
	public void setVarices(String varices) {
		this.varices = varices;
	}
	
	

}
