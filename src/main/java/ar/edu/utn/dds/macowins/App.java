package ar.edu.utn.dds.macowins;

import ar.edu.utn.dds.macowins.prenda.estado.Liquidacion;
import ar.edu.utn.dds.macowins.prenda.estado.Nuevo;
import ar.edu.utn.dds.macowins.prenda.estado.Promocion;

public class App {
	
	private Float coeficientePagoTarjeta;
	private Nuevo nuevo = new Nuevo();
	private Liquidacion liquidacion = new Liquidacion();
	private Promocion promocion;

	public App(Float coeficientePagoTarjeta, Float descuentoEstadoPromocion) {
		this.coeficientePagoTarjeta = coeficientePagoTarjeta;
		this.promocion = new Promocion(descuentoEstadoPromocion);
	}

	public static void main(String[] args) {
		App app = new App(0.3f, 100f);
	}
}
