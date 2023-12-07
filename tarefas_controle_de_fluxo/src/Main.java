import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        List<Integer> listaNotas = new ArrayList<Integer>();

        for(int i =0; i<=3; i++) {
            listaNotas.add((int)myObj.nextDouble());
        }
        media(listaNotas);
    }

    public static void media(List<Integer>notas){
        Integer media = 0;
        for(Integer nota : notas){
            media +=  nota;
        }
        aprovacao(media / notas.toArray().length);

    }

    public static void aprovacao(Integer nota){
        System.out.println("Sua nota :" + nota);
        if(nota >= 7){
            System.out.println("Aprovado");
        }
        if(nota < 7 && nota >=5 ){
            System.out.println("Recuperacao");
        }
        if(nota < 5){
            System.out.println("Reprovado");
        }
    }
}