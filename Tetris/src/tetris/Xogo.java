package tetris;

import java.util.ArrayList;

/**
 *
 * @author a22javiermm
 */
public class Xogo {

    final int LADO_CADRADO= 2;
    final int MAX_Y=20;
    final int MAX_X=20;
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

    public boolean ePosicionValida(int x, int y) {
        if (x > MAX_X || y > MAX_Y) {
            return false;
        } else {
            return true;
        }
    }
    
    public void engadirFichaAoChan(){
        
    }
    
    public boolean chocaFichaCoChan(){
        getCoordenadas();
        if(ficha)
    }
}
