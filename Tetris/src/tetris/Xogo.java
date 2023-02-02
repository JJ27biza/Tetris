package tetris;

import java.util.ArrayList;

/**
 *
 * @author a22javiermm
 */
public class Xogo {

    final static int LADO_CADRADO= 1;
    final int MAX_Y=20;
    final int MAX_X=10;
    boolean pausa;
    int numeroLinas=MAX_Y-LADO_CADRADO;
    
    ArrayList<Cadrado>cadradosChan=new ArrayList<Cadrado>();
    
    public void moverFichaDereita() {

    }

    public void moverFichaEsquerda() {

    }

    public void moverFichaAbaixo() {

    }

    public void rotarFicha() {

    }
    public void xerarNovaFicha(){
        FichaBarra novaFicha = new FichaBarra();
    }

    public boolean ePosicionValida(int x, int y) {
        if (x > MAX_X || y > MAX_Y) {
            return false;
        } else {
            return true;
        }
    }
    
    public void engadirFichaAoChan(){
        
    }
    
    /*public boolean chocaFichaCoChan(){
        
        if(cadrado.get(y)==y)
            //codigo
    }*/
}
