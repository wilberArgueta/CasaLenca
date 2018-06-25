package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.casalenca.entity.Proveedores;

@Repository("proveedoresRepository")
public interface ProveedoresRepository extends JpaRepository<Proveedores, Character> {
	public Proveedores findProveedoresByCod(char[] cod);
}
