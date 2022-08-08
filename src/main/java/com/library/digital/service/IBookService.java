package com.library.digital.service;

import java.util.List;
import java.util.Optional;

import com.library.digital.entity.Book;
import com.library.digital.entity.form.BookForm;
import com.library.digital.entity.form.BookUpdateForm;

public interface IBookService {
	
	Book create(BookForm form);
	
	Optional<Book> get(Long id);
	
	List<Book> getAll();
	
	Book update(Long id, BookUpdateForm formUpdate);
	
	void delete(Long id);
	
	

}
