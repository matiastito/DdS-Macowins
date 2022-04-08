package ar.edu.utn.dds.macowins;

import java.util.Collection;
import java.util.Date;

import ar.edu.utn.dds.macowins.prenda.Prenda;
import ar.edu.utn.dds.macowins.prenda.estado.Liquidacion;
import ar.edu.utn.dds.macowins.prenda.estado.Nuevo;
import ar.edu.utn.dds.macowins.prenda.estado.Promocion;
import ar.edu.utn.dds.macowins.venta.PrendaVendida;
import ar.edu.utn.dds.macowins.venta.Venta;

public class Negocio {
	
	private Float coeficientePagoTarjeta;
	private Float descuentoEstadoPromocion;
	
	private Collection<Venta> ventas;
	
	public Negocio(Float coeficientePagoTarjeta, Float descuentoEstadoPromocion) {
		this.coeficientePagoTarjeta = coeficientePagoTarjeta;
		this.descuentoEstadoPromocion = descuentoEstadoPromocion;
	}

	public Float importeVentas(Date dia) {
		Float ret = 0f;
		for (Venta venta : ventas) {
			ret += venta.importe();
		}
		return ret;
	}
}
