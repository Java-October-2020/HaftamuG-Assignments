package com.haftamu.updateAndDelete.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haftamu.updateAndDelete.models.Book;
import com.haftamu.updateAndDelete.services.BookService;


@RestController
public class BooksApi {
    private BookService bookService;
    
    public BooksApi(BookService bService){
        this.bookService = bService;
    }
    
	@GetMapping("/")
	public List<Book> index(){
		return this.bookService.allBooks();
	}
	
	
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, Book updatedBook) {
        return this.bookService.updateBook(updatedBook);
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    
    
}