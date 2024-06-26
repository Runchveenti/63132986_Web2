package nguyenngocanhthu.BookStoreManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nguyenngocanhthu.BookStoreManagement.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
