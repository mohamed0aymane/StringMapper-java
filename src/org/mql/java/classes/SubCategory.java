package org.mql.java.classes;

public class SubCategory {

	private int id ;
	private String name;
	private Product product;
	private 	Category  catergory;
	public SubCategory() {
		// TODO Auto-generated constructor stub
	}
	public SubCategory(int id, String name, Product product) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
	}
	
	public SubCategory(int id, String name, Product product, Category catergory) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
		this.catergory = catergory;
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
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Category getCatergory() {
		return catergory;
	}
	public void setCatergory(Category catergory) {
		this.catergory = catergory;
	}
	
}
