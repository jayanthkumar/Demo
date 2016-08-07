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
		return book;
	}

	public void setBookMapper(BookDao bookMapper) {
		this.bookDao = bookMapper;
	}

	@Override
	public List<Book> getAllBooks() {
		return this.bookDao.getAllBooks();
	}

	@Override
	public Book deleteBook(int id) {
		Book book = bookDao.getBook(id);
		if (book != null) {
			this.bookDao.deleteBook(id);
		} else {
			throw new RuntimeException("Book not found to delete");
		}
		return book;
	}

	@Override
	public void deleteAllBooks() {
		bookDao.deleteAllBooks();
	}

	@Override
	public Book add(Book book) {
		int numberOfBooksAdded = bookDao.save(book);
		if (numberOfBooksAdded > 0) {
			return book;
		}
		return null;
	}

	@Override
	public Book update(Book book) {
		int numberOfBooksUpdate = bookDao.update(book);
		if (numberOfBooksUpdate > 0) {
			return book;
		}
		return null;
	}
}
