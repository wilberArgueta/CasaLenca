package com.casalenca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.CompraProductos;
import com.casalenca.entity.Compras;

@Repository("compraProductosRepository")
public interface CompraProductosRepository extends JpaRepository<CompraProductos,Integer>{
	
	public CompraProductos findCompraById(int id);
	public List<CompraProductos> findByCompras(Compras c);
}
