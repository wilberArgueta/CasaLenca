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
import com.casalenca.model.EmpleadosModel;
import com.casalenca.model.Message;
import com.casalenca.service.ComprasService;

@RestController
public class ComprasController {

	@Autowired
	@Qualifier("comprasService")
	private ComprasService cps;

	@RequestMapping(path = "/api/compras", method = RequestMethod.POST)
	public Message nuevo(@RequestBody ComprasModel cp) {

		return cps.addCompra(cp);
	}

	@RequestMapping(path = "/api/compras", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody ComprasModel cp) {

		return cps.updateCompra(cp);
	}

	@RequestMapping(path = "/api/compras", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody ComprasModel cp) {

		return cps.deleteCompra(cp);
	}

	@RequestMapping(path = "/api/compras", method = RequestMethod.GET)
	public List<ComprasModel> lista() {

		return cps.listaCompras();
	}

	@RequestMapping(path = "/api/compras/{id}", method = RequestMethod.GET)
	public ComprasModel byId(@RequestParam int id) {

		return cps.findCompraById(id);
	}

	@RequestMapping(path = "/api/compras/empleado", method = RequestMethod.GET)
	public List<ComprasModel> byEmpleado(@RequestBody EmpleadosModel em) {

		return cps.listaByEmpleado(em);
	}

}
