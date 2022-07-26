import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa implements Cadastrar_Listar {


    ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public Cliente() {
        super();
    }

    @Override
    public void cadastrar() {
        System.out.println("-------------------------------------");
        System.out.print("Informa��es de cadastro - Cliente\n");
        System.out.println("-------------------------------------");
        System.out.print("Informe o seu nome: ");
        String nome = input.next();
        System.out.print("Informe o seu e-mail: ");
        String email = input.next();
        System.out.print("Digite o seu CPF: ");
        String cpf = input.next();
        Cliente cliente = new Cliente(nome, email, cpf);
        listaDeClientes.add(cliente);
    }

    @Override
    public void listar() {

        for (int i = 0; i < listaDeClientes.size(); i++) {
            System.out.println(listaDeClientes.get(i).getNome());
            System.out.println(listaDeClientes.get(i).getEmail());
            System.out.println(listaDeClientes.get(i).getCpf());
        }
    }

     public Cliente(String nome, String cpf, String email) {
            super(nome, cpf, email);
        }


    }

