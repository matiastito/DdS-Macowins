package ar.edu.utn.dds.macowins.prenda.estado;

import ar.edu.utn.dds.macowins.prenda.Prenda;

public class Liquidacion implements Estado {

	public Float precio(Prenda prenda) {
		return prenda.precioBase() * 0.5f;
	}
	
}
