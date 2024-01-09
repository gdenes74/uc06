
package atividade2;

import java.util.Scanner;


public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Hospedagem hospedagem = new Hospedagem();
        Transporte transporte = new Transporte();
        PacoteViagem pacoteViagem = new PacoteViagem();
        Venda venda = new Venda();
        
        
        
        
        System.out.println("Bem vindo Agência de viagens:");
        System.out.println("Preencha os dados da viagem:");
        System.out.println();
        
        System.out.println("Qual o destino desejado: ");
        String destino= sc.nextLine();
        System.out.println("Quantos dias deseja se hospedar: ");
        int quantidadeDias= sc.nextInt();
        
        System.out.println();
        System.out.println("Agora vamos escolher um hotel:");
        System.out.print("Digite o nome do Hotel: ");
        String descricao = sc.nextLine();
        sc.nextLine();
        System.out.println("Qual o valor da diaria do Hotel:");
        double valorDiaria=sc.nextDouble();
        hospedagem = new Hospedagem(descricao, valorDiaria);
        
        System.out.println();
        System.out.println("Agora vamos escolher um meio de transporte: ");
        System.out.println("Qual o meio de transporte (Avião, Ônibus, trem ...: ");
        sc.nextLine();
        String tipoTransporte = sc.nextLine();
        System.out.println("Qual o valor do transporte:");
        double valorTransporte = sc.nextDouble();
        transporte = new Transporte(tipoTransporte, valorTransporte);
        
        pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);
        
        System.out.println();
        System.out.println("Dados do pagamento: ");
        System.out.println("Por favor, digite o nome do cliente");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        System.out.println("Digite a forma de pagamento ( Dinheiro, crédito, débito, pix):");
        String formaPagamento = sc.nextLine();
        venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);
        
        System.out.println();
        System.out.println("Valor do dólar hoje: ");
        double valorDolar= sc.nextDouble();
        System.out.println("Valor da porcentagem de lucro: ");
        int porcentagem = sc.nextInt();
        
        System.out.println();
        System.out.println(venda.toString());
        System.out.println("Valor total sem lucro: " + pacoteViagem.totalPacote());
        
        System.out.println(venda.totalPacote(porcentagem, pacoteViagem.totalPacote(), valorDolar));
        
        
        
                
                
                
    }              
}
