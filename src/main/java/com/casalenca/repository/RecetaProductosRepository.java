package com.casalenca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.casalenca.entity.RecetaProductos;
import com.casalenca.entity.Recetas;

@Repository("recetaProductosRepository")
public interface RecetaProductosRepository extends JpaRepository<RecetaProductos, Integer> {
	public RecetaProductos findRecetaProductosById(int id);
	public List<RecetaProductos> findRecetaProductosByReceta(Recetas r);
}
