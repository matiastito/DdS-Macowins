package ar.edu.utn.dds.macowins.prenda.estado;

import ar.edu.utn.dds.macowins.prenda.Prenda;

public class Nuevo implements Estado {

	public Float precio(Float precioPrenda) {
		return precioPrenda;		
	}

	public Float precio(Prenda prenda) {
		return prenda.precioBase();
	}
}
