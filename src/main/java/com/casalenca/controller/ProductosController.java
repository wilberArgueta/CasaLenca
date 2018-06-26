package com.casalenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casalenca.model.ProductosModel;
import com.casalenca.model.Message;
import com.casalenca.service.ProductosService;

@RestController
public class ProductosController {

	@Autowired
	@Qualifier("productosService")
	private ProductosService cps;

	@RequestMapping(path = "/api/productos", method = RequestMethod.POST)
	public Message nuevo(@RequestBody ProductosModel cp) {

		return cps.addProductos(cp);
	}

	@RequestMapping(path = "/api/productos", method = RequestMethod.PUT)
	public Message actualizar(@RequestBody ProductosModel cp) {

		return cps.updateProductos(cp);
	}

	@RequestMapping(path = "/api/productos", method = RequestMethod.DELETE)
	public Message eliminar(@RequestBody ProductosModel cp) {

		return cps.deleteProductos(cp);
	}

	@RequestMapping(path = "/api/productos", method = RequestMethod.GET)
	public List<ProductosModel> lista() {

		return cps.listaProductos();
	}

	@RequestMapping(path = "/api/productos/{cod}", method = RequestMethod.GET)
	public ProductosModel byId(@RequestParam String cod) {

		return cps.findProductosByCod(cod.toCharArray());
	}

}
