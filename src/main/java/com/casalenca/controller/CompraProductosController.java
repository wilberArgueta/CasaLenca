package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.CompraProductosModel;
import com.casalenca.model.ComprasModel;
import com.casalenca.model.Message;
import com.casalenca.service.CompraProductosService;

@RestController
public class CompraProductosController {

	@Autowired
	@Qualifier("compraProductosService")
	private CompraProductosService cps;

	@RequestMapping(path = "/api/compraProducto", method = RequestMethod.POST)
	public Message nuevo(@RequestBody CompraProductosModel cp) {

		return cps.addCompraProducto(cp);
	}

	@RequestMapping(path = "/api/compraProducto", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody CompraProductosModel cp) {

		return cps.updateCompraProducto(cp);
	}

	@RequestMapping(path = "/api/compraProducto", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody CompraProductosModel cp) {

		return cps.deleteCompraProducto(cp);
	}

	@RequestMapping(path = "/api/compraProducto", method = RequestMethod.GET)
	public List<CompraProductosModel> lista() {

		return cps.listaCompraProductos();
	}

	@RequestMapping(path = "/api/compraProducto/{id}", method = RequestMethod.GET)
	public CompraProductosModel byId(@RequestParam int id) {

		return cps.findCompraProductosById(id);
	}

	@RequestMapping(path = "/api/compraProducto/compras", method = RequestMethod.GET)
	public List<CompraProductosModel> byCompra(@RequestBody ComprasModel c) {

		return cps.listaByCompra(c);
	}

}
