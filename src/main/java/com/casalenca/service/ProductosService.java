package com.casalenca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.casalenca.convert.ProductosConvert;
import com.casalenca.model.ProductosModel;
import com.casalenca.model.Message;
import com.casalenca.repository.ProductosRepository;

@Service("productosService")
public class ProductosService {

	@Autowired
	@Qualifier("productosRepository")
	private ProductosRepository evr;

	@Autowired
	@Qualifier("productosConvert")
	private ProductosConvert evc;

	private Message m;

	public Message addProductos(ProductosModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Productos Agregado Correctamente..");
		return m;
	}

	public Message deleteProductos(ProductosModel em) {
		m = new Message();
		evr.delete(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Productos Eliminado Correctamente..");
		return m;
	}

	public Message updateProductos(ProductosModel em) {
		m = new Message();
		evr.save(evc.ModelToEntity(em));
		m.setStatus(HttpStatus.OK);
		m.setMessage("Productos Update Correctamente..");
		return m;
	}

	public List<ProductosModel> listaProductos() {

		List<ProductosModel> lcpm = new ArrayList<>();
		evr.findAll().forEach(e -> lcpm.add(evc.EntityToModel(e)));

		return lcpm;
	}

	public ProductosModel findProductosByCod(char[] cod) {

		return evc.EntityToModel(evr.findProductosByCod(cod));
	}

}
