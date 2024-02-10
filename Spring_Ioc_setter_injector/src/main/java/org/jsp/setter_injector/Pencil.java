package org.jsp.setter_injector;

public class Pencil {
	
	private String brand;
	private double price;
	private String color;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void load()
	{
		System.out.println("Object Created...");
	}
	
	public void unload()
	{
		System.out.println("Object deleted...");
	}
	
	

}
