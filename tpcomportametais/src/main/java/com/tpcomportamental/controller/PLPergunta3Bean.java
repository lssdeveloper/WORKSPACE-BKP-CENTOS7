package com.tpcomportamental.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

@ManagedBean(name = "plPergunta3Bean")
public class PLPergunta3Bean implements Serializable {

	private static final long serialVersionUID = 1L;
	
//	private String val;
	private int qtdOpcaoA;
	private int qtdOpcaoB;
	private int qtdOpcaoC;	
//	private List<String> lstOpcA;
//	private List<String> lstOpcB;
//	private List<String> lstOpcC;	
	private String opcao;
	private List<String> opcoes;
	private String descricao;
	private List<String> decricoes;
	
	@PostConstruct
	public void init(){
//		System.out.println(this.opcao);
//		if (this.opcao == "") {
//			this.qtdOpcaoA = 0;
//			this.qtdOpcaoB = 0;
//			this.qtdOpcaoC = 0;			
//		}
//		lstOpcA = new ArrayList<String>();
//		lstOpcB = new ArrayList<String>();
//		lstOpcC = new ArrayList<String>();		
		
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
	
	public int getQtdOpcaoA() {
		return qtdOpcaoA;
	}

	public void setQtdOpcaoA(int qtdOpcaoA) {
		this.qtdOpcaoA = qtdOpcaoA;
	}

	public int getQtdOpcaoB() {
		return qtdOpcaoB;
	}

	public void setQtdOpcaoB(int qtdOpcaoB) {
		this.qtdOpcaoB = qtdOpcaoB;
	}

	public int getQtdOpcaoC() {
		return qtdOpcaoC;
	}

	public void setQtdOpcaoC(int qtdOpcaoC) {
		this.qtdOpcaoC = qtdOpcaoC;
	}

//	public List<String> getLstOpcA() {
//		return lstOpcA;
//	}
//
//	public void setLstOpcA(List<String> lstOpcA) {
//		this.lstOpcA = lstOpcA;
//	}
//
//	public List<String> getLstOpcB() {
//		return lstOpcB;
//	}
//
//	public void setLstOpcB(List<String> lstOpcB) {
//		this.lstOpcB = lstOpcB;
//	}
//
//	public List<String> getLstOpcC() {
//		return lstOpcC;
//	}
//
//	public void setLstOpcC(List<String> lstOpcC) {
//		this.lstOpcC = lstOpcC;
//	}

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


//	public String getVal() {
//		return val;
//	}
//
//	public void setVal(String val) {
//		this.val = val;
//	}
	
	public void closeDialog() {
//		System.out.println(opcao);
		RequestContext.getCurrentInstance().closeDialog(" Opção:"+ opcao);
	}
	public void abrePergunta1() {
		Map<String, Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        options.put("draggable", false);        
        options.put("modal", true);
		RequestContext.getCurrentInstance().openDialog("pergunta1", options, null);
	}

	public void aoRetornoDaPergunta1(SelectEvent event) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Perfil de Liderança", event.getObject().toString()));
	}	
	
	public void abrePergunta2(){
		RequestContext.getCurrentInstance().closeDialog(" Opção:"+ opcao);
		System.out.println("Abre pergunta 2: opcao = "+this.opcao);			
		if (this.opcao == "A") {
			this.qtdOpcaoA++;
		}else if (this.opcao == "B") {
			this.qtdOpcaoB++;			
		}else {
			this.qtdOpcaoC++;
		}
		System.out.println("qtdOpcaoA = "+this.qtdOpcaoA + " qtdOpcaoB = "+this.qtdOpcaoB + " qtdOpcaoC = "+this.qtdOpcaoC );		
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        options.put("draggable", false);        
        options.put("modal", true);
        this.opcao = null;

        RequestContext.getCurrentInstance().openDialog("pergunta2", options, null);    
      
	}
	public void aoRetornoDaPergunta2(SelectEvent event) {
        System.out.println("aoRetornoDaPergunta2: opcao = "+this.opcao);
		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}	
	
	public void abrePergunta3(){
		RequestContext.getCurrentInstance().closeDialog(" Opção:"+ opcao);
		System.out.println("Abre pergunta 3: opcao = "+this.opcao);			
		if (this.opcao == "A") {
			this.qtdOpcaoA++;
		}else if (this.opcao == "B") {
			this.qtdOpcaoB++;			
		}else {
			this.qtdOpcaoC++;
		}
		System.out.println("qtdOpcaoA = "+this.qtdOpcaoA + " qtdOpcaoB = "+this.qtdOpcaoB + " qtdOpcaoC = "+this.qtdOpcaoC );		
		
		Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        options.put("draggable", false);        
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("pergunta3", options, null);		
	}
	public void aoRetornoDaPergunta3(SelectEvent event) {

		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}	
}
