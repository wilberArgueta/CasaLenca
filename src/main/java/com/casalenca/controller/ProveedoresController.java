package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.ProveedoresModel;
import com.casalenca.model.Message;
import com.casalenca.service.ProveedoresService;

@RestController
public class ProveedoresController {

	@Autowired
	@Qualifier("proveedoresService")
	private ProveedoresService cps;

	@RequestMapping(path = "/api/proveedores", method = RequestMethod.POST)
	public Message nuevo(@RequestBody ProveedoresModel cp) {

		return cps.addProveedores(cp);
	}

	@RequestMapping(path = "/api/proveedores", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody ProveedoresModel cp) {

		return cps.updateProveedores(cp);
	}

	@RequestMapping(path = "/api/proveedores", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody ProveedoresModel cp) {

		return cps.deleteProveedores(cp);
	}

	@RequestMapping(path = "/api/proveedores", method = RequestMethod.GET)
	public List<ProveedoresModel> lista() {

		return cps.listaProveedores();
	}

	@RequestMapping(path = "/api/proveedores/{cod}", method = RequestMethod.GET)
	public ProveedoresModel byId(@RequestParam String cod) {

		return cps.findProveedoresByCod(cod.toCharArray());
	}

}
