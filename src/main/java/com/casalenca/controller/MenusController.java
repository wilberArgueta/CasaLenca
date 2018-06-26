package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.MenusModel;
import com.casalenca.model.Message;
import com.casalenca.service.MenusService;

@RestController
public class MenusController {

	@Autowired
	@Qualifier("menusService")
	private MenusService cps;

	@RequestMapping(path = "/api/menus", method = RequestMethod.POST)
	public Message nuevo(@RequestBody MenusModel cp) {

		return cps.addMenus(cp);
	}

	@RequestMapping(path = "/api/menus", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody MenusModel cp) {

		return cps.updateMenus(cp);
	}

	@RequestMapping(path = "/api/menus", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody MenusModel cp) {

		return cps.deleteMenus(cp);
	}

	@RequestMapping(path = "/api/menus", method = RequestMethod.GET)
	public List<MenusModel> lista() {

		return cps.listaMenus();
	}

	@RequestMapping(path = "/api/menus/{id}", method = RequestMethod.GET)
	public MenusModel byId(@RequestParam int id) {

		return cps.findMenusById(id);
	}

}
