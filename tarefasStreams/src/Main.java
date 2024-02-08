import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /***
         *
         * exemplo de nomes
         * Jesus -masculino, Maria -feminino, Pedro -masculino, Sara -feminino, Ruth -feminino, Gabriel -masculino
         *
         */
        System.out.println("Digite os nomes e sexo :");
        List<String> nomesSexo = Arrays.asList(leituraDeDados().split(","));

        Map<String, List<Pessoa>> listaPessoas = nomesSexo.stream()
                .map(nomeSexo -> new Pessoa(nomeSexo.split("-")[0], nomeSexo.split("-")[1]))
                .filter(pessoa -> pessoa.getSexo().equals("feminino"))
                .collect(Collectors.groupingBy(pessoa -> pessoa.getSexo()));

        listaPessoas.forEach((sexo, pessoas)->{
            System.out.println(sexo);
            pessoas.forEach(pessoa ->
                    System.out.println(pessoa.getNome()));
        });

    }


    public static String leituraDeDados() {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        return entrada;
    }

}