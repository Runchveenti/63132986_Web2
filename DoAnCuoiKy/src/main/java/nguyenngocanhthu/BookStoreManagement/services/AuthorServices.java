package nguyenngocanhthu.BookStoreManagement.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nguyenngocanhthu.BookStoreManagement.entity.Author;
import nguyenngocanhthu.BookStoreManagement.repositories.AuthorRepository;


@Service
public class AuthorServices {
	@Autowired
	private AuthorRepository authorRepo;
	
	public List<Author> getAllAuthors(){
		return authorRepo.findAll();
	}
	
	public Author save(Author au) {
		return authorRepo.save(au);
	}
}
