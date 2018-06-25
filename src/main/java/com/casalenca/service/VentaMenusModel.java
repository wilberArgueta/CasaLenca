package com.casalenca.service;

public class VentaMenusModel {

	private int idVentaMenu;

	private MenusModelSer menu;

	private VentasModel venta;

	private int cantidad = 1;

	public VentaMenusModel() {
		// TODO Auto-generated constructor stub
	}

	public VentaMenusModel(int idVentaMenu, MenusModelSer menu, VentasModel venta, int cantidad) {
		this.idVentaMenu = idVentaMenu;
		this.menu = menu;
		this.venta = venta;
		this.cantidad = cantidad;
	}

	public int getIdVentaMenu() {
		return idVentaMenu;
	}

	public void setIdVentaMenu(int idVentaMenu) {
		this.idVentaMenu = idVentaMenu;
	}

	public MenusModelSer getMenu() {
		return menu;
	}

	public void setMenu(MenusModelSer menu) {
		this.menu = menu;
	}

	public VentasModel getVenta() {
		return venta;
	}

	public void setVenta(VentasModel venta) {
		this.venta = venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "VentaMenus [idVentaMenu=" + idVentaMenu + ", menu=" + menu + ", venta=" + venta + ", cantidad="
				+ cantidad + "]";
	}

}
