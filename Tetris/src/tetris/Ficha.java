
package tetris;

/**
 *
 * @author a22javiermm
 */
public abstract class Ficha {
    ArrayList<Cadrado>cadrados = new ArrayList<Cadrado>();
    
    public abstract boolean moverDereita();
    
    public abstract boolean moverAbaixo();
    
    public abstract boolean moverEsquerda();
    
    public abstract boolean rotar();
    
}
