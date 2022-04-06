package ar.edu.utn.dds.macowins.cobro;

import ar.edu.utn.dds.macowins.medioDePago.MedioDePago;
import ar.edu.utn.dds.macowins.venta.Venta;

public class Cobro {

	private Venta venta;
	private MedioDePago medioDePago;
	
	public Cobro(Venta venta, MedioDePago medioDePago) {
		this.venta = venta;
		this.medioDePago = medioDePago;
	}
	
	public Float importe() {
		return venta.importe() + medioDePago.recargo(venta);
	}
}
