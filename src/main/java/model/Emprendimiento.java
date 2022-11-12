package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Emprendimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmprendimiento;

	private String nombre;
	private String url;
	private String descripcion;
	private byte[] banner;
	private boolean mostTopDonors;
	private boolean mostCantManguitos;
	private float PrecioManguito;
	private float PrecioBeneficio;
	private String descripcionBeneficio;
	private ArrayList<String> redes;

	/*
	 * @ManyToMany private List<Categoria> categorias;
	 * 
	 * @OneToMany private List<Post> posteos;
	 * 
	 * @OneToMany private List<DonacionPlan> donacionesPlan;
	 * 
	 * @OneToMany private List<DonacionManguito>donacionesManguito;
	 */

	@OneToOne(mappedBy = "emprendimiento")
	// @JoinColumn(name = "idEmprendedor", nullable = false)
	private Emprendedor emprendedor;

	public Emprendimiento() {
		// TODO Auto-generated constructor stub
	}

	public Emprendimiento(String nombre) {
		this.nombre = nombre;
	}

	public void setEmprendedor(Emprendedor e) {
		this.emprendedor = e;
		e.setEmprendimiento(this);
	}

	public Emprendedor getEmprendedor() {
		return emprendedor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + this.nombre;
	}

}
