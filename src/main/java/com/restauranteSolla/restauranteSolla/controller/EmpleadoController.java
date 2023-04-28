package com.restauranteSolla.restauranteSolla.controller;

import com.restauranteSolla.restauranteSolla.model.Empleado;
import com.restauranteSolla.restauranteSolla.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController {


    @Autowired(required = true)
    private EmpleadoRepository repository;

    @GetMapping("/empleados")
    public List<Empleado> listarClientes(){return repository.findAll();}

    @PostMapping("/empleados")
    public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
        return repository.save(empleado);
    }
    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerClientePorId(@PathVariable Long id){
        Empleado empleado = repository.findById(id)
                .orElseThrow();
        return ResponseEntity.ok(empleado);}

    //este metodo sirve para eliminar un empleado
    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarEmpleado(@PathVariable Long id){
        Empleado empleado = repository.findById(id)
                .orElseThrow();

        repository.delete(empleado);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar",Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id,@RequestBody Empleado detallesEmpleado){
        Empleado empleado = repository.findById(id)
                .orElseThrow();

        empleado.setNombre(detallesEmpleado.getNombre());
        empleado.setApellido(detallesEmpleado.getApellido());
        empleado.setCargo(detallesEmpleado.getCargo());
        empleado.setSalario(detallesEmpleado.getSalario());

        Empleado empleadoActualizado = repository.save(empleado);
        return ResponseEntity.ok(empleadoActualizado);
    }

    @GetMapping("/empleados/existe/{id}")
    public Empleado obtenerEmpleado(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow();
    }

    //@GetMapping("/empleados/name/{id}")
    //public Empleado obtenerEmpleado(@PathVariable int id) {
        //return repository.buscarPorDocumentoIdentidad(id);

   // }



}
