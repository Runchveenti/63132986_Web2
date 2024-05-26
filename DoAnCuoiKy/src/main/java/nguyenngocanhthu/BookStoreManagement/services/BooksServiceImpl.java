package nguyenngocanhthu.BookStoreManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import nguyenngocanhthu.BookStoreManagement.entity.Books;
import nguyenngocanhthu.BookStoreManagement.repositories.BookRepository;

public class BooksServiceImpl implements BooksService {
	@Autowired BookRepository bookRepository;
	static List<Books> dsBook;
	@Override
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}
	@Override
	public Page<Books> getAllBooks(Pageable pageable) {
		// TODO Auto-generated method stub
		return bookRepository.findAll(pageable);
	}

}
