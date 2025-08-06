public class ComissaoSenior implements InterfaceComissao {

    @Override
    public double calcular(double valor){
        return valor * 0.15;
    }
}
