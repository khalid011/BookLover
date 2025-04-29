package com.khalid.BookLover.controller;

import com.khalid.BookLover.model.Book;
import com.khalid.BookLover.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String showBooks() {
        return "Welcome Khalid vai to your favorite place..!!";
    }

    @PostMapping("/login/{id}")
    public void login(@PathVariable int id) {
        System.out.println("Adding user with id: " + id);
    }

    @PostMapping("/addBook")
    public String addNewBook(@RequestBody Book bookInfo) {
        return bookService.saveBook(bookInfo);
    }
}
