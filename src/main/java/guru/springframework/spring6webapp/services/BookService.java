package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.spring6webapp.domain.Book;



public interface BookService {
    public Iterable<Book> findAll();

}


