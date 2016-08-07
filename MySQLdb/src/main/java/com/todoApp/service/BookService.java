package com.todoApp.service;

import java.util.List;

import com.todoApp.domain.Book;

public interface BookService {
	Book getBook(int id);
	List<Book> getAllBooks();
}
