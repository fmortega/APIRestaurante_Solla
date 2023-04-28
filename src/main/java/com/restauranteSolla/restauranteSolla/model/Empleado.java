package com.restauranteSolla.restauranteSolla.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
//@AllArgsConstructor
//@NoArgsConstructor
public class Empleado {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)


        private Long id;
        private int documento_identidad;
        private String nombre;
        private String apellido;
        private String cargo;
        private Double salario;

        public Empleado(Long id, int documento_identidad, String nombre, String apellido, String cargo, Double salario) {
                this.id = id;
                this.documento_identidad = documento_identidad;
                this.nombre = nombre;
                this.apellido = apellido;
                this.cargo = cargo;
                this.salario = salario;
        }

        public Empleado() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public int getDocumento_identidad() {
                return documento_identidad;
        }

        public void setDocumento_identidad(int documento_identidad) {
                this.documento_identidad = documento_identidad;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public String getCargo() {
                return cargo;
        }

        public void setCargo(String cargo) {
                this.cargo = cargo;
        }

        public Double getSalario() {
                return salario;
        }

        public void setSalario(Double salario) {
                this.salario = salario;
        }


}


