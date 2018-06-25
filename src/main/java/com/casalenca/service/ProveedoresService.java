package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.casalenca.convert.ProveedoresConvert;
import com.casalenca.model.ProveedoresModel;
import com.casalenca.model.Message;
import com.casalenca.repository.ProveedoresRepository;

@Service("proveedoresService")
public class ProveedoresService {

	@Autowired
	@Qualifier("proveedoresRepository")
	private ProveedoresRepository evr;

	@Autowired
	@Qualifier("proveedoresConvert")
	private ProveedoresConvert evc;

	private Message m;

	public Message addProveedores(ProveedoresModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Proveedores Agregado Correctamente..");
		return m;
	}

	public Message deleteProveedores(ProveedoresModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Proveedores Eliminado Correctamente..");
		return m;
	}

	public Message updateProveedores(ProveedoresModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Proveedores Update Correctamente..");
		return m;
	}

	public List<ProveedoresModel> listaProveedores() {

		List<ProveedoresModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public ProveedoresModel findProveedoresByCod(char[] cod) {

		return evc.EntityToModel(evr.findProveedoresByCod(cod));
	}

}
