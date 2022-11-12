package model;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "Empre")
public class Emprendedor extends Usuario {

	@OneToOne
	// @JoinColumn(name = "idEmprendedor")
	private Emprendimiento emprendimiento;

	private String nombre;
	private String clave;

	public Emprendedor() {

	}

	public Emprendedor(String nombre, String clave) {
		this.nombre = nombre;
		this.clave = clave;
	}

	public void setEmprendimiento(Emprendimiento e) {
		this.emprendimiento = e;
	}

	public Emprendimiento getEmprendimiento() {
		return this.emprendimiento;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + this.nombre;

	}
}
