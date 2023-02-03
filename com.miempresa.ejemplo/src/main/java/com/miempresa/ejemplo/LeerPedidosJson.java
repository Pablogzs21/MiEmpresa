package com.miempresa.ejemplo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class LeerPedidosJson {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
            Pizzas pedidos = mapper.readValue(new File("data/pedidos.json"), Pizzas.class);
            
            // Imprimir información de bicicletas
            for (Pizza pedido : pedidos.getPizzas()) {
                System.out.println("Pedido: " + pedido.getPedido());
                System.out.println("Tipo: " + pedido.getTipo());
                System.out.println("Domicilio: " + pedido.getDomicilio());
                System.out.println("Precio: " + pedido.getPrecio());
                System.out.println("Topping: " + pedido.getTopping());
                System.out.println("--------------");
            }
            
		}catch(IOException e){
            e.printStackTrace();
		}
	}
}

class Pizzas{
    private Pizza[] pizzas;

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizza) {
        this.pizzas = pizza;
    }
}

class Pizza{
	
	private int pedido;
	private String tipo;
	private String domicilio;
	private int precio;
	private String topping;
	
	public int getPedido() {
		return pedido;
	}
	
	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getTopping() {
		return topping;
	}
	
	public void setTopping(String topping) {
		this.topping = topping;
	}
	
}
