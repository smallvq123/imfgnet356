package yj.core.webservice.sender;

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
 * SI_PP001_Sender_SyncService service = new SI_PP001_Sender_SyncService();
 * SIPP001SenderSync portType = service.getHTTPPort();
 * portType.siPP001SenderSync(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "SI_PP001_Sender_SyncService", targetNamespace = "http://www.cq-yj.com/HAP/PP001/Sender", wsdlLocation = "resources/wsdl.xml")
public class SIPP001SenderSyncService extends Service {

	public final static URL WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(SIPP001SenderSyncService.class.getName());

	static {
		URL url = null;
		url = SIPP001SenderSyncService.class.getClassLoader().getResource("wsdl.xml");
		System.out.println(url);
		WSDL_LOCATION = url;
	}

	public SIPP001SenderSyncService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public SIPP001SenderSyncService() {
		super(WSDL_LOCATION, new QName(
				"http://www.cq-yj.com/HAP/PP001/Sender",
				"SI_PP001_Sender_SyncService"));
	}

	/**
	 * 
	 * @return returns SIPP001SenderSync
	 */
	@WebEndpoint(name = "HTTP_Port")
	public SIPP001SenderSync getHTTPPort() {
		return super.getPort(new QName("http://www.cq-yj.com/HAP/PP001/Sender",
				"HTTP_Port"), SIPP001SenderSync.class);
	}

	/**
	 * 
	 * @return returns SIPP001SenderSync
	 */
	@WebEndpoint(name = "HTTPS_Port")
	public SIPP001SenderSync getHTTPSPort() {
		return super.getPort(new QName("http://www.cq-yj.com/HAP/PP001/Sender",
				"HTTPS_Port"), SIPP001SenderSync.class);
	}

}
