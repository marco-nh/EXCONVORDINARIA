package verpeliculas.control;

import verpeliculas.model.AlmacenPeliculas;

public class GeneroOrganizacion implements Organizacion {
    private String genero = "";
    @Override
    public AlmacenPeliculas organizar(AlmacenPeliculas almacen) {
        AlmacenPeliculas almacenret = almacen;
        int ord = 0;
        int cantidad = 0;
        int max = almacen.mostrarCantidad();
        return almacenret;
    }
    
}
