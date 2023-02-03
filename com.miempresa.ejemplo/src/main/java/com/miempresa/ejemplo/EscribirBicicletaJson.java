package com.miempresa.ejemplo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EscribirBicicletaJson {
	public static void main(String[] args) {
		List<Bicycle2> bicycles = new ArrayList<Bicycle2>();
		
		bicycles.add(new Bicycle2(
				"Trek", 
				"Emonda", 
				"Road Bike", 
				2500, 
				56, 
				"Carbon Fiber", 
				22));
		
		bicycles.add(new Bicycle2(
				"Specialized", 
				"Tarmac", 
				"Road Bike", 
				3000, 
				54, 
				"Carbon Fiber", 
				20));
		
		bicycles.add(new Bicycle2(
				"Giant", 
				"Defy", 
				"Road Bike", 
				2000,
				58, 
				"Aluminum", 
				18));
		
		bicycles.add(new Bicycle2(
				"Cannondale", 
				"Synapse", 
				"Endurance Bike", 
				1500,
				55, 
				"Carbon Fiber", 
				16));
		
		bicycles.add(new Bicycle2(
				"Santa Cruz",
				"Tallboy", 
				"Mountain Bike",
				3500, 
				18, 
				"Carbon Fiber", 
				12));

		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File("data/bicleta2.json"), bicycles);
			System.out.println("JSON file created successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Bicycle2 {
	private String brand;
	private String model;
	private String type;
	private int price;
	private int frameSize;
	private String material;
	private int gears;

	public Bicycle2(String brand, String model, String type, int price, int frameSize, String material, int gears) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.frameSize = frameSize;
		this.material = material;
		this.gears = gears;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getFrameSize() {
		return frameSize;
	}

	public void setFrameSize(int frameSize) {
		this.frameSize = frameSize;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

}
