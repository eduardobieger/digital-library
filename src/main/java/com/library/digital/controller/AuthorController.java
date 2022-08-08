package com.library.digital.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.digital.entity.Author;
import com.library.digital.entity.Book;
import com.library.digital.entity.form.AuthorForm;
import com.library.digital.service.impl.AuthorServiceImpl;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorServiceImpl service;
	
	@GetMapping
	public List<Author> getAll() {
		return service.getAll();
	}
	
	@PostMapping
	public Author create(@Valid @RequestBody AuthorForm form) {
		return service.create(form);
	}
	
	@GetMapping("/books/{id}")
	public List<Book> getAllBookId(@PathVariable Long id) {
		return service.getAllBookId(id);
	}
	
}
