package com.library.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.digital.entity.Author;
import com.library.digital.entity.Book;
import com.library.digital.entity.form.AuthorForm;
import com.library.digital.entity.form.AuthorUpdateForm;
import com.library.digital.repository.AuthorRepository;
import com.library.digital.service.IAuthorService;

@Service
public class AuthorServiceImpl implements IAuthorService {
	
	@Autowired
	private AuthorRepository repository;

	@Override
	public Author create(AuthorForm form) {
		Author author = new Author();
		author.setName(form.getName());
		author.setBirthDate(form.getBirthDate());
		
		return repository.save(author);
	}

	@Override
	public Author get(Long id) {
		return null;
	}

	@Override
	public List<Author> getAll() {
		return repository.findAll();
	}

	@Override
	public Author update(Long id, AuthorUpdateForm formUpdate) {
		return null;
	}

	@Override
	public void delete(Long id) {
	}

	@Override
	public List<Book> getAllBookId(Long id) {
		Author author = repository.findById(id).get();
		return author.getBooks();
	}

}
