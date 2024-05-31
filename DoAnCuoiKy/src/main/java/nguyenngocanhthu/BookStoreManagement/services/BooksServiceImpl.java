package nguyenngocanhthu.BookStoreManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import nguyenngocanhthu.BookStoreManagement.entity.Books;
import nguyenngocanhthu.BookStoreManagement.repositories.BookRepository;

@Service
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
	
	// Search and sort books
	@Override
    public Page<Books> searchAndSortBooks(String keyword, Pageable pageable) {
        if (keyword == null || keyword.isEmpty()) {
            return bookRepository.findAll(pageable);
        } else {
            return bookRepository.findByTitleContainingIgnoreCaseOrAuthorNameContainingIgnoreCaseOrCategoryNameContainingIgnoreCase(
                    keyword, keyword, keyword, pageable);
        }
    }

}
