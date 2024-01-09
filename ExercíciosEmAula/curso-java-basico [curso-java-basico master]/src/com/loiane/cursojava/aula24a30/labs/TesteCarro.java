
package com.loiane.cursojava.aula24a30.labs;

import com.loiane.cursojava.aula24a30.labs.Carro;


public class TesteCarro {
    
   
   
    public static void main(String[] args) {
        //criar OBJETO- VARIOS CARROS
        Carro imposto = new Carro();
        
        Carro fusca= new Carro();
        fusca.marca= "Volkswagem";
        fusca.cor= "Bege";
        fusca.modelo= "Itamar";
        fusca.passageiros= 5;
        fusca.placa= "imm-8899";
        fusca.volumeTanque= 50;
        fusca.consumo= 10;
        
        
        Carro sw4= new Carro();
        sw4.marca= "Toyota";
        sw4.cor= "Branca";
        sw4.modelo= "Gabinada";
        sw4.passageiros= 5;
        sw4.placa= "KIT-0048";
        sw4.volumeTanque= 80;
        sw4.consumo= 15;
        
        Carro kombi= new Carro();
        kombi.marca= "Volkswagem";
        kombi.cor="Vermelha" ;
        kombi.modelo="Corujinha";
        kombi.passageiros=9;
        kombi.placa="KIU_2012";
        kombi.volumeTanque=80;
        kombi.consumo=12;
        
        System.out.println("Meu Fusquinha:");
        System.out.println("Modelo: " + fusca.modelo);
        System.out.println("Cor: " + fusca.cor);
        System.out.println("Marca: " + fusca.marca);
        System.out.println("Placa: " + fusca.placa);
        System.out.println("Passageiros: " + fusca.passageiros);
        fusca.exibirAutonomia();
        double autonomia= fusca.obterAutonomia();
        System.out.println("A autonomia do fusca é: " + autonomia);
        System.out.println("A autonomia do fuscuita é: " + fusca.obterAutonomia());
        
        double qtdeCombustivel = fusca.calcularCombustivel(150);
        double qtdeCombustivel2 = fusca.calcularCombustivel(300);
        System.out.println("Para andar 150 km, gasto " + qtdeCombustivel + " litros de combustível. ");
        System.out.println("Para andar 150 km, gasto " + qtdeCombustivel2 + " litros de combustível. ");
        
        double valorImpostoVenda = imposto.pagarImposto(10000, 1.65);
        System.out.println("O imposto a ser pago na venda será de R$ " + valorImpostoVenda );

        System.out.println("Carro do meu tio");
        System.out.println("Modelo: " + sw4.modelo);
        System.out.println("Cor: " + sw4.cor);
        System.out.println("Marca: " + sw4.marca);
        System.out.println("Placa: " + sw4.placa);
        System.out.println("Passageiros: " + sw4.passageiros+"\n");
        sw4.exibirAutonomia();
        
        System.out.println("Carro dos Sonhos");
        System.out.println("Modelo: " + kombi.modelo);
        System.out.println("Cor: " + kombi.cor);
        System.out.println("Marca: " + kombi.marca);
        System.out.println("Placa: " + kombi.placa);
        System.out.println("Passageiros: " + kombi.passageiros+"\n");
        kombi.exibirAutonomia();
    }
    
}
