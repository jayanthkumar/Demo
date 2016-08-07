package com.todoApp.service.impl;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.todoApp.domain.Book;
import com.todoApp.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookServiceImplTest {
	@Autowired(required = true)
	BookService bookService;
	
	@Test
	public void testUpdateBook() {
		Book book = new Book();
		book.setTitle("Amara chitra katha ...");
		book.setAuthor("Shrinivas");
		book.setAvailable(true);
		book.setImage("Cartoon image");
		book.setLink("Link to download");
		book.setPrice(800.0);
		book.setPublished(new Date());
		book.setId(12);
		Book updatedBook = bookService.update(book);
		Assert.assertNotNull(updatedBook);
	}

//	@Test
//	public void testInsertBook() {
//		Book book = new Book();
//		book.setTitle("Amara chitra katha");
//		book.setAuthor("Shrinivas");
//		book.setAvailable(true);
//		book.setImage("Cartoon image");
//		book.setLink("Link to download");
//		book.setPrice(800.0);
//		book.setPublished(new Date());
//		Book addedBook = bookService.add(book);
//		Assert.assertNotNull(addedBook);
//	}
//
//	@Test
//	public void testBook() {
//		Book book = bookService.getBook(1);
//		System.out.println("book is:" + book);
//	}
//
//	@Test
//	public void testAllBooks() {
//		List<Book> books = bookService.getAllBooks();
//		for (Book book : books) {
//			System.out.println("Each book is :" + book);
//		}
//	}
//
//	@Test
//	public void testDeleteBook() {
//		Book book = bookService.deleteBook(11);
//		System.out.println("Deleted book is :" + book);
//	}
//
//	@Test
//	public void testDeleteAllBooks() {
//		bookService.deleteAllBooks();
//		List<Book> books = bookService.getAllBooks();
//		Assert.assertTrue(books.size() == 0);
//	}

}
