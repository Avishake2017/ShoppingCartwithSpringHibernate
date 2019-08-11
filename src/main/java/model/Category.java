package model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
			@Id
			private int category_id;
			private String category_name;
			private String category_description;
			@OneToMany
			private Set<Product> prod;
			
			public Set<Product> getProd() {
				return prod;
			}
			public void setProd(Set<Product> prod) {
				this.prod = prod;
			}
			@GeneratedValue
			public int getCategory_id() {
				return category_id;
			}
			public void setCategory_id(int category_id) {
				this.category_id = category_id;
			}
			public String getCategory_name() {
				return category_name;
			}
			public void setCategory_name(String category_name) {
				this.category_name = category_name;
			}
			public String getCategory_description() {
				return category_description;
			}
			public void setCategory_description(String category_description) {
				this.category_description = category_description;
			}
			@Override
			public String toString() {
				return "Category [category_id=" + category_id + ", category_name=" + category_name
						+ ", category_description=" + category_description + "]";
			}
			
}
