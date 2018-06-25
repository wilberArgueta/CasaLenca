package com.casalenca.convert;

import org.springframework.stereotype.Component;

import com.casalenca.entity.Recetas;
import com.casalenca.model.RecetasModel;

@Component("recetasConvert")
public class RecetasConvert {

	public Recetas ModelToEntity(RecetasModel rm) {
		Recetas r = new Recetas();
		r.setIdReceta(rm.getIdReceta());
		r.setNombre(rm.getNombre());
		r.setDetalle(rm.getDetalle());
		r.setActiva(rm.isActiva());
		r.setCreado(rm.getCreado());
		r.setActualizado(rm.getActualizado());
		r.setEliminado(rm.getEliminado());

		return r;
	}

	public RecetasModel EntityToModel(Recetas rm) {
		RecetasModel r = new RecetasModel();
		r.setIdReceta(rm.getIdReceta());
		r.setNombre(rm.getNombre());
		r.setDetalle(rm.getDetalle());
		r.setActiva(rm.isActiva());
		r.setCreado(rm.getCreado());
		r.setActualizado(rm.getActualizado());
		r.setEliminado(rm.getEliminado());

		return r;
	}

}
