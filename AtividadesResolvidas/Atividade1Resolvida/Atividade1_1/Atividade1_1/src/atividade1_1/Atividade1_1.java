
package atividade1_1;

import java.util.Scanner;


public class Atividade1_1 {

    public static void main(String[] args) {
   
    Scanner entrada = new Scanner (System.in);
    int audAlfa = 150, audBeta= 350;
    int audAlfaCadParcial=70;
    int nrConvidados, cadFaltantes;
    
      
    System.out.println(" Digite o número de convidados para o eventos na data requerida? ");
    nrConvidados = entrada.nextInt();
    cadFaltantes = nrConvidados - 150;
    
		 if (nrConvidados<=0 || nrConvidados>350) 
                 {
		  System.out.println(" Número de convidados inválido");
                 }
                 else
                 {
                     if(nrConvidados>0 && nrConvidados <=150)                    
                     { 
                         System.out.println("Use o auditório Alfa");
                     }
                     else
                        if(nrConvidados<=220 && nrConvidados >150)
                            {
                            System.out.println("Use o auditório Alfa" +"\nInclua mais " + cadFaltantes + " cadeiras ");
                             }   
                 
                   else {
                          System.out.println("Use o auditório Beta");
                        }
                }
    }
    }  
