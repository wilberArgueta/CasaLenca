package com.casalenca.convert;

import com.casalenca.entity.Menus;
import com.casalenca.model.MenusModel;

public class ConvertMenu {

	public MenusModel EntityToModel(Menus m) {

		MenusModel mm = new MenusModel();
		mm.setIdMenu(m.getIdMenu());
		mm.setNombre(m.getNombre());
		mm.setDetalles(m.getDetalles());
		mm.setActivo(m.getActivo());
		mm.setCreado(m.getCreado());
		mm.setActualizado(m.getActualizado());
		mm.setEliminado(m.getEliminado());

		return mm;
	}

	public Menus ModelToEntity(MenusModel m) {

		Menus mm = new Menus();
		mm.setIdMenu(m.getIdMenu());
		mm.setNombre(m.getNombre());
		mm.setDetalles(m.getDetalles());
		mm.setActivo(m.getActivo());
		mm.setCreado(m.getCreado());
		mm.setActualizado(m.getActualizado());
		mm.setEliminado(m.getEliminado());

		return mm;
	}

}
