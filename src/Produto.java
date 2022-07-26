public class Produto extends Vendas{

    private String nome;
    private double valorProduto;

    public Produto(String dataRegistro, String nome, double valorProduto) {
        super(dataRegistro);
        this.nome = nome;
        this.valorProduto = valorProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
}
