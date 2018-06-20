package com.casalenca.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facturas")
public class Facturas {

	@Id
	@Column(name = "id_factura")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFactura;

	@Column(name = "num_factura")
	private char[] numFactura;

	@Column(name = "correlativo_factura")
	private char[] correlativoFactura;

	@Column(name = "fecha_factura")
	private Date fechaFactura;

	@Column(name = "iva")
	private int iva;

	@Column(name = "detalles")
	private String detalle;

	public Facturas() {
		// TODO Auto-generated constructor stub
	}

	public Facturas(int idFactura, char[] numFactura, char[] correlativoFactura, Date fechaFactura, int iva,
			String detalle) {
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.correlativoFactura = correlativoFactura;
		this.fechaFactura = fechaFactura;
		this.iva = iva;
		this.detalle = detalle;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public char[] getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(char[] numFactura) {
		this.numFactura = numFactura;
	}

	public char[] getCorrelativoFactura() {
		return correlativoFactura;
	}

	public void setCorrelativoFactura(char[] correlativoFactura) {
		this.correlativoFactura = correlativoFactura;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "FacturasModel [idFactura=" + idFactura + ", numFactura=" + Arrays.toString(numFactura)
				+ ", correlativoFactura=" + Arrays.toString(correlativoFactura) + ", fechaFactura=" + fechaFactura
				+ ", iva=" + iva + ", detalle=" + detalle + "]";
	}

}
