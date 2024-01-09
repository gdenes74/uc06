
package com.loiane.cursojava.aula24a30.labs;


public class Exer02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero= "123456";
        conta.agencia= "1234";
        conta.especial= true;
        conta.limiteEspecial= 500;
        conta.valorEspecialUsado=0;
        conta.saldo= -10;
        
        System.out.println("Saldo da conta ag:" + conta.agencia +" cc:"+ conta.numero + " = " + conta.saldo);
        
        boolean saqueEfetuado = conta.realizarSaque(10);
            if (saqueEfetuado){
                System.out.println("Saque efetuado com sucesso");
                System.out.println("Saldo atual da conta " + conta.saldo);
                //conta.consultarSaldo(); PODERIA TER SIDO COLOCADO ASSIM COM METODO 
            }else {
                System.out.println("Não foi possível realzar saque. Saldo insuficiente ");
            }
            saqueEfetuado = conta.realizarSaque(500);
            System.out.println("Tentativa de saque de R$500,00 reais");
            if (saqueEfetuado){
                System.out.println("Saque efetuado com sucesso");
                //System.out.println("Saldo atual da conta " + conta.saldo); outra maneira abaixo descrito com metodo
                conta.consultarSaldo();
            }else {
                System.out.println("Não foi possível realzar saque. Saldo insuficiente ");
            }
            System.out.println("Depósito de R$500,00 reais");
            conta.depositar(500);
            conta.consultarSaldo();
            
            if (conta.verificarUsoChequeEspecial()){
                System.out.println("Está usando cheque especial."); 
            }else {
                System.out.println("Não está utilizando o cheque especial. ");
            }
            conta.realizarSaque(600);
            conta.consultarSaldo();
            
            if (conta.verificarUsoChequeEspecial()){
                System.out.println("Está usando cheque especial."); 
            }else {
                System.out.println("Não está utilizando o cheque especial. ");
            }
    }
    
}
