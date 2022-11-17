package controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import java.util.List;
import model.Emprendimiento;

@RestController
@RequestMapping("/emprendimiento", produces = MediaType.APPLICATION_JSON_VALUE) public class EmprendimientoRestController {

  @Autowired
  EmprendimientoService emprendimientoService;
  
  //Recupero todos los emprendedores
  @GetMapping
  public ResponseEntity<List<Emprendimiento>> listEmp() {
    List<Emprendimiento>> emp = emprendimientoService.findAllEmprendimientos();//findAll?
    if(emp.isEmpty()){
      return new ResponseEntity<List<Emprendimiento>>(HttpStatus.NO_CONTENT);
     }
    return new ResponseEntity<List<Emprendimiento>>(emp, HttpStatus.OK);
    
  //Recupero un emprendimiento usando su id
  @GetMapping("/{id}")
  public ResponseEntity<Emprendimiento> getEmp(@PathVariable("id") long id) {
    System.out.println("Obteniendo emprendimiento con id " + id);
    Emprendimiento emp = emprendimientoService.findById(id);//findById?
    if (emp == null) {
      System.out.println("El emprendimiento con id " + id + " no encontrado");
      return new ResponseEntity<Emprendimiento>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<Emprendimiento>(emprendimiento, HttpStatus.OK);
  }

  //Creo un emprendimiento
  @PostMapping
  public ResponseEntity<void> createEmp(@RequestBody Emprendimiento emp) {
    System.out.println("Creando el emprendimiento" + emp.getName());//creo que todo esto tiene que ir en models o en DAO, no estoy seguro
    if (emprendimientoService.isEmprendimientoExist(emp)) {
      System.out.println("Ya existe un emprendimiento con nombre " + emp.getName());
      return new ResponseEntity<void>(HttpStatus.CONFLICT); 
    }
    emprendimientoService.saveEmprendimiento(emp);//menos los de Service, que creo que van en otro lado, no estoy seguro
    return new ResponseEntity<Emprendimiento>(headers, HttpStatus.CREATED);
  } 
    
  //Actualizo un usuario
  @PutMapping("/{id}")
  public ResponseEntity<Emprendimiento> updateEmp(@PathVariable("id") long id, @RequestBody Emprendimiento emp) {
    System.out.println("Actualizando el emprendimiento " + id);
    Emprendimiento empActual = emprendimientoService.findById(id);
    if (empActual==null) {
      System.out.println("Emprendimiento con id " + id + " no encontrado");
      return new ResponseEntity<Emprendimiento>(HttpStatus.NOT_FOUND);
    }
    empActual.setName(emp.getName());
    // todos los atributos de Emprendimiento hay que hacerle un "empActual.setBlaBLa(emp.getBlaBla)"
    emprendimientoService.updateEmprendimiento(empActual);
    return new ResponseEntity<Emprendimiento>(empActual, HttpStatus.OK);
  }
    
}
