package com.alkemy.disney.mundodinsey.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Pelicula")
@Getter
@Setter
public class PeliculaEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String imagen;

    private String titulo;

    private Date fechaCreacion;

    private int calificacion;

    private GeneroEntity genero;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set <PersonajeEntity>  personajesAsociados;



}
