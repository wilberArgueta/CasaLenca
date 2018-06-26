package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.EmpleadoVentasModel;
import com.casalenca.model.EmpleadosModel;
import com.casalenca.model.Message;
import com.casalenca.service.EmpleadoVentasService;

@RestController
public class EmpleadoVentasController {

	@Autowired
	@Qualifier("empleadoVentasService")
	private EmpleadoVentasService cps;

	@RequestMapping(path = "/api/empleadoVentas", method = RequestMethod.POST)
	public Message nuevo(@RequestBody EmpleadoVentasModel cp) {

		return cps.addEmpleadoVentas(cp);
	}

	@RequestMapping(path = "/api/empleadoVentas", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody EmpleadoVentasModel cp) {

		return cps.updateEmpleadoVentas(cp);
	}

	@RequestMapping(path = "/api/empleadoVentas", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody EmpleadoVentasModel cp) {

		return cps.deleteEmpleadoVentas(cp);
	}

	@RequestMapping(path = "/api/empleadoVentas", method = RequestMethod.GET)
	public List<EmpleadoVentasModel> lista() {

		return cps.listaEmpleadoVentas();
	}

	@RequestMapping(path = "/api/empleadoVentas/{cod}", method = RequestMethod.GET)
	public EmpleadoVentasModel byId(@RequestParam int id) {

		return cps.findEmpleadoVentasById(id);
	}
	@RequestMapping(path = "/api/empleadoVentas/empleado", method = RequestMethod.GET)
	public List<EmpleadoVentasModel> byEmpleado(@RequestBody EmpleadosModel e) {

		return cps.listaEmpleadoVentasByEmpleado(e);
	}

}
