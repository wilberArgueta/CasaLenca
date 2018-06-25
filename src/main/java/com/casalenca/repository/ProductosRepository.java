package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.Productos;

@Repository("productosRepository")
public interface ProductosRepository extends JpaRepository<Productos, Character> {
	
	public Productos findProductosByCod(char[] cod);

}
