package org.mql.java;

import org.mql.java.classes.Category;
import org.mql.java.classes.Product;
import org.mql.java.classes.SubCategory;

public class Examples {

	public Examples() {
		exp01();
	}
	void exp01() {	
		Product product2=new Product();
		SubCategory subCategory=new SubCategory(1,"electronics",product2,new Category());
		Category category=new Category(1,"iphone",subCategory);
		Product product1=new Product(1,"telephone",9000.00,category,1,new int[]{1,2,3}) ;
		product1.setPrd(product1);
		
        System.out.println(StringMapper.toString(product1));
		
	}
	
	public static void main(String[] args) {
		new Examples();
	}
}
