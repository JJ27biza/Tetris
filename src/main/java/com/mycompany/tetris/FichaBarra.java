/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tetris;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;


/**
 *
 * @author a22danielpc
 */
public class FichaBarra extends Ficha {
  
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
     private void xerarLabel(){
        
         for(int a=0;a<cadradosBarra.size();a++)
         cadradosBarra.get(a).IblCadrado=new JLabel();
     
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
