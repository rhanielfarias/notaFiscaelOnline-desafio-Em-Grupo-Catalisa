public abstract class Produto{


    private double valorProduto;
    private String nomeDoProduto;

    public Produto(double valorProduto, String nomeDoProduto) {
        this.valorProduto = valorProduto;
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
}
