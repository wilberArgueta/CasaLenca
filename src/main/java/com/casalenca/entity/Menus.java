package com.casalenca.entity;

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
@Table(name = "menus")
public class Menus {

	public Menus() {

	}

	public Menus(int idMenu, String nombre, String detalles, Boolean activo, Date creado, Date actualizado,
			Date eliminado) {
		this.idMenu = idMenu;
		this.nombre = nombre;
		this.detalles = detalles;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	@Id
	@Column(name = "id_menu", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMenu;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "detalles")
	private String detalles;

	@Column(name = "activo")
	private Boolean activo;

	@Column(name = "creado")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creado;

	@Column(name = "actualizado")
	@Temporal(TemporalType.TIMESTAMP)
	private Date actualizado;

	@Column(name = "eliminado")
	@Temporal(TemporalType.TIMESTAMP)
	private Date eliminado;

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public Date getActualizado() {
		return actualizado;
	}

	public void setActualizado(Date actualizado) {
		this.actualizado = actualizado;
	}

	public Date getEliminado() {
		return eliminado;
	}

	public void setEliminado(Date eliminado) {
		this.eliminado = eliminado;
	}

	@Override
	public String toString() {
		return "Menus [idMenu=" + idMenu + ", nombre=" + nombre + ", detalles=" + detalles + ", activo=" + activo
				+ ", creado=" + creado + ", actualizado=" + actualizado + ", eliminado=" + eliminado + "]";
	}

}
