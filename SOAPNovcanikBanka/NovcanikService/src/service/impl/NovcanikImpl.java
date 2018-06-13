package service.impl;


import javax.xml.bind.annotation.XmlSeeAlso;
import service.*;
import javax.jws.WebService;

@WebService(serviceName = "novcanik", endpointInterface = "service.Novcanik", targetNamespace = "http://www.example.org/novcanik/")
public class NovcanikImpl implements Novcanik {
	public double stanje() {
		return 0;
	}

	public boolean skiniSaNovcanika(double in) {
		return false;
	}

	public boolean dodajNaNavcanik(double in) {
		return false;
	}
}