
package atividade1_4;
import java.util.Scanner;

public class Ativ1_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome[] = new String[15];
        String hospede;
        int menu, i=0;
        
        do{ System.out.print("\n|Digite 1- Cadastrar\n");
            System.out.print("|Digite 2- Pesquisar\n");
            System.out.print("|Digite 3- Sair\n");
            System.out.print("|Escolha sua opção\n");
            menu= entrada.nextInt();
            
            switch(menu){
                case 1:
                    if(i<15){
                        System.out.println("Digite o nome do hóspede:");
                        entrada.nextLine();
                        nome[i]=entrada.nextLine();
                        i++;
                    }else{
                        System.out.println("Limite Máximo atingido!");
                    }
                    break;
                case 2:
                    System.out.println("Pesquise o nome do hóspede?\nDigite exatamente igual:");
                    entrada.nextLine();
                    hospede= entrada.nextLine();
                    
                    for(i=0; i<15; i++){
                        if (nome[i].equals(hospede)){
                            System.out.println("Hóspede encontrado: " + nome[i] +" no índice: " + (i));
                            break;
                            
                        }else if (!nome[i].equals (hospede) && i == 15){
                            System.out.println("Hóspede não encontrado.");
                            break;
                        }
                    }
                case 3:
                    System.out.println("Fim do programa");
                    break;
                    
                default:
                  System.out.println("Digite um número válido: ");
                  break;
                
            
               
            
            
            }
        }while(menu!=3);
        
        entrada.close();
    
    
    }
    
}
