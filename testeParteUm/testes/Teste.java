import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class Teste {


    /***
     *
     * exemplo de nomes
     * Jesus -masculino, Maria -feminino, Pedro -masculino, Sara -feminino, Ruth -feminino, Gabriel -masculino
     *
     */
    @Test
    public void onlyWomen() {

        List<String> dadosPessoas = Arrays.asList("Jesus -masculino", "Maria -feminino", "Pedro -masculino", "Sara -feminino", "Ruth -feminino", "Gabriel -masculino");

        Map<String, List<Pessoa>> mulheres = Main.filtroMulheres(dadosPessoas);

        long totalMulheres = mulheres.values().stream()
                .flatMap(List::stream)
                .count();

        long totalHomens = mulheres.getOrDefault("masculino", List.of()).size();


        Assert.assertEquals(3, totalMulheres);
        Assert.assertNotEquals(2, totalMulheres);
        Assert.assertEquals(0, totalHomens);


    }


}
