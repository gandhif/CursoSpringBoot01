package com.tecsup.SpringBoot.ejercicio01.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingService{
    @Override
    public String primetaInterfas() {
        return " Primer Servicios...";
    }
}
