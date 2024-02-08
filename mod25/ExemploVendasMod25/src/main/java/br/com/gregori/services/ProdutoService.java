/**
 * 
 */
package br.com.gregori.services;

import br.com.gregori.dao.IProdutoDAO;
import br.com.gregori.domain.Produto;
import br.com.gregori.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
