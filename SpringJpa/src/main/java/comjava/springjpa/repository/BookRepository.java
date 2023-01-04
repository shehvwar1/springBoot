package comjava.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import comjava.springjpa.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
