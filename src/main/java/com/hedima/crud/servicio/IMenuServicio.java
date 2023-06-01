package com.hedima.crud.servicio;

import com.hedima.crud.modelo.Menu;

import java.util.List;

public interface IMenuServicio {
    Menu crear(Menu menu);
    Menu modificar(Menu menu);
    void eliminar(Integer menuId);

    Menu consultarUno(Integer menuId);
    List<Menu> consultarTodos();

}
