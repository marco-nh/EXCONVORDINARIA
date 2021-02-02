
package verpeliculas.model;

import java.awt.Image;

public class Caratula {
    private final Image image;

    /**
     *
     * @param imagen
     */
    public Caratula(Image imagen){
        this.image=imagen;
    }

    public Image mostrarImage() {
        return image;
    }
}
