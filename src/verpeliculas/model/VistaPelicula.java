/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verpeliculas.model;

/**
 *
 * @author usuario
 */
public class VistaPelicula {
    private int vistas;
    public VistaPelicula(int vistas){
        this.vistas=vistas;
    }
    public void recarga(int vistas){
        this.vistas=vistas;
    }

    public int mostrarVistas() {
        return vistas;
    }
}
