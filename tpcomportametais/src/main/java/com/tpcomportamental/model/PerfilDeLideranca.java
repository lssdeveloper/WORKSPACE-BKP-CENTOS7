package com.tpcomportamental.model;

import java.io.Serializable;
import java.util.List;

public class PerfilDeLideranca implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String pergunta;
	private List<String> respostas;
	private Character alternativa;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPerguntas() {
		return pergunta;
	}
	public void setPerguntas(String perguntas) {
		this.pergunta = perguntas;
	}
	public Character getAlternativa() {
		return alternativa;
	}
	public void setAlternativa(Character alternativa) {
		this.alternativa = alternativa;
	}
	public void setRespostas(List<String> respostas) {
		this.respostas = respostas;
	}
	public List<String> getRespostas() {
		return respostas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		PerfilDeLideranca other = (PerfilDeLideranca) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
