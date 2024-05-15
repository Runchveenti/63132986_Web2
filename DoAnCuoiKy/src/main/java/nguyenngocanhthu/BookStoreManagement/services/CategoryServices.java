package nguyenngocanhthu.BookStoreManagement.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nguyenngocanhthu.BookStoreManagement.entity.Category;
import nguyenngocanhthu.BookStoreManagement.repositories.CategoryRepository;

@Service
public class CategoryServices {
	@Autowired
    private CategoryRepository cateRepository;

    public Category save(Category category) {
        return cateRepository.save(category);
    }
    
    public List<Category> getAllCategories() {
        return cateRepository.findAll();
    }

}
