package com.restauranteSolla.restauranteSolla.repository;

import com.restauranteSolla.restauranteSolla.model.Empleado;
import com.restauranteSolla.restauranteSolla.model.RegistroAlimentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    //@Query("SELECT nombre FROM empleado e WHERE e.documento_identidad = :documento_identidad")
   // Empleado buscarPorDocumentoIdentidad(@Param("documentoIdentidad") int documentoIdentidad);



}

