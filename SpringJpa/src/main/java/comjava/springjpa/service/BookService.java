package comjava.springjpa.service;

import java.util.List;

import comjava.springjpa.entity.Book;

public interface BookService {
	Book insertBook(Book b);
//	Book updateRecord(int bookId);
	List<Book> displayAll();
//	String deleteRecord(int bookId );
	Book getBook(int bookId);
}
