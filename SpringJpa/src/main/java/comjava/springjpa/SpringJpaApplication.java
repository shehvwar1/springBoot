package comjava.springjpa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import comjava.springjpa.ServiceImplementation.BookServiceImplementation;
import comjava.springjpa.entity.Book;
import comjava.springjpa.repository.BookRepository;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(SpringJpaApplication.class, args);
	BookRepository br = ctx.getBean(BookRepository.class);
		BookServiceImplementation service = new BookServiceImplementation();
		Book b1 = new Book();
		b1.setBookName("Java");
		b1.setDescription("This Book covers whole Java Concepts");
		b1.setPrice(300.76);
		Book b2 = new Book();
		b2.setBookName("Master Frontend");
		b2.setDescription("Learn frontend within hours");
		b2.setPrice(250.76);
		br.save(b1);
		br.save(b2);
	System.out.println(br.findAll());
	System.out.println(br.findById(2));
	br.deleteById(1);
//		service.getBook(1);
//		service.displayAll();
//		service.deleteRecord(2);
		
	}

}
