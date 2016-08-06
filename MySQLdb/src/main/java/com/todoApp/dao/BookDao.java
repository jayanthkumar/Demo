package com.todoApp.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.todoApp.domain.Book;

public interface BookDao {
	// void deleteAllBooks();
	// List<Book> getAllBooks();
	@Select("select book_id as id, image_url, title, author, price, link, submission_date, isAvailable from books where book_id=#{id}")
	@Results({
		@Result(id=true, column="book_id", property="id"),
		@Result(column="image_url", property="image"),
		@Result(column="title", property="title"),
		@Result(column="author", property="author"),
		@Result(column="price", property="price"),
		@Result(column="link", property="link"),
		@Result(column="submission_date", property="published"),
		@Result(column="isAvailable", property="isAvailable")
	})
	Book getBook(int id);

	@Insert("INSERT INTO books(image_url, title, author, price, link, submission_date, isAvailable) values (#{image}, #{title}, #{author}, #{price}, #{link}, #{published}, #{isAvailable})")
	@Options(useGeneratedKeys=true, keyProperty="book_id")
	int saveOrUpdate(Book book);
	// boolean deleteBook(Book book);
}
