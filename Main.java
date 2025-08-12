import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfaceComissao comissaoJunior = new ComissaoJunior();

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do venda: ");
        Double venda = scanner.nextDouble();

        Vendedor vendedor01 = new Vendedor(nome, comissaoJunior);
        double calculo = vendedor01.calcularComissao(venda);
        System.out.println("Vendedor: "+ vendedor01.getNome() + "\nComissão da venda: " + calculo);
    }
}
