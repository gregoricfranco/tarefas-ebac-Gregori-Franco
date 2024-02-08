import org.example.TesteCliente;
import org.junit.Assert;
import org.junit.Test;



public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Gregori");
		cli.adicionarNome1("Gregori");

		Assert.assertEquals("Gregori", cli.getNome());
	}
}
