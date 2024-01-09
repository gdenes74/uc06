
package atividade1_2;

import java.util.Scanner;


public class Atividade1_2 {
    
public static void main(String[] args) {
    int idadeA, idadeB;
    String nomeA, nomeB,quartoA, quartoB;
    
    Scanner entrada = new Scanner (System.in);
    System.out.println("Digite o nome do primeiro hóspede:");
    nomeA=entrada.nextLine();
    System.out.println( nomeA + " (Nome cliente)");
    
    System.out.println("Digite a idade do primeiro hóspede:");
    idadeA=entrada.nextInt();
    System.out.println( idadeA + " (idade do cliente)");
    
    
    System.out.println("Digite o nome do segundo hóspede:");
    entrada.nextLine();
    nomeB=entrada.nextLine();
    System.out.println(nomeB + " (Nome do cliente)");
        
    System.out.println("Digite a idade do segundo hóspede:");
    idadeB=entrada.nextInt();
    System.out.println( idadeB + "(idade do cliente)");
    
    if (idadeA>idadeB && idadeA>=60){
        System.out.println("Quarto A: " + nomeB + " com desconto de 40%; Quarto B: " + nomeA);
    }
    else{
        System.out.println("Quarto A: " + nomeB + "com desconto de 40%, Quarto B: " + nomeA);    
         }
    
    }
    
}
