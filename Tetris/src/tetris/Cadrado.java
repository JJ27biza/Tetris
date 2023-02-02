
package tetris;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author a22javiermm
 */
public class Cadrado {
    public int x;
    public int y;
    public Color corRecheo;
    public JLabel lblCadrado;
    
    
    public Cadrado(int x, int y, Color corRecheo) {
        this.x = x;
        this.y = y;
        this.corRecheo = corRecheo;
    }

        
    
    public String getCoordenadas(){
    
       String coordenadas;
       coordenadas=x+" "+y;
    
    return coordenadas;
    }
}
