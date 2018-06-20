package com.casalenca.convert;

import com.casalenca.entity.Compras;
import com.casalenca.model.ComprasModel;

public class ConvertCompra {

	public Compras ModelToEntity(ComprasModel cm) {
		Compras c = new Compras();
		c.setIdCompra(cm.getIdCompra());
		c.setRegistroCompra(cm.getRegistroCompra());
		c.setFechaCompra(cm.getFechaCompra());
		c.setDetalle(cm.getDetalle());

		return c;

	}

	public ComprasModel EntityToModel(Compras cm) {
		ComprasModel c = new ComprasModel();
		c.setIdCompra(cm.getIdCompra());
		c.setRegistroCompra(cm.getRegistroCompra());
		c.setFechaCompra(cm.getFechaCompra());
		c.setDetalle(cm.getDetalle());

		return c;

	}

}
