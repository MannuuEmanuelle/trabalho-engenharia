public class Vendedor {
    private String nome;
    private InterfaceComissao comissao;
    
    public Vendedor(String nome, InterfaceComissao comissao){
        this.nome = nome;
        this.comissao = comissao;
    }

    public void setComissao (InterfaceComissao comissao){
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

    public InterfaceComissao getComissao() {
        return comissao;
    }
    
}
