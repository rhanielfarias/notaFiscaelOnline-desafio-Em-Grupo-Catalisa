public abstract class Vendas {

    private String dataRegistro;

    public Vendas(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
