
package tetris;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.border.Border;
/**
 *
 * @author a22javiermm
 */
public class FichaBarra extends Ficha{
     ArrayList<Cadrado>cadradosBarra = new ArrayList<Cadrado>();
    
    
    
    Cadrado cadrado1=new Cadrado(135,0,Color.YELLOW);
    Cadrado cadrado2=new Cadrado(135,30,Color.yellow);
    Cadrado cadrado3=new Cadrado(135,60,Color.yellow);
    Cadrado cadrado4=new Cadrado(135,90,Color.yellow);

    
    public FichaBarra() {
        cadradosBarra.add(cadrado1);
        cadradosBarra.add(cadrado2);
        cadradosBarra.add(cadrado3);
        cadradosBarra.add(cadrado4);
        
    }
     private JLabel xerarLabel(){
        Border borde;
        borde=BorderFactory.createLineBorder(Color.yellow);
         
         cadradosBarra.get(0).lblCadrado=new JLabel();
         cadradosBarra.get(0).lblCadrado.setBorder(borde);
         cadradosBarra.get(0).lblCadrado.setBackground(Color.red);
         cadradosBarra.get(0).lblCadrado.setOpaque(true);
         cadradosBarra.get(0).lblCadrado.setSize(30, 30);
         cadradosBarra.get(0).lblCadrado.setLocation(cadradosBarra.get(0).x, cadradosBarra.get(0).y);
         return cadradosBarra.get(0).lblCadrado;
     }
    
    public boolean moverDereita() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean moverAbaixo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean moverEsquerda() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public boolean rotar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
