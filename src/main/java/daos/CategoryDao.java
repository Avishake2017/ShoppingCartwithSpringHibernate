package daos;

import model.Category;
import java.util.List;

public interface CategoryDao {
			public boolean addCategory(Category category);
			public List<Category> getAllCategory();
			public boolean deleteCategory(Category category);
}
