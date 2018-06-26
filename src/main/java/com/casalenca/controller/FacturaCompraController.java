package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.ComprasModel;
import com.casalenca.model.FacturaCompraModel;
import com.casalenca.model.FacturasModel;
import com.casalenca.model.Message;
import com.casalenca.service.FacturaCompraService;

@RestController
public class FacturaCompraController {

	@Autowired
	@Qualifier("facturaCompraService")
	private FacturaCompraService cps;

	@RequestMapping(path = "/api/facturaCompra", method = RequestMethod.POST)
	public Message nuevo(@RequestBody FacturaCompraModel cp) {

		return cps.addFacturaCompra(cp);
	}

	@RequestMapping(path = "/api/facturaCompra", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody FacturaCompraModel cp) {

		return cps.updateFacturaCompra(cp);
	}

	@RequestMapping(path = "/api/facturaCompra", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody FacturaCompraModel cp) {

		return cps.deleteFacturaCompra(cp);
	}

	@RequestMapping(path = "/api/facturaCompra", method = RequestMethod.GET)
	public List<FacturaCompraModel> lista() {

		return cps.listaFacturaCompra();
	}

	@RequestMapping(path = "/api/facturaCompra/{cod}", method = RequestMethod.GET)
	public FacturaCompraModel byId(@RequestParam int id) {

		return cps.findFacturaCompraById(id);
	}

	@RequestMapping(path = "/api/facturaCompra/factura", method = RequestMethod.GET)
	public FacturaCompraModel byFactura(@RequestBody FacturasModel f) {

		return cps.findFacturaCompraByFactura(f);
	}

	@RequestMapping(path = "/api/facturaCompra/compra", method = RequestMethod.GET)
	public FacturaCompraModel byCompra(@RequestBody ComprasModel c) {

		return cps.findFacturaCompraByCompra(c);
	}
}
