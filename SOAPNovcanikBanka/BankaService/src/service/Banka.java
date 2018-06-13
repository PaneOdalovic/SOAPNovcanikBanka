package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2018-06-13T20:24:57.367+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://www.example.org/banka/", name = "banka")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Banka {

    @WebMethod(action = "http://www.example.org/banka/stanje")
    @WebResult(name = "out", targetNamespace = "", partName = "out")
    public double stanje();

    @WebMethod
    @WebResult(name = "out", targetNamespace = "", partName = "out")
    public boolean skiniSaRacuna(
        @WebParam(partName = "in", name = "in", targetNamespace = "")
        double in
    );

    @WebMethod
    @WebResult(name = "Transakcija", targetNamespace = "http://www.example.org/banka/", partName = "out")
    public TransakicijaPortType izvestaj();

    @WebMethod
    @WebResult(name = "out", targetNamespace = "", partName = "out")
    public boolean dodajNaRacuna(
        @WebParam(partName = "in", name = "in", targetNamespace = "")
        double in
    );
}