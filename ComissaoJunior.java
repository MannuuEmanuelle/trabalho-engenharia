public class ComissaoJunior implements InterfaceComissao {

    @Override
    public double calcular(double valor){
        return valor * 0.1;
    }
}
