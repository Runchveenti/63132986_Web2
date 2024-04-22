package nguyenngocanhthu.BookStoreManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nguyenngocanhthu.BookStoreManagement.entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {
	
}
