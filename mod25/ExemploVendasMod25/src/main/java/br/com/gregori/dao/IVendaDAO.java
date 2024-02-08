/**
 * 
 */
package br.com.gregori.dao;

import br.com.gregori.dao.generic.IGenericDAO;
import br.com.gregori.domain.Venda;
import br.com.gregori.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
