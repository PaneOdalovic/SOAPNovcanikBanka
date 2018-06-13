
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Transakcija_QNAME = new QName("http://www.example.org/banka/", "Transakcija");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Stanje }
     * 
     */
    public Stanje createStanje() {
        return new Stanje();
    }

    /**
     * Create an instance of {@link StanjeResponse }
     * 
     */
    public StanjeResponse createStanjeResponse() {
        return new StanjeResponse();
    }

    /**
     * Create an instance of {@link SkiniSaRacuna }
     * 
     */
    public SkiniSaRacuna createSkiniSaRacuna() {
        return new SkiniSaRacuna();
    }

    /**
     * Create an instance of {@link SkiniSaRacunaResponse }
     * 
     */
    public SkiniSaRacunaResponse createSkiniSaRacunaResponse() {
        return new SkiniSaRacunaResponse();
    }

    /**
     * Create an instance of {@link DodajNaRacuna }
     * 
     */
    public DodajNaRacuna createDodajNaRacuna() {
        return new DodajNaRacuna();
    }

    /**
     * Create an instance of {@link DodajNaRacunaResponse }
     * 
     */
    public DodajNaRacunaResponse createDodajNaRacunaResponse() {
        return new DodajNaRacunaResponse();
    }

    /**
     * Create an instance of {@link Izvestaj }
     * 
     */
    public Izvestaj createIzvestaj() {
        return new Izvestaj();
    }

    /**
     * Create an instance of {@link IzvestajResponse }
     * 
     */
    public IzvestajResponse createIzvestajResponse() {
        return new IzvestajResponse();
    }

    /**
     * Create an instance of {@link TransakicijaPortType }
     * 
     */
    public TransakicijaPortType createTransakicijaPortType() {
        return new TransakicijaPortType();
    }

    /**
     * Create an instance of {@link Transakcija }
     * 
     */
    public Transakcija createTransakcija() {
        return new Transakcija();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransakicijaPortType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/banka/", name = "Transakcija")
    public JAXBElement<TransakicijaPortType> createTransakcija(TransakicijaPortType value) {
        return new JAXBElement<TransakicijaPortType>(_Transakcija_QNAME, TransakicijaPortType.class, null, value);
    }

}
