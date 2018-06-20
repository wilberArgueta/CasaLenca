package com.casalenca.convert;

import com.casalenca.entity.Existencias;
import com.casalenca.model.ExistenciasModel;

public class ConvertExistencia {

	public ExistenciasModel EntityToModel(Existencias e) {

		ExistenciasModel em = new ExistenciasModel();
		em.setIdExistencias(e.getIdExistencias());
		em.setCantidad(e.getCantidad());
		em.setCodProducto(e.getCodProducto());

		return em;
	}

	public Existencias ModelToEntity(ExistenciasModel e) {

		Existencias em = new Existencias();
		em.setIdExistencias(e.getIdExistencias());
		em.setCantidad(e.getCantidad());
		em.setCodProducto(e.getCodProducto());

		return em;
	}
}
