package com.library.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.digital.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
