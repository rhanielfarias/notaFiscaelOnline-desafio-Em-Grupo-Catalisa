
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControleRegistro {
    List<Usuario> listaDeVendedores = new ArrayList<>();
    List<Usuario> listaDeClientes = new ArrayList<>();
    List<Vendas> listaDeVendas = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void cadastrarVendedor(String nomeDoVendedor, String emailDoVendedor, String cpfDoVendedor) {


        Boolean cpfExistente = procurarCpf(listaDeVendedores, cpfDoVendedor);
        if (Boolean.FALSE.equals(cpfExistente)) { // se cpf existente for igual a false
            Usuario vendedor = new Vendedor(nomeDoVendedor, emailDoVendedor, cpfDoVendedor);
            listaDeVendedores.add(vendedor);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Vendedor(a) já cadastrado(a).");
        }
    }

    public void listarVendedor() {
        for (Usuario listaVendedores : listaDeVendedores) {
            System.out.println("Nome do vendedor: " + listaVendedores.getNome());
            System.out.println("E-mail do vendedor: " + listaVendedores.getEmail());
            System.out.println("Cpf do vendedor: " + listaVendedores.getCpf());
            System.out.println();
        }
    }

    public void cadastrarCliente(String nomeCliente, String emailCliente, String cpfCliente) {

        Boolean cpfExistenteCliente = procurarCpf(listaDeClientes, cpfCliente);
        if (Boolean.FALSE.equals(cpfExistenteCliente)) {
            Usuario cliente = new Cliente(nomeCliente, emailCliente, cpfCliente);
            listaDeClientes.add(cliente);
            System.out.println("O seu cadastrado foi efetuado com sucesso.\n");
        } else {
            System.out.println("ERRO: Cliente já cadastrado(a).");
        }
    }

    public void listarClientes() {
        for (Usuario listaDeCliente : listaDeClientes) {
            System.out.println("Nome do cliente: " + listaDeCliente.getNome());
            System.out.println("E-mail do cliente: " + listaDeCliente.getEmail());
            System.out.println("Cpf do cliente: " + listaDeCliente.getCpf());
            System.out.println();
        }
    }

    public void cadastrarVenda() {

        String cpf = input.nextLine();
        if (procurarCpf(listaDeVendedores, cpf) || procurarCpf(listaDeClientes, cpf)) {
            System.out.print("Informe a data de registro da venda: ");
            String dataRegistroDoProduto = input.next();
            System.out.print("Informe o valor: ");
            double valorVendaDoProduto = input.nextDouble();
            System.out.println();
            Vendas vendas = new Vendas(dataRegistroDoProduto, valorVendaDoProduto);
            listaDeVendas.add(vendas);
        } else {
            System.out.println("ERRO: Cpf não cadastrado. Favor realizar o seu cadastro.");
        }
    }


    /* public void cadastrarVenda() {
         System.out.println();
         String cpf = input.next();
         if (!procurarCpf(listaDeVendedores, cpf) || !procurarCpf(listaDeClientes, cpf)) {
           // System.out.print("Informe o seu cpf: ");
            // String teste = input.next();
             System.out.print("Informe a data de registro da venda: ");
             String dataRegistroDoProduto = input.next();
             System.out.print("Informe o valor: ");
             double valorVendaDoProduto = input.nextDouble();
             System.out.println();
             Vendas vendas = new Vendas(dataRegistroDoProduto, valorVendaDoProduto);
             listaDeVendas.add(vendas);

         } else {
             System.out.println("ERRO: Cpf não cadastrado. por favor realize o seu cadastro.");
         }
     }
 */
    public void listarVendas() {
        for (Vendas listaDeVenda : listaDeVendas) {
            System.out.println("Data de registro da venda: " + listaDeVenda.getDataRegistro());
            System.out.println("Valor do produto: " + listaDeVenda.getValorVenda());
            System.out.println();
        }
    }

    public Boolean procurarCpf(List<Usuario> listaUsuarios, String cpf) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }


}
