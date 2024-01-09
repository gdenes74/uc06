
package atividade1_3a;

import java.util.Scanner;


public class Atividade1_3a {   


    public static void main(String[] args) {
        
	double vlrPadraoDiaria, soma=0.0;
        int idadeHospede=0, contIdademenor=0, contIdadeMaior=0,contIdade=0, cont=0;
	double vlrDiariaMaior=0, vlrDiaria=0, somaTotal=0,vlrDiariaMenor=0;
        String nomeHospede="";	
    
	      
        Scanner entrada = new Scanner(System.in);
        System.out.println(" O valor padrão da diária no Hotel é de : \n");
        vlrPadraoDiaria= entrada.nextDouble();
        System.out.println(vlrPadraoDiaria + "(R$  valor padrão da diária )\n");
					
	
        do{           
            System.out.println(" nome do hóspede \n ou digite pare(em minúscula)\n ");
            entrada.nextLine(); 
            nomeHospede=entrada.nextLine();
            
            
            if (!nomeHospede.equals("pare")){
             
                System.out.println("Qual idade hóspede\n");
                idadeHospede = entrada.nextInt();
                      
                
                if (idadeHospede <= 4) {
                    System.out.println(nomeHospede + " possui gratuidade\n");
                    System.out.println("possui " + idadeHospede + " anos \n");
                    vlrDiariaMenor = vlrPadraoDiaria * 0;
                    contIdademenor++;
                } else if (idadeHospede >= 80) {
                    System.out.println("nomeHospede, \n( paga meia )\n");
                    System.out.println("possui " + idadeHospede + " anos \n");
                    vlrDiariaMaior = (vlrPadraoDiaria / 2);
                    contIdadeMaior++;
                } else {
                    System.out.println(nomeHospede + "(nome do hóspede)\n");
                    System.out.println(idadeHospede + " (idade)\n");
                    vlrDiaria = vlrPadraoDiaria;
                    contIdade++;
                }
                   
                  
            } 
            somaTotal = vlrDiariaMaior + vlrDiariaMenor + vlrDiaria;
            }while(!nomeHospede.equals("pare"));
   
        System.out.println(" Total de hospedagens R$ " + somaTotal + ";" + contIdademenor + " gratuidade(s);" + contIdadeMaior + " meia (s) ");        
            entrada.close();
    }   
}
  
