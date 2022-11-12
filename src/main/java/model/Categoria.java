package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCategoria;
	private String nombre;
	private String descripcion;
	
	public Categoria(String n,String d) {
		this.nombre=n;
		this.nombre=d;
	}
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

}
