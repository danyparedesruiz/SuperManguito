package controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import java.util.List;
import model.Donacion;

@RestController
@RequestMapping("/donacion", produces = MediaType.APPLICATION_JSON_VALUE) public class DonacionRestController {

  @Autowired
  DonacionService donacionService;
  
  //Creo una donacion
  @PostMapping
  public ResponseEntity<void> createDonacion(@RequestBody Donacion donacion) {
    System.out.println("Creando la donacion");
    if (donacionService.isDonacionExist(donacion)) {
      System.out.println("Ya existe una donacio con id " + donacion.getId());
      return new ResponseEntity<void>(HttpStatus.CONFLICT); 
    }
    donacionService.saveDonacion(donacion);
    return new ResponseEntity<Donacion>(headers, HttpStatus.CREATED);
  }
  
  
  
  
