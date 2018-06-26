package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.casalenca.convert.VentaMenusConvert;
import com.casalenca.convert.VentasConvert;
import com.casalenca.model.VentaMenusModel;
import com.casalenca.model.VentasModel;
import com.casalenca.model.Message;
import com.casalenca.repository.VentaMenusRepository;

@Service("ventaMenusService")
public class VentaMenusService {

	@Autowired
	@Qualifier("ventaMenusRepository")
	private VentaMenusRepository evr;

	@Autowired
	@Qualifier("ventaMenusConvert")
	private VentaMenusConvert evc;

	@Autowired
	@Qualifier("ventasConvert")
	private VentasConvert vc;

	private Message m;

	public Message addVentaMenus(VentaMenusModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("VentaMenus Agregado Correctamente..");
		return m;
	}

	public Message deleteVentaMenus(VentaMenusModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("VentaMenus Eliminado Correctamente..");
		return m;
	}

	public Message updateVentaMenus(VentaMenusModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("VentaMenus Update Correctamente..");
		return m;
	}

	public List<VentaMenusModel> listaVentaMenus() {

		List<VentaMenusModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public VentaMenusModel findVentaMenusById(int id) {

		return evc.EntityToModel(evr.findVentaMenusById(id));
	}

	public List<VentaMenusModel> findVentaMenusByReceta(VentasModel vm) {
		List<VentaMenusModel> vmm = new ArrayList<>();

		evr.findVentaMenusByVenta(vc.ModelToEntity(vm)).forEach(t -> vmm.add(evc.EntityToModel(t)));

		return vmm;
	}

}
