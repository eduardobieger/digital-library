package com.library.digital.service;

import java.util.List;

import com.library.digital.entity.Author;
import com.library.digital.entity.Book;
import com.library.digital.entity.form.AuthorForm;
import com.library.digital.entity.form.AuthorUpdateForm;

public interface IAuthorService {

	Author create(AuthorForm form);
	
	Author get(Long id);
	
	List<Author> getAll();
	
	Author update(Long id, AuthorUpdateForm formUpdate);
	
	void delete(Long id);
	
	List<Book> getAllBookId(Long id);
	
}
