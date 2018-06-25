package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.casalenca.convert.RecetaProductosConvert;
import com.casalenca.convert.RecetasConvert;
import com.casalenca.model.RecetaProductosModel;
import com.casalenca.model.RecetasModel;
import com.casalenca.model.Message;
import com.casalenca.repository.RecetaProductosRepository;

@Service("recetaProductosService")
public class RecetaProductosService {

	@Autowired
	@Qualifier("recetaProductosRepository")
	private RecetaProductosRepository evr;

	@Autowired
	@Qualifier("recetaProductosConvert")
	private RecetaProductosConvert evc;

	@Autowired
	@Qualifier("recetasConvert")
	private RecetasConvert rc;

	private Message m;

	public Message addRecetaProductos(RecetaProductosModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("RecetaProductos Agregado Correctamente..");
		return m;
	}

	public Message deleteRecetaProductos(RecetaProductosModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("RecetaProductos Eliminado Correctamente..");
		return m;
	}

	public Message updateRecetaProductos(RecetaProductosModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("RecetaProductos Update Correctamente..");
		return m;
	}

	public List<RecetaProductosModel> listaRecetaProductos() {

		List<RecetaProductosModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public RecetaProductosModel findRecetaProductosById(int id) {

		return evc.EntityToModel(evr.findRecetaProductosById(id));
	}

	public RecetaProductosModel findRecetaProductosByReceta(RecetasModel rm) {

		return evc.EntityToModel(evr.findRecetaProductosByReceta(rc.ModelToEntity(rm)));
	}

}
