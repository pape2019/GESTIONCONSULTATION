package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class ConsultationPrenatale implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int numConsPr;
	@Temporal(TemporalType.DATE)
    private Date dateConsPren;
	@Temporal(TemporalType.DATE)
    private Date dateDernRegle;
	@Temporal(TemporalType.DATE)
    private Date dateProchCons;
	@Temporal(TemporalType.DATE)
    private Date dateAccouch;
	@OneToOne
	@JoinColumn(name="num_exam")
    private  Examen examen;
	@ManyToOne
	@JoinColumn(name="num_fichemat")
    private FicheMaternelle fichematernelle;
	@ManyToMany(mappedBy="consultationprenatales")
    private Collection<Femme> femmes;
	public int getNumConsPr() {
		return numConsPr;
	}
	public void setNumConsPr(int numConsPr) {
		this.numConsPr = numConsPr;
	}
	public Date getDateConsPren() {
		return dateConsPren;
	}
	public void setDateConsPren(Date dateConsPren) {
		this.dateConsPren = dateConsPren;
	}
	public Date getDateDernRegle() {
		return dateDernRegle;
	}
	public void setDateDernRegle(Date dateDernRegle) {
		this.dateDernRegle = dateDernRegle;
	}
	public Date getDateProchCons() {
		return dateProchCons;
	}
	public void setDateProchCons(Date dateProchCons) {
		this.dateProchCons = dateProchCons;
	}
	public Date getDateAccouch() {
		return dateAccouch;
	}
	public void setDateAccouch(Date dateAccouch) {
		this.dateAccouch = dateAccouch;
	}
	public Examen getExamen() {
		return examen;
	}
	public void setExamen(Examen examen) {
		this.examen = examen;
	}
	public FicheMaternelle getFichematernelle() {
		return fichematernelle;
	}
	public void setFichematernelle(FicheMaternelle fichematernelle) {
		this.fichematernelle = fichematernelle;
	}
	public Collection<Femme> getFemmes() {
		return femmes;
	}
	public void setFemmes(Collection<Femme> femmes) {
		this.femmes = femmes;
	}
	public ConsultationPrenatale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ConsultationPrenatale(Date dateConsPren, Date dateDernRegle, Date dateProchCons, Date dateAccouch) {
		super();
		this.dateConsPren = dateConsPren;
		this.dateDernRegle = dateDernRegle;
		this.dateProchCons = dateProchCons;
		this.dateAccouch = dateAccouch;
	}
   


}
