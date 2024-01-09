
package com.loiane.cursojava.aula33.labs;


public class Aluno {
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        nomeDisciplinas= new String[3];
        notasDisciplinas =new double[3][4];      
    }

    public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas= new String[3];
        this.notasDisciplinas =new double[3][4]; 
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the nomeDisciplinas
     */
    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    /**
     * @param nomeDisciplinas the nomeDisciplinas to set
     */
    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    /**
     * @return the notasDisciplinas
     */
    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    /**
     * @param notasDisciplinas the notasDisciplinas to set
     */
    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
     public void mostrarInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
         System.out.println("Nome do curso: " + getNomeCurso());
         
         for (int i=0; i<getNotasDisciplinas().length; i++){
             System.out.println("Notas da disciplina " + getNomeDisciplinas() [i]);
             for (int j=0; j<getNotasDisciplinas()[i].length; j++){
                 System.out.print(getNotasDisciplinas()[i][j]+ " ");
             }
             System.out.println();
         }
    }
    public boolean verificarAprovado(int indice){
        double soma=0;
        
        for (int i=0; i< getNotasDisciplinas()[indice].length;i++){
            soma += getNotasDisciplinas() [indice][i];
        }
        double media = soma/4;
        if (media>=7){
            return true;
        }            
        return false;
        
    }
    private double obterMedia(int indice ){
        double soma=0;
        
        for (int i=0; i< getNotasDisciplinas()[indice].length;i++){
            soma += getNotasDisciplinas() [indice][i];
        }
        double media = soma/4;
        return media;
        
    }
    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomeDisciplinas [pos] = nomeDisciplina;
    }
}
