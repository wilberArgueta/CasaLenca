package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.Compras;
import com.casalenca.entity.FacturaCompra;
import com.casalenca.entity.Facturas;

@Repository("facturaCompraRepository")
public interface FacturaCompraRepository extends JpaRepository<FacturaCompra, Integer> {

	public FacturaCompra findFacturaCompraById(int id);

	public FacturaCompra findFacturaCompraByFactura(Facturas f);

	public FacturaCompra findFacturaCompraByCompra(Compras c);

}
