package comjava.springjpa.ServiceImplementation;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import comjava.springjpa.entity.Book;
import comjava.springjpa.repository.BookRepository;
import comjava.springjpa.service.BookService;


public class BookServiceImplementation implements BookService {

	private BookRepository bookRepository;
//	Book b = new Book();
	
	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Book insertBook(Book b) {
		return bookRepository.save(b);
		
	}
	@Override
	public List<Book> displayAll() {
		return bookRepository.findAll();
	}

//	@Override
//	public String deleteRecord(int bookId) {
//		 bookRepository.deleteById(bookId);
//		 return "Book deleted with id " + bookId + "Successfully";
//	}

	@Override
	public Book getBook(int bookId) {
		return bookRepository.findById(bookId).get();
	}


}
