package com.haftamu.updateAndDelete.services;
import com.haftamu.updateAndDelete.models.Book;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.haftamu.updateAndDelete.repository.BookRepository;
@Service
public class BookService {
	
    // adding the book repository as a dependency
   private BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return this.bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return this.bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
    	return this.bookRepository.findById(id).orElse(null);
    }
    
    public Book updateBook(Book book) {
      return this.bookRepository.save(book);
        	
        }
    
    public void deleteBook(Long id) {
    this.bookRepository.deleteById(id);
    }
}