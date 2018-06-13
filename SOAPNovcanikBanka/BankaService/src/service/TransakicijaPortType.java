
package service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransakicijaPortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransakicijaPortType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trensakcije" type="{http://www.example.org/banka/}transakcija" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransakicijaPortType", propOrder = {
    "trensakcije"
})
public class TransakicijaPortType {

    protected List<Transakcija> trensakcije;

    /**
     * Gets the value of the trensakcije property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trensakcije property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrensakcije().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transakcija }
     * 
     * 
     */
    public List<Transakcija> getTrensakcije() {
        if (trensakcije == null) {
            trensakcije = new ArrayList<Transakcija>();
        }
        return this.trensakcije;
    }

}
