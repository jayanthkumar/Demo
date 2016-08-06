package com.todoApp.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

import com.todoApp.dao.BookDao;
import com.todoApp.domain.Book;

public class BookDaoImpl extends SqlSessionDaoSupport implements BookDao {

	@Override
	public Book getBook(int id) {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.getBook(id);
	}

	@Override
	public int saveOrUpdate(Book book) {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.saveOrUpdate(book);
	}

}
