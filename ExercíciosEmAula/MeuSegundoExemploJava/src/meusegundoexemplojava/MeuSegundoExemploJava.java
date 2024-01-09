
package meusegundoexemplojava;
import java.util.Scanner;


public class MeuSegundoExemploJava {

    
    public static void main(String[] args) { 
        //definicao de variável
        String disciplina;

        Scanner entrada = new Scanner(System.in);
        //Entrada de dados
        System.out.println("Informe o nome da disciplina ");
        disciplina = entrada.nextLine();
        System.out.println("Disciplina: " + disciplina);    
       
    }
    
}
