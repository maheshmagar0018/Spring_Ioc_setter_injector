package org.jsp.setter_injector;

public class Tv {
	
	private int id;
	private String name;
	private String brand;
	private double price;
	
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
	
	public void tvDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(brand);
		System.out.println(price);
	}
	
	public void on()
	{
		System.out.println("Tv Object Started");
	}
	
	public void off()
	{
		System.out.println("Tv Object deleted");
	}
	
	

}
