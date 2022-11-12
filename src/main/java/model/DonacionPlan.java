package model;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import model.Donacion;


@Entity
@DiscriminatorValue(value="p")
public class DonacionPlan extends Donacion {
	
	private float precioDonacion;
	
	public DonacionPlan(){
		
	}

}