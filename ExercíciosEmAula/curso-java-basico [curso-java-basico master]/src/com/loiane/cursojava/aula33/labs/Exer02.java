
package com.loiane.cursojava.aula33.labs;

public class Exer02 {
    /*Crie uma classe para representar um conta corrente, que possuí um número, um saldo
    um status que informa se ela é especial ou não, um limite. Desenvolva métodos para realizar 
    saque(verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo
    e verificar se o cliente está usando cheque especial ou não. Desenvolva um programa para testar
    essa classe.  */
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero ("123456");
        conta.setAgencia("1234");
        conta.setEspecial (true);
        conta.setLimiteEspecial(500);
        conta.setValorEspecialUsado(0);
        conta.setSaldo(-10);
        
        System.out.println("Saldo da conta ag:" + conta.getAgencia() +" cc:"+ conta.getNumero() + " = " + conta.getSaldo());
        
        boolean saqueEfetuado = conta.realizarSaque(10);
            if (saqueEfetuado){
                System.out.println("Saque efetuado com sucesso");
                System.out.println("Saldo atual da conta " );
                conta.consultarSaldo();
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
