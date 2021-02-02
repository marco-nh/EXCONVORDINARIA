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
public class AlmacenPeliculas {
    private Pelicula[] almacen = new Pelicula[100];
    private int cantidad;
    
    public AlmacenPeliculas(){
        cantidad=0;
    }
    
    public void añadirPelicula(Pelicula pelicula){
        almacen[cantidad] = pelicula;
        cantidad++;
    }
    
    public void eliminarPelicula(Pelicula pelicula){
        for(int i=0; i < cantidad; i++){
            if(pelicula.mostrarTitulo().equals(almacen[i].mostrarTitulo())){
                if(i == cantidad-1){
                    almacen[i] = null;
                } else {
                    for(int j=i; j < cantidad-1; j++){
                        almacen[j] = almacen[j+1];
                    }
                }
                cantidad--;
            }
        }
    }
    
    public Pelicula[] mostrarAlmacen(){
        return almacen;
    }
    
    public int mostrarCantidad(){
        return cantidad;
    }
}
