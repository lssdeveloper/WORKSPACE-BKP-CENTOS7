package br.com.acangasolucoes.erp.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.acangasolucoes.erp.model.Colaborador;
import br.com.acangasolucoes.erp.model.Endereco;

@ManagedBean
@SessionScoped
public class ColaboradoresManager implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Colaborador> colaboradores = new ArrayList<>();
	private Colaborador colaboradorEdicao = new Colaborador();
	private Endereco enderecoEdicao;
	
	public ColaboradoresManager() {
		List<Endereco> enderecosJoao = new ArrayList<>();
		enderecosJoao.addAll(Arrays.asList(
				new Endereco("Rua José Fonseca", "1000", "Centro", "Uberlândia"),
				new Endereco("Av. Cesário Alvim", "12", "Brasil", "Belo Horizonte"),
				new Endereco("Av. Afonso Pena", "1280", "Centro", "Uberaba")));
		
		colaboradores.add(new Colaborador("123.123.123-11", "João da Silva Albuquerque", 
				"(34) 3238-1111", "(34) 9 9999-7716", "joao@algaworks.com", 
				"Minas Gerais", new Date(), true, "Colaborador especial\nÉ gente boa!", enderecosJoao));
		
		colaboradores.add(new Colaborador("333.333.123-11", "Maria Abadia das Couves Teixeira", 
				"(11) 4000-1234", "(11) 9 8888-1122", "maria@algaworks.com", 
				"São Paulo", null, false, null, new ArrayList<>()));
		
		colaboradores.add(new Colaborador("444.444.123-11", "Paula Maria de Souza Mendes", 
				"(31) 2233-4455", "(31) 9 9433-2282", "paula@algaworks.com", 
				"Minas Gerais", null, false, null, new ArrayList<>()));
	}
	
	public void novoEndereco() {
		enderecoEdicao = new Endereco();
	}
	
	public String novoColaborador() {
		colaboradorEdicao = new Colaborador();
		return "CadastroColaborador?faces-redirect=true";
	}
	
	public void salvar() {
		if (!colaboradores.contains(colaboradorEdicao)) {
			colaboradores.add(colaboradorEdicao);
		}
		colaboradorEdicao = new Colaborador();
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Colaborador salvo com sucesso!"));
	}

	public List<Colaborador> getColaboradors() {
		return colaboradores;
	}

	public Colaborador getColaboradorEdicao() {
		return colaboradorEdicao;
	}

	public void setColaboradorEdicao(Colaborador colaboradorEdicao) {
		this.colaboradorEdicao = colaboradorEdicao;
	}

	public Endereco getEnderecoEdicao() {
		return enderecoEdicao;
	}

	public void setEnderecoEdicao(Endereco enderecoEdicao) {
		this.enderecoEdicao = enderecoEdicao;
	}
	
}