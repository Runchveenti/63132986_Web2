package nguyenngocanhthu.BookStoreManagement.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import nguyenngocanhthu.BookStoreManagement.entity.Books;
import nguyenngocanhthu.BookStoreManagement.services.BooksService;

@Controller
public class BookListController {
	@Autowired 
	BooksService bookListService; 
	
	@GetMapping("/books")
	public String getAllBooks(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 5); 
        Page<Books> dsBook = bookListService.getAllBooks(pageable);
        model.addAttribute("dsBook", dsBook);
        return "Books";
    }
}
