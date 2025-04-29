package com.khalid.BookLover.service;

import com.khalid.BookLover.model.Book;
import com.khalid.BookLover.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public String updateBook(Book bookInfo, int id) {
        try {
            bookRepository.deleteById(id);
            bookRepository.save(bookInfo);
            return "Successfully updated the book titled:" + bookInfo.getBookName();
        } catch (Exception e) {
            return "Could not update the book, exception occured: " + e;
        }
    }

    public String deleteBook(int id) {
        try {
            bookRepository.deleteById(id);
            return "Successfully delete the book";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
