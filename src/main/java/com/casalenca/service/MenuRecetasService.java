package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.casalenca.convert.MenuRecetasConvert;
import com.casalenca.convert.MenusConvert;
import com.casalenca.model.MenuRecetasModel;
import com.casalenca.model.MenusModel;
import com.casalenca.model.Message;
import com.casalenca.repository.MenuRecetasRepository;

@Service("menuRecetasService")
public class MenuRecetasService {

	@Autowired
	@Qualifier("menuRecetasRepository")
	private MenuRecetasRepository evr;

	@Autowired
	@Qualifier("menuRecetasConvert")
	private MenuRecetasConvert evc;

	@Autowired
	@Qualifier("menusConvert")
	private MenusConvert mc;

	private Message m;

	public Message addMenuRecetas(MenuRecetasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuRecetas Agregado Correctamente..");
		return m;
	}

	public Message deleteMenuRecetas(MenuRecetasModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuRecetas Eliminado Correctamente..");
		return m;
	}

	public Message updateMenuRecetas(MenuRecetasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("MenuRecetas Update Correctamente..");
		return m;
	}

	public List<MenuRecetasModel> listaMenuRecetas() {

		List<MenuRecetasModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public MenuRecetasModel findMenuRecetasById(int id) {

		return evc.EntityToModel(evr.findMenuRecetaById(id));
	}

	public MenuRecetasModel findMenuRecetaByMenu(MenusModel mm) {

		return evc.EntityToModel(evr.findMenuRecetaByMenu(mc.ModelToEntity(mm)));
	}

}
