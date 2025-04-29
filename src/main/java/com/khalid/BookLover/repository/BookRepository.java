package com.khalid.BookLover.repository;

import com.khalid.BookLover.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
