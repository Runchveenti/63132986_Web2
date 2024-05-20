package nguyenngocanhthu.BookStoreManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import nguyenngocanhthu.BookStoreManagement.services.BookServices;
import nguyenngocanhthu.BookStoreManagement.entity.Books;

@Controller
public class BookController {
	@Autowired BookServices bookServices;
	@GetMapping("/available_books")
	public String getAll(Model model) {
		List<Books> dsBK = bookServices.getAllBook();
		model.addAttribute("dsBK", dsBK);
		return "bookList";
	}
}