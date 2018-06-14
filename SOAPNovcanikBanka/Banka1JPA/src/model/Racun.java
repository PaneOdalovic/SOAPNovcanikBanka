package model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the racun database table.
 * 
 */
@Entity
@NamedQuery(name="Racun.findAll", query="SELECT r FROM Racun r")
public class Racun implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idracun;

	private String brojRacuna;

	private double iznos;

	//bi-directional many-to-one association to Transakcija
	@OneToMany(mappedBy="racun")
	@JsonIgnore
	private List<Transakcija> transakcijas;

	//bi-directional one-to-one association to User
	@OneToOne(mappedBy="racun")
	private User user;

	public Racun() {
	}

	public int getIdracun() {
		return this.idracun;
	}

	public void setIdracun(int idracun) {
		this.idracun = idracun;
	}

	public String getBrojRacuna() {
		return this.brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public double getIznos() {
		return this.iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

	public List<Transakcija> getTransakcijas() {
		return this.transakcijas;
	}

	public void setTransakcijas(List<Transakcija> transakcijas) {
		this.transakcijas = transakcijas;
	}

	public Transakcija addTransakcija(Transakcija transakcija) {
		getTransakcijas().add(transakcija);
		transakcija.setRacun(this);

		return transakcija;
	}

	public Transakcija removeTransakcija(Transakcija transakcija) {
		getTransakcijas().remove(transakcija);
		transakcija.setRacun(null);

		return transakcija;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}