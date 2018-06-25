package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.Empleados;

@Repository("empleadosRepository")
public interface EmpleadosRepository extends JpaRepository<Empleados, Character> {

	public Empleados findEmpleadoByCodEmpleado(char[] cod);

}
