package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_cliente")

public class Cliente {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    private String firstName;
    private String lastName;
    @Column(name = "email_address", unique = true, nullable = false)
    private String email;

}
