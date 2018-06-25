package com.casalenca.convert;

import org.springframework.stereotype.Component;

import com.casalenca.entity.Productos;
import com.casalenca.model.ProductosModel;

@Component("productosConvert")
public class ProductosConvert {

	public Productos ModelToEntity(ProductosModel pm) {
		Productos p = new Productos();

		p.setCodProducto(pm.getCodProducto());
		p.setNombre(pm.getNombre());
		p.setMedida(pm.getMedida());
		p.setActivo(pm.isActivo());
		p.setCreado(pm.getCreado());
		p.setActualizado(pm.getActualizado());
		p.setEliminado(pm.getEliminado());
		return p;
	}

	public ProductosModel EntityToModel(Productos pm) {
		ProductosModel p = new ProductosModel();

		p.setCodProducto(pm.getCodProducto());
		p.setNombre(pm.getNombre());
		p.setMedida(pm.getMedida());
		p.setActivo(pm.isActivo());
		p.setCreado(pm.getCreado());
		p.setActualizado(pm.getActualizado());
		p.setEliminado(pm.getEliminado());
		return p;
	}

}
