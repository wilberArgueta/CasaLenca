package com.casalenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casalenca.entity.Facturas;

@Repository("facturasRepository")
public interface FacturasRepository extends JpaRepository<Facturas, Integer> {

	public Facturas findFacturaById(int id);

	public Facturas findFacturaByNumFactura(char[] numFactura);

}
