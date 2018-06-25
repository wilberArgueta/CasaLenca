package com.casalenca.convert;

import org.springframework.stereotype.Component;

import com.casalenca.entity.Proveedores;
import com.casalenca.model.ProveedoresModel;

@Component("proveedoresConvert")
public class ProveedoresConvert {

	public Proveedores ModelToEntity(ProveedoresModel pm) {
		Proveedores p = new Proveedores();
		p.setCodProveedor(pm.getCodProveedor());
		p.setRazonSocial(pm.getRazonSocial());
		p.setNit(pm.getNit());
		p.setTelefono(pm.getTelefono());
		p.setActivo(pm.isActivo());
		p.setCreado(pm.getCreado());
		p.setActualizado(pm.getActualizado());
		p.setEliminado(pm.getEliminado());

		return p;
	}

	public ProveedoresModel EntityToModel(Proveedores pm) {
		ProveedoresModel p = new ProveedoresModel();
		p.setCodProveedor(pm.getCodProveedor());
		p.setRazonSocial(pm.getRazonSocial());
		p.setNit(pm.getNit());
		p.setTelefono(pm.getTelefono());
		p.setActivo(pm.isActivo());
		p.setCreado(pm.getCreado());
		p.setActualizado(pm.getActualizado());
		p.setEliminado(pm.getEliminado());

		return p;
	}

}
