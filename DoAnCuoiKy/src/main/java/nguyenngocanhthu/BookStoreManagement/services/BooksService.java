package nguyenngocanhthu.BookStoreManagement.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import nguyenngocanhthu.BookStoreManagement.entity.Books;

@Service
public interface BooksService {
	// Phân Trang
	List<Books> getAllBooks();
	Page<Books> getAllBooks(Pageable pageable);
	
	// Tìm kiếm và lọc sách 
	Page<Books> searchAndSortBooks(String keyword, Pageable pageable);  
}

