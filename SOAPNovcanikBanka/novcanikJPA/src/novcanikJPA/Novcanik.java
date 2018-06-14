package novcanikJPA;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the novcanik database table.
 * 
 */
@Entity
@NamedQuery(name="Novcanik.findAll", query="SELECT n FROM Novcanik n")
public class Novcanik implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idnovcanik;

	private double iznos;

	//bi-directional one-to-one association to User
	@OneToOne(mappedBy="novcanik")
	private User user;

	public Novcanik() {
	}

	public int getIdnovcanik() {
		return this.idnovcanik;
	}

	public void setIdnovcanik(int idnovcanik) {
		this.idnovcanik = idnovcanik;
	}

	public double getIznos() {
		return this.iznos;
	}

	public void setIznos(double iznos) {
		this.iznos = iznos;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}