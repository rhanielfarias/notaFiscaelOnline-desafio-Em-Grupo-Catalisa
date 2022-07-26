public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.cadastrar();
        cliente1.listar();
        System.out.println();


        Vendedor vendedor1 = new Vendedor();
        vendedor1.cadastrar();
        vendedor1.listar();
        System.out.println();
    }
}