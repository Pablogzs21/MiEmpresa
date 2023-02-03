package com.miempresa.ejemplo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class LeerBicicletaJson {
	public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            // Leer archivo JSON y mapearlo a un objeto Java
            Bicycles bikes = mapper.readValue(new File("data/bicicleta.json"), Bicycles.class);
            
            // Imprimir información de bicicletas
            for (Bicycle bike : bikes.getBicycles()) {
                System.out.println("Brand: " + bike.getBrand());
                System.out.println("Model: " + bike.getModel());
                System.out.println("Type: " + bike.getType());
                System.out.println("Price: " + bike.getPrice());
                System.out.println("Frame Size: " + bike.getFrameSize());
                System.out.println("Material: " + bike.getMaterial());
                System.out.println("Gears: " + bike.getGears());
                System.out.println("--------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Bicycles {
    private Bicycle[] bicycles;

    public Bicycle[] getBicycles() {
        return bicycles;
    }

    public void setBicycles(Bicycle[] bicycles) {
        this.bicycles = bicycles;
    }
}

class Bicycle {
    private String brand;
    private String model;
    private String type;
    private int price;
    private int frameSize;
    private String material;
    private int gears;

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
