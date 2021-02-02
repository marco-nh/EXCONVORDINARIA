package verpeliculas.control;

import verpeliculas.model.AlmacenPeliculas;

public class MasvistasOrganizacion implements Organizacion{
    private int vistas = 0;
    @Override
    public AlmacenPeliculas organizar(AlmacenPeliculas almacen) {
        AlmacenPeliculas almacenret = almacen;
        int ord = 0;
        int cantidad = 0;
        int max = almacen.mostrarCantidad();
        while (cantidad < max){
            for (int i=0; i < almacen.mostrarCantidad(); i++){
                if(almacen.mostrarAlmacen()[i].mostrarVistas() >= vistas){
                    ord = i;
                    vistas = almacen.mostrarAlmacen()[i].mostrarVistas();
                }
            }
            almacenret.añadirPelicula(almacen.mostrarAlmacen()[ord]);
            almacen.eliminarPelicula(almacen.mostrarAlmacen()[ord]);
            vistas=0;
            cantidad++;
            
        }
        return almacenret;
    }
    
}
