package com.casalenca.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.casalenca.entity.CompraProductos;
import com.casalenca.model.CompraProductosModel;

@Component("compraProductosConvert")
public class CompraProductosConvert {

	@Autowired
	private ComprasConvert c;

	@Autowired
	private ProductosConvert p;

	public CompraProductos ModelToEntity(CompraProductosModel cpm) {
		CompraProductos cp = new CompraProductos();
		cp.setIdCompraProducto(cpm.getIdCompraProducto());
		cp.setCompras(c.ModelToEntity(cpm.getCompras()));
		cp.setProductos(p.ModelToEntity(cpm.getProductos()));
		cp.setCantidad(cpm.getCantidad());

		return cp;
	}

	public CompraProductosModel EntityToModel(CompraProductos cpm) {
		CompraProductosModel cp = new CompraProductosModel();
		cp.setIdCompraProducto(cpm.getIdCompraProducto());
		cp.setCompras(c.EntityToModel(cpm.getCompras()));
		cp.setProductos(p.EntityToModel(cpm.getProductos()));
		cp.setCantidad(cpm.getCantidad());

		return cp;
	}

}
