package com.imperialblackapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;
		
		@Column(name="PRODUTO") 
		private String produto;
		
		@Column(name="PRECO") 
		private Integer preco;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getProduto() {
			return produto;
		}
		public void setProduto(String produto) {
			this.produto = produto;
		}
		public Integer getPreco() {
			return preco;
		}
		public void setPreco(Integer preco) {
			this.preco = preco;
		}
		 
		
	
}
