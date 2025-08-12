public class ComissaoJunior implements CalculoComissao {

    @Override
    public double calcular(double valor){
        return valor * 0.1;
    }
}
