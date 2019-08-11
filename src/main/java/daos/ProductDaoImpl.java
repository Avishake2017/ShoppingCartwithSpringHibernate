package daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Product;


@Repository(value="ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao{
@Autowired
 SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		try {
		Session session = sessionFactory.openSession();
				session.save(product);
				return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Product> getAllProduct() {
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from Product");
			return query.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteProduct(Product product) {
		
		return false;
	}

}
