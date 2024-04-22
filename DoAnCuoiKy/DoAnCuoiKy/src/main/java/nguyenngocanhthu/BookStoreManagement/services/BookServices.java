package nguyenngocanhthu.BookStoreManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
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
}
