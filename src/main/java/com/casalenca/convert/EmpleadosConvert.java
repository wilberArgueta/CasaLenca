package com.casalenca.convert;

import org.springframework.stereotype.Component;

import com.casalenca.entity.Empleados;
import com.casalenca.model.EmpleadosModel;

@Component("empleadosConvert")
public class EmpleadosConvert {

	public Empleados ModelToEntity(EmpleadosModel em) {
		Empleados e = new Empleados();

		e.setCodEmpleado(em.getCodEmpleado());
		e.setNombre(em.getNombre());
		e.setApellido(em.getApellido());
		e.setDui(em.getDui());
		e.setFechaNacimiento(em.getFechaNacimiento());
		e.setDireccion(em.getDireccion());
		e.setTelefono(em.getTelefono());
		e.setActivo(em.isActivo());
		e.setCreado(em.getCreado());
		e.setActualizado(em.getActualizado());
		e.setEliminado(em.getEliminado());

		return e;

	}

	public EmpleadosModel EntityToModel(Empleados em) {
		EmpleadosModel e = new EmpleadosModel();

		e.setCodEmpleado(em.getCodEmpleado());
		e.setNombre(em.getNombre());
		e.setApellido(em.getApellido());
		e.setDui(em.getDui());
		e.setFechaNacimiento(em.getFechaNacimiento());
		e.setDireccion(em.getDireccion());
		e.setTelefono(em.getTelefono());
		e.setActivo(em.isActivo());
		e.setCreado(em.getCreado());
		e.setActualizado(em.getActualizado());
		e.setEliminado(em.getEliminado());

		return e;

	}

}
