package com.tpcomportamental.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean(name="plOpcoesBean")
public class PLOpcoesBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String opcao;
	private List<String> opcoes;
	private String descricao;
	private List<String> decricoes;
	
	@PostConstruct
	public void init(){
		/*opção*/
		opcoes = new ArrayList<String>();
		opcoes.add("A");
		opcoes.add("B");
		opcoes.add("C");
		
		/*Descrição*/
		decricoes = new ArrayList<String>();
		decricoes.add("Só as que, por algum motivo específico, você não pode "
				+ "fazer por si próprio.");
		decricoes.add("Qualquer uma que não goste de fazer.");
		decricoes.add("Aquelas que podem proporcionar maior desenvolvimento para a equipe.");
	}
	
	public String getOpcao() {
		return opcao;
	}
	public void setOpcao(String opcao) {
		this.opcao = opcao;
	}
	public List<String> getOpcoes() {
		return opcoes;
	}
	public void setOpcoes(List<String> opcoes) {
		this.opcoes = opcoes;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<String> getDecricoes() {
		return decricoes;
	}
	public void setDecricoes(List<String> decricoes) {
		this.decricoes = decricoes;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PLOpcoesBean other = (PLOpcoesBean) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
	
	
	

}
