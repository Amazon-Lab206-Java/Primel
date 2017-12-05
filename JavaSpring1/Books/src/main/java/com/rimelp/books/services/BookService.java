package com.rimelp.books.services;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.rimelp.books.models.Book;
import com.rimelp.books.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bookRepository;
	List<Book> books = new ArrayList<Book>(Arrays.asList());
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    public Book findBookById(Long id) {
    	return bookRepository.findOne(id);
    }
    
    public void addBook(Book book) {
    	bookRepository.save(book);
    }
    
    public void updateBook(Book book) {
    	bookRepository.save(book);
    }
    
    public void destroyBook(Long id) {
    	if (id < books.size()) {
    		bookRepository.delete(id);
    	}
    }
    
    public BookService(BookRepository bookRepository) {
    	this.bookRepository = bookRepository;
    }
    
}
