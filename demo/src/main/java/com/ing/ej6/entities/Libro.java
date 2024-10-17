package com.ing.ej6.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="libro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro extends Base{
    @Column(name="titulo")
    private String titulo;
    @Column(name="fecha")
    private int fecha;
    @Column(name="genero")
    private String genero;
    @Column(name="paginas")
    private String paginas;

    @ManyToMany(cascade = CascadeType.REFRESH) //si hay cambio en autor se actuliza para libro
    private List<Autor> autores;
}
