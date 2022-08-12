package com.rutvik;
import jakarta.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.rutvik.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World " + name;
    }
}