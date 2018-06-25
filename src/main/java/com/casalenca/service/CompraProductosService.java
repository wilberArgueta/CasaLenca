package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.casalenca.convert.CompraProductosConvert;
import com.casalenca.convert.ComprasConvert;
import com.casalenca.model.CompraProductosModel;
import com.casalenca.model.Message;
import com.casalenca.repository.CompraProductosRepository;

import com.casalenca.model.ComprasModel;

@Service("compraProductosService")
public class CompraProductosService {

	@Autowired
	@Qualifier("compraProductosRepository")
	private CompraProductosRepository cpr;

	@Autowired
	@Qualifier("compraProductosConvert")
	private CompraProductosConvert cpc;

	@Autowired
	@Qualifier("comprasConvert")
	private ComprasConvert cc;

	private Message m;

	public Message addCompraProducto(CompraProductosModel cp) {
		m = new Message();
		cpr.save(cpc.ModelToEntity(cp));
		m.setStatus(HttpStatus.OK);
		m.setMessage("CompraProductos Agregado Correctamente..");
		return m;
	}

	public Message deleteCompraProducto(CompraProductosModel cp) {
		m = new Message();
		cpr.delete(cpc.ModelToEntity(cp));
		m.setStatus(HttpStatus.OK);
		m.setMessage("CompraProductos Eliminado Correctamente..");
		return m;
	}

	public Message updateCompraProducto(CompraProductosModel cp) {
		m = new Message();
		cpr.save(cpc.ModelToEntity(cp));
		m.setStatus(HttpStatus.OK);
		m.setMessage("CompraProductos Update Correctamente..");
		return m;
	}

	public List<CompraProductosModel> listaCompraProductos() {

		List<CompraProductosModel> lcpm = new ArrayList<>();
		cpr.findAll().forEach(p -> lcpm.add(cpc.EntityToModel(p)));

		return lcpm;
	}

	public CompraProductosModel findCompraProductosById(int id) {

		return cpc.EntityToModel(cpr.findCompraById(id));
	}

	public List<CompraProductosModel> listaByCompra(ComprasModel cm) {

		List<CompraProductosModel> lcpm = new ArrayList<>();
		cpr.findByCompras(cc.ModelToEntity(cm)).forEach(c -> lcpm.add(cpc.EntityToModel(c)));

		return lcpm;
	}

}
