package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.FacturaVentaModel;
import com.casalenca.model.FacturasModel;
import com.casalenca.model.Message;
import com.casalenca.service.FacturaVentaService;

@RestController
public class FacturaVentaController {

	@Autowired
	@Qualifier("facturaVentaService")
	private FacturaVentaService cps;

	@RequestMapping(path = "/api/facturaVenta", method = RequestMethod.POST)
	public Message nuevo(@RequestBody FacturaVentaModel cp) {

		return cps.addFacturaVenta(cp);
	}

	@RequestMapping(path = "/api/facturaVenta", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody FacturaVentaModel cp) {

		return cps.updateFacturaVenta(cp);
	}

	@RequestMapping(path = "/api/facturaVenta", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody FacturaVentaModel cp) {

		return cps.deleteFacturaVenta(cp);
	}

	@RequestMapping(path = "/api/facturaVenta", method = RequestMethod.GET)
	public List<FacturaVentaModel> lista() {

		return cps.listaFacturaVenta();
	}

	@RequestMapping(path = "/api/facturaVenta/{cod}", method = RequestMethod.GET)
	public FacturaVentaModel byId(@RequestParam int id) {

		return cps.findFacturaVentaById(id);
	}

	@RequestMapping(path = "/api/facturaVenta/factura", method = RequestMethod.GET)
	public List<FacturaVentaModel> byNum(@RequestBody FacturasModel f) {

		return cps.findFacturaVentaByFactura(f);
	}
}
