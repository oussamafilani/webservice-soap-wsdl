package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {

    public static void main (String[] args) {
        String url = "http://localhost:6054/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web Service déployé sur " + url);
    }
}
