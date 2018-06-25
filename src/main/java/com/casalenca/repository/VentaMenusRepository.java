package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.VentaMenus;

@Repository("ventaMenusRepository")
public interface VentaMenusRepository extends JpaRepository<VentaMenus, Integer> {

}
