package nguyenngocanhthu.BookStoreManagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import nguyenngocanhthu.BookStoreManagement.entity.Books;
import nguyenngocanhthu.BookStoreManagement.services.BookServices;

@Controller
public class HomeController {
	@Autowired
	private BookServices service; 
	
	@GetMapping("/index")
	public String Index() {
		return "index";
	}
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBook() {
		List<Books>list=service.getAllBook();
//		ModelAndView m = new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
		return new ModelAndView("bookList", "book", list);
	}
	
	@GetMapping("/my_books")
	public String getMyBooks() {
		return "myBooks";
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Books b) {
		service.save(b);
		return "redirect:/available_books";
	}
}