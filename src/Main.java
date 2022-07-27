import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner input = new Scanner(System.in);
        ControleRegistro vendedor = new ControleRegistro();
        ControleRegistro vendas = new ControleRegistro();

        while (continuar) {
            System.out.println("------------------------------------- ");
            System.out.println("Bem-vindo(a) ao menu de registro de vendas.");
            System.out.println("-------------------------------------");
            System.out.println("Digite o n�mero [1] - Para cadastrar uma venda");
            System.out.println("Digite o n�mero [2] - Para cadastrar um vendedor");
            System.out.println("Digite o n�mero [3] - Para exibir a lista de vendedores cadastrados");
            System.out.println("Digite o n�mero [4] - Para sair do menu\n");

            System.out.print("Informe um n�mero e execute uma das op��es acima: ");
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
                    continuar = false;
                    System.out.println("Ok, saindo do menu de registro de vendas...");
                    break;
                default:
                    System.out.println("Op��o invalida, digite um n�mero das op��es acima");
            }
        }

    }
}
