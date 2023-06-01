package com.hedima.crud.servicio;

import com.hedima.crud.modelo.Menu;
import com.hedima.crud.repositorio.IMenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServicio implements IMenuServicio{

    @Autowired
    private IMenuRepo repo;
    @Override
    public Menu crear(Menu menu) {
        return repo.save(menu);
    }

    @Override
    public Menu modificar(Menu menu) {
        return repo.save(menu);
    }

    @Override
    public void eliminar(Integer menuId) {
       repo.deleteById(menuId);
    }

    @Override
    public Menu consultarUno(Integer menuId) {
//        Optional<Menu> oMenuBBDD = repo.findById(menuId);
//        Menu menuBBDD;
//        if(oMenuBBDD.isPresent()){
//            menuBBDD = oMenuBBDD.get();
//        }else{
//            menuBBDD = new Menu();
//        }
        return repo.findById(menuId).orElse(new Menu());
    }

    @Override
    public List<Menu> consultarTodos() {
        return repo.findAll();
    }
}
