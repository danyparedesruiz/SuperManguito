package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import model.Donacion;

@Entity
@DiscriminatorValue(value="DonacionM")
public class DonacionManguito extends Donacion {
	
	private int cantidadManguito;
	private float precioManguito;
	
	public DonacionManguito() {
		
	}
	
	private void setCantidadManguito(int cantidadManguito) {
		this.cantidadManguito=cantidadManguito;
	}
	private void setPrecioManguito(float precioManguito) {
		this.precioManguito=precioManguito;
	}
	private int getCantidadManguito() {
		return cantidadManguito;
	}
	private float getPrecioManguito() {
		return cantidadManguito;
	}
}
