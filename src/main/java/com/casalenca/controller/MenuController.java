package com.casalenca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.convert.ConvertMenu;
import com.casalenca.model.MenusModel;
import com.casalenca.model.Message;
import com.casalenca.repository.MenuRepository;

@RestController
public class MenuController {

	@Autowired
	@Qualifier("menuRepository")
	private MenuRepository menuRepository;

	ConvertMenu cm = new ConvertMenu();

	@GetMapping(path = "/menus")
	public List<MenusModel> getMenus() {

		List<MenusModel> listaMenus = new ArrayList<>();
		menuRepository.findAll().forEach(menu -> listaMenus.add(cm.EntityToModel(menu)));
		return listaMenus;

	}

	@PostMapping(path = "/add")
	public Message addMenu(@RequestBody MenusModel mm) {
		menuRepository.save(cm.ModelToEntity(mm));
		Message m = new Message();
		m.setStatus(HttpStatus.ACCEPTED);
		m.setMessage("Menu Ingresado Correctamente..");

		return m;
	}

}
