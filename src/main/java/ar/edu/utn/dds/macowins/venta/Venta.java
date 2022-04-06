package ar.edu.utn.dds.macowins.venta;

import java.util.Collection;
import java.util.Date;

public class Venta {
	
	private Date fechaDeVenta;
	private Collection<PrendaVendida> prendasVendidas;
	
	public Venta(Date fechaDeVenta, Collection<PrendaVendida> prendasVendidas) {
		this.fechaDeVenta = fechaDeVenta;
		this.prendasVendidas = prendasVendidas;
	}
	
	public Collection<PrendaVendida> prendasVendidas() {
		return prendasVendidas;
	}
	
	public Float importe() {
		Float sumaTotlDePrendasVendidas = 0f;
		for (PrendaVendida prendasVendida : prendasVendidas) {
			sumaTotlDePrendasVendidas += prendasVendida.getPrecioVenta();
		}
		return sumaTotlDePrendasVendidas;
	}
}
