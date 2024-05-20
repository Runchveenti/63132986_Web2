package nguyenngocanhthu.BookStoreManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nguyenngocanhthu.BookStoreManagement.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
