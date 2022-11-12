
package model;
import java.awt.image.BufferedImage;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String mensaje;
	private byte[] imagen;

	private Date fecha;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje=mensaje;
	}
	public String getMensaje() {
		return mensaje;
	}
	
	public void setImagen(byte[]imagen) {
		this.imagen=imagen;
	}
	
	public byte[] imagen() {
		return imagen;
	}

	public Date getFecha() {
		return fecha;
	}

}
