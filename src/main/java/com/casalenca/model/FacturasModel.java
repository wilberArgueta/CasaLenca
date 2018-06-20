package com.casalenca.model;

import java.util.Arrays;
import java.util.Date;

public class FacturasModel {

	private int idFactura;
	private char[] numFactura;
	private char[] correlativoFactura;
	private Date fechaFactura;
	private int iva;
	private String detalle;

	public FacturasModel() {
		// TODO Auto-generated constructor stub
	}

	public FacturasModel(int idFactura, char[] numFactura, char[] correlativoFactura, Date fechaFactura, int iva,
			String detalle) {
		super();
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
