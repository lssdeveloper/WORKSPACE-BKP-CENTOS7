package com.tpcomportamental.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import com.tpcomportamental.model.Car;
import com.tpcomportamental.service.CarService;

@ManagedBean(name = "dfCarsView")
@ViewScoped
public class DFCarsView implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Car> cars;

	@ManagedProperty("#{carService}")
	private CarService service;

	@PostConstruct
	public void init() {
		cars = service.createCars(9);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setService(CarService service) {
		this.service = service;
	}

	public void selectCarFromDialog(Car car) {
		RequestContext.getCurrentInstance().closeDialog(car);
	}
}