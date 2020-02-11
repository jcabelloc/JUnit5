package com.zytrust.junit5.assertions.assertArraysEquals;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.zytrust.junit5.bookstore.model.Book;
import com.zytrust.junit5.bookstore.service.BookService;

public class AssertArraysEqualsDemo {
	
	@Test
	public void assertArrayEqualsWithNoMessage() {
		BookService bookService = new BookService();
		
		Book headFirstJavaBook = new Book("1", "Head First Java", "Wrox");
		Book headFirstDesignPatternBook = new Book("2", "Head First Design Pattern", "Packt");
		Book headFirstJavascriptBook = new Book("3", "Head First Javascript", "Wrox");
		
		bookService.addBook(headFirstJavaBook);
		bookService.addBook(headFirstDesignPatternBook);
		bookService.addBook(headFirstJavascriptBook);
		
		String[] actualBookIds = bookService.getBookIdsByPublisher("Wrox");
		
		assertArrayEquals(new String[] {"1", "3"}, actualBookIds);
	}
	
	// TODO 1 assertArrayEqualsWithMessage
	
	
	
	
	// TODO 2 assertArrayEqualsWithMessageSupplier

}
