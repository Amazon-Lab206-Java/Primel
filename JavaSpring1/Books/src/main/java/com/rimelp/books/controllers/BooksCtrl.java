package com.rimelp.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimelp.books.models.Book;
import com.rimelp.books.services.BookService;


@Controller
public class BooksCtrl {
	
	private final BookService bookService;
	
	public BooksCtrl(BookService bookService) {
		this.bookService = bookService;
	}
	
	
	@RequestMapping("/books")
    public String books(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "books.jsp";
    }
	
	@RequestMapping("/books/{index}")
    public String findBookById(Model model, @PathVariable("index") Long index) {
        model.addAttribute("book", bookService.findBookById(index));
        return "showBook.jsp";
    }
	
	@RequestMapping("books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "newBook.jsp";
	}
	
	@PostMapping("/books/new")
	public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "newBook.jsp";
		}
		else {
			bookService.addBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/books/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBookById(id);
		if(book != null) {
			model.addAttribute("book", book);
			return "editBook.jsp";
		}
		else {
			return "redirect:/books";
		}
	}
	
	@PostMapping("/books/edit/{id}")
	public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "editBook.jsp";
		}
		else {
			bookService.updateBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping(value="/books/delete/{id}")
	public String destroyBook(@PathVariable("id") long id) {
		bookService.destroyBook(id);
		return "redirect:/books";
	}
}
