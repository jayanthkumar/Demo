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
	public int saveOrUpdate(Book book) {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.saveOrUpdate(book);
	}

	@Override
	public List<Book> getAllBooks() {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.getAllBooks();
	}

}
