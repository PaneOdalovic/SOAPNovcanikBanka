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
 * 2018-06-13T20:24:57.464+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "banka", 
                  wsdlLocation = "file:/file:/D:/4.Fax/letnji semestar/ProjekatDistribuirane/SOAPNovcanikBanka/BankaService/spec/banka.wsdl",
                  targetNamespace = "http://www.example.org/banka/") 
public class Banka_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/banka/", "banka");
    public final static QName BankaSOAP = new QName("http://www.example.org/banka/", "bankaSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/file:/D:/4.Fax/letnji semestar/ProjekatDistribuirane/SOAPNovcanikBanka/BankaService/spec/banka.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Banka_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/file:/D:/4.Fax/letnji semestar/ProjekatDistribuirane/SOAPNovcanikBanka/BankaService/spec/banka.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Banka_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Banka_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Banka_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Banka_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Banka_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Banka_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Banka
     */
    @WebEndpoint(name = "bankaSOAP")
    public Banka getBankaSOAP() {
        return super.getPort(BankaSOAP, Banka.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Banka
     */
    @WebEndpoint(name = "bankaSOAP")
    public Banka getBankaSOAP(WebServiceFeature... features) {
        return super.getPort(BankaSOAP, Banka.class, features);
    }

}