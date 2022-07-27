public class Vendas {

    private String dataRegistro;
    private double valorVenda;

    public Vendas(String dataRegistro, double valorVenda) {
        this.dataRegistro = dataRegistro;
        this.valorVenda = valorVenda;

    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
}

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;

    }
}
