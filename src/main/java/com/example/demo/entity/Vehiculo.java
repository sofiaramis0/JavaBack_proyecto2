package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_vehiculo") // Nombre de la tabla en la base de datos
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehiculo_id") // Nombre de la columna de la clave primaria en la base de datos
    private Long vehiculoId;

    private String marca;

    private String modelo;

    private int precio;
}
