package com.tpcomportamental.controller;

import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import com.tpcomportamental.model.Car;
import com.tpcomportamental.model.PerfilDeLideranca;

@ManagedBean
public class PerfilDeLiderancaBean {

    public void showMessage() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life", "Echoes in eternity.");
         
        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }
    
    public void chooseCar() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        options.put("draggable", false);
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("selectCar", options, null);
    } 
    
    public void onCarChosen(SelectEvent event) {
        Car car = (Car) event.getObject();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Selected", "Id:" + car.getId());
         
        FacesContext.getCurrentInstance().addMessage(null, message);
    }   
    
    public void testePerfil() {
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("resizable", false);
        options.put("draggable", false);
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("selecionaPerfil", options, null);
    }  
    
    public void noPerfilEscolhido(SelectEvent event) {
        PerfilDeLideranca pl = (PerfilDeLideranca) event.getObject();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Perfil Selecionado", "Id:" + pl.getId());
         
        FacesContext.getCurrentInstance().addMessage(null, message);
    }    
}
