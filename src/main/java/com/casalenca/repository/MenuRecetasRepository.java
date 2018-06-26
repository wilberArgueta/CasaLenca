package com.casalenca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.MenuRecetas;
import com.casalenca.entity.Menus;

@Repository("menuRecetasRepository")
public interface MenuRecetasRepository extends JpaRepository<MenuRecetas, Integer> {

	public MenuRecetas findMenuRecetaById(int id);

	public List<MenuRecetas> findMenuRecetaByMenu(Menus m);

}
