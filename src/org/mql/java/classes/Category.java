package org.mql.java.classes;

public class Category {
	private int id;
	private String name;
	private SubCategory subCategory;
	public Category() {
		// TODO Auto-generated constructor stub
	}
	 public Category(int id, String name,SubCategory subCategory) {
	        this.id = id;
	        this.name = name;
	        this.subCategory=subCategory;
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
	public SubCategory getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}
	 

}
