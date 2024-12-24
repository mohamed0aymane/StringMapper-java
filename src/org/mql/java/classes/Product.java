package org.mql.java.classes;

public class Product {
	private static int id;
	private static String name = "";
	private double price;
	private Category category;
	private Integer a;
	private Product prd;
	private int[] values;
	private static final String anas="";
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name, double price,Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public Product(int id, String name, double price,Category category,Integer a,int[] values) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		
		this.a=a;
		this.setValues(values);
	}


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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Integer getA() {
		return a;
	}


	public void setA(Integer a) {
		this.a = a;
	}


	public Product getPrd() {
		return prd;
	}


	public void setPrd(Product prd) {
		this.prd = prd;
	}


	public int[] getValues() {
		return values;
	}


	public void setValues(int[] values) {
		this.values = values;
	}
	

}
