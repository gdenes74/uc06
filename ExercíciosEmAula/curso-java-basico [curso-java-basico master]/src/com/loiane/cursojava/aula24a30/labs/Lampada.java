/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loiane.cursojava.aula24a30.labs;

/**
 *
 * @author larak
 */
public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    String [] tipos;
    boolean tipoAbajur;
    
    boolean ligada;
    
    void ligar (){
        ligada = true;
    }
    void desligar (){
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada){
        System.out.println("Lãmpada está ligada");
        }else{
            System.out.println("Lâmpada está desligada");
            }
    }
    void mudarEstado(){
        if(ligada){
            desligar();
            }else {
                ligar();
        }
    }
}
        
    
    
    

