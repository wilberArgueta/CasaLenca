package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.FacturaVenta;
import com.casalenca.entity.Facturas;

@Repository("facturaVentaRepository")
public interface FacturaVentaRepository extends JpaRepository<FacturaVenta, Integer> {

	public FacturaVenta findFacturaVentaById(int id);

	public FacturaVenta findFacturaVentaByFactura(Facturas f);

}
