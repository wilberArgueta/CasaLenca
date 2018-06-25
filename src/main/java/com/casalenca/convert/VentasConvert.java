package com.casalenca.convert;

import org.springframework.stereotype.Component;

import com.casalenca.entity.Ventas;
import com.casalenca.model.VentasModel;

@Component("ventasConvert")
public class VentasConvert {

	public Ventas ModelToEntity(VentasModel vm) {
		Ventas v = new Ventas();

		v.setIdVenta(vm.getIdVenta());
		v.setNumRegistro(vm.getNumRegistro());
		v.setFecha(vm.getFecha());
		v.setDetalle(vm.getDetalle());

		return v;
	}

	public VentasModel EntityToModel(Ventas vm) {
		VentasModel v = new VentasModel();

		v.setIdVenta(vm.getIdVenta());
		v.setNumRegistro(vm.getNumRegistro());
		v.setFecha(vm.getFecha());
		v.setDetalle(vm.getDetalle());

		return v;
	}
}
