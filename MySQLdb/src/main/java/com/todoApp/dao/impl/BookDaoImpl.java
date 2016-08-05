package com.todoApp.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.todoApp.dao.BookDao;
import com.todoApp.domain.Book;

public class BookDaoImpl extends SqlSessionDaoSupport implements BookDao {

	@Override
	public Book getBook(int id) {
		BookDao bookDao = getSqlSession().getMapper(BookDao.class);
		return bookDao.getBook(id);
	}

}
