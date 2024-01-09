/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula33.labs;

/**
 *
 * @author larak
 */
public class Exer01 {
     public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.ligar();
        
        lampada.mostrarEstado();        
        //System.out.println("Lâmpada está " + lampada.ligada);
        
        lampada.desligar();
        
        lampada.mostrarEstado();
        //System.out.println("Lâmpada está " + lampada.ligada);
        
        lampada.mudarEstado();
        
        lampada.mostrarEstado();
        
        
            


        //poderia fazer a lampada desligar colocando 
        //lampada.ligada = true;        
        //lampada.ligada= false;
    }
    
    
}
