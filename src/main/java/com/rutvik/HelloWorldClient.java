package com.rutvik;

import java.net.*;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
public class HelloWorldClient{
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:7779/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above  
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://rutvik.com/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println(hello.getHelloWorldAsString("rutvik rpc"));
    }
}