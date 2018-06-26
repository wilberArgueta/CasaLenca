package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.EmpleadosModel;
import com.casalenca.model.Message;
import com.casalenca.service.EmpleadosService;

@RestController
public class EmpleadosController {

	@Autowired
	@Qualifier("empleadosService")
	private EmpleadosService cps;

	@RequestMapping(path = "/api/empleados", method = RequestMethod.POST)
	public Message nuevo(@RequestBody EmpleadosModel cp) {

		return cps.addEmpleado(cp);
	}

	@RequestMapping(path = "/api/empleados", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody EmpleadosModel cp) {

		return cps.updateEmpleado(cp);
	}

	@RequestMapping(path = "/api/empleados", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody EmpleadosModel cp) {

		return cps.deleteEmpleado(cp);
	}

	@RequestMapping(path = "/api/empleados", method = RequestMethod.GET)
	public List<EmpleadosModel> lista() {

		return cps.listaEmpleados();
	}

	@RequestMapping(path = "/api/empleados/{cod}", method = RequestMethod.GET)
	public EmpleadosModel byId(@RequestParam String cod) {

		return cps.findEmpleadoByCod(cod.toCharArray());
	}

}
