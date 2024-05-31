package nguyenngocanhthu.BookStoreManagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nguyenngocanhthu.BookStoreManagement.entity.Books;
import nguyenngocanhthu.BookStoreManagement.services.BookServices;


@Controller

public class BookController {
	@Autowired BookServices bookServices;
	
//	@GetMapping("/available_books")
//	public String getAll(Model model) {
//		List<Books> dsBK = bookServices.getAllBook();
//		model.addAttribute("dsBK", dsBK);
//		return "bookList";
//	}
	
//	// Search and sort book 
//	@GetMapping("/available_books")
//    public String getAll(Model model,
//                        @RequestParam(value = "keyword", required = false) String keyword,
//                       @RequestParam(value = "sortBy", required = false, defaultValue = "title") String sortBy) {
//      List<Books> dsBK = bookServices.searchAndSortBooks(keyword, sortBy);
//       model.addAttribute("dsBK", dsBK);
//        model.addAttribute("keyword", keyword);
//        model.addAttribute("sortBy", sortBy);
//        return "bookList";
//    }
	
	// Search and sort book 
	@GetMapping("/search_sort_books")
    public String searchAndSortBooks(
            @RequestParam(value = "keyword", required = false) String keyword,
            @RequestParam(value = "sortBy", required = false, defaultValue = "title") String sortBy,
            @RequestParam(defaultValue = "0") int page,
            Model model) {

        Pageable pageable = PageRequest.of(page, 5, Sort.by(sortBy));
        Page<Books> dsBook = bookServices.searchAndSortBooks(keyword, pageable);

        model.addAttribute("dsBook", dsBook);
        model.addAttribute("keyword", keyword);
        model.addAttribute("sortBy", sortBy);
        model.addAttribute("currentPage", page);
        return "searchSortBookList";
    }
	
	
	@GetMapping("/book_details/{id}")
    public String getBookDetails(@PathVariable("id") Long id, Model model) {
        Optional<Books> book = bookServices.getBookById(id);
        if (book.isPresent()) {
            model.addAttribute("book", book.get());
            return "bookDetails";
        } else {
            return "redirect:/available_books"; // Hoặc một trang lỗi tùy chỉnh
        }
    }
	
	// Edit book 
	@GetMapping("/edit_book/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
	    Optional<Books> book = bookServices.getBookById(id);
	    if (book.isPresent()) {
	        model.addAttribute("book", book.get());
	        return "editBook"; 
	    } else {
	        return "redirect:/available_books"; 
	    }
	}
	
	// Update book 
	@PostMapping("/update_book/{id}")
	public String updateBook(@PathVariable("id") Long id, @ModelAttribute Books bookDetails) {
	    Optional<Books> bookOptional = bookServices.getBookById(id);
	    if (bookOptional.isPresent()) {
	        Books book = bookOptional.get();
	        book.setTitle(bookDetails.getTitle());
	        book.setAuthorName(bookDetails.getAuthorName());
	        book.setCategoryName(bookDetails.getCategoryName());
	        book.setPrice(bookDetails.getPrice());
	        bookServices.save(book);
	        return "redirect:/available_books?success=true";
	    } else {
	        return "redirect:/available_books"; // Or an error page
	    }
	}
	
	// Endpoint để xoá sách
    @DeleteMapping("/delete_book/{bookId}")
    public ResponseEntity<String> deleteBookById(@PathVariable Long bookId) {
        boolean isDeleted = bookServices.deleteBookById(bookId);
        if (isDeleted) {
            return ResponseEntity.ok("Book deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No data found for resource with given identifier");
        }
    }
    
    
	
}