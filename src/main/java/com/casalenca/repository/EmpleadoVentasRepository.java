package com.casalenca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.EmpleadoVentas;
import com.casalenca.entity.Empleados;

@Repository("empleadoVentasRepository")
public interface EmpleadoVentasRepository extends JpaRepository<EmpleadoVentas, Integer> {

		public EmpleadoVentas findEmpleadoVentasById(int id);
		public List<EmpleadoVentas> findByEmpleado(Empleados e);
}
