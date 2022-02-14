package com.alkemy.disney.mundodinsey.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.LocalDateType;

import javax.persistence.*;

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
    private LocalDateType fechaCreacion;
    private int calificacion;

    @ManyToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private PersonajeEntity personaje;



}
