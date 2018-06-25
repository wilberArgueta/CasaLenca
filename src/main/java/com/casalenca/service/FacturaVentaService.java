package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.casalenca.convert.FacturaVentaConvert;
import com.casalenca.convert.FacturasConvert;
import com.casalenca.model.FacturaVentaModel;
import com.casalenca.model.FacturasModel;
import com.casalenca.model.Message;
import com.casalenca.repository.FacturaVentaRepository;

@Service("facturaVentaService")
public class FacturaVentaService {

	@Autowired
	@Qualifier("facturaVentaRepository")
	private FacturaVentaRepository evr;

	@Autowired
	@Qualifier("facturaVentaConvert")
	private FacturaVentaConvert evc;

	@Autowired
	@Qualifier("facturasConvert")
	private FacturasConvert fc;

	private Message m;

	public Message addFacturaVenta(FacturaVentaModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("FacturaVenta Agregado Correctamente..");
		return m;
	}

	public Message deleteFacturaVenta(FacturaVentaModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("FacturaVenta Eliminado Correctamente..");
		return m;
	}

	public Message updateFacturaVenta(FacturaVentaModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("FacturaVenta Update Correctamente..");
		return m;
	}

	public List<FacturaVentaModel> listaFacturaVenta() {

		List<FacturaVentaModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public FacturaVentaModel findFacturaVentaById(int id) {

		return evc.EntityToModel(evr.findFacturaVentaById(id));
	}

	public FacturaVentaModel findFacturaVentaByFactura(FacturasModel fm) {

		return evc.EntityToModel(evr.findFacturaVentaByFactura(fc.ModelToEntity(fm)));
	}

}
