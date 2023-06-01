package com.hedima.crud.controlador;

import com.hedima.crud.modelo.Menu;
import com.hedima.crud.servicio.IMenuServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    @GetMapping("/formulario")
    public String mostrarFormulario(Model modelo) {
        Menu menu = new Menu();
        modelo.addAttribute("menu",menu);
        return "formulario";
    }

    @PostMapping("/alta")
    public String guardarMenu(Menu m, RedirectAttributes ra) {
        Menu m1 = servicio.crear(m);
        System.out.println(m1.toString());
        return "redirect:/menus";
    }
}
