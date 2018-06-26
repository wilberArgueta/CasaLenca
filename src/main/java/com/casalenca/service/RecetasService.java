package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.casalenca.convert.RecetasConvert;
import com.casalenca.model.RecetasModel;
import com.casalenca.model.Message;
import com.casalenca.repository.RecetasRepository;

@Service("recetasService")
public class RecetasService {

	@Autowired
	@Qualifier("recetasRepository")
	private RecetasRepository evr;

	@Autowired
	@Qualifier("recetasConvert")
	private RecetasConvert evc;

	@Autowired
	@Qualifier("recetasConvert")
	private RecetasConvert rc;

	private Message m;

	public Message addRecetas(RecetasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Recetas Agregado Correctamente..");
		return m;
	}

	public Message deleteRecetas(RecetasModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Recetas Eliminado Correctamente..");
		return m;
	}

	public Message updateRecetas(RecetasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Recetas Update Correctamente..");
		return m;
	}

	public List<RecetasModel> listaRecetas() {

		List<RecetasModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public RecetasModel findRecetasById(int id) {

		return evc.EntityToModel(evr.findRecetaById(id));
	}

}
