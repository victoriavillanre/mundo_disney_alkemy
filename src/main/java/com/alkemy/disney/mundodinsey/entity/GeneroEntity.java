package com.alkemy.disney.mundodinsey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Genero")
@Getter
@Setter
public class GeneroEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String imagen;

    private String nombre;





}
