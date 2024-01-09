
package atividade3;


public class Assalariados extends Funcionarios{
    protected Double salario;


            //método construtor e herança
    public Assalariados(){
        super();
    }
    public Assalariados(String nome,String CPF,String endereco,String telefone,String setor,Double salario){
        super(nome,CPF,endereco,telefone,setor);
        this.salario = salario;
    }
                //(Gettters e setters)
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }

    @Override
    public void mostraDados(){
        System.out.println();
        System.out.println("NOME: "+getNome());
        System.out.println("CPF: " +getCPF());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Setor: "+getSetor());
        System.out.println("Salario: "+salario());
        System.out.println();
    }

    @Override
    public Double porcentagem(Integer porcentagem){
        return salario = (porcentagem*salario)/100 + salario;
    }

    @Override
    public Double salario(){
        return this.salario;
    }

}
