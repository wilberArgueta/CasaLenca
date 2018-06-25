package com.casalenca.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.casalenca.entity.FacturaVenta;
import com.casalenca.model.FacturaVentaModel;

@Component("facturaVentaConvert")
public class FacturaVentaConvert {

	@Autowired
	private FacturasConvert fc;

	@Autowired
	private VentasConvert vc;

	public FacturaVenta ModelToEntity(FacturaVentaModel fvm) {

		FacturaVenta fv = new FacturaVenta();
		fv.setIdFacturaVenta(fvm.getIdFacturaVenta());
		fv.setFactura(fc.ModelToEntity(fvm.getFactura()));
		fv.setVenta(vc.ModelToEntity(fvm.getVenta()));

		return fv;

	}

	public FacturaVentaModel EntityToModel(FacturaVenta fvm) {

		FacturaVentaModel fv = new FacturaVentaModel();
		fv.setIdFacturaVenta(fvm.getIdFacturaVenta());
		fv.setFactura(fc.EntityToModel(fvm.getFactura()));
		fv.setVenta(vc.EntityToModel(fvm.getVenta()));

		return fv;

	}

}
