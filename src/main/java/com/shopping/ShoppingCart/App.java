package com.shopping.ShoppingCart;

import daos.ProductDao;
import daos.ProductDaoImpl;
import model.Category;
import model.Product;

public class App 
{
    public static void main( String[] args )
    {
       Category category = new Category();
       
       category.setCategory_name("Electronics");
       category.setCategory_description("Electronics Product");
       
       Product product  = new Product();
       
       product.setProduct_name("XBox One");
       product.setProduct_description("Gaming Console");
      product.setCategory(category);
      ProductDao pd = new ProductDaoImpl();
      pd.addProduct(product);
       
       /*Product product1 = new Product();
       product1.setProduct_id(2);
       product1.setProduct_name("Trimmer");
       product1.setProduct_description("Shaving Product");
       
       Product product2 = new Product();
       product2.setProduct_id(3);
       product2.setProduct_name("Dell");
       product2.setProduct_description("Laptop");
       */
      
       
    }
}
