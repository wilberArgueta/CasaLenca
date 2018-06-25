package com.casalenca.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.casalenca.entity.Compras;
import com.casalenca.model.ComprasModel;

@Component("comprasConvert")
public class ComprasConvert {

	@Autowired
	private ProveedoresConvert pc;

	public Compras ModelToEntity(ComprasModel cm) {
		Compras c = new Compras();
		c.setIdCompra(cm.getIdCompra());
		c.setRegistroCompra(cm.getRegistroCompra());
		c.setProveedor(pc.ModelToEntity(cm.getProveedor()));
		c.setFechaCompra(cm.getFechaCompra());
		c.setDetalle(cm.getDetalle());

		return c;
	}

	public ComprasModel EntityToModel(Compras cm) {
		ComprasModel c = new ComprasModel();
		c.setIdCompra(cm.getIdCompra());
		c.setRegistroCompra(cm.getRegistroCompra());
		c.setProveedor(pc.EntityToModel(cm.getProveedor()));
		c.setFechaCompra(cm.getFechaCompra());
		c.setDetalle(cm.getDetalle());

		return c;
	}

}
