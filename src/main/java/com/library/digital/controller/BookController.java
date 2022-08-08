package com.library.digital.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.digital.entity.Book;
import com.library.digital.entity.form.BookForm;
import com.library.digital.service.impl.BookServiceImpl;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookServiceImpl service;
	
	@GetMapping
	public List<Book> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Book> get(@PathVariable Long id) {
		return service.get(id);
	}
	
	@PostMapping
	public Book create(@Valid @RequestBody BookForm form) {
		return service.create(form);
	}
	
}
