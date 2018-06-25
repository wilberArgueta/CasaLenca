package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.Menus;

@Repository("menusRepository")
public interface MenusRepository extends JpaRepository<Menus, Integer> {

	public Menus findMenusById(int id);

}
