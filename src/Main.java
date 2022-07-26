public class Main {
    public static void main(String[] args) {
        Cliente teste = new Cliente();

        teste.cadastrar();
        System.out.println(teste);



        /*Vendedor teste2 = new Vendedor();
        teste2.cadastrar();
        System.out.println(teste2);*/

        System.out.println();
        Cliente cliente1 = new Cliente();
        cliente1.cadastrar();
        cliente1.listar();
        System.out.println();
        Cliente cliente = new Cliente();
        cliente.cadastrar();
cliente.listar();

        Vendedor vendedor1 = new Vendedor();
        vendedor1.cadastrar();
        vendedor1.listar();
        System.out.println();
    }
}