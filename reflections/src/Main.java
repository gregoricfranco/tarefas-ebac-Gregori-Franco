import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<?> classe = Produto.class;
        System.out.println(classe);
        System.out.println(classe.getAnnotation(Tabela.class));
        Annotation[] anotacoes = classe.getDeclaredAnnotations();
        for (Annotation an : anotacoes) {
            System.out.println(an);
        }
    }
}