public class Vendedor extends Pessoa implements Cadastrar_Listar{

    @Override
    public void cadastrar() {

    }

    @Override
    public void listar() {

    }

    public Vendedor(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }
}
