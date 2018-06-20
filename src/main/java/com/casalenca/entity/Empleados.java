package com.casalenca.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "empleados")
public class Empleados {

	@Id
	@Column(name = "cod_empleado")
	private char[] codEmpleado;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "dui")
	private char[] dui;

	@Column(name = "f_nacimiento")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "activo")
	private boolean activo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date actualizado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date eliminado;

	public Empleados() {
		// TODO Auto-generated constructor stub
	}

	public Empleados(char[] codEmpleado, String nombre, String apellido, char[] dui, Date fechaNacimiento,
			String direccion, boolean activo, Date creado, Date actualizado, Date eliminado) {

		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dui = dui;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.activo = activo;
		this.creado = creado;
		this.actualizado = actualizado;
		this.eliminado = eliminado;
	}

	public char[] getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(char[] codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char[] getDui() {
		return dui;
	}

	public void setDui(char[] dui) {
		this.dui = dui;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
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
		return "EmpleadosModel [codEmpleado=" + Arrays.toString(codEmpleado) + ", nombre=" + nombre + ", apellido="
				+ apellido + ", dui=" + Arrays.toString(dui) + ", fechaNacimiento=" + fechaNacimiento + ", direccion="
				+ direccion + ", activo=" + activo + ", creado=" + creado + ", actualizado=" + actualizado
				+ ", eliminado=" + eliminado + "]";
	}

}
