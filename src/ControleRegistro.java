import java.lang.reflect.Array;
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
        String nome = input.nextLine();
        System.out.print("Informe seu e-mail: ");
        String email = input.nextLine();
        System.out.print("Informe seu cpf: ");


        String cpf = input.nextLine();
        if (!procurarCpf(listaDeVendedores, cpf)) {
            Usuario vendedor = new Vendedor(nome, email, cpf);
            listaDeVendedores.add(vendedor);
            System.out.println("O seu cadastrado foi efetuado com sucesso.");
        } else {
            System.out.println("ERRO: Vendedor(a) já cadastrado(a).");
        }
    }


    public void listarVendedor() {
        for (int i = 0; i < listaDeVendedores.size(); i++) {
            System.out.println(listaDeVendedores.get(i).getNome());
            System.out.println(listaDeVendedores.get(i).getEmail());
            System.out.println(listaDeVendedores.get(i).getCpf());
        }
    }

    public void cadastrarCliente() {
        System.out.println("\n-------------------------------------");
        System.out.print("Informações de cadastro - Cliente\n");
        System.out.println("-------------------------------------");
        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.print("Informe seu e-mail: ");
        String email = input.nextLine();
        System.out.print("Informe seu cpf: ");
        String cpf = input.nextLine();
        if (procurarCpf(listaDeClientes, cpf)) {
            Usuario cliente = new Cliente(nome, email, cpf);
            listaDeClientes.add(cliente);
        } else {
            System.out.println("ERRO: Cliente já cadastrado(a)");
        }
    }

    public void cadastrarProduto() {
        System.out.print("Informe seu cpf: ");
        String cpf = input.nextLine();
        if (procurarCpf(listaDeVendedores, cpf)) {
            System.out.println("Informe a data de registro do produto");
            String dataRegistro = input.nextLine();
            System.out.println("Informe o valor");
            double valorVenda = input.nextDouble();
            Vendas vendas = new Vendas(dataRegistro, valorVenda);
            listaDeVendas.add(vendas);
        } else {
            System.out.println("ERRO: Cpf não reconhecido");
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
