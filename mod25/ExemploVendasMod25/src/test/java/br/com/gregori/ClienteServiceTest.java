
package br.com.gregori;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.gregori.dao.ClienteDaoMock;
import br.com.gregori.dao.IClienteDAO;
import br.com.gregori.domain.Cliente;
import br.com.gregori.exceptions.TipoChaveNaoEncontradaException;
import br.com.gregori.services.ClienteService;
import br.com.gregori.services.IClienteService;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Gregori");
		cliente.setCidade("São Jose");
		cliente.setEnd("Endereco");
		cliente.setEstado("SC");
		cliente.setNumero(20);
		cliente.setTel(4899999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Gregori");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Gregori", cliente.getNome());
	}
}
