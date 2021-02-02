package verpeliculas.control;

import verpeliculas.model.AlmacenPeliculas;

public class NovedadesOrganizacion implements Organizacion {
    private int año = 0;
    @Override
    public AlmacenPeliculas organizar(AlmacenPeliculas almacen) {
        AlmacenPeliculas almacenret = almacen;
        int ord = 0;
        int cantidad = 0;
        int max = almacen.mostrarCantidad();
        while (cantidad < max){
            for (int i=0; i < almacen.mostrarCantidad(); i++){
                if(almacen.mostrarAlmacen()[i].mostrarAño() >= año){
                    ord = i;
                    año = almacen.mostrarAlmacen()[i].mostrarAño();
                }
            }
            almacenret.añadirPelicula(almacen.mostrarAlmacen()[ord]);
            almacen.eliminarPelicula(almacen.mostrarAlmacen()[ord]);
            año=0;
            cantidad++;
            
        }
        return almacenret;
    }
}
