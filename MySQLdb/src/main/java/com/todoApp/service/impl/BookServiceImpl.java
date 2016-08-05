package com.todoApp.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todoApp.dao.BookDao;
import com.todoApp.domain.Book;
import com.todoApp.service.BookService;

@Transactional
public class BookServiceImpl implements BookService {
	
	BookDao bookMapper;

	@Override
	public Book getBook(int id) {
		return bookMapper.getBook(id);
	}

	public void setBookMapper(BookDao bookMapper) {
		this.bookMapper = bookMapper;
	}
}
