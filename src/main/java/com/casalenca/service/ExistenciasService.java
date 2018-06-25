package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.casalenca.convert.ExistenciasConvert;
import com.casalenca.convert.ProductosConvert;
import com.casalenca.model.ExistenciasModel;
import com.casalenca.model.Message;
import com.casalenca.model.ProductosModel;
import com.casalenca.repository.ExistenciasRepository;

@Service("existenciasService")
public class ExistenciasService {

	@Autowired
	@Qualifier("existenciasRepository")
	private ExistenciasRepository evr;

	@Autowired
	@Qualifier("existenciasConvert")
	private ExistenciasConvert evc;

	@Autowired
	@Qualifier("productosConvert")
	private ProductosConvert pc;

	private Message m;

	public Message addExistencias(ExistenciasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Existencias Agregado Correctamente..");
		return m;
	}

	public Message deleteExistencias(ExistenciasModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Existencias Eliminado Correctamente..");
		return m;
	}

	public Message updateExistencias(ExistenciasModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Existencias Update Correctamente..");
		return m;
	}

	public List<ExistenciasModel> listaExistencias() {

		List<ExistenciasModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public ExistenciasModel findExistenciasById(int id) {

		return evc.EntityToModel(evr.findExistenciaById(id));
	}

	public ExistenciasModel findExistenciasByProducto(ProductosModel pm) {

		return evc.EntityToModel(evr.findExistenciasByProducto(pc.ModelToEntity(pm)));
	}

}
