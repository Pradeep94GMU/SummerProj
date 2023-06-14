package com.librarymanagement.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagement.dao.BookRepository;
import com.librarymanagement.model.Book;
import com.librarymanagement.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	//i need to fetch book from dao so need a object of that
	
	@Autowired
	private BookRepository bookrepoObj;

	@Override
	public List<Book> getAllBooks() {
		return bookrepoObj.findAll();
	}

	@Override
	public Book getBookById(Long id) {
		Optional<Book> singleId = bookrepoObj.findById(id);
		return singleId.orElse(null);
	}

	@Override
	public Book saveBook(Book book) {
		bookrepoObj.save(book);
		return book;
	}

	@Override
	public void deleteBook(Long id) {
		bookrepoObj.deleteById(id);
		
	}

}
