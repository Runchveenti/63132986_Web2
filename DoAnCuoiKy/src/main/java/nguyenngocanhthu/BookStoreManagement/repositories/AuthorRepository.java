package nguyenngocanhthu.BookStoreManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nguyenngocanhthu.BookStoreManagement.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
