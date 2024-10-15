package com.tecsup.SpringBoot.ejercicio01.Controller;

import com.tecsup.SpringBoot.ejercicio01.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class GreetingController {

    //primera forma de iyeccion de dependencia

    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingService1;

    @Autowired
    @Qualifier("greetingServiceImpl2")
    private GreetingService greetingService2;



    @GetMapping("/gt1")
    public String primetaInterfas(){
        return greetingService1.primetaInterfas();
    }

    @GetMapping("/gt2")
    public String primeraInterfas2(){
        return greetingService2.primetaInterfas();
    }


}
