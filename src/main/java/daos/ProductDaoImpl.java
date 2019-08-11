package daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Product;


@Repository(value="ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao{
@Autowired
private SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		try {
				session.save(product);
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Product> getAllProduct() {
		
		return null;
	}

	public boolean deleteProduct(Product product) {
		
		return false;
	}

}
