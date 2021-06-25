package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedidos;
import modelo.umpramuitos.Pedido;


public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido  = new Pedido();
		Produto produto = new Produto("Geladeira",2789.99);
		ItemPedidos item = new ItemPedidos(pedido,produto,10);
		
		dao
			.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();

			
			
	}
}
