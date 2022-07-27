import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public  class ControleRegistro {
    List<Usuario> listaDeVendedores = new ArrayList<>();
    List<Usuario> listaDeClientes = new ArrayList<>();
    List<Vendas> listaDeVendas = new ArrayList<>();
Scanner  input = new Scanner(System.in);

    public void cadastrarVendedor() {
        System.out.println("-------------------------------------");
        System.out.print("Informa��es de cadastro - Vendedor\n");
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
        }
        else {
            System.out.println("ERRO: Este vendedor já está cadastrado.");
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
        System.out.println("-------------------------------------");
        System.out.print("Informa��es de cadastro - Cliente\n");
        System.out.println("-------------------------------------");
        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.print("Informe seu e-mail: ");
        String email = input.nextLine();
        System.out.print("Informe seu cpf: ");
        String cpf = input.nextLine();
        if (!procurarCpf(listaDeClientes, cpf)) {
            Usuario cliente = new Cliente(nome, email, cpf);
            listaDeClientes.add(cliente);
        }
        else {
            System.out.println("ERRO: Este cliente já está cadastrado.");
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
        }
        else {
            System.out.println("ERRO: CPF n�o reconhecido");
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
