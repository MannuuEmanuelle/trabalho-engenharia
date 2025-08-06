public class Vendedor {
    private InterfaceComissao comissao;

    public void setComissao (InterfaceComissao comissao){
        this.comissao = comissao;
    }

    public double calcularComissao(double valor){
        return comissao.calcular(valor);
    }
}
