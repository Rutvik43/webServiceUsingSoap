package com.rutvik;
import jakarta.xml.ws.Endpoint;
//Endpoint publisher
public class HelloWorldPublisher{
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7279/ws/hello", new HelloWorldImpl());
    }
}