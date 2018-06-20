package com.casalenca.model;

import java.util.Arrays;
import java.util.Date;

public class ComprasModel {

	private int idCompra;

	private char[] registroCompra;

	private Date fechaCompra;

	private String detalle;

	public ComprasModel() {
		// TODO Auto-generated constructor stub
	}

	public ComprasModel(int idCompra, char[] registroCompra, Date fechaCompra, String detalle) {
		super();
		this.idCompra = idCompra;
		this.registroCompra = registroCompra;
		this.fechaCompra = fechaCompra;
		this.detalle = detalle;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public char[] getRegistroCompra() {
		return registroCompra;
	}

	public void setRegistroCompra(char[] registroCompra) {
		this.registroCompra = registroCompra;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "ComprasModel [idCompra=" + idCompra + ", registroCompra=" + Arrays.toString(registroCompra)
				+ ", fechaCompra=" + fechaCompra + ", detalle=" + detalle + "]";
	}

}
