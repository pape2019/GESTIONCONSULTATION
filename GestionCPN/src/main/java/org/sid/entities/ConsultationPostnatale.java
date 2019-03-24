package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class ConsultationPostnatale implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int numConsPost;
  private float sucre;
  private float urine_album;
  private float poids;
  private float tension_arter;
  private String interrogatoire;
  @OneToOne
  @JoinColumn(name="num_fichemat")
  private FicheMaternelle fichematernelle;
  @OneToOne
  @JoinColumn(name="num_exam")
  private Examen examen;
public int getNumConsPost() {
	return numConsPost;
}
public void setNumConsPost(int numConsPost) {
	this.numConsPost = numConsPost;
}
public float getSucre() {
	return sucre;
}
public void setSucre(float sucre) {
	this.sucre = sucre;
}
public float getUrine_album() {
	return urine_album;
}
public void setUrine_album(float urine_album) {
	this.urine_album = urine_album;
}
public float getPoids() {
	return poids;
}
public void setPoids(float poids) {
	this.poids = poids;
}
public float getTension_arter() {
	return tension_arter;
}
public void setTension_arter(float tension_arter) {
	this.tension_arter = tension_arter;
}
public String getInterrogatoire() {
	return interrogatoire;
}
public void setInterrogatoire(String interrogatoire) {
	this.interrogatoire = interrogatoire;
}
public FicheMaternelle getFichematernelle() {
	return fichematernelle;
}
public void setFichematernelle(FicheMaternelle fichematernelle) {
	this.fichematernelle = fichematernelle;
}
public Examen getExamen() {
	return examen;
}
public void setExamen(Examen examen) {
	this.examen = examen;
}
public ConsultationPostnatale() {
	super();
	// TODO Auto-generated constructor stub
}
public ConsultationPostnatale(float sucre, float urine_album, float poids, float tension_arter, String interrogatoire) {
	super();
	this.sucre = sucre;
	this.urine_album = urine_album;
	this.poids = poids;
	this.tension_arter = tension_arter;
	this.interrogatoire = interrogatoire;
}
  
}
