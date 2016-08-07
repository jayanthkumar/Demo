package com.todoApp.service;

import java.util.List;

import com.todoApp.domain.Book;

public interface BookService {
	Book add(Book book);
	
	Book update(Book book);
	
	Book getBook(int id);

	List<Book> getAllBooks();

	Book deleteBook(int id);

	void deleteAllBooks();
}
