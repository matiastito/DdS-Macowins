package ar.edu.utn.dds.macowins.venta;

import ar.edu.utn.dds.macowins.prenda.Prenda;

public class PrendaVendida {

	private Prenda prenda;
	private Integer cantidadVendida;
	
	public PrendaVendida(Prenda prenda, Integer cantidadVendida) {
		this.prenda = prenda;
		this.cantidadVendida = cantidadVendida;
	}

	public Float getPrecioVenta() {
		return this.cantidadVendida * this.prenda.precio();
	}
}
