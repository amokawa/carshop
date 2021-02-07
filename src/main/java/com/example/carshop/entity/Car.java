package com.example.carshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Campo obrigatório")
    private String brand;

    @NotNull(message = "Campo obrigatório")
    private String model;

    @NotNull(message = "Campo obrigatório")
    private Float price;

    private LocalDate createdAt = LocalDate.now();

}
