/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verpeliculas.model;

import java.awt.Image;

/**
 *
 * @author usuario
 */
public class ContenidoPelicula implements Pelicula{
    private String genero;
    private String titulo;
    private int año;
    private String director;
    private double calificacion;
    private int duracion;
    private Caratula caratula;
    private VistaPelicula vistas;
    
    public ContenidoPelicula(String genero,String titulo, int año, String director,double calificacion,int duracion,Caratula caratula,
            VistaPelicula vistas){
        this.genero=genero;
        this.titulo=titulo;
        this.año=año;
        this.director=director;
        this.calificacion=calificacion;
        this.duracion=duracion;
        this.caratula=caratula;
        this.vistas=vistas;
    }

    @Override
    public String mostrarGenero() {
        return genero;
    }

    @Override
    public String mostrarTitulo() {
        return titulo;
    }

    @Override
    public int mostrarAño() {
        return año;
    }

    @Override
    public String mostrarDirector() {
        return director;
    }

    @Override
    public double mostrarCalificacion() {
        return calificacion;
    }

    @Override
    public int mostrarDuracion() {
        return duracion;
    }

    @Override
    public Image mostrarCarátula() {
        return caratula.mostrarImage();
    }

    @Override
    public int mostrarVistas() {
        return vistas.mostrarVistas();
    }
}
