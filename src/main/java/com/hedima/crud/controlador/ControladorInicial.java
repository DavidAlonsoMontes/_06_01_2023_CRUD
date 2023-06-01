package com.hedima.crud.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControladorInicial {
   @GetMapping
    public String mostrarInicio() {
        return "index";
    }
}
