package ar.edu.utn.dds.macowins.prenda.estado;

import ar.edu.utn.dds.macowins.prenda.Prenda;

public class Promocion implements Estado {

	private Float descuento;

	public Promocion(Float descuento) {
		this.descuento = descuento;
	}

	public Float precio(Prenda prenda) {
		return prenda.precioBase() - descuento;
	}
}
