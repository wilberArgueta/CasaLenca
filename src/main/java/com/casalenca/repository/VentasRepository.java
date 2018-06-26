package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.casalenca.entity.Ventas;

@Repository("ventasRepository")
public interface VentasRepository extends JpaRepository<Ventas, Integer> {

	public Ventas findVentasById(int id);

}
