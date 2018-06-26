package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.ExistenciasModel;
import com.casalenca.model.Message;
import com.casalenca.model.ProductosModel;
import com.casalenca.service.ExistenciasService;

@RestController
public class ExistenciasController {

	@Autowired
	@Qualifier("existenciasService")
	private ExistenciasService cps;

	@RequestMapping(path = "/api/existencias", method = RequestMethod.POST)
	public Message nuevo(@RequestBody ExistenciasModel cp) {

		return cps.addExistencias(cp);
	}

	@RequestMapping(path = "/api/existencias", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody ExistenciasModel cp) {

		return cps.updateExistencias(cp);
	}

	@RequestMapping(path = "/api/existencias", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody ExistenciasModel cp) {

		return cps.deleteExistencias(cp);
	}

	@RequestMapping(path = "/api/existencias", method = RequestMethod.GET)
	public List<ExistenciasModel> lista() {

		return cps.listaExistencias();
	}

	@RequestMapping(path = "/api/existencias/{cod}", method = RequestMethod.GET)
	public ExistenciasModel byId(@RequestParam int id) {

		return cps.findExistenciasById(id);
	}

	@RequestMapping(path = "/api/existencias/producto", method = RequestMethod.GET)
	public ExistenciasModel byProducto(@RequestBody ProductosModel p) {

		return cps.findExistenciasByProducto(p);
	}
}
