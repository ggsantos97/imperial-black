package com.imperialblackapi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="TB_COMANDA")

public class Comanda implements Serializable{
	
	@JsonIgnoreProperties({"produtos"})
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_COMANDA")
	private  Long id;
	
	@Column(name="STATUS") 
	 private Boolean status;
	
	@Column(name = "DATA_CRIACAO")
	private Date dtHoraCriacao;
	
	@Column(name = "DATA_FECHAMENTO")
	private Date dtHoraFechamento;
	
	@Column(name ="NUM_MESA")
	private Integer mesa;
	
	@Column(name="VALOR_TOTAL")
	private Double valorTotal;
	
	//@OneToMany
	//@Column(name="ID_PRODUTO")
	//private List<Produto> produtos;

	public Long getIdComanda() {
		return id;
	}

	public void setIdComanda(Long id) {
		this.id = id;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getDtHoraCriacao() {
		return dtHoraCriacao;
	}

	public void setDtHoraCriacao(Date dtHoraCriacao) {
		this.dtHoraCriacao = dtHoraCriacao;
	}

	public Date getDtHoraFechamento() {
		return dtHoraFechamento;
	}

	public void setDtHoraFechamento(Date dtHoraFechamento) {
		this.dtHoraFechamento = dtHoraFechamento;
	}

	public Integer getMesa() {
		return mesa;
	}

	public void setMesa(Integer mesa) {
		this.mesa = mesa;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	/*
	 * public List<Produto> getProdutos() { return produtos; }
	 * 
	 * public void setProdutos(List<Produto> produtos) { this.produtos = produtos; }
	 */
	  
	
	
	
 


		
	
	
}
