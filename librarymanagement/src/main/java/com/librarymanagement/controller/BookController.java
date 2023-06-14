package com.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.model.Book;
import com.librarymanagement.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookserObj; 
	
	@GetMapping("/books")
	List<Book> getAllBooks(){
		return bookserObj.getAllBooks();
	}
	
	@GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookserObj.getBookById(id);
    }
	
	@PostMapping("/book")
	public Book saveBook(@RequestBody Book book) {
		return bookserObj.saveBook(book);
	}
	
	@DeleteMapping("/book/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookserObj.deleteBook(id);
	}
	
	

}
