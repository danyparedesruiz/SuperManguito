package model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.sound.midi.VoiceStatus;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,name = "tipoUser")
public abstract  class Usuario {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	private String nombre;
	private String clave;
	
	public Usuario(String n, String c) {
		this.nombre=n;
		this.clave=c;
	}
	
	public Usuario() {
		
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setClave(String clave) {
		this.clave=clave;
	}
	
	public String getClave() {
		return clave;
	}
	
	
	public boolean validar(String n, String c) {
		return (nombre==n || clave==c);
	}
	}
