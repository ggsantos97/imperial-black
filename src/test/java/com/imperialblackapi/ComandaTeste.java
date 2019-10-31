package com.imperialblackapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import com.imperialblackapi.model.Comanda;
import com.imperialblackapi.model.Produto;

@SpringBootTest
@WebAppConfiguration
public class ComandaTeste {
	
	
	  
	 public static void main(String[] args) {
		 Comanda c = new Comanda();
		 Produto p = new Produto();
		 Produto p2 = new Produto();
		 p.setProduto("cerveja");
		 p.setPreco(5);
		 p2.setProduto("essencia");
		 p2.setPreco(15);
		 
		 List<Produto> produtos = new ArrayList<Produto>();
		 produtos.add(p);
		 produtos.add(p2);
		 c.setProdutos(produtos);
		 
		 c.setMesa(4);
		 c.setValorTotal((p.getPreco() + p2.getPreco() * 1.5));
		 c.setStatus(true);
		 
		 
	}
	 
}
