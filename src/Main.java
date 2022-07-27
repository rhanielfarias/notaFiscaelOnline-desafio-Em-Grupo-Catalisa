import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner input = new Scanner(System.in);
        ControleRegistro vendedor = new ControleRegistro();
        ControleRegistro vendas = new ControleRegistro();

        while (continuar) {
<<<<<<< HEAD
            System.out.println("-----------");
            System.out.println("Bem-vindo ao registro de vendas. Por favor Escolha uma das opï¿½ï¿½es abaixo:");
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
=======
            System.out.println("-------------------------------------");
            System.out.println("Bem-vindo(a) ao menu de registro de vendas.");
            System.out.println("-------------------------------------");
            System.out.println("Digite o número [1] - Para cadastrar uma venda");
            System.out.println("Digite o número [2] - Para cadastrar um vendedor");
            System.out.println("Digite o número [3] - Para exibir a lista de vendedores cadastrados");
            System.out.println("Digite o número [4] - Para sair do menu\n");

            System.out.print("Informe um número e execute uma das opções acima: ");
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
                    System.out.println("Opção invalida, digite um número das opções acima");
>>>>>>> 32b73d4d027aee8034e740ff95dd5b41e7e74602
            }
        }

    }
}
