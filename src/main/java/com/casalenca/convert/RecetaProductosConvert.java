package com.casalenca.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.casalenca.entity.RecetaProductos;
import com.casalenca.model.RecetaProductosModel;

@Component("recetaProductosConvert")
public class RecetaProductosConvert {

	@Autowired
	private ProductosConvert pc;

	@Autowired
	private RecetasConvert rc;

	public RecetaProductos ModelToEntity(RecetaProductosModel rpm) {
		RecetaProductos rp = new RecetaProductos();

		rp.setIdRecetaProducto(rpm.getIdRecetaProducto());
		rp.setProducto(pc.ModelToEntity(rpm.getProducto()));
		rp.setReceta(rc.ModelToEntity(rpm.getReceta()));
		rp.setCantidad(rpm.getCantidad());

		return rp;
	}

	public RecetaProductosModel EntityToModel(RecetaProductos rpm) {
		RecetaProductosModel rp = new RecetaProductosModel();

		rp.setIdRecetaProducto(rpm.getIdRecetaProducto());
		rp.setProducto(pc.EntityToModel(rpm.getProducto()));
		rp.setReceta(rc.EntityToModel(rpm.getReceta()));
		rp.setCantidad(rpm.getCantidad());

		return rp;
	}
}
