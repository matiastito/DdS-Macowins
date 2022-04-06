package ar.edu.utn.dds.macowins.prenda;

import ar.edu.utn.dds.macowins.prenda.estado.Estado;

public class Prenda {
	
	private TipoPrenda tipoPrenda;
	private Float precioBase;
	private Estado estado;
	
	public Prenda(TipoPrenda tipoPrenda, Float precioBase, Estado estado) {
		this.tipoPrenda = tipoPrenda;
		this.precioBase = precioBase;
		this.estado = estado;
	}
	
	public TipoPrenda tipoPrenda() {
		return tipoPrenda;
	}
	
	public Float precioBase() {
		return precioBase;
	}

	public Float precio() {
		return estado.precio(this);
	}

}
