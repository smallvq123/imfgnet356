package yj.core.webservice_migo.sender;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import java.net.URL;
import java.util.logging.Logger;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 *
 * <pre>
 * SI_MIGO_Sender_SyncService service = new SI_MIGO_Sender_SyncService();
 * SIMIGOSenderSync portType = service.getHTTPPort();
 * portType.siMIGOSenderSync(...);
 * </pre>
 *
 * </p>
 *
 */
@WebServiceClient(name = "SI_MIGO_Sender_SyncService", targetNamespace = "http://www.cq-yj.com/HAP/MIGO/Sender", wsdlLocation = "resources/migo.xml")
public class SIMIGOSenderSyncService extends Service {

    public final static URL WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(SIMIGOSenderSyncService.class.getName());

    static {
        URL url = null;
        url = SIMIGOSenderSyncService.class.getClassLoader().getResource("migo.xml");
        System.out.println(url);
        WSDL_LOCATION = url;
    }

    public SIMIGOSenderSyncService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SIMIGOSenderSyncService() {
        super(WSDL_LOCATION, new QName(
                "http://www.cq-yj.com/HAP/MIGO/Sender",
                "SI_MIGO_Sender_SyncService"));
    }

    /**
     *
     * @return returns SIMIGOSenderSync
     */
    @WebEndpoint(name = "HTTP_Port")
    public SIMIGOSenderSync getHTTPPort() {
        return super.getPort(new QName("http://www.cq-yj.com/HAP/MIGO/Sender",
                "HTTP_Port"), SIMIGOSenderSync.class);
    }

    /**
     *
     * @return returns SIMIGOSenderSync
     */
    @WebEndpoint(name = "HTTPS_Port")
    public SIMIGOSenderSync getHTTPSPort() {
        return super.getPort(new QName("http://www.cq-yj.com/HAP/MIGO/Sender",
                "HTTPS_Port"), SIMIGOSenderSync.class);
    }

}

