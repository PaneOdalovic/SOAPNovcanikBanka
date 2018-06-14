package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the transakcija database table.
 * 
 */
@Embeddable
public class TransakcijaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idtransakcija;

	@Column(name="racun1_idracun", insertable=false, updatable=false)
	private int racun1Idracun;

	public TransakcijaPK() {
	}
	public int getIdtransakcija() {
		return this.idtransakcija;
	}
	public void setIdtransakcija(int idtransakcija) {
		this.idtransakcija = idtransakcija;
	}
	public int getRacun1Idracun() {
		return this.racun1Idracun;
	}
	public void setRacun1Idracun(int racun1Idracun) {
		this.racun1Idracun = racun1Idracun;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransakcijaPK)) {
			return false;
		}
		TransakcijaPK castOther = (TransakcijaPK)other;
		return 
			(this.idtransakcija == castOther.idtransakcija)
			&& (this.racun1Idracun == castOther.racun1Idracun);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idtransakcija;
		hash = hash * prime + this.racun1Idracun;
		
		return hash;
	}
}