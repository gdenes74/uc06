
package tiposdedados;


public class EncontreTamanhoPrimeiroNome {
    public static void main(String[] args) {
        String nome = "João da Silva", primeiroNome;
        int fimNome, tamanhoNome;
        
        //tamanho do nome completo
        tamanhoNome= nome.length();
        //encontra o índice no qual ocorre o primeiro caractere de espaço
        fimNome = nome.indexOf(" ");
        //extrai o primeiro nome
        primeiroNome= nome.substring(0,fimNome);
        
        //monstra na tela o resultado
        System.out.println("Tamanho total: " + tamanhoNome + " caracteres;\nPrimeiro nome: " + primeiroNome);
    }
}
