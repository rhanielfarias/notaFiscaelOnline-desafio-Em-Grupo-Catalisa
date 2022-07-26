import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor extends Pessoa implements Cadastrar_Listar {

    ArrayList<Vendedor> listaDeVendedores = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public Vendedor() {
        super();
    }


    @Override
    public void cadastrar() {
        System.out.print("CADASTRO VENDEDOR\n");
        System.out.print("Informe seu nome: ");
        String nome = input.next();
        System.out.print("Informe seu e-mail: ");
        String email = input.next();
        System.out.print("Informe seu cpf: ");
        String cpf = input.next();
        Vendedor vendedor = new Vendedor(nome, email, cpf);
        listaDeVendedores.add(vendedor);

    }


    @Override
    public void listar() {

    }

    public Vendedor(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }
}
