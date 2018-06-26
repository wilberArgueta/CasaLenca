package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.FacturasModel;
import com.casalenca.model.Message;
import com.casalenca.service.FacturasService;

@RestController
public class FacturasController {

	@Autowired
	@Qualifier("facturasService")
	private FacturasService cps;

	@RequestMapping(path = "/api/facturas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody FacturasModel cp) {

		return cps.addFacturas(cp);
	}

	@RequestMapping(path = "/api/facturas", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody FacturasModel cp) {

		return cps.updateFacturas(cp);
	}

	@RequestMapping(path = "/api/facturas", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody FacturasModel cp) {

		return cps.deleteFacturas(cp);
	}

	@RequestMapping(path = "/api/facturas", method = RequestMethod.GET)
	public List<FacturasModel> lista() {

		return cps.listaFacturas();
	}

	@RequestMapping(path = "/api/facturas/{cod}", method = RequestMethod.GET)
	public FacturasModel byId(@RequestParam int id) {

		return cps.findFacturasById(id);
	}

	@RequestMapping(path = "/api/facturas/{num}", method = RequestMethod.GET)
	public FacturasModel byNum(@RequestParam String num) {

		return cps.findFacturaByNumFactura(num.toCharArray());
	}
}
