
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transakcija complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transakcija"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datuma" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="iznos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ulaz" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transakcija", propOrder = {
    "datuma",
    "iznos",
    "ulaz"
})
public class Transakcija {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datuma;
    protected double iznos;
    protected boolean ulaz;

    /**
     * Gets the value of the datuma property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatuma() {
        return datuma;
    }

    /**
     * Sets the value of the datuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatuma(XMLGregorianCalendar value) {
        this.datuma = value;
    }

    /**
     * Gets the value of the iznos property.
     * 
     */
    public double getIznos() {
        return iznos;
    }

    /**
     * Sets the value of the iznos property.
     * 
     */
    public void setIznos(double value) {
        this.iznos = value;
    }

    /**
     * Gets the value of the ulaz property.
     * 
     */
    public boolean isUlaz() {
        return ulaz;
    }

    /**
     * Sets the value of the ulaz property.
     * 
     */
    public void setUlaz(boolean value) {
        this.ulaz = value;
    }

}
