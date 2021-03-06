package com.alkemy.disney.mundodinsey.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Personaje")
@Getter
@Setter
public class PersonajeEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String imagen;
    private String nombre;
    private int edad;
    private int peso;
    private String historia;

   @ManyToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   private Set <PeliculaEntity> peliculasAsociadas;


}
