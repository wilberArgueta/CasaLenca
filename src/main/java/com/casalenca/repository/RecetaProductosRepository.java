package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.casalenca.entity.RecetaProductos;
import com.casalenca.entity.Recetas;

@Repository("recetaProductosRepository")
public interface RecetaProductosRepository extends JpaRepository<RecetaProductos, Integer> {
	public RecetaProductos findRecetaProductosById(int id);
	public RecetaProductos findRecetaProductosByReceta(Recetas r);
}
