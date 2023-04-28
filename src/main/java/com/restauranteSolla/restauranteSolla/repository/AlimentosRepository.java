package com.restauranteSolla.restauranteSolla.repository;

import com.restauranteSolla.restauranteSolla.model.RegistroAlimentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlimentosRepository extends JpaRepository<RegistroAlimentos,Long> {

    @Query(value = "SELECT nombre FROM empleado e INNER JOIN alimentosempleados ae ON e.documento_identidad = ae.id_empleado"
            , nativeQuery = true)
    List<RegistroAlimentos> buscaNombre();
}
