package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.VentaMenusModel;
import com.casalenca.model.VentasModel;
import com.casalenca.model.Message;
import com.casalenca.service.VentaMenusService;

@RestController
public class VentaMenusController {

	@Autowired
	@Qualifier("ventaMenusService")
	private VentaMenusService cps;

	@RequestMapping(path = "/api/ventaMenus", method = RequestMethod.POST)
	public Message nuevo(@RequestBody VentaMenusModel cp) {

		return cps.addVentaMenus(cp);
	}

	@RequestMapping(path = "/api/ventaMenus", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody VentaMenusModel cp) {

		return cps.updateVentaMenus(cp);
	}

	@RequestMapping(path = "/api/ventaMenus", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody VentaMenusModel cp) {

		return cps.deleteVentaMenus(cp);
	}

	@RequestMapping(path = "/api/ventaMenus", method = RequestMethod.GET)
	public List<VentaMenusModel> lista() {

		return cps.listaVentaMenus();
	}

	@RequestMapping(path = "/api/ventaMenus/{id}", method = RequestMethod.GET)
	public VentaMenusModel byId(@RequestParam int id) {

		return cps.findVentaMenusById(id);
	}

	@RequestMapping(path = "/api/ventaMenus/venta", method = RequestMethod.GET)
	public List<VentaMenusModel> byVenta(@RequestBody VentasModel vm) {

		return cps.findVentaMenusByReceta(vm);
	}

}
