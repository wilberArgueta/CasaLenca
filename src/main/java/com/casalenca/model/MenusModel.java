package com.casalenca.model;

import java.util.Date;

public class MenusModel {

	public MenusModel() {

	}

	public MenusModel(int idMenu, String nombre, String detalles, Boolean activo, Date creado, Date actualizado,
			Date eliminado) {
		this.idMenu = idMenu;
		this.nombre = nombre;
		this.detalles = detalles;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	private int idMenu;

	private String nombre;

	private String detalles;

	private Boolean activo;

	private Date creado;

	private Date actualizado;

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
