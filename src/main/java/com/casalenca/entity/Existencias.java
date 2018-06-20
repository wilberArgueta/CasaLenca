package com.casalenca.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "existencias")
public class Existencias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_existencia")
	private int idExistencias;

	@Column(name = "cantidad")
	private int cantidad;

	@Column(name = "cod_producto")
	private char[] codProducto;

	public Existencias() {

	}

	public Existencias(int idExistencias, int cantidad, char[] codProducto) {
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
