package daos;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Category;
@Repository(value = "CategoryDao")
@Transactional
public class CategoryDaoimpl implements CategoryDao{
	@Autowired

	private SessionFactory sessionFactory;
	public boolean addCategory(Category category) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(category);
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Category> getAllCategory() {
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from Catagory");
			return query.list();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean deleteCategory(Category category) {
		
		return false;
	}

}
