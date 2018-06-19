package com.casalenca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.Menus;

@Repository("menuRepository")
public interface MenuRepository extends CrudRepository<Menus, Long> {

}
