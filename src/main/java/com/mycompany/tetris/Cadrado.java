/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tetris;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author a22danielpc
 */
public class Cadrado {
    
    public int x;
    
    public int y;
    
    public Color corRecheo;
    
    public JLabel IblCadrado;
    
    
    public String getCoordenadas(){
    
       String coordenadas;
       coordenadas=x+""+y;
    
    return coordenadas;
    }
    
}
