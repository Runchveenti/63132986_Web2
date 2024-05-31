package nguyenngocanhthu.BookStoreManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import nguyenngocanhthu.BookStoreManagement.entity.*;
import nguyenngocanhthu.BookStoreManagement.repositories.BookRepository;
@Service
public class BookServices {
	@Autowired
	private BookRepository bRepo;
	

	
	public void save(Books b) {
		bRepo.save(b);
	}
	
	public List<Books> getAllBook(){
		return bRepo.findAll();
	}
	
	public Optional<Books> getBookById(Long id) {
        return bRepo.findById(id);
    }
	
	
	// Delete book
	public boolean deleteBookById(Long id) {
        Optional<Books> bookOptional = bRepo.findById(id);
        if (bookOptional.isPresent()) {
            bRepo.delete(bookOptional.get());
            return true;
        }
        return false;
    }
	
	// Search and sort books
	public Page<Books> searchAndSortBooks(String keyword, Pageable pageable) {
        if (keyword == null || keyword.isEmpty()) {
            return bRepo.findAll(pageable);
        } else {
            return bRepo.findByTitleContainingIgnoreCaseOrAuthorNameContainingIgnoreCaseOrCategoryNameContainingIgnoreCase(
                    keyword, keyword, keyword, pageable);
        }
    }
	
}
