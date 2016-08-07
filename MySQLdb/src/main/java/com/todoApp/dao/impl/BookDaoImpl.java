package com.todoApp.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.todoApp.dao.BookDao;
import com.todoApp.domain.Book;

public class BookDaoImpl extends SqlSessionDaoSupport implements BookDao {

	@Override
	public Book getBook(int id) {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		Book book = bookDao.getBook(id);
		if (book == null) {
			throw new IllegalArgumentException(
					"No Book found with the book id: " + id);
		}
		return book;
	}

	@Override
	public int save(Book book) {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.getAllBooks();
	}

	@Override
	public boolean deleteBook(int id) {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.deleteBook(id);
	}

	@Override
	public void deleteAllBooks() {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		bookDao.deleteAllBooks();
	}

	@Override
	public int update(Book book) {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.update(book);
	}

}
