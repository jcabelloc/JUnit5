package com.zytrust.junit5.assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.zytrust.junit5.bookstore.exception.BookNotFoundException;
import com.zytrust.junit5.bookstore.model.Book;
import com.zytrust.junit5.bookstore.service.BookService;

public class AssertThrowsDemo {
	
	@Test
	public void assertThrowsWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		
		assertThrows(BookNotFoundException.class, 
				() -> bookService.getBookByTitle("Head First Spring"));
		
	}
	
	// TODO 1 assertThrowsWithMessage
	
	// TODO 2 assertThrowsWithMessageSupplier

}
