
package com.loiane.cursojava.aula33.labs;

import java.util.Scanner;

public class Exer03 {
    
/*Escreva uma class para representar um Aluno. Adicione atributos relacionados
às características de um Aluno, como nome, matricula, curso que está matriculado, 
nome de 3 disciplinas. Desenvolva um método para verificar se o aluno está aprovado
(nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que pede as informaççoes do aluno ao 
usuário e ao final informa o nome das disciplinas, mostra as notas e mostra se o 
aluno foi aprovado ou não.*/
public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());
        
        System.out.println("Entre com o nome do curso");
        aluno.setNomeCurso ( scan.next());
        
        System.out.println("Entre com a matrícula");    
        aluno.setMatricula(scan.next());
                
        //aluno.nomeDisciplinas=new String[3];
        for (int i=0; i< aluno.getNomeDisciplinas().length;i++){
            System.out.println("Entre com o nome da disciplina " + i);    
            aluno.setNomeDisciplinaPos(i, scan.next());
        }
        aluno.getNotasDisciplinas=new double [3][4];
        for (int i=0; i< aluno.getNotasDisciplinas().length;i++){
            System.out.println("Otendo notas da disciplina " + aluno.nomeDisciplinas[i]);  
            for (int j=0; j< aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j]=scan.nextDouble();
            }
            
        }
        aluno.mostrarInfo();
        
        for (int i=0; i<aluno.nomeDisciplinas.length;i++){
          if (aluno.verificarAprovado(i))  {
              System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
          }else{
              System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado");
          }
    }
        
    
}
