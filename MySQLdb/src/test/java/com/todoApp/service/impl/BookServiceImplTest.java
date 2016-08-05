package com.todoApp.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.todoApp.domain.Book;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookServiceImplTest {
	@Autowired(required = true)
	BookServiceImpl bookService;

	@Test
	public void testBook() {
		Book book = bookService.getBook(1);
		System.out.println("book is:" + book);
	}
}