package br.ucsal.controleEstoque;

public interface IEstoque {
	
	void cadastroCategoria (int codigo, String categoria);
	void removerCategoria (int codigo);
	void alterarCategoria (int codigo, String novaCategoria);
	//void consultarCategoria (int codigo);
	
	void cadastroProduto ();
	void removerProduto();
	void alterarProduto();
	//void consultarProduto();
	
	void imprimirEstoque();
	void imprimirCategoria();
	void imprimirProdutoCategoria();
	
	double custoMedio();
}
