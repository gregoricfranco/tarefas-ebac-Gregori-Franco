
public class Main {
    public static void main(String[] args) {

        Assalariado assalariado = new Assalariado();
        assalariado.setSalario(100d);
        assalariado.setNome("salariado");
        assalariado.imprimirValores();

        Comissionado comissionado = new Comissionado();
        comissionado.setNome("comissionado");
        comissionado.setTotalVenda(100d);
        comissionado.setTotalComissao(0.22d);
        comissionado.imprimirValores();
    }



}