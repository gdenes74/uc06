
package atividade3;

public class Horistas extends Funcionarios{
    protected Integer horaTrabalhadas;
    protected Double valorDaHora;
                    //método construtor e herança 
    public Horistas(){
        super();
    }

    public Horistas(String nome,String CPF,String endereco,String telefone,String setor,Integer horaTrabalhadas,Double valorDaHora){
        super(nome,CPF,endereco,telefone,setor);
        this.horaTrabalhadas = horaTrabalhadas;
        this.valorDaHora = valorDaHora;
    }
            //(Gettters e setters)
    public Integer getHoraTrabalhadas(){
        return horaTrabalhadas;
    }
    public void setHoraTrabalhadas(Integer horaTrabalhadas){
        this.horaTrabalhadas = horaTrabalhadas;
    }
    

    public Double getValorDaHora(){
        return valorDaHora;
    }
    public void setValorDaHora(Double valorDaHora){
        this.valorDaHora = valorDaHora;
    }

    @Override
    public void mostraDados(){
        System.out.println();
        System.out.println("NOME: "+getNome());
        System.out.println("CPF: " +getCPF());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Setor: "+getSetor());
        System.out.println("Horas trabalhada: "+getHoraTrabalhadas());
        System.out.println("Valor da hora: "+getValorDaHora());
        System.out.println("Diaria: "+salario());
        System.out.println();
    }

    @Override
    public Double porcentagem(Integer porcentagem){
        double total = horaTrabalhadas*valorDaHora;
        total = (total * porcentagem )/100 + total;
        return total;
    }

    @Override
    public Double salario(){
        return horaTrabalhadas*valorDaHora;
    }

}