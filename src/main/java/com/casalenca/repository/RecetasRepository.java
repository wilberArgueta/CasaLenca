package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.casalenca.entity.Recetas;

@Repository("recetasRepository")
public interface RecetasRepository extends JpaRepository<Recetas, Integer> {
	
	public Recetas findRecetaById(int id);

}
