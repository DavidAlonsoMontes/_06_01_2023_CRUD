package com.hedima.crud.repositorio;

import com.hedima.crud.modelo.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMenuRepo extends JpaRepository<Menu,Integer> {
}
