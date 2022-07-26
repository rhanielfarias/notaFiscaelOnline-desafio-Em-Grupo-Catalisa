import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Pessoa implements Cadastrar_Listar{


    ArrayList<Cliente> listaDeClientes = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public Cliente() {
        super();
    }

    @Override
    public void cadastrar() {
        System.out.println("CADASTRO CLIENTE");
        System.out.println("Informe o seu nome: ");
        String nome = input.next();
        System.out.println("Informe o seu e-mail: ");
        String email = input.next();
        System.out.println("Digite o seu CPF: ");
        String cpf = input.next();
        Cliente cliente = new Cliente(nome, email, cpf);
        listaDeClientes.add(cliente);
    }
    @Override
    public void listar() {


    }

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }




}
