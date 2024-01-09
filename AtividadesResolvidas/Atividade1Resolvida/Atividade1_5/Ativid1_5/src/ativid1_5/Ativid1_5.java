
package ativid1_5;

import java.util.Scanner;


public class Ativid1_5 {

   
    public static void main(String[] args) {
        
        
        
        int andar, quarto, i, j; 
        char opcao;
        String [][] ocupacao = new String[4][3];
        Scanner entrada= new Scanner (System.in);
        
        
        //zerando uma matriz  
        for (i=0; i<4; i++){
            for (j=0; j<3; j++){
                ocupacao [i][j]="Desocupado";
                
            }
         }
        do{
            System.out.println("Informe andar e quarto: ");
            System.out.println("Digite o andar: ");
            andar = entrada.nextInt();
            System.out.println("Digite o quarto: ");
            quarto = entrada.nextInt();
            
                ocupacao[andar-1][quarto-1]= "Ocupado";
                
                System.out.println("Deseja informar outra ocupação? (S/N) ");
                opcao = entrada.next().charAt(0);
                
            
            
        }   while  (opcao!='N') ;
        
        for (i=0; i<4; i++){
            System.out.println((i+1)+ "°andar");
            for (j=0; j<3; j++){
                System.out.println("- quarto " + (j+1) + " " + ocupacao[i][j]);
            }
        }
    }
    
}

