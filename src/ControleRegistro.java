import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleRegistro {
    List<Usuario> listaDeVendedores = new ArrayList<>();
    List<Usuario> listaDeClientes = new ArrayList<>();
    List<Vendas> listaDeVendas = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void cadastrarVendedor() {
        System.out.println("\n-------------------------------------");
        System.out.print("Informações de cadastro - Vendedor\n");
        System.out.println("-------------------------------------");
        System.out.print("Informe seu nome: ");
        String nomeVendedor = input.nextLine();
        System.out.print("Informe seu e-mail: ");
        String emailVendedor = input.nextLine();
        System.out.print("Informe seu cpf: ");
        String cpfVendedor = input.nextLine();
        System.out.println();

        if (!procurarCpf(listaDeVendedores, cpfVendedor)) {
            Usuario vendedor = new Vendedor(nomeVendedor, emailVendedor, cpfVendedor);
            listaDeVendedores.add(vendedor);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Vendedor(a) já cadastrado(a).");
        }
    }

    public void listarVendedor() {
        for (int i = 0; i < listaDeVendedores.size(); i++) {
            System.out.println("Nome do vendedor: " + listaDeVendedores.get(i).getNome());
            System.out.println("E-mail do vendedor: " + listaDeVendedores.get(i).getEmail());
            System.out.println("Cpf do vendedor: " + listaDeVendedores.get(i).getCpf());
            System.out.println();
        }
    }

    public void cadastrarCliente() {
        System.out.println("\n-------------------------------------");
        System.out.print("Informações de cadastro - Cliente\n");
        System.out.println("-------------------------------------");
        System.out.print("Informe seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("Informe seu e-mail: ");
        String emailCliente = input.nextLine();
        System.out.print("Informe seu cpf: ");
        String cpfCliente = input.nextLine();
        System.out.println();

        if (!procurarCpf(listaDeClientes, cpfCliente)) {
            Usuario cliente = new Cliente(nomeCliente, emailCliente, cpfCliente);
            listaDeClientes.add(cliente);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Cliente já cadastrado(a).");
        }
    }

    public void listarClientes() {
        for (int i = 0; i < listaDeClientes.size(); i++) {
            System.out.println("Nome do cliente: " + listaDeClientes.get(i).getNome());
            System.out.println("E-mail do cliente: " + listaDeClientes.get(i).getEmail());
            System.out.println("Cpf do cliente: " + listaDeClientes.get(i).getCpf());
            System.out.println();
        }
    }


    public void cadastrarVenda() {
        System.out.println("Informa CPF");
        String cpf = input.nextLine();
        if (procurarCpf(listaDeVendedores, cpf) || procurarCpf(listaDeClientes, cpf)) {
            System.out.print("Informe a data de registro da venda: ");
            String dataRegistroDoProduto = input.nextLine();
            System.out.print("Informe o valor: ");
            double valorVendaDoProduto = input.nextDouble();
            System.out.println();
            Vendas vendas = new Vendas(dataRegistroDoProduto, valorVendaDoProduto);
            listaDeVendas.add(vendas);

            System.out.print("Deseja cadastrar mais alguma venda? ([1] - sim / [2] - não): ");
            int respostaDoUsuariaro = input.nextInt();
input.nextLine();
            if (respostaDoUsuariaro == 1) {// respostaDoUsuariaro ==
                cadastrarVenda();
            } else {
                System.out.println("Nenhuma venda a cadastrar ");
            }

        } else {
            System.out.println("ERRO: Cpf não cadastrado. Favor realizar o seu cadastro.");
        }
    }

    public void listarVendas() {
        for (int i = 0; i < listaDeVendas.size(); i++) {
            System.out.println("Data de registro da venda: " + listaDeVendas.get(i).getDataRegistro());
            System.out.println("Valor do produto: " + listaDeVendas.get(i).getValorVenda());
            System.out.println();
        }
    }

    public boolean procurarCpf(List<Usuario> listaUsuarios, String cpf) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }


}
