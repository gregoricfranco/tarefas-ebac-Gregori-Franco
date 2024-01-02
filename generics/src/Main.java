import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(new Honda("Civic",125.548D,"Preto"));
        carros.add(new Fiat("Argos", 65.588D, "Vermelho"));

        carros.forEach(carro -> System.out.println(carro));

    }
}