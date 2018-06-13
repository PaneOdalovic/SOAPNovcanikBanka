package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2018-06-13T20:31:52.690+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "novcanik", 
                  wsdlLocation = "file:/file:/D:/4.Fax/letnji semestar/ProjekatDistribuirane/SOAPNovcanikBanka/NovcanikService/spec/novcanik.wsdl",
                  targetNamespace = "http://www.example.org/novcanik/") 
public class Novcanik_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/novcanik/", "novcanik");
    public final static QName NovcanikSOAP = new QName("http://www.example.org/novcanik/", "novcanikSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/file:/D:/4.Fax/letnji semestar/ProjekatDistribuirane/SOAPNovcanikBanka/NovcanikService/spec/novcanik.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Novcanik_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/file:/D:/4.Fax/letnji semestar/ProjekatDistribuirane/SOAPNovcanikBanka/NovcanikService/spec/novcanik.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Novcanik_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Novcanik_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Novcanik_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Novcanik_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Novcanik_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Novcanik_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Novcanik
     */
    @WebEndpoint(name = "novcanikSOAP")
    public Novcanik getNovcanikSOAP() {
        return super.getPort(NovcanikSOAP, Novcanik.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Novcanik
     */
    @WebEndpoint(name = "novcanikSOAP")
    public Novcanik getNovcanikSOAP(WebServiceFeature... features) {
        return super.getPort(NovcanikSOAP, Novcanik.class, features);
    }

}
