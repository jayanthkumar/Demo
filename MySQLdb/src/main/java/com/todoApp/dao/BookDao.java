package com.todoApp.dao;

import org.apache.ibatis.annotations.Select;

import com.todoApp.domain.Book;

public interface BookDao {
//	void deleteAllBooks();
//	List<Book> getAllBooks();
	@Select("select book_id as id, image_url, title, author, price, link, submission_date, isAvailable from books where book_id=#{id}")
	Book getBook(int id);
//	Book saveOrUpdate(Book book);
//	boolean deleteBook(Book book);
}
