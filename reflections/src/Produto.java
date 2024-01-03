@Tabela("classe principal")
public class Produto {

    private int cod;

    private String name;

    public Produto(int cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
