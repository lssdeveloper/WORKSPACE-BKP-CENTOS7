package com.tpcomportamental.controller;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

@ManagedBean(name = "plRootBean")
public class PLRootBean {

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


}
