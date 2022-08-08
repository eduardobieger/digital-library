package com.library.digital.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.digital.entity.Author;
import com.library.digital.entity.Book;
import com.library.digital.entity.form.BookForm;
import com.library.digital.entity.form.BookUpdateForm;
import com.library.digital.repository.AuthorRepository;
import com.library.digital.repository.BookRepository;
import com.library.digital.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public Book create(BookForm form) {
		Book book = new Book();
		Author author = authorRepository.findById(form.getAuthorId()).get();
		
		book.setTitle(form.getTitle());
		book.setAuthor(author);
		book.setPagesNumber(form.getPagesNumber());
		book.setPublisher(form.getPublisher());
		book.setPublicationDate(form.getPublicationDate());
		book.setDescription(form.getDescription());
		
		return bookRepository.save(book);
	}

	@Override
	public Optional<Book> get(Long id) {
		return bookRepository.findById(id);
	}

	@Override
	public List<Book> getAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book update(Long id, BookUpdateForm formUpdate) {
		return null;
	}

	@Override
	public void delete(Long id) {
	}

}
