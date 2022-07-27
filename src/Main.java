import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner input = new Scanner(System.in);
        ControleRegistro vendedor = new ControleRegistro();
        ControleRegistro vendas = new ControleRegistro();

        while (continuar) {
            System.out.println("-----------");
            System.out.println("Bem-vindo ao registro de vendas. Por favor Escolha uma das op��es abaixo:");
            System.out.println("1 - Adicionar uma venda");
            System.out.println("2 - Adicionar um vendedor");
            System.out.println("3 - Listar os vendedores cadastrados");
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    vendas.cadastrarProduto();
                    break;
                case 2:
                    vendedor.cadastrarVendedor();

                    break;
                case 3:
                    vendedor.listarVendedor();
                    break;
                case 4:
                    break;
                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }

    }
}
