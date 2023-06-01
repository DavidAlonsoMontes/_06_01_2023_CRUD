package com.hedima.crud.controlador;

import com.hedima.crud.modelo.Menu;
import com.hedima.crud.servicio.IMenuServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menus")
public class ControladorMenu {
    @Autowired
    private IMenuServicio servicio;
    @GetMapping
    public String mostrarTodos(Model modelo) {
        List<Menu> menus = servicio.consultarTodos();
        modelo.addAttribute("menus",menus);
        return "mostrar";

    }
}
