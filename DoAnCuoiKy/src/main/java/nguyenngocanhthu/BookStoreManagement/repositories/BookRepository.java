package nguyenngocanhthu.BookStoreManagement.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nguyenngocanhthu.BookStoreManagement.entity.Books;


@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {
	Optional<Books> findById(Long id);
	
	Page<Books> findAll(Pageable pageable);
	
	List<Books> findByTitleContainingIgnoreCaseOrAuthorNameContainingIgnoreCaseOrCategoryNameContainingIgnoreCase(
	        String title, String authorName, String categoryName, Sort sort);
	
	Page<Books> findByTitleContainingIgnoreCaseOrAuthorNameContainingIgnoreCaseOrCategoryNameContainingIgnoreCase(
			String keyword, String keyword2, String keyword3, Pageable pageable);
}
