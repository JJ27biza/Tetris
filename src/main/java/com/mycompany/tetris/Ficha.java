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
public abstract class Ficha {
    
        ArrayList<Cadrado>cadrados = new ArrayList<Cadrado>();
       

       
        
        

     public abstract boolean moverDereita();

     public abstract boolean moverAbaixo();
    
     public abstract boolean moverEsquerda();
    
     public abstract boolean rotar();
}
