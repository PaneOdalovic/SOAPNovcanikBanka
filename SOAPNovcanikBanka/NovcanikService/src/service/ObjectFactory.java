
package service;

import javax.xml.bind.annotation.XmlRegistry;


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
     * Create an instance of {@link SkiniSaNovcanika }
     * 
     */
    public SkiniSaNovcanika createSkiniSaNovcanika() {
        return new SkiniSaNovcanika();
    }

    /**
     * Create an instance of {@link SkiniSaNovcanikaResponse }
     * 
     */
    public SkiniSaNovcanikaResponse createSkiniSaNovcanikaResponse() {
        return new SkiniSaNovcanikaResponse();
    }

    /**
     * Create an instance of {@link DodajNaNavcanik }
     * 
     */
    public DodajNaNavcanik createDodajNaNavcanik() {
        return new DodajNaNavcanik();
    }

    /**
     * Create an instance of {@link DodajNaNavcanikResponse }
     * 
     */
    public DodajNaNavcanikResponse createDodajNaNavcanikResponse() {
        return new DodajNaNavcanikResponse();
    }

}
