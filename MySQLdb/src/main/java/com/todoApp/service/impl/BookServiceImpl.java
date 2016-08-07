package com.todoApp.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.todoApp.dao.BookDao;
import com.todoApp.domain.Book;
import com.todoApp.service.BookService;

@Transactional
public class BookServiceImpl implements BookService {

	BookDao bookDao;

	@Override
	public Book getBook(int id) {
		Book book = bookDao.getBook(id);
		bookDao.saveOrUpdate(book);
		return book;
	}

	public void setBookMapper(BookDao bookMapper) {
		this.bookDao = bookMapper;
	}

	@Override
	public List<Book> getAllBooks() {
		return this.bookDao.getAllBooks();
	}
}
