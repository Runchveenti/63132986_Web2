package nguyenngocanhthu.BookStoreManagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import nguyenngocanhthu.BookStoreManagement.entity.Author;
import nguyenngocanhthu.BookStoreManagement.entity.Books;
import nguyenngocanhthu.BookStoreManagement.entity.Category;
import nguyenngocanhthu.BookStoreManagement.services.AuthorServices;
import nguyenngocanhthu.BookStoreManagement.services.BookServices;
import nguyenngocanhthu.BookStoreManagement.services.CategoryServices;

@Controller
public class HomeController {
	@Autowired
	private BookServices service; 
	
	@GetMapping("/index")
	public String Index() {
		return "index";
	}
	
	@GetMapping("/book_register")
	public String bookRegister(Model model) {
		model.addAttribute("book", new Books());
		model.addAttribute("authors", auService.getAllAuthors());
		model.addAttribute("categories", cateService.getAllCategories());
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
	
	@Autowired
	private AuthorServices auService;
	
	@GetMapping("/author_register")
	public String authorRegister(Model model) {
		model.addAttribute("author", new Author());
		return "addAuthor";
	}
	
	@PostMapping("/save_author")
	public String addAuthor(@ModelAttribute Author au) {
		auService.save(au);
		return "redirect:/book_register";
	}
	@Autowired
	private CategoryServices cateService;
	
	@GetMapping("/category_register")
	public String categoryRegister(Model model) {
		model.addAttribute("category", new Category());
		return "addCategory";
	}
	
	@PostMapping("/save_category")
	public String addCategory(@ModelAttribute Category category) {
		cateService.save(category);
		return "redirect:/book_register";
	}
}