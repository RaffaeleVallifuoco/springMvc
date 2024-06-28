package it.raff.dev.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.raff.dev.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
