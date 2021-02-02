package verpeliculas.model;

import java.awt.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author usuario
 */
public interface Pelicula {
    public String mostrarGenero();
    public String mostrarTitulo();
    public int mostrarAño();
    public String mostrarDirector();
    public double mostrarCalificacion();
    public int mostrarDuracion();
    public Image mostrarCarátula();
    public int mostrarVistas();
}
