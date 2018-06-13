package service.impl;


import javax.xml.bind.annotation.XmlSeeAlso;
import service.*;
import javax.jws.WebService;

@WebService(serviceName = "banka", endpointInterface = "service.Banka", targetNamespace = "http://www.example.org/banka/")
public class BankaImpl implements Banka {
	public double stanje() {
		return 0;
	}

	public boolean skiniSaRacuna(double in) {
		return false;
	}

	public TransakicijaPortType izvestaj() {
		return null;
	}

	public boolean dodajNaRacuna(double in) {
		return false;
	}
}