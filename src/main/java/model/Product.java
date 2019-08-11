package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	private int product_id;
	private int product_name;
	private int product_description;
	
			public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getProduct_name() {
		return product_name;
	}
	public void setProduct_name(int product_name) {
		this.product_name = product_name;
	}
	public int getProduct_description() {
		return product_description;
	}
	public void setProduct_description(int product_description) {
		this.product_description = product_description;
	}
			
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_description="
				+ product_description + "]";
	}		
}
