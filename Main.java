import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        CalculoComissao comissaoJunior = new ComissaoJunior();
        CalculoComissao comissaoSenior = new ComissaoSenior();

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Senioridade do vendedor: \n1 - Sênior\n2 - Júnior");
        int senioridade = scanner.nextInt();

        System.out.print("Digite o valor do venda: ");
        Double venda = scanner.nextDouble();

        switch (senioridade) {
            case 1 -> {
                Vendedor vendedor01 = new Vendedor(nome, venda, comissaoSenior);
                System.out.println("\nVendedor: "+ vendedor01.getNome() + "\nComissão da venda: " + vendedor01.calcularComissao(venda));
            }
            case 2 -> {
                Vendedor vendedor02 = new Vendedor(nome, venda, comissaoJunior);
                System.out.println("\nVendedor: "+ vendedor02.getNome() + "\nComissão da venda: " + vendedor02.calcularComissao(venda));
            }
            default -> System.out.println("Valor inválido!");
        }
    }
}
