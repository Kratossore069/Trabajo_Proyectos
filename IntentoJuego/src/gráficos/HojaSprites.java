/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gráficos;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class HojaSprites {

    //Atributos
    private final int ANCHO;
    private final int ALTO;
    public final int[] PIXELES;

    //Constructores
    public HojaSprites(final String RUTA, final int ANCHO, final int ALTO) {
        this.ALTO = ALTO;
        this.ANCHO = ANCHO;
        PIXELES = new int[ANCHO * ALTO];
        try {
            BufferedImage imagen = ImageIO.read(HojaSprites.class.getResource(RUTA));
            imagen.getRGB(0, 0, ANCHO, ALTO, PIXELES, 0, ANCHO);
        } catch (Exception ex) {
            System.out.println("Error en el método Buffered");
        }
        
    }
}
