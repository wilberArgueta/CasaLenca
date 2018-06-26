package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.RecetasModel;
import com.casalenca.model.Message;
import com.casalenca.service.RecetasService;

@RestController
public class RecetasController {

	@Autowired
	@Qualifier("recetasService")
	private RecetasService cps;

	@RequestMapping(path = "/api/recetas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody RecetasModel cp) {

		return cps.addRecetas(cp);
	}

	@RequestMapping(path = "/api/recetas", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody RecetasModel cp) {

		return cps.updateRecetas(cp);
	}

	@RequestMapping(path = "/api/recetas", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody RecetasModel cp) {

		return cps.deleteRecetas(cp);
	}

	@RequestMapping(path = "/api/recetas", method = RequestMethod.GET)
	public List<RecetasModel> lista() {

		return cps.listaRecetas();
	}

	@RequestMapping(path = "/api/recetas/{id}", method = RequestMethod.GET)
	public RecetasModel byId(@RequestParam int id) {

		return cps.findRecetasById(id);
	}

}
