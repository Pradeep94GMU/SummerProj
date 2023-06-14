package com.librarymanagement.service;

import java.util.List;
import com.librarymanagement.model.Book;

public interface BookService {
	
	List<Book> getAllBooks();
    Book getBookById(Long id);
    Book saveBook(Book book);
    void deleteBook(Long id);

}
