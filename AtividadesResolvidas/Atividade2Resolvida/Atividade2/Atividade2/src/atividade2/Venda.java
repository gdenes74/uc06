
package atividade2;


public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda() {
    }
    
    

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }

    public void setPacoteViagem(PacoteViagem pacoteViagem) {
        this.pacoteViagem = pacoteViagem;
    }
    public double conversor(double valor, double valorDolar){
        return valor*valorDolar;
    }
    public String totalPacote(int porcentagem, double valor, double valorDolar){
        double dolar = pacoteViagem.valorLucro(porcentagem, valor);
        double real = conversor(dolar,  valorDolar);
        return 
                "Valor total do pacote em Dólar: " + dolar + "\n"+
                 "Valor total do pacote em Reais: " + real;
    }
    
    @Override
    public String toString(){
        return " Nome do cliente: " + nomeCliente +
                "\nForma de pagamento: " + formaPagamento+
                "\nHotel: " + pacoteViagem.getHospedagem().getDescricao()+
                "\nTransporte: " + pacoteViagem.getTransporte().getTipo();
         }
    
}
