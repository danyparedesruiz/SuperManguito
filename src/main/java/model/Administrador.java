package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value = "Admin")
public class Administrador extends Usuario {
	//@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long idUsuario;
	private String nombre;
	private String clave;

	public Administrador() {
		super();
	}
	
}