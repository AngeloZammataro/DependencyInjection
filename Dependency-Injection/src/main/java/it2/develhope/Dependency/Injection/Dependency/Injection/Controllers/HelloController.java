package it2.develhope.Dependency.Injection.Dependency.Injection.Controllers;

import it2.develhope.Dependency.Injection.Dependency.Injection.Services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//il controller viene gestito da SpringBoot
@RestController //è un componente
public class HelloController {


    //Si usa per instanziare la classe.
    //La classe chiamata dovrà avere l'annotazione
    //@Service o @RestController o @Component
    @Autowired
    private HelloService helloServices;

    @GetMapping
    public String get(){
        return helloServices.getHello();
    }

    @GetMapping("/pippo")
    public String getPippo(){
        return "Ciao io sono Pippo";
    }
}
