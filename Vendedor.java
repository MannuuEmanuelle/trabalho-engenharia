public class Vendedor {
    private String nome;
    private Double valorVenda;
    private CalculoComissao comissao;

    public Vendedor(String nome, Double valorVenda, CalculoComissao comissao){
        this.nome = nome;
        this.valorVenda = valorVenda;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorVenda(){
        return valorVenda;
    }
    public CalculoComissao getComissao() {
        return comissao;
    }
    
    public void setComissao (CalculoComissao comissao){
        this.comissao = comissao;
    }

    public Double calcularComissao(Double valorVenda){
        return comissao.calcular(valorVenda);
    }

    
}
