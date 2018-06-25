package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.Existencias;
import com.casalenca.entity.Productos;

@Repository("existenciasRepository")
public interface ExistenciasRepository extends JpaRepository<Existencias, Integer> {
	
	public Existencias findExistenciaById(int id);
	public Existencias findExistenciasByProducto(Productos p);

}
