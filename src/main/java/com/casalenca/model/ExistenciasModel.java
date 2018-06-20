package com.casalenca.model;

import java.util.Arrays;

public class ExistenciasModel {

	private int idExistencias;
	private int cantidad;
	private char[] codProducto;

	public ExistenciasModel() {

	}

	public ExistenciasModel(int idExistencias, int cantidad, char[] codProducto) {
		this.idExistencias = idExistencias;
		this.cantidad = cantidad;
		this.codProducto = codProducto;
	}

	public int getIdExistencias() {
		return idExistencias;
	}

	public void setIdExistencias(int idExistencias) {
		this.idExistencias = idExistencias;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public char[] getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(char[] codProducto) {
		this.codProducto = codProducto;
	}

	@Override
	public String toString() {
		return "ExistenciasModel [idExistencias=" + idExistencias + ", cantidad=" + cantidad + ", codProducto="
				+ Arrays.toString(codProducto) + "]";
	}

}
