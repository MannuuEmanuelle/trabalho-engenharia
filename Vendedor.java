public class Vendedor {
    private String nome;
    private Double valorVenda;
    private CalculoComissao comissao;
    
    public Vendedor(String nome, double valorVenda, CalculoComissao comissao){
        this.nome = nome;
        this.valorVenda = valorVenda;
        this.comissao = comissao;
    }

    public void setComissao (CalculoComissao comissao){
        this.comissao = comissao;
    }

    public double calcularComissao(double valor){
        return comissao.calcular(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorVenda(){
        return valorVenda;
    }
    public CalculoComissao getComissao() {
        return comissao;
    }
    
}
