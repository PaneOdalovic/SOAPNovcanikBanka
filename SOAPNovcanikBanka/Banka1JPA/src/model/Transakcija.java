package model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the transakcija database table.
 * 
 */
@Entity
@NamedQuery(name="Transakcija.findAll", query="SELECT t FROM Transakcija t")
public class Transakcija implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransakcijaPK id;

	private double iznos;

	private int ulazna;

	//bi-directional many-to-one association to Racun
	@ManyToOne
	@JoinColumn(name="racun1_idracun")
	@JsonIgnore
	private Racun racun;

	public Transakcija() {
	}

	public TransakcijaPK getId() {
		return this.id;
	}

	public void setId(TransakcijaPK id) {
		this.id = id;
	}

	public double getIznos() {
		return this.iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

	public int getUlazna() {
		return this.ulazna;
	}

	public void setUlazna(int ulazna) {
		this.ulazna = ulazna;
	}

	public Racun getRacun() {
		return this.racun;
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}

}