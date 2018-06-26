package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.VentasModel;
import com.casalenca.model.Message;
import com.casalenca.service.VentasService;

@RestController
public class VentasController {

	@Autowired
	@Qualifier("ventasService")
	private VentasService cps;

	@RequestMapping(path = "/api/ventas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody VentasModel cp) {

		return cps.addVentas(cp);
	}

	@RequestMapping(path = "/api/ventas", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody VentasModel cp) {

		return cps.updateVentas(cp);
	}

	@RequestMapping(path = "/api/ventas", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody VentasModel cp) {

		return cps.deleteVentas(cp);
	}

	@RequestMapping(path = "/api/ventas", method = RequestMethod.GET)
	public List<VentasModel> lista() {

		return cps.listaVentas();
	}

	@RequestMapping(path = "/api/ventas/{id}", method = RequestMethod.GET)
	public VentasModel byId(@RequestParam int id) {

		return cps.findVentasById(id);
	}

}
