package com.casalenca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.VentaMenus;
import com.casalenca.entity.Ventas;

@Repository("ventaMenusRepository")
public interface VentaMenusRepository extends JpaRepository<VentaMenus, Integer> {
	
	public VentaMenus findVentaMenusById(int id);
	
	public List<VentaMenus> findVentaMenusByVenta(Ventas v);

}
