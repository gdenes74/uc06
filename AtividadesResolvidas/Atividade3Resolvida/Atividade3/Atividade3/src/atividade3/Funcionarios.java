
package atividade3;


public abstract class Funcionarios {
 protected String nome;
 protected String CPF; 
 protected String endereco;
 protected String telefone; 
 protected String setor;

 public Funcionarios(){
    
 }

 public Funcionarios(String nome,String CPF,String endereco,String telefone,String setor){
    this.nome = nome;
    this.CPF = CPF;
    this.endereco = endereco;
    this.telefone = telefone;
    this.setor = setor;
 }
 
            //(Gettters e setters)
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

    public String getCPF(){
        return CPF;
    }
    public void setCPF(){
        this.CPF = CPF;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
              //(Metodos)
    
    public abstract void mostraDados();
    public abstract Double porcentagem(Integer porcentagem);
    public abstract Double salario();

}