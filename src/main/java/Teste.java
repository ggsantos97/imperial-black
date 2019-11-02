import java.util.ArrayList;
import java.util.List;

import com.imperialblackapi.model.Comanda;
import com.imperialblackapi.model.Produto;
import com.imperialblackapi.service.ComandaService;

public class Teste {
	public static void main(String[] args) {
		Produto p1 = new  Produto();
		p1.setProduto("coca");
		Produto p2 = new Produto();
		p2.setProduto("guaraná");
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p2);
		produtos.add(p1);
		
		Comanda c = new Comanda();
		c.setMesa(4);
		c.setCliente("Gustavo");
		c.setProdutos(produtos);
				

		ComandaService service = new ComandaService();
		c = service.add(c);
		
		System.out.println("Olá" + c.getCliente() + "Sua comanda foi criada com sucesso");
	}
}
