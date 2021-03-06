package pojo;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private int id;
	private String name;
	private float price;
	
	public Product() {
		this.name = "PRODUCT";
		this.price = (float) 100.0;
	}
	
}
