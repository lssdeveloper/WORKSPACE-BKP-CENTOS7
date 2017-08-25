package com.tpcomportamental.controller;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

@ManagedBean(name = "plPergunta1Bean")
public class PLPergunta1Bean {
	
	public void abrePergunta2(){
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        options.put("draggable", false);        
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("pergunta2", options, null);    
      
	}
	public void aoRetornoDaPergunta2(SelectEvent event) {

		RequestContext.getCurrentInstance().closeDialog(event.getObject());
	}	
}
