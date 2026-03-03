package com.bookstore.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bookstore.bookstore.entity.Book;
import com.bookstore.bookstore.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService service;

    // ================= CRUD =================

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return service.getBook(id);
    }

    @PostMapping("/add")
    public Book addBook(@Valid @RequestBody Book book) {
        return service.addBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id,
                           @Valid @RequestBody Book updated) {
        return service.updateBook(id, updated);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
        return "Book deleted successfully";
    }

    // ================= SEARCH =================

    @GetMapping("/search/title")
    public List<Book> searchTitle(@RequestParam String value) {
        return service.searchByTitle(value);
    }

    @GetMapping("/search/author")
    public List<Book> searchAuthor(@RequestParam String value) {
        return service.searchByAuthor(value);
    }

    @GetMapping("/search/genre")
    public List<Book> searchGenre(@RequestParam String value) {
        return service.searchByGenre(value);
    }

    // ================= SORT =================

    @GetMapping("/sort")
    public List<Book> sortBooks(@RequestParam String field) {
        return service.getSortedBooks(field);
    }
}
