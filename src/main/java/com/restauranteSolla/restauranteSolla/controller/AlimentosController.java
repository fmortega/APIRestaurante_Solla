package com.restauranteSolla.restauranteSolla.controller;

import com.restauranteSolla.restauranteSolla.model.Empleado;
import com.restauranteSolla.restauranteSolla.model.RegistroAlimentos;
import com.restauranteSolla.restauranteSolla.repository.AlimentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AlimentosController {
    @Autowired(required = true)
    private AlimentosRepository repository;

    @GetMapping("/alimentos")
    public List<RegistroAlimentos> listaralimentos(){return repository.findAll();}

    @PostMapping("/alimentos")
    public RegistroAlimentos guardarEmpleado(@RequestBody RegistroAlimentos alimentos) {
        return repository.save(alimentos);
    }
    @GetMapping("/alimentos/{id}")
    public ResponseEntity<RegistroAlimentos> obtenerClientePorId(@PathVariable Long id){
        RegistroAlimentos alimentos = repository.findById(id)
                .orElseThrow();
        return ResponseEntity.ok(alimentos);}

    @GetMapping("/alimentos/nombre")
    public ResponseEntity<RegistroAlimentos> obtenerClientePorId(){
        RegistroAlimentos alimentos = (RegistroAlimentos) repository.buscaNombre();

        return ResponseEntity.ok(alimentos);}
}