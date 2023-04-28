package com.restauranteSolla.restauranteSolla.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alimentosempleados")
public class RegistroAlimentos {
    public RegistroAlimentos(Long id, int id_empleado, String tipo_alimento) {
        this.id = id;
        this.id_empleado = id_empleado;
        this.tipo_alimento = tipo_alimento;
    }

    public RegistroAlimentos() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private int id_empleado;
    private String tipo_alimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getTipo_alimento() {
        return tipo_alimento;
    }

    public void setTipo_alimento(String tipo_alimento) {
        this.tipo_alimento = tipo_alimento;
    }
}