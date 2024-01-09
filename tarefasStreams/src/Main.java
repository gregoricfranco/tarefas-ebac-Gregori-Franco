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
                .map(nomeSexo -> nomeSexo.split("-"))
                .map(nomeSexos -> new Pessoa(nomeSexos[0], nomeSexos[1]))
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