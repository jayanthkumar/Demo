package com.todoApp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.todoApp.domain.Book;
import com.todoApp.service.BookService;

@Controller
@RequestMapping("/")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	public BookController() {
		// TODO Auto-generated constructor stub
		System.out.println("am I created");
	}

	@RequestMapping("/books")
	@ResponseBody
	public List<Book> getBook(){
		return bookService.getAllBooks();
	}
}
