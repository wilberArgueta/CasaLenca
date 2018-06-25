package com.casalenca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.Compras;
import com.casalenca.entity.Empleados;

@Repository("comprasRepository")
public interface ComprasRepository extends JpaRepository<Compras, Integer> {
	
	public Compras findCompraById(int id);
	public List<Compras> findComprasByEmpleado(Empleados e);

}
