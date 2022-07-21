package it2.develhope.Dependency.Injection.Dependency.Injection.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloService { //HelloService viene gestito dal controller HelloController annotandolo con Autowired

    @Value("${spring.helloMessage}") //per iniettare dal file YAML o .properties
    private String helloMessage;

    //la stringa helloMessage viene iniettata nel metodo getHello
    //recuperiamo la stringa helloMessage da application.properties
    public String getHello(){
        return helloMessage;
    }

    //inietta AnotherService dentro HelloService
    HelloService(AnotherHelloService numberOfHello) {

    }
}
