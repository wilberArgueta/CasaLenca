package com.casalenca.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compras")
public class Compras {

	@Id
	@Column(name = "id_compra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCompra;

	@Column(name = "registro_compra")
	private char[] registroCompra;

	@Column(name = "fecha_compra")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCompra;

	@Column(name = "detalle")
	private String detalle;

	public Compras() {
		// TODO Auto-generated constructor stub
	}

	public Compras(int idCompra, char[] registroCompra, Date fechaCompra, String detalle) {

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
