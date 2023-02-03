package com.miempresa.ejemplo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EscribirPedidosJson {
	public static void main(String[] args) {
		List<Pizzas> pedidos = new ArrayList<Pizzas>();
		
		pedidos.add(new Pizzas(
				"Trek", 
				"Emonda", 
				"Road Bike", 
				2500, 
				56));
		
		pedidos.add(new Pizzas(
				"Specialized", 
				"Tarmac", 
				"Road Bike", 
				3000, 
				54));
		
		pedidos.add(new Pizzas(
				"Giant", 
				"Defy", 
				"Road Bike", 
				2000,
				58));
		
		pedidos.add(new Pizzas(
				"Cannondale", 
				"Synapse", 
				"Endurance Bike", 
				1500,
				55));
		
		pedidos.add(new Pizzas(
				"Santa Cruz",
				"Tallboy", 
				"Mountain Bike",
				3500, 
				18));

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File("data/pedidos2.json"), pedidos);
			System.out.println("JSON file created successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Pizzas {
	private String pedido;
	private String domicilio;
	private String tipo;
	private int precio;
	private int topping;


	public Pizzas(String brand, String model, String type, int price, int frameSize) {
		this.pedido = brand;
		this.domicilio = model;
		this.tipo = type;
		this.precio = price;
		this.topping = frameSize;
	}

	public String getBrand() {
		return pedido;
	}

	public void setBrand(String brand) {
		this.pedido = brand;
	}

	public String getModel() {
		return domicilio;
	}

	public void setModel(String model) {
		this.domicilio = model;
	}

	public String getType() {
		return tipo;
	}

	public void setType(String type) {
		this.tipo = type;
	}

	public int getPrice() {
		return precio;
	}

	public void setPrice(int price) {
		this.precio = price;
	}

	public int getFrameSize() {
		return topping;
	}

	public void setFrameSize(int frameSize) {
		this.topping = frameSize;
	}


}