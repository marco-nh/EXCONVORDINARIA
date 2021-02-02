/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verpeliculas.view;

import java.awt.Image;
import verpeliculas.control.NovedadesOrganizacion;
import verpeliculas.control.Organizacion;
import verpeliculas.model.AlmacenPeliculas;
import verpeliculas.model.Caratula;
import verpeliculas.model.ContenidoPelicula;
import verpeliculas.model.Pelicula;
import verpeliculas.model.VistaPelicula;

/**
 *
 * @author usuario
 */
public class VistApp {
    public void execute(){
        Image imagen = null;
        VistaPelicula vistas = new VistaPelicula(200);
        VistaPelicula vistas2 = new VistaPelicula(300);
        Caratula caratula = new Caratula(imagen);
        Pelicula a = new ContenidoPelicula("genero3","titulo", 11, "director",4.73,33,caratula,vistas);
        Pelicula b = new ContenidoPelicula("genero4","titulo2", 11, "director",4.73,33,caratula,vistas);
        Pelicula c = new ContenidoPelicula("genero2","titulo2", 110, "director",4.73,33,caratula,vistas2);
        
        AlmacenPeliculas al1 = new AlmacenPeliculas();
        AlmacenPeliculas al2 = new AlmacenPeliculas();
        al1.añadirPelicula(a);
        al1.añadirPelicula(b);
        al1.añadirPelicula(c);
        System.out.println(al1.mostrarAlmacen()[0].mostrarGenero());
        Organizacion org = new NovedadesOrganizacion();
        al2 = org.organizar(al1);
        System.out.println(al1.mostrarAlmacen()[0].mostrarGenero());
    }
}
