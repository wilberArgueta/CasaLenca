package com.casalenca.model;

import java.time.LocalDate;
import java.util.Arrays;

public class ProveedoresModel {

	private char[] codProveedor;

	private String razonSocial;

	private char[] nit;

	private char[] telefono;

	private String direccion;

	private String correo;

	private boolean activo = true;

	private LocalDate creado;

	private LocalDate actualizado;

	private LocalDate eliminado;

	public ProveedoresModel() {
		// TODO Auto-generated constructor stub
	}

	public ProveedoresModel(char[] codProveedor, String razonSocial, char[] nit, char[] telefono, String direccion,
			String correo, boolean activo, LocalDate creado, LocalDate actualizado, LocalDate eliminado) {
		this.codProveedor = codProveedor;
		this.razonSocial = razonSocial;
		this.nit = nit;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	public char[] getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(char[] codProveedor) {
		this.codProveedor = codProveedor;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public char[] getNit() {
		return nit;
	}

	public void setNit(char[] nit) {
		this.nit = nit;
	}

	public char[] getTelefono() {
		return telefono;
	}

	public void setTelefono(char[] telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public LocalDate getCreado() {
		return creado;
	}

	public void setCreado(LocalDate creado) {
		this.creado = creado;
	}

	public LocalDate getActualizado() {
		return actualizado;
	}

	public void setActualizado(LocalDate actualizado) {
		this.actualizado = actualizado;
	}

	public LocalDate getEliminado() {
		return eliminado;
	}

	public void setEliminado(LocalDate eliminado) {
		this.eliminado = eliminado;
	}

	@Override
	public String toString() {
		return "Proveedores [codProveedor=" + Arrays.toString(codProveedor) + ", razonSocial=" + razonSocial + ", nit="
				+ Arrays.toString(nit) + ", telefono=" + Arrays.toString(telefono) + ", direccion=" + direccion
				+ ", correo=" + correo + ", activo=" + activo + ", creado=" + creado + ", actualizado=" + actualizado
				+ ", eliminado=" + eliminado + "]";
	}

}
