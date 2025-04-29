package com.khalid.BookLover.service;

import com.khalid.BookLover.model.Book;
import com.khalid.BookLover.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public String saveBook(Book bookInfo) {
        try {
            bookRepository.save(bookInfo);
            return "Book named " + bookInfo.getBookName() + " - is saved successfully in the db";
        } catch (Exception ex) {
            return "Failure, exception occurred" + ex.toString();
        }
    }
}
