package ar.edu.utn.dds.macowins.medioDePago;

import ar.edu.utn.dds.macowins.venta.PrendaVendida;
import ar.edu.utn.dds.macowins.venta.Venta;

public class MedioDePagoTarjeta implements MedioDePago {

	private Integer cantidadDeCuotas;
	private Float coefPagoTarjeta;

	public MedioDePagoTarjeta(Float coefPagoTarjeta, Integer cantidadDeCuotas) {
		this.coefPagoTarjeta = coefPagoTarjeta;
		this.cantidadDeCuotas = cantidadDeCuotas;
	}
	

	public Float recargo(Venta venta) {
		Float recargo = cantidadDeCuotas * coefPagoTarjeta;
		for (PrendaVendida prendaVendida : venta.prendasVendidas()) {
			recargo += 0.01f * prendaVendida.getPrecioVenta();
		}
		return recargo;
	}
}
