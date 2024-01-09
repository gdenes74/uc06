
package com.loiane.cursojava.aula24a30.labs;

public class Carro {
    
     //variáveis das instâncias - atributos
        int passageiros;
        String marca, cor, modelo, placa;
        double consumo, volumeTanque;
        double valorVenda, aliquota;

      //Tipos de Métodos: simples, com retorno e com parametros
        //declaração do método
        //MÉTODO SIMPLES
        void exibirAutonomia(){
            //corpo do método
            System.out.println("A autonomia é: " + consumo * volumeTanque + " km");
            
        }
        // MÉTODO COM RETORNO
                
         double obterAutonomia(){
             System.out.println("Apresentando o método com retorno: ");
             return consumo * volumeTanque;
            
        }
         //MÉTODO COM PARAMETROS
          double calcularCombustivel(double km){
              double qtdeCombustivel=km/consumo;
            return  qtdeCombustivel;
        }
          //Método com retorno duplo
          double pagarImposto(double valorVenda, double aliquota){
              
              double valorImposto = valorVenda*aliquota/100;
              return valorImposto;
          }
          
}
