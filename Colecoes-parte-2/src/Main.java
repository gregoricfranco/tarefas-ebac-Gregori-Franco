import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Digite os nomes e sexo separados por traço");

        String[] nomes = leituraDeDados().split(",");
        List<Pessoa> pessoas = Arrays.stream(nomes)
                .map(nomeSexo -> new Pessoa(nomeSexo.split("-")[0], nomeSexo.split("-")[1]))
                .collect(Collectors.toList());

        List<Pessoa> sexoFeminino = new ArrayList<>();
        List<Pessoa> sexoMasculino = new ArrayList<>();
        pessoas.forEach(pessoa-> {
            if (pessoa.getSexo().equals("f")) {
                sexoFeminino.add(pessoa);
            }else{
                sexoMasculino.add(pessoa);
            }
        });

        System.out.println("Lista de sexo Masculino");
       sexoMasculino.forEach(masculino -> System.out.println("Nome: "+masculino.getNome()+ "Sexo: "+ masculino.getSexo()));

       System.out.println("Lista de sexo feminino");
       sexoFeminino.forEach(feminino -> System.out.println("Nome: "+feminino.getNome()+ "Sexo: "+ feminino.getSexo()));

    }

    private static String leituraDeDados() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}