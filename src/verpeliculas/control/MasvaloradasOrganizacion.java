package verpeliculas.control;

import verpeliculas.model.AlmacenPeliculas;

public class MasvaloradasOrganizacion implements Organizacion {
    private double calificacion = 0;
    @Override
    public AlmacenPeliculas organizar(AlmacenPeliculas almacen) {
        AlmacenPeliculas almacenret = almacen;
        int ord = 0;
        int cantidad = 0;
        int max = almacen.mostrarCantidad();
        while (cantidad < max){
            for (int i=0; i < almacen.mostrarCantidad(); i++){
                if(almacen.mostrarAlmacen()[i].mostrarCalificacion() >= calificacion){
                    ord = i;
                    calificacion = (int) almacen.mostrarAlmacen()[i].mostrarCalificacion();
                }
            }
            almacenret.añadirPelicula(almacen.mostrarAlmacen()[ord]);
            almacen.eliminarPelicula(almacen.mostrarAlmacen()[ord]);
            calificacion=0;
            cantidad++;
            
        }
        return almacenret;
    }
}
