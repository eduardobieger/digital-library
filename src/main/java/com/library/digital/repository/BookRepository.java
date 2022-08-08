package com.library.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.digital.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
