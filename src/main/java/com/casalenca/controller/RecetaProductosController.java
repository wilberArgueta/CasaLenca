package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.RecetaProductosModel;
import com.casalenca.model.RecetasModel;
import com.casalenca.model.Message;
import com.casalenca.service.RecetaProductosService;

@RestController
public class RecetaProductosController {

	@Autowired
	@Qualifier("recetaProductosService")
	private RecetaProductosService cps;

	@RequestMapping(path = "/api/recetaProductos", method = RequestMethod.POST)
	public Message nuevo(@RequestBody RecetaProductosModel cp) {

		return cps.addRecetaProductos(cp);
	}

	@RequestMapping(path = "/api/recetaProductos", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody RecetaProductosModel cp) {

		return cps.updateRecetaProductos(cp);
	}

	@RequestMapping(path = "/api/recetaProductos", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody RecetaProductosModel cp) {

		return cps.deleteRecetaProductos(cp);
	}

	@RequestMapping(path = "/api/recetaProductos", method = RequestMethod.GET)
	public List<RecetaProductosModel> lista() {

		return cps.listaRecetaProductos();
	}

	@RequestMapping(path = "/api/recetaProductos/{id}", method = RequestMethod.GET)
	public RecetaProductosModel byId(@RequestParam int id) {

		return cps.findRecetaProductosById(id);
	}
	
	@RequestMapping(path = "/api/recetaProductos/receta", method = RequestMethod.GET)
	public List<RecetaProductosModel> byReceta(@RequestBody RecetasModel rm) {

		return cps.findRecetaProductosByReceta(rm);
	}

}
