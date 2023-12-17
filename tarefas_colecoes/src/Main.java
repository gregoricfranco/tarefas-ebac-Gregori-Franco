import java.util.*;
public class Main {
    public static void main(String[] args) {

    tarefa1();
    tarefa2();

    }
    public static void tarefa1(){
        System.out.println("Digite os nomes separados por vírgulas:");

        List<String> nomes = Arrays.asList(leituraDeDados().split(","));
        Collections.sort(nomes);
        System.out.println("Nomes separados por , ordenados: " + nomes);
    }

    public static void tarefa2(){
        System.out.println("Digite os nomes e sexo :");
        List<String> nomesSexo = Arrays.asList(leituraDeDados().split(","));
        List<Pessoa> nomesPorSexo  = separaListaPorSexo("-", nomesSexo);
        System.out.println("Pessoas separadas por sexo: ");
        for(Pessoa pessoa:  nomesPorSexo){
            System.out.println(pessoa.getNome()+" sexo: "+pessoa.getSexo());
        }
    }

    public static List<Pessoa> separaListaPorSexo(String separador, List<String> nomes) {
        List<Pessoa> nomesSexoslist = new ArrayList<Pessoa>();
        for (String nome : nomes) {
            String[] nomeSexos = nome.split(separador);
            Pessoa pessoa = new Pessoa(nomeSexos[0],nomeSexos[1]);
            nomesSexoslist.add(pessoa);
        }
        nomesSexoslist.sort(Comparator.comparing(Pessoa::getSexo));
        return nomesSexoslist;
    }

     public static String leituraDeDados() {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        return entrada;
    }
}