public abstract class Carro {
    private String modelo;
    private Double preco;

    private String cor;


    public Carro(String modelo, Double preco, String cor) {
        this.modelo = modelo;
        this.preco = preco;
        this.cor = cor;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
