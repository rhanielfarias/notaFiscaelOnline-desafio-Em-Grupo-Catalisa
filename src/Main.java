import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner input = new Scanner(System.in);
        ControleRegistro controleRegistro = new ControleRegistro();

        System.out.println("-----------------------------------------------");
        System.out.println("Bem-vindo(a) ao menu de registro de vendas.");
        System.out.println("-----------------------------------------------");

        while (continuar) {

            System.out.println("Digite o número [1] - Para cadastrar um vendedor");
            System.out.println("Digite o número [2] - Para cadastrar cliente");
            System.out.println("Digite o número [3] - Para cadastrar a venda");
            System.out.println("Digite o número [4] - Para exibir os vendedores cadastrados");
            System.out.println("Digite o número [5] - Para exibir os clientes cadastrados");
            System.out.println("Digite o número [6] - Para exibir vendas cadastradas");
            System.out.println("Digite o número [7] para buscar vendas por CPF");
            System.out.println("Digite o número [8] - Para sair do sistema de registro\n");

            System.out.print("Informe um número e execute uma das opções apresentadas: ");
            int opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    controleRegistro.cadastrarVendedor();
                    break;
                case 2:
                    controleRegistro.cadastrarCliente();
                    break;
                case 3:
                    controleRegistro.cadastrarVenda();
                    break;
                case 4:
                    System.out.println("\n----------------------------");
                    System.out.println("Vendedores cadastrados: ");
                    System.out.println("------------------------------");
                    controleRegistro.listarVendedor();
                    break;
                case 5:
                    System.out.println("\n----------------------------");
                    System.out.println("Clientes cadastrados: ");
                    System.out.println("------------------------------");
                    controleRegistro.listarClientes();
                    break;
                case 6:
                    System.out.println("\n----------------------------");
                    System.out.println("Vendas cadastradas: ");
                    System.out.println("------------------------------");
                    controleRegistro.listarVendas();
                    break;
                case 7:
                    controleRegistro.buscarPorCpf();
                    break;
                case 8:
                    continuar = false;
                    System.out.println("Ok, saindo do sistema de registro... ");
                    break;
                default:
                    System.out.println("Opção invalida, digite um número das opções abaixo \n");
            }
        }

    }
}
